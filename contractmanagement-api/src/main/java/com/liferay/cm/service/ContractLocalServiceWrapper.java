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
 * Provides a wrapper for {@link ContractLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContractLocalService
 * @generated
 */
@ProviderType
public class ContractLocalServiceWrapper
	implements ContractLocalService, ServiceWrapper<ContractLocalService> {

	public ContractLocalServiceWrapper(
		ContractLocalService contractLocalService) {

		_contractLocalService = contractLocalService;
	}

	/**
	 * Adds the contract to the database. Also notifies the appropriate model listeners.
	 *
	 * @param contract the contract
	 * @return the contract that was added
	 * @throws UnsupportedOperationException
	 */
	@Override
	public com.liferay.cm.model.Contract addContract(
			com.liferay.cm.model.Contract contract)
		throws UnsupportedOperationException {

		return _contractLocalService.addContract(contract);
	}

	@Override
	public com.liferay.cm.model.Contract addContract(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, java.util.Date startdate, java.util.Date reviewdate,
			long statusid, long termid, long typeid, String version,
			String remarks, boolean autoextend)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractLocalService.addContract(
			serviceContext, name, startdate, reviewdate, statusid, termid,
			typeid, version, remarks, autoextend);
	}

	/**
	 * Creates a new contract with the primary key. Does not add the contract to the database.
	 *
	 * @param contractId the primary key for the new contract
	 * @return the new contract
	 */
	@Override
	public com.liferay.cm.model.Contract createContract(long contractId) {
		return _contractLocalService.createContract(contractId);
	}

	/**
	 * Deletes the contract from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contract the contract
	 * @return the contract that was removed
	 * @throws PortalException
	 */
	@Override
	public com.liferay.cm.model.Contract deleteContract(
			com.liferay.cm.model.Contract contract)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractLocalService.deleteContract(contract);
	}

	/**
	 * Deletes the contract with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contractId the primary key of the contract
	 * @return the contract that was removed
	 * @throws PortalException if a contract with the primary key could not be found
	 */
	@Override
	public com.liferay.cm.model.Contract deleteContract(long contractId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractLocalService.deleteContract(contractId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contractLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _contractLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.cm.model.impl.ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _contractLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.cm.model.impl.ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _contractLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _contractLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _contractLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.cm.model.Contract fetchContract(long contractId) {
		return _contractLocalService.fetchContract(contractId);
	}

	/**
	 * Returns the contract matching the UUID and group.
	 *
	 * @param uuid the contract's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contract, or <code>null</code> if a matching contract could not be found
	 */
	@Override
	public com.liferay.cm.model.Contract fetchContractByUuidAndGroupId(
		String uuid, long groupId) {

		return _contractLocalService.fetchContractByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _contractLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the contract with the primary key.
	 *
	 * @param contractId the primary key of the contract
	 * @return the contract
	 * @throws PortalException if a contract with the primary key could not be found
	 */
	@Override
	public com.liferay.cm.model.Contract getContract(long contractId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractLocalService.getContract(contractId);
	}

	/**
	 * Returns the contract matching the UUID and group.
	 *
	 * @param uuid the contract's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contract
	 * @throws PortalException if a matching contract could not be found
	 */
	@Override
	public com.liferay.cm.model.Contract getContractByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractLocalService.getContractByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the contracts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.cm.model.impl.ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @return the range of contracts
	 */
	@Override
	public java.util.List<com.liferay.cm.model.Contract> getContracts(
		int start, int end) {

		return _contractLocalService.getContracts(start, end);
	}

	@Override
	public java.util.List<com.liferay.cm.model.Contract> getContractsByGroupId(
		long groupId) {

		return _contractLocalService.getContractsByGroupId(groupId);
	}

	@Override
	public java.util.List<com.liferay.cm.model.Contract> getContractsByGroupId(
		long groupId, int start, int end) {

		return _contractLocalService.getContractsByGroupId(groupId, start, end);
	}

	/**
	 * Returns all the contracts matching the UUID and company.
	 *
	 * @param uuid the UUID of the contracts
	 * @param companyId the primary key of the company
	 * @return the matching contracts, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.cm.model.Contract>
		getContractsByUuidAndCompanyId(String uuid, long companyId) {

		return _contractLocalService.getContractsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of contracts matching the UUID and company.
	 *
	 * @param uuid the UUID of the contracts
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching contracts, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.cm.model.Contract>
		getContractsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.cm.model.Contract> orderByComparator) {

		return _contractLocalService.getContractsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of contracts.
	 *
	 * @return the number of contracts
	 */
	@Override
	public int getContractsCount() {
		return _contractLocalService.getContractsCount();
	}

	@Override
	public int getContractsCountByGroupId(long groupId) {
		return _contractLocalService.getContractsCountByGroupId(groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _contractLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _contractLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _contractLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the contract in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param contract the contract
	 * @return the contract that was updated
	 */
	@Override
	public com.liferay.cm.model.Contract updateContract(
		com.liferay.cm.model.Contract contract) {

		return _contractLocalService.updateContract(contract);
	}

	@Override
	public com.liferay.cm.model.Contract updateContract(
			long contractId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, java.util.Date startdate, java.util.Date reviewdate,
			long statusid, long termid, long typeid, String version,
			String remarks, boolean autoextend)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contractLocalService.updateContract(
			contractId, serviceContext, name, startdate, reviewdate, statusid,
			termid, typeid, version, remarks, autoextend);
	}

	@Override
	public ContractLocalService getWrappedService() {
		return _contractLocalService;
	}

	@Override
	public void setWrappedService(ContractLocalService contractLocalService) {
		_contractLocalService = contractLocalService;
	}

	private ContractLocalService _contractLocalService;

}