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

import com.liferay.cm.model.Status;
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
 * The persistence utility for the status service. This utility wraps <code>com.liferay.cm.service.persistence.impl.StatusPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StatusPersistence
 * @generated
 */
@ProviderType
public class StatusUtil {

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
	public static void clearCache(Status status) {
		getPersistence().clearCache(status);
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
	public static Map<Serializable, Status> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Status> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Status> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Status> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Status> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Status update(Status status) {
		return getPersistence().update(status);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Status update(Status status, ServiceContext serviceContext) {
		return getPersistence().update(status, serviceContext);
	}

	/**
	 * Returns all the statuses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching statuses
	 */
	public static List<Status> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the statuses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @return the range of matching statuses
	 */
	public static List<Status> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the statuses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching statuses
	 */
	public static List<Status> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Status> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the statuses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching statuses
	 */
	public static List<Status> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Status> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first status in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching status
	 * @throws NoSuchStatusException if a matching status could not be found
	 */
	public static Status findByUuid_First(
			String uuid, OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first status in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching status, or <code>null</code> if a matching status could not be found
	 */
	public static Status fetchByUuid_First(
		String uuid, OrderByComparator<Status> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last status in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching status
	 * @throws NoSuchStatusException if a matching status could not be found
	 */
	public static Status findByUuid_Last(
			String uuid, OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last status in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching status, or <code>null</code> if a matching status could not be found
	 */
	public static Status fetchByUuid_Last(
		String uuid, OrderByComparator<Status> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the statuses before and after the current status in the ordered set where uuid = &#63;.
	 *
	 * @param statusId the primary key of the current status
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next status
	 * @throws NoSuchStatusException if a status with the primary key could not be found
	 */
	public static Status[] findByUuid_PrevAndNext(
			long statusId, String uuid,
			OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByUuid_PrevAndNext(
			statusId, uuid, orderByComparator);
	}

	/**
	 * Removes all the statuses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of statuses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching statuses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the status where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchStatusException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching status
	 * @throws NoSuchStatusException if a matching status could not be found
	 */
	public static Status findByUUID_G(String uuid, long groupId)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the status where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching status, or <code>null</code> if a matching status could not be found
	 */
	public static Status fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the status where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching status, or <code>null</code> if a matching status could not be found
	 */
	public static Status fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	 * Removes the status where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the status that was removed
	 */
	public static Status removeByUUID_G(String uuid, long groupId)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of statuses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching statuses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the statuses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching statuses
	 */
	public static List<Status> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the statuses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @return the range of matching statuses
	 */
	public static List<Status> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the statuses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching statuses
	 */
	public static List<Status> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Status> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the statuses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching statuses
	 */
	public static List<Status> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Status> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first status in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching status
	 * @throws NoSuchStatusException if a matching status could not be found
	 */
	public static Status findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first status in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching status, or <code>null</code> if a matching status could not be found
	 */
	public static Status fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Status> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last status in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching status
	 * @throws NoSuchStatusException if a matching status could not be found
	 */
	public static Status findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last status in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching status, or <code>null</code> if a matching status could not be found
	 */
	public static Status fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Status> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the statuses before and after the current status in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param statusId the primary key of the current status
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next status
	 * @throws NoSuchStatusException if a status with the primary key could not be found
	 */
	public static Status[] findByUuid_C_PrevAndNext(
			long statusId, String uuid, long companyId,
			OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByUuid_C_PrevAndNext(
			statusId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the statuses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of statuses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching statuses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the statuses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching statuses
	 */
	public static List<Status> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the statuses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @return the range of matching statuses
	 */
	public static List<Status> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the statuses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching statuses
	 */
	public static List<Status> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Status> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the statuses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching statuses
	 */
	public static List<Status> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Status> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first status in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching status
	 * @throws NoSuchStatusException if a matching status could not be found
	 */
	public static Status findByGroupId_First(
			long groupId, OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first status in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching status, or <code>null</code> if a matching status could not be found
	 */
	public static Status fetchByGroupId_First(
		long groupId, OrderByComparator<Status> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last status in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching status
	 * @throws NoSuchStatusException if a matching status could not be found
	 */
	public static Status findByGroupId_Last(
			long groupId, OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last status in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching status, or <code>null</code> if a matching status could not be found
	 */
	public static Status fetchByGroupId_Last(
		long groupId, OrderByComparator<Status> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the statuses before and after the current status in the ordered set where groupId = &#63;.
	 *
	 * @param statusId the primary key of the current status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next status
	 * @throws NoSuchStatusException if a status with the primary key could not be found
	 */
	public static Status[] findByGroupId_PrevAndNext(
			long statusId, long groupId,
			OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByGroupId_PrevAndNext(
			statusId, groupId, orderByComparator);
	}

	/**
	 * Returns all the statuses that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching statuses that the user has permission to view
	 */
	public static List<Status> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	 * Returns a range of all the statuses that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @return the range of matching statuses that the user has permission to view
	 */
	public static List<Status> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the statuses that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching statuses that the user has permission to view
	 */
	public static List<Status> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Status> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the statuses before and after the current status in the ordered set of statuses that the user has permission to view where groupId = &#63;.
	 *
	 * @param statusId the primary key of the current status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next status
	 * @throws NoSuchStatusException if a status with the primary key could not be found
	 */
	public static Status[] filterFindByGroupId_PrevAndNext(
			long statusId, long groupId,
			OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			statusId, groupId, orderByComparator);
	}

	/**
	 * Removes all the statuses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of statuses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching statuses
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of statuses that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching statuses that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the statuses where groupId = &#63; and statusId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @return the matching statuses
	 */
	public static List<Status> findByG_S(long groupId, long statusId) {
		return getPersistence().findByG_S(groupId, statusId);
	}

	/**
	 * Returns a range of all the statuses where groupId = &#63; and statusId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @return the range of matching statuses
	 */
	public static List<Status> findByG_S(
		long groupId, long statusId, int start, int end) {

		return getPersistence().findByG_S(groupId, statusId, start, end);
	}

	/**
	 * Returns an ordered range of all the statuses where groupId = &#63; and statusId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching statuses
	 */
	public static List<Status> findByG_S(
		long groupId, long statusId, int start, int end,
		OrderByComparator<Status> orderByComparator) {

		return getPersistence().findByG_S(
			groupId, statusId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the statuses where groupId = &#63; and statusId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching statuses
	 */
	public static List<Status> findByG_S(
		long groupId, long statusId, int start, int end,
		OrderByComparator<Status> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_S(
			groupId, statusId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first status in the ordered set where groupId = &#63; and statusId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching status
	 * @throws NoSuchStatusException if a matching status could not be found
	 */
	public static Status findByG_S_First(
			long groupId, long statusId,
			OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByG_S_First(
			groupId, statusId, orderByComparator);
	}

	/**
	 * Returns the first status in the ordered set where groupId = &#63; and statusId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching status, or <code>null</code> if a matching status could not be found
	 */
	public static Status fetchByG_S_First(
		long groupId, long statusId,
		OrderByComparator<Status> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			groupId, statusId, orderByComparator);
	}

	/**
	 * Returns the last status in the ordered set where groupId = &#63; and statusId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching status
	 * @throws NoSuchStatusException if a matching status could not be found
	 */
	public static Status findByG_S_Last(
			long groupId, long statusId,
			OrderByComparator<Status> orderByComparator)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByG_S_Last(
			groupId, statusId, orderByComparator);
	}

	/**
	 * Returns the last status in the ordered set where groupId = &#63; and statusId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching status, or <code>null</code> if a matching status could not be found
	 */
	public static Status fetchByG_S_Last(
		long groupId, long statusId,
		OrderByComparator<Status> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			groupId, statusId, orderByComparator);
	}

	/**
	 * Returns all the statuses that the user has permission to view where groupId = &#63; and statusId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @return the matching statuses that the user has permission to view
	 */
	public static List<Status> filterFindByG_S(long groupId, long statusId) {
		return getPersistence().filterFindByG_S(groupId, statusId);
	}

	/**
	 * Returns a range of all the statuses that the user has permission to view where groupId = &#63; and statusId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @return the range of matching statuses that the user has permission to view
	 */
	public static List<Status> filterFindByG_S(
		long groupId, long statusId, int start, int end) {

		return getPersistence().filterFindByG_S(groupId, statusId, start, end);
	}

	/**
	 * Returns an ordered range of all the statuses that the user has permissions to view where groupId = &#63; and statusId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching statuses that the user has permission to view
	 */
	public static List<Status> filterFindByG_S(
		long groupId, long statusId, int start, int end,
		OrderByComparator<Status> orderByComparator) {

		return getPersistence().filterFindByG_S(
			groupId, statusId, start, end, orderByComparator);
	}

	/**
	 * Removes all the statuses where groupId = &#63; and statusId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 */
	public static void removeByG_S(long groupId, long statusId) {
		getPersistence().removeByG_S(groupId, statusId);
	}

	/**
	 * Returns the number of statuses where groupId = &#63; and statusId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @return the number of matching statuses
	 */
	public static int countByG_S(long groupId, long statusId) {
		return getPersistence().countByG_S(groupId, statusId);
	}

	/**
	 * Returns the number of statuses that the user has permission to view where groupId = &#63; and statusId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusId the status ID
	 * @return the number of matching statuses that the user has permission to view
	 */
	public static int filterCountByG_S(long groupId, long statusId) {
		return getPersistence().filterCountByG_S(groupId, statusId);
	}

	/**
	 * Caches the status in the entity cache if it is enabled.
	 *
	 * @param status the status
	 */
	public static void cacheResult(Status status) {
		getPersistence().cacheResult(status);
	}

	/**
	 * Caches the statuses in the entity cache if it is enabled.
	 *
	 * @param statuses the statuses
	 */
	public static void cacheResult(List<Status> statuses) {
		getPersistence().cacheResult(statuses);
	}

	/**
	 * Creates a new status with the primary key. Does not add the status to the database.
	 *
	 * @param statusId the primary key for the new status
	 * @return the new status
	 */
	public static Status create(long statusId) {
		return getPersistence().create(statusId);
	}

	/**
	 * Removes the status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param statusId the primary key of the status
	 * @return the status that was removed
	 * @throws NoSuchStatusException if a status with the primary key could not be found
	 */
	public static Status remove(long statusId)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().remove(statusId);
	}

	public static Status updateImpl(Status status) {
		return getPersistence().updateImpl(status);
	}

	/**
	 * Returns the status with the primary key or throws a <code>NoSuchStatusException</code> if it could not be found.
	 *
	 * @param statusId the primary key of the status
	 * @return the status
	 * @throws NoSuchStatusException if a status with the primary key could not be found
	 */
	public static Status findByPrimaryKey(long statusId)
		throws com.liferay.cm.exception.NoSuchStatusException {

		return getPersistence().findByPrimaryKey(statusId);
	}

	/**
	 * Returns the status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param statusId the primary key of the status
	 * @return the status, or <code>null</code> if a status with the primary key could not be found
	 */
	public static Status fetchByPrimaryKey(long statusId) {
		return getPersistence().fetchByPrimaryKey(statusId);
	}

	/**
	 * Returns all the statuses.
	 *
	 * @return the statuses
	 */
	public static List<Status> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @return the range of statuses
	 */
	public static List<Status> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of statuses
	 */
	public static List<Status> findAll(
		int start, int end, OrderByComparator<Status> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>StatusModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of statuses
	 * @param end the upper bound of the range of statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of statuses
	 */
	public static List<Status> findAll(
		int start, int end, OrderByComparator<Status> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the statuses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of statuses.
	 *
	 * @return the number of statuses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StatusPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StatusPersistence, StatusPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(StatusPersistence.class);

		ServiceTracker<StatusPersistence, StatusPersistence> serviceTracker =
			new ServiceTracker<StatusPersistence, StatusPersistence>(
				bundle.getBundleContext(), StatusPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}