/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.cm.service.impl;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.cm.model.Status;
import com.liferay.cm.model.Status;
import com.liferay.cm.service.base.StatusLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the status local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.cm.service.StatusLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StatusLocalServiceBaseImpl
 */

public class StatusLocalServiceImpl extends StatusLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.cm.service.StatusLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.cm.service.StatusLocalServiceUtil</code>.
	 */



	@Override
	public Status addStatus(Status status) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Please use more extensive method for adding Status");
	}

	public Status addStatus(ServiceContext serviceContext,
								String name,
								String description) throws PortalException {

		Group group = serviceContext.getScopeGroup();
		User user = _UserLocalService.getUser(serviceContext.getUserId());
		long statusId = _CounterLocalService.increment(Status.class.getName());

		Status status = createStatus(statusId);

		status.setGroupId(group.getGroupId());

		status.setCompanyId(group.getCompanyId());
		status.setUserId(serviceContext.getUserId());
		status.setUserName(user.getScreenName());
		status.setCreateDate(serviceContext.getCreateDate(new Date()));
		status.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		status.setModifierId(serviceContext.getUserId());
		status.setModifierName(user.getScreenName());

		status.setName(name);
		status.setDescription(description);
		status.setStatusId(statusId);

		// persist
		status = super.addStatus(status);

		// add permission resources so we can use permissioning system
		boolean portletActions = false;
		boolean addGroupPermissions = true;
		boolean addGuestPermissions = true;

		resourceLocalService.addResources(
				group.getCompanyId(), group.getGroupId(), serviceContext.getUserId(),
				Status.class.getName(),	status.getStatusId(), portletActions,
				addGroupPermissions, addGuestPermissions);

		// update asset
		//updateAsset(person,serviceContext);

		// Log assignment addition

		if (_log.isDebugEnabled()) {

			_log.debug("User " + serviceContext.getUserId() + " added a Person.");
		}
		// Start workflow instance and return the assignment.

		//return startWorkflowInstance(userId, assignment, serviceContext);

		return super.addStatus(status);
	}

	public Status updateStatus(long statusId,
								   ServiceContext serviceContext,
								   String name,
								   String description) throws PortalException {

		User user = _UserLocalService.getUser(serviceContext.getUserId());

		Status status = getStatus(statusId);
		status.setModifiedDate(new Date());
		status.setModifierId(serviceContext.getUserId());
		status.setModifierName(user.getScreenName());

		status.setName(name);
		status.setDescription(description);

		// persist
		return super.updateStatus(status);
	}

	public Status deleteStatus(long statusId) throws PortalException {

		Status status = getStatus(statusId);
		return deleteStatus(status);
	}

	public Status deleteStatus(Status status) throws PortalException {

		resourceLocalService.deleteResource(status, ResourceConstants.SCOPE_INDIVIDUAL);
		return super.deleteStatus(status);
	}

	//finders
	public List<Status> getStatussByGroupId(long groupId) {
		return statusPersistence.findByGroupId(groupId);
	}

	public List<Status> getStatussByGroupId(long groupId, int start, int end) {
		return statusPersistence.findByGroupId(groupId,	start,end);
	}

	public int getStatussCountByGroupId(long groupId) {
		return statusPersistence.countByGroupId(groupId);
	}

	// use springbeans way..
	@ServiceReference(type = UserLocalService.class)
	private UserLocalService _UserLocalService;

	@ServiceReference(type = CounterLocalService.class)
	private CounterLocalService _CounterLocalService;

	private static final Logger _log = LoggerFactory.getLogger(StatusLocalServiceImpl.class);
}