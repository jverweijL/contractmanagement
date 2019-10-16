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

package com.liferay.cm.service.persistence;

import com.liferay.cm.model.Contract;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the contract service. This utility wraps <code>com.liferay.cm.service.persistence.impl.ContractPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContractPersistence
 * @generated
 */
@ProviderType
public class ContractUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Contract contract) {
		getPersistence().clearCache(contract);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Contract> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Contract> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Contract> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Contract> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Contract> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Contract update(Contract contract) {
		return getPersistence().update(contract);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Contract update(
		Contract contract, ServiceContext serviceContext) {

		return getPersistence().update(contract, serviceContext);
	}

	/**
	 * Returns all the contracts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contracts
	 */
	public static List<Contract> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the contracts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @return the range of matching contracts
	 */
	public static List<Contract> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the contracts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contracts
	 */
	public static List<Contract> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contract> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contracts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contracts
	 */
	public static List<Contract> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contract> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first contract in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public static Contract findByUuid_First(
			String uuid, OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first contract in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public static Contract fetchByUuid_First(
		String uuid, OrderByComparator<Contract> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last contract in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public static Contract findByUuid_Last(
			String uuid, OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last contract in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public static Contract fetchByUuid_Last(
		String uuid, OrderByComparator<Contract> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the contracts before and after the current contract in the ordered set where uuid = &#63;.
	 *
	 * @param contractId the primary key of the current contract
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contract
	 * @throws NoSuchContractException if a contract with the primary key could not be found
	 */
	public static Contract[] findByUuid_PrevAndNext(
			long contractId, String uuid,
			OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByUuid_PrevAndNext(
			contractId, uuid, orderByComparator);
	}

	/**
	 * Removes all the contracts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of contracts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contracts
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the contract where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchContractException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public static Contract findByUUID_G(String uuid, long groupId)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the contract where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public static Contract fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the contract where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public static Contract fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	 * Removes the contract where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the contract that was removed
	 */
	public static Contract removeByUUID_G(String uuid, long groupId)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of contracts where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching contracts
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the contracts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching contracts
	 */
	public static List<Contract> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the contracts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @return the range of matching contracts
	 */
	public static List<Contract> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the contracts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contracts
	 */
	public static List<Contract> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Contract> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contracts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contracts
	 */
	public static List<Contract> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Contract> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first contract in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public static Contract findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first contract in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public static Contract fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Contract> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last contract in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public static Contract findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last contract in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public static Contract fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Contract> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the contracts before and after the current contract in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param contractId the primary key of the current contract
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contract
	 * @throws NoSuchContractException if a contract with the primary key could not be found
	 */
	public static Contract[] findByUuid_C_PrevAndNext(
			long contractId, String uuid, long companyId,
			OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByUuid_C_PrevAndNext(
			contractId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the contracts where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of contracts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching contracts
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the contracts where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching contracts
	 */
	public static List<Contract> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the contracts where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @return the range of matching contracts
	 */
	public static List<Contract> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the contracts where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contracts
	 */
	public static List<Contract> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Contract> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contracts where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contracts
	 */
	public static List<Contract> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Contract> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first contract in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public static Contract findByGroupId_First(
			long groupId, OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first contract in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public static Contract fetchByGroupId_First(
		long groupId, OrderByComparator<Contract> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last contract in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public static Contract findByGroupId_Last(
			long groupId, OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last contract in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public static Contract fetchByGroupId_Last(
		long groupId, OrderByComparator<Contract> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the contracts before and after the current contract in the ordered set where groupId = &#63;.
	 *
	 * @param contractId the primary key of the current contract
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contract
	 * @throws NoSuchContractException if a contract with the primary key could not be found
	 */
	public static Contract[] findByGroupId_PrevAndNext(
			long contractId, long groupId,
			OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByGroupId_PrevAndNext(
			contractId, groupId, orderByComparator);
	}

	/**
	 * Returns all the contracts that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching contracts that the user has permission to view
	 */
	public static List<Contract> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	 * Returns a range of all the contracts that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @return the range of matching contracts that the user has permission to view
	 */
	public static List<Contract> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the contracts that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contracts that the user has permission to view
	 */
	public static List<Contract> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Contract> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the contracts before and after the current contract in the ordered set of contracts that the user has permission to view where groupId = &#63;.
	 *
	 * @param contractId the primary key of the current contract
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contract
	 * @throws NoSuchContractException if a contract with the primary key could not be found
	 */
	public static Contract[] filterFindByGroupId_PrevAndNext(
			long contractId, long groupId,
			OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			contractId, groupId, orderByComparator);
	}

	/**
	 * Removes all the contracts where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of contracts where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching contracts
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of contracts that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching contracts that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the contracts where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @return the matching contracts
	 */
	public static List<Contract> findByG_C(long groupId, long contractId) {
		return getPersistence().findByG_C(groupId, contractId);
	}

	/**
	 * Returns a range of all the contracts where groupId = &#63; and contractId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @return the range of matching contracts
	 */
	public static List<Contract> findByG_C(
		long groupId, long contractId, int start, int end) {

		return getPersistence().findByG_C(groupId, contractId, start, end);
	}

	/**
	 * Returns an ordered range of all the contracts where groupId = &#63; and contractId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contracts
	 */
	public static List<Contract> findByG_C(
		long groupId, long contractId, int start, int end,
		OrderByComparator<Contract> orderByComparator) {

		return getPersistence().findByG_C(
			groupId, contractId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contracts where groupId = &#63; and contractId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contracts
	 */
	public static List<Contract> findByG_C(
		long groupId, long contractId, int start, int end,
		OrderByComparator<Contract> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_C(
			groupId, contractId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first contract in the ordered set where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public static Contract findByG_C_First(
			long groupId, long contractId,
			OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByG_C_First(
			groupId, contractId, orderByComparator);
	}

	/**
	 * Returns the first contract in the ordered set where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public static Contract fetchByG_C_First(
		long groupId, long contractId,
		OrderByComparator<Contract> orderByComparator) {

		return getPersistence().fetchByG_C_First(
			groupId, contractId, orderByComparator);
	}

	/**
	 * Returns the last contract in the ordered set where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public static Contract findByG_C_Last(
			long groupId, long contractId,
			OrderByComparator<Contract> orderByComparator)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByG_C_Last(
			groupId, contractId, orderByComparator);
	}

	/**
	 * Returns the last contract in the ordered set where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public static Contract fetchByG_C_Last(
		long groupId, long contractId,
		OrderByComparator<Contract> orderByComparator) {

		return getPersistence().fetchByG_C_Last(
			groupId, contractId, orderByComparator);
	}

	/**
	 * Returns all the contracts that the user has permission to view where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @return the matching contracts that the user has permission to view
	 */
	public static List<Contract> filterFindByG_C(
		long groupId, long contractId) {

		return getPersistence().filterFindByG_C(groupId, contractId);
	}

	/**
	 * Returns a range of all the contracts that the user has permission to view where groupId = &#63; and contractId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @return the range of matching contracts that the user has permission to view
	 */
	public static List<Contract> filterFindByG_C(
		long groupId, long contractId, int start, int end) {

		return getPersistence().filterFindByG_C(
			groupId, contractId, start, end);
	}

	/**
	 * Returns an ordered range of all the contracts that the user has permissions to view where groupId = &#63; and contractId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contracts that the user has permission to view
	 */
	public static List<Contract> filterFindByG_C(
		long groupId, long contractId, int start, int end,
		OrderByComparator<Contract> orderByComparator) {

		return getPersistence().filterFindByG_C(
			groupId, contractId, start, end, orderByComparator);
	}

	/**
	 * Removes all the contracts where groupId = &#63; and contractId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 */
	public static void removeByG_C(long groupId, long contractId) {
		getPersistence().removeByG_C(groupId, contractId);
	}

	/**
	 * Returns the number of contracts where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @return the number of matching contracts
	 */
	public static int countByG_C(long groupId, long contractId) {
		return getPersistence().countByG_C(groupId, contractId);
	}

	/**
	 * Returns the number of contracts that the user has permission to view where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @return the number of matching contracts that the user has permission to view
	 */
	public static int filterCountByG_C(long groupId, long contractId) {
		return getPersistence().filterCountByG_C(groupId, contractId);
	}

	/**
	 * Caches the contract in the entity cache if it is enabled.
	 *
	 * @param contract the contract
	 */
	public static void cacheResult(Contract contract) {
		getPersistence().cacheResult(contract);
	}

	/**
	 * Caches the contracts in the entity cache if it is enabled.
	 *
	 * @param contracts the contracts
	 */
	public static void cacheResult(List<Contract> contracts) {
		getPersistence().cacheResult(contracts);
	}

	/**
	 * Creates a new contract with the primary key. Does not add the contract to the database.
	 *
	 * @param contractId the primary key for the new contract
	 * @return the new contract
	 */
	public static Contract create(long contractId) {
		return getPersistence().create(contractId);
	}

	/**
	 * Removes the contract with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contractId the primary key of the contract
	 * @return the contract that was removed
	 * @throws NoSuchContractException if a contract with the primary key could not be found
	 */
	public static Contract remove(long contractId)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().remove(contractId);
	}

	public static Contract updateImpl(Contract contract) {
		return getPersistence().updateImpl(contract);
	}

	/**
	 * Returns the contract with the primary key or throws a <code>NoSuchContractException</code> if it could not be found.
	 *
	 * @param contractId the primary key of the contract
	 * @return the contract
	 * @throws NoSuchContractException if a contract with the primary key could not be found
	 */
	public static Contract findByPrimaryKey(long contractId)
		throws com.liferay.cm.exception.NoSuchContractException {

		return getPersistence().findByPrimaryKey(contractId);
	}

	/**
	 * Returns the contract with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contractId the primary key of the contract
	 * @return the contract, or <code>null</code> if a contract with the primary key could not be found
	 */
	public static Contract fetchByPrimaryKey(long contractId) {
		return getPersistence().fetchByPrimaryKey(contractId);
	}

	/**
	 * Returns all the contracts.
	 *
	 * @return the contracts
	 */
	public static List<Contract> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the contracts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @return the range of contracts
	 */
	public static List<Contract> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the contracts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contracts
	 */
	public static List<Contract> findAll(
		int start, int end, OrderByComparator<Contract> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contracts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContractModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contracts
	 * @param end the upper bound of the range of contracts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of contracts
	 */
	public static List<Contract> findAll(
		int start, int end, OrderByComparator<Contract> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the contracts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of contracts.
	 *
	 * @return the number of contracts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ContractPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContractPersistence, ContractPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ContractPersistence.class);

		ServiceTracker<ContractPersistence, ContractPersistence>
			serviceTracker =
				new ServiceTracker<ContractPersistence, ContractPersistence>(
					bundle.getBundleContext(), ContractPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}