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

package com.liferay.cm.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link ContractService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContractService
 * @generated
 */
@ProviderType
public class ContractServiceWrapper
	implements ContractService, ServiceWrapper<ContractService> {

	public ContractServiceWrapper(ContractService contractService) {
		_contractService = contractService;
	}

	@Override
	public com.liferay.cm.model.Contract addContract(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, java.util.Date startdate, java.util.Date reviewdate,
			long statusid, long termid, long typeid, String version,
			String remarks, boolean autoextend)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractService.addContract(
			serviceContext, name, startdate, reviewdate, statusid, termid,
			typeid, version, remarks, autoextend);
	}

	@Override
	public com.liferay.cm.model.Contract deleteContract(long contractId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractService.deleteContract(contractId);
	}

	@Override
	public com.liferay.cm.model.Contract getContract(long contractId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractService.getContract(contractId);
	}

	@Override
	public java.util.List<com.liferay.cm.model.Contract> getContractsByGroupId(
		long groupId) {

		return _contractService.getContractsByGroupId(groupId);
	}

	@Override
	public java.util.List<com.liferay.cm.model.Contract> getContractsByGroupId(
		long groupId, int start, int end) {

		return _contractService.getContractsByGroupId(groupId, start, end);
	}

	@Override
	public int getContractsCountByGroupId(long groupId) {
		return _contractService.getContractsCountByGroupId(groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _contractService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.cm.model.Contract updateContract(
			long contractId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, java.util.Date startdate, java.util.Date reviewdate,
			long statusid, long termid, long typeid, String version,
			String remarks, boolean autoextend)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractService.updateContract(
			contractId, serviceContext, name, startdate, reviewdate, statusid,
			termid, typeid, version, remarks, autoextend);
	}

	@Override
	public ContractService getWrappedService() {
		return _contractService;
	}

	@Override
	public void setWrappedService(ContractService contractService) {
		_contractService = contractService;
	}

	private ContractService _contractService;

}