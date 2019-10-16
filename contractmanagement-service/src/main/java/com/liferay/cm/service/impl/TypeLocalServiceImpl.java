/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the types of the GNU Lesser General Public License as published by the Free
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
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.cm.model.Type;
import com.liferay.cm.service.base.TypeLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Activate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.cm.service.TypeLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TypeLocalServiceBaseImpl
 */

public class TypeLocalServiceImpl extends TypeLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.cm.service.TypeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.cm.service.TypeLocalServiceUtil</code>.
	 */



	@Override
	public Type addType(Type type) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Please use more extensive method for adding Person");
	}

	public Type addType(ServiceContext serviceContext,

								String name,
								String description) throws PortalException {

		Group group = _GroupLocalService.getGroup(serviceContext.getScopeGroupId());
		User user = _UserLocalService.getUser(serviceContext.getUserId());
		long typeId = _CounterLocalService.increment(Type.class.getName());

		Type type = createType(typeId);

		type.setGroupId(group.getGroupId());

		type.setCompanyId(group.getCompanyId());
		type.setUserId(serviceContext.getUserId());
		type.setUserName(user.getScreenName());
		type.setCreateDate(serviceContext.getCreateDate(new Date()));
		type.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		type.setModifierId(serviceContext.getUserId());
		type.setModifierName(user.getScreenName());

		type.setName(name);
		type.setDescription(description);

		// persist
		type = super.addType(type);

		// add permission resources so we can use permissioning system
		boolean portletActions = false;
		boolean addGroupPermissions = true;
		boolean addGuestPermissions = true;

		resourceLocalService.addResources(
				group.getCompanyId(), group.getGroupId(), serviceContext.getUserId(),
				Type.class.getName(),	type.getTypeId(), portletActions,
				addGroupPermissions, addGuestPermissions);

		// update asset
		//updateAsset(person,serviceContext);

		// Log assignment addition

		if (_log.isDebugEnabled()) {

			_log.debug("User " + serviceContext.getUserId() + " added a Person.");
		}
		// Start workflow instance and return the assignment.

		//return startWorkflowInstance(userId, assignment, serviceContext);

		return super.addType(type);
	}

	public Type updateType(long typeId,
								   ServiceContext serviceContext,

								   String name,
								   String description) throws PortalException {

		User user = _UserLocalService.getUser(serviceContext.getUserId());

		Type type = getType(typeId);
		type.setModifiedDate(new Date());
		type.setModifierId(serviceContext.getUserId());
		type.setModifierName(user.getScreenName());

		type.setName(name);
		type.setDescription(description);

		// persist
		return super.updateType(type);
	}

	public Type deleteType(long typeId) throws PortalException {

		Type type = getType(typeId);
		return deleteType(type);
	}

	public Type deleteType(Type type) throws PortalException {

		resourceLocalService.deleteResource(type, ResourceConstants.SCOPE_INDIVIDUAL);
		return super.deleteType(type);
	}

	//finders
	public List<Type> getTypesByGroupId(long groupId) {
		return typePersistence.findByGroupId(groupId);
	}

	public List<Type> getTypesByGroupId(long groupId, int start, int end) {
		return typePersistence.findByGroupId(groupId,	start,end);
	}

	public int getTypesCountByGroupId(long groupId) {
		return typePersistence.countByGroupId(groupId);
	}

	// use springbeans way..
	@ServiceReference(type = GroupLocalService.class)
	private GroupLocalService _GroupLocalService;

	@ServiceReference(type = UserLocalService.class)
	private UserLocalService _UserLocalService;

	@ServiceReference(type = CounterLocalService.class)
	private CounterLocalService _CounterLocalService;

	private static final Logger _log = LoggerFactory.getLogger(TypeLocalServiceImpl.class);
}