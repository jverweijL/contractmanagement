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

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.cm.model.Contract;
import com.liferay.cm.service.base.ContractServiceBaseImpl;

import com.liferay.cm.service.permission.ContractPermissionChecker;
import com.liferay.cm.service.permission.impl.ContractPermissionCheckerImpl;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the contract remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.cm.service.ContractService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContractServiceBaseImpl
 */

public class ContractServiceImpl extends ContractServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.cm.service.ContractServiceUtil</code> to access the contract remote service.
	 */

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

		// permission checks will be implemented here
		// check toplevel since it doesn't exist just yet
		_contractPermissionChecker.checkTopLevel(getPermissionChecker(),serviceContext.getScopeGroupId(), ActionKeys.ADD_ENTRY);

		return contractLocalService.addContract(  serviceContext,
		 name,
		 startdate,
		 reviewdate,
		 statusid,
		 termid,
		 typeid,
		 version,
		 remarks,
		 autoextend);
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

		Contract contract = contractLocalService.getContract(contractId);

		// permission checks will be implemented here
		_contractPermissionChecker.check(
				getPermissionChecker(), contract.getGroupId(),
				contract.getContractId(), ActionKeys.UPDATE);

		return contractLocalService.updateContract( contractId,
		 serviceContext,
		 name,
		 startdate,
		 reviewdate,
		 statusid,
		 termid,
		 typeid,
		 version,
		 remarks,
		 autoextend);
	}

	public Contract getContract(long contractId) throws PortalException {
		Contract contract = contractLocalService.getContract(contractId);

		// permission checks will be implemented here
		_contractPermissionChecker.check(
				getPermissionChecker(), contract.getGroupId(),
				contract.getContractId(), ActionKeys.VIEW);

		return contractLocalService.getContract(contractId);
	}


	public Contract deleteContract(long contractId) throws PortalException {

		Contract contract = contractLocalService.getContract(contractId);

		// permission checks will be implemented here
		_contractPermissionChecker.check(
				getPermissionChecker(), contract.getGroupId(),
				contract.getContractId(), ActionKeys.DELETE);

		return contractLocalService.deleteContract(contractId);
	}


	public List<Contract> getContractsByGroupId(long groupId) {

		List<Contract> contracts = contractLocalService.getContractsByGroupId(groupId);

		// permission checks should be implemented here

		return contracts;
	}

	public List<Contract> getContractsByGroupId(long groupId, int start, int end) {

		List<Contract> contracts = contractLocalService.getContractsByGroupId(groupId,start,end);

		// permission checks should be implemented here

		return contracts;
	}

	public int getContractsCountByGroupId(long groupId) {
		return contractLocalService.getContractsCountByGroupId(groupId);
	}

	/**
	 * Service builder classes are not OSGi components but Spring beans and you cannot
	 * use the @Reference annotation. Use @ServiceReference instead.
	 */
	@ServiceReference(type = com.liferay.cm.service.permission.ContractPermissionChecker.class)
	private ContractPermissionChecker _contractPermissionChecker;
}