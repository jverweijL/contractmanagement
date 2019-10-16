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

package com.liferay.cm.service.http;

import com.liferay.cm.service.ContractServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the SOAP utility for the
 * <code>ContractServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.cm.model.ContractSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.cm.model.Contract</code>, that is translated to a
 * <code>com.liferay.cm.model.ContractSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContractServiceHttp
 * @generated
 */
@ProviderType
public class ContractServiceSoap {

	public static com.liferay.cm.model.ContractSoap addContract(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, java.util.Date startdate, java.util.Date reviewdate,
			long statusid, long termid, long typeid, String version,
			String remarks, boolean autoextend)
		throws RemoteException {

		try {
			com.liferay.cm.model.Contract returnValue =
				ContractServiceUtil.addContract(
					serviceContext, name, startdate, reviewdate, statusid,
					termid, typeid, version, remarks, autoextend);

			return com.liferay.cm.model.ContractSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.cm.model.ContractSoap updateContract(
			long contractId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, java.util.Date startdate, java.util.Date reviewdate,
			long statusid, long termid, long typeid, String version,
			String remarks, boolean autoextend)
		throws RemoteException {

		try {
			com.liferay.cm.model.Contract returnValue =
				ContractServiceUtil.updateContract(
					contractId, serviceContext, name, startdate, reviewdate,
					statusid, termid, typeid, version, remarks, autoextend);

			return com.liferay.cm.model.ContractSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.cm.model.ContractSoap getContract(long contractId)
		throws RemoteException {

		try {
			com.liferay.cm.model.Contract returnValue =
				ContractServiceUtil.getContract(contractId);

			return com.liferay.cm.model.ContractSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.cm.model.ContractSoap deleteContract(
			long contractId)
		throws RemoteException {

		try {
			com.liferay.cm.model.Contract returnValue =
				ContractServiceUtil.deleteContract(contractId);

			return com.liferay.cm.model.ContractSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.cm.model.ContractSoap[] getContractsByGroupId(
			long groupId)
		throws RemoteException {

		try {
			java.util.List<com.liferay.cm.model.Contract> returnValue =
				ContractServiceUtil.getContractsByGroupId(groupId);

			return com.liferay.cm.model.ContractSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.cm.model.ContractSoap[] getContractsByGroupId(
			long groupId, int start, int end)
		throws RemoteException {

		try {
			java.util.List<com.liferay.cm.model.Contract> returnValue =
				ContractServiceUtil.getContractsByGroupId(groupId, start, end);

			return com.liferay.cm.model.ContractSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getContractsCountByGroupId(long groupId)
		throws RemoteException {

		try {
			int returnValue = ContractServiceUtil.getContractsCountByGroupId(
				groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ContractServiceSoap.class);

}