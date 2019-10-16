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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;

import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.cm.model.Contract;
import com.liferay.cm.service.base.ContractLocalServiceBaseImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;


/**
 * The implementation of the contract local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.cm.service.ContractLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContractLocalServiceBaseImpl
 */

public class ContractLocalServiceImpl extends ContractLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.cm.service.ContractLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.cm.service.ContractLocalServiceUtil</code>.
	 */

	@Override
	public Contract addContract(Contract contract) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Please use more extensive method for adding Person");
	}

	public Contract addContract(ServiceContext serviceContext,
								String name,
								Date startdate,
								Date reviewdate,
								long statusid,
								long termid,
								long typeid,
								String version,
								String remarks,
								boolean autoextend) throws PortalException {

		Group group = serviceContext.getScopeGroup();
		User user = _UserLocalService.getUser(serviceContext.getUserId());
		long contractId = _CounterLocalService.increment(Contract.class.getName());

		Contract contract = createContract(contractId);

		contract.setGroupId(group.getGroupId());

		contract.setCompanyId(group.getCompanyId());
		contract.setUserId(serviceContext.getUserId());
		contract.setUserName(user.getScreenName());
		contract.setCreateDate(serviceContext.getCreateDate(new Date()));
		contract.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		contract.setModifierId(serviceContext.getUserId());
		contract.setModifierName(user.getScreenName());

		contract.setAutoextend(autoextend);
		contract.setStartdate(startdate);
		contract.setName(name);
		contract.setRemarks(remarks);
		contract.setReviewdate(reviewdate);
		contract.setStatusId(statusid);
		contract.setTermId(termid);
		contract.setTypeId(typeid);
		contract.setVersion(version);


		// persist
		contract = super.addContract(contract);

		// add permission resources so we can use permissioning system
		boolean portletActions = false;
		boolean addGroupPermissions = true;
		boolean addGuestPermissions = true;

		resourceLocalService.addResources(
				group.getCompanyId(), group.getGroupId(), serviceContext.getUserId(),
				Contract.class.getName(),	contract.getContractId(), portletActions,
				addGroupPermissions, addGuestPermissions);

		// update asset
		//updateAsset(contract,serviceContext);

		// Log contract addition

		if (_log.isDebugEnabled()) {

			_log.debug("User " + serviceContext.getUserId() + " added a Contract.");
		}
		// Start workflow instance and return the assignment.

		//return startWorkflowInstance(userId, assignment, serviceContext);

		return super.addContract(contract);
	}

	public Contract updateContract(long contractId,
								   ServiceContext serviceContext,
								   String name,
								   Date startdate,
								   Date reviewdate,
								   long statusid,
								   long termid,
								   long typeid,
								   String version,
								   String remarks,
								   boolean autoextend) throws PortalException {

		User user = _UserLocalService.getUser(serviceContext.getUserId());

		Contract contract = getContract(contractId);
		contract.setModifiedDate(new Date());
		contract.setModifierId(serviceContext.getUserId());
		contract.setModifierName(user.getScreenName());

		contract.setAutoextend(autoextend);
		contract.setStartdate(startdate);
		contract.setName(name);
		contract.setRemarks(remarks);
		contract.setReviewdate(reviewdate);
		contract.setStatusId(statusid);
		contract.setTermId(termid);
		contract.setTypeId(typeid);
		contract.setVersion(version);

		// persist
		return super.updateContract(contract);
	}

	public Contract deleteContract(long contractId) throws PortalException {

		Contract contract = getContract(contractId);
		return deleteContract(contract);
	}

	public Contract deleteContract(Contract contract) throws PortalException {

		resourceLocalService.deleteResource(contract, ResourceConstants.SCOPE_INDIVIDUAL);
		return super.deleteContract(contract);
	}

	//finders
	public List<Contract> getContractsByGroupId(long groupId) {
		return contractPersistence.findByGroupId(groupId);
	}

	public List<Contract> getContractsByGroupId(long groupId, int start, int end) {
		return contractPersistence.findByGroupId(groupId,	start,end);
	}

	public int getContractsCountByGroupId(long groupId) {
		return contractPersistence.countByGroupId(groupId);
	}

	// use springbeans way..
	@ServiceReference(type = GroupLocalService.class)
	private GroupLocalService _GroupLocalService;

	@ServiceReference(type = UserLocalService.class)
	private UserLocalService _UserLocalService;

	@ServiceReference(type = CounterLocalService.class)
	private CounterLocalService _CounterLocalService;

	private static final Logger _log = LoggerFactory.getLogger(ContractLocalServiceImpl.class);
}