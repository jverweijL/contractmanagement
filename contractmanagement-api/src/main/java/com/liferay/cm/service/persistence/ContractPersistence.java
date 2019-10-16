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

import com.liferay.cm.exception.NoSuchContractException;
import com.liferay.cm.model.Contract;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the contract service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContractUtil
 * @generated
 */
@ProviderType
public interface ContractPersistence extends BasePersistence<Contract> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContractUtil} to access the contract persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the contracts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contracts
	 */
	public java.util.List<Contract> findByUuid(String uuid);

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
	public java.util.List<Contract> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Contract> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

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
	public java.util.List<Contract> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first contract in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public Contract findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Returns the first contract in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public Contract fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

	/**
	 * Returns the last contract in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public Contract findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Returns the last contract in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public Contract fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

	/**
	 * Returns the contracts before and after the current contract in the ordered set where uuid = &#63;.
	 *
	 * @param contractId the primary key of the current contract
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contract
	 * @throws NoSuchContractException if a contract with the primary key could not be found
	 */
	public Contract[] findByUuid_PrevAndNext(
			long contractId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Removes all the contracts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of contracts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contracts
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the contract where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchContractException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public Contract findByUUID_G(String uuid, long groupId)
		throws NoSuchContractException;

	/**
	 * Returns the contract where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public Contract fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the contract where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public Contract fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the contract where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the contract that was removed
	 */
	public Contract removeByUUID_G(String uuid, long groupId)
		throws NoSuchContractException;

	/**
	 * Returns the number of contracts where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching contracts
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the contracts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching contracts
	 */
	public java.util.List<Contract> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Contract> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Contract> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

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
	public java.util.List<Contract> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first contract in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public Contract findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Returns the first contract in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public Contract fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

	/**
	 * Returns the last contract in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public Contract findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Returns the last contract in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public Contract fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

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
	public Contract[] findByUuid_C_PrevAndNext(
			long contractId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Removes all the contracts where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of contracts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching contracts
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the contracts where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching contracts
	 */
	public java.util.List<Contract> findByGroupId(long groupId);

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
	public java.util.List<Contract> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<Contract> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

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
	public java.util.List<Contract> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first contract in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public Contract findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Returns the first contract in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public Contract fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

	/**
	 * Returns the last contract in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public Contract findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Returns the last contract in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public Contract fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

	/**
	 * Returns the contracts before and after the current contract in the ordered set where groupId = &#63;.
	 *
	 * @param contractId the primary key of the current contract
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contract
	 * @throws NoSuchContractException if a contract with the primary key could not be found
	 */
	public Contract[] findByGroupId_PrevAndNext(
			long contractId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Returns all the contracts that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching contracts that the user has permission to view
	 */
	public java.util.List<Contract> filterFindByGroupId(long groupId);

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
	public java.util.List<Contract> filterFindByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<Contract> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

	/**
	 * Returns the contracts before and after the current contract in the ordered set of contracts that the user has permission to view where groupId = &#63;.
	 *
	 * @param contractId the primary key of the current contract
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contract
	 * @throws NoSuchContractException if a contract with the primary key could not be found
	 */
	public Contract[] filterFindByGroupId_PrevAndNext(
			long contractId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Removes all the contracts where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of contracts where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching contracts
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of contracts that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching contracts that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Returns all the contracts where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @return the matching contracts
	 */
	public java.util.List<Contract> findByG_C(long groupId, long contractId);

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
	public java.util.List<Contract> findByG_C(
		long groupId, long contractId, int start, int end);

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
	public java.util.List<Contract> findByG_C(
		long groupId, long contractId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

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
	public java.util.List<Contract> findByG_C(
		long groupId, long contractId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first contract in the ordered set where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public Contract findByG_C_First(
			long groupId, long contractId,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Returns the first contract in the ordered set where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public Contract fetchByG_C_First(
		long groupId, long contractId,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

	/**
	 * Returns the last contract in the ordered set where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract
	 * @throws NoSuchContractException if a matching contract could not be found
	 */
	public Contract findByG_C_Last(
			long groupId, long contractId,
			com.liferay.portal.kernel.util.OrderByComparator<Contract>
				orderByComparator)
		throws NoSuchContractException;

	/**
	 * Returns the last contract in the ordered set where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contract, or <code>null</code> if a matching contract could not be found
	 */
	public Contract fetchByG_C_Last(
		long groupId, long contractId,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

	/**
	 * Returns all the contracts that the user has permission to view where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @return the matching contracts that the user has permission to view
	 */
	public java.util.List<Contract> filterFindByG_C(
		long groupId, long contractId);

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
	public java.util.List<Contract> filterFindByG_C(
		long groupId, long contractId, int start, int end);

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
	public java.util.List<Contract> filterFindByG_C(
		long groupId, long contractId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

	/**
	 * Removes all the contracts where groupId = &#63; and contractId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 */
	public void removeByG_C(long groupId, long contractId);

	/**
	 * Returns the number of contracts where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @return the number of matching contracts
	 */
	public int countByG_C(long groupId, long contractId);

	/**
	 * Returns the number of contracts that the user has permission to view where groupId = &#63; and contractId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param contractId the contract ID
	 * @return the number of matching contracts that the user has permission to view
	 */
	public int filterCountByG_C(long groupId, long contractId);

	/**
	 * Caches the contract in the entity cache if it is enabled.
	 *
	 * @param contract the contract
	 */
	public void cacheResult(Contract contract);

	/**
	 * Caches the contracts in the entity cache if it is enabled.
	 *
	 * @param contracts the contracts
	 */
	public void cacheResult(java.util.List<Contract> contracts);

	/**
	 * Creates a new contract with the primary key. Does not add the contract to the database.
	 *
	 * @param contractId the primary key for the new contract
	 * @return the new contract
	 */
	public Contract create(long contractId);

	/**
	 * Removes the contract with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contractId the primary key of the contract
	 * @return the contract that was removed
	 * @throws NoSuchContractException if a contract with the primary key could not be found
	 */
	public Contract remove(long contractId) throws NoSuchContractException;

	public Contract updateImpl(Contract contract);

	/**
	 * Returns the contract with the primary key or throws a <code>NoSuchContractException</code> if it could not be found.
	 *
	 * @param contractId the primary key of the contract
	 * @return the contract
	 * @throws NoSuchContractException if a contract with the primary key could not be found
	 */
	public Contract findByPrimaryKey(long contractId)
		throws NoSuchContractException;

	/**
	 * Returns the contract with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contractId the primary key of the contract
	 * @return the contract, or <code>null</code> if a contract with the primary key could not be found
	 */
	public Contract fetchByPrimaryKey(long contractId);

	/**
	 * Returns all the contracts.
	 *
	 * @return the contracts
	 */
	public java.util.List<Contract> findAll();

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
	public java.util.List<Contract> findAll(int start, int end);

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
	public java.util.List<Contract> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator);

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
	public java.util.List<Contract> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contract>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the contracts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of contracts.
	 *
	 * @return the number of contracts
	 */
	public int countAll();

}