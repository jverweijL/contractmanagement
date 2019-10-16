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
import com.liferay.cm.model.Term;
import com.liferay.cm.service.base.TermLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the term local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.cm.service.TermLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TermLocalServiceBaseImpl
 */

public class TermLocalServiceImpl extends TermLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.cm.service.TermLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.cm.service.TermLocalServiceUtil</code>.
	 */



	@Override
	public Term addTerm(Term term) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Please use more extensive method for adding Person");
	}

	public Term addTerm(ServiceContext serviceContext,
						String name,
						String description) throws PortalException {

		Group group = serviceContext.getScopeGroup();
		User user = _UserLocalService.getUser(serviceContext.getUserId());
		long termId = _CounterLocalService.increment(Term.class.getName());

		Term term = createTerm(termId);

		term.setGroupId(group.getGroupId());

		term.setCompanyId(group.getCompanyId());
		term.setUserId(serviceContext.getUserId());
		term.setUserName(user.getScreenName());
		term.setCreateDate(serviceContext.getCreateDate(new Date()));
		term.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		term.setModifierId(serviceContext.getUserId());
		term.setModifierName(user.getScreenName());

		term.setName(name);
		term.setDescription(description);

		// persist
		term = super.addTerm(term);

		// add permission resources so we can use permissioning system
		boolean portletActions = false;
		boolean addGroupPermissions = true;
		boolean addGuestPermissions = true;

		resourceLocalService.addResources(
				group.getCompanyId(), group.getGroupId(), serviceContext.getUserId(),
				Term.class.getName(),	term.getTermId(), portletActions,
				addGroupPermissions, addGuestPermissions);

		// update asset
		//updateAsset(person,serviceContext);

		// Log assignment addition

		if (_log.isDebugEnabled()) {

			_log.debug("User " + serviceContext.getUserId() + " added a Person.");
		}
		// Start workflow instance and return the assignment.

		//return startWorkflowInstance(userId, assignment, serviceContext);

		return super.addTerm(term);
	}

	public Term updateTerm(long termId,
							ServiceContext serviceContext,
							String name,
							String description) throws PortalException {

		User user = _UserLocalService.getUser(serviceContext.getUserId());

		Term term = getTerm(termId);
		term.setModifiedDate(new Date());
		term.setModifierId(serviceContext.getUserId());
		term.setModifierName(user.getScreenName());

		term.setName(name);
		term.setDescription(description);

		// persist
		return super.updateTerm(term);
	}

	public Term deleteTerm(long termId) throws PortalException {

		Term term = getTerm(termId);
		return deleteTerm(term);
	}

	public Term deleteTerm(Term term) throws PortalException {

		resourceLocalService.deleteResource(term, ResourceConstants.SCOPE_INDIVIDUAL);
		return super.deleteTerm(term);
	}

	//finders
	public List<Term> getTermsByGroupId(long groupId) {
		return termPersistence.findByGroupId(groupId);
	}

	public List<Term> getTermsByGroupId(long groupId, int start, int end) {
		return termPersistence.findByGroupId(groupId,	start,end);
	}

	public int getTermsCountByGroupId(long groupId) {
		return termPersistence.countByGroupId(groupId);
	}

	// use springbeans way..
	@ServiceReference(type = GroupLocalService.class)
	private GroupLocalService _GroupLocalService;

	@ServiceReference(type = UserLocalService.class)
	private UserLocalService _UserLocalService;

	@ServiceReference(type = CounterLocalService.class)
	private CounterLocalService _CounterLocalService;

	private static final Logger _log = LoggerFactory.getLogger(TermLocalServiceImpl.class);
}