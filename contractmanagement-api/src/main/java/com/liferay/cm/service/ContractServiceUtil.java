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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Contract. This utility wraps
 * <code>com.liferay.cm.service.impl.ContractServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ContractService
 * @generated
 */
@ProviderType
public class ContractServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.cm.service.impl.ContractServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.cm.model.Contract addContract(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, java.util.Date startdate, java.util.Date reviewdate,
			long statusid, long termid, long typeid, String version,
			String remarks, boolean autoextend)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addContract(
			serviceContext, name, startdate, reviewdate, statusid, termid,
			typeid, version, remarks, autoextend);
	}

	public static com.liferay.cm.model.Contract deleteContract(long contractId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteContract(contractId);
	}

	public static com.liferay.cm.model.Contract getContract(long contractId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getContract(contractId);
	}

	public static java.util.List<com.liferay.cm.model.Contract>
		getContractsByGroupId(long groupId) {

		return getService().getContractsByGroupId(groupId);
	}

	public static java.util.List<com.liferay.cm.model.Contract>
		getContractsByGroupId(long groupId, int start, int end) {

		return getService().getContractsByGroupId(groupId, start, end);
	}

	public static int getContractsCountByGroupId(long groupId) {
		return getService().getContractsCountByGroupId(groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.cm.model.Contract updateContract(
			long contractId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, java.util.Date startdate, java.util.Date reviewdate,
			long statusid, long termid, long typeid, String version,
			String remarks, boolean autoextend)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateContract(
			contractId, serviceContext, name, startdate, reviewdate, statusid,
			termid, typeid, version, remarks, autoextend);
	}

	public static ContractService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContractService, ContractService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ContractService.class);

		ServiceTracker<ContractService, ContractService> serviceTracker =
			new ServiceTracker<ContractService, ContractService>(
				bundle.getBundleContext(), ContractService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}