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
 * Provides the local service utility for Type. This utility wraps
 * <code>com.liferay.cm.service.impl.TypeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TypeLocalService
 * @generated
 */
@ProviderType
public class TypeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.cm.service.impl.TypeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.cm.model.Type addType(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, String description)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addType(serviceContext, name, description);
	}

	/**
	 * Adds the type to the database. Also notifies the appropriate model listeners.
	 *
	 * @param type the type
	 * @return the type that was added
	 * @throws UnsupportedOperationException
	 */
	public static com.liferay.cm.model.Type addType(
			com.liferay.cm.model.Type type)
		throws UnsupportedOperationException {

		return getService().addType(type);
	}

	/**
	 * Creates a new type with the primary key. Does not add the type to the database.
	 *
	 * @param typeId the primary key for the new type
	 * @return the new type
	 */
	public static com.liferay.cm.model.Type createType(long typeId) {
		return getService().createType(typeId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param typeId the primary key of the type
	 * @return the type that was removed
	 * @throws PortalException if a type with the primary key could not be found
	 */
	public static com.liferay.cm.model.Type deleteType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteType(typeId);
	}

	/**
	 * Deletes the type from the database. Also notifies the appropriate model listeners.
	 *
	 * @param type the type
	 * @return the type that was removed
	 * @throws PortalException
	 */
	public static com.liferay.cm.model.Type deleteType(
			com.liferay.cm.model.Type type)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteType(type);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.cm.model.impl.TypeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.cm.model.impl.TypeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.cm.model.Type fetchType(long typeId) {
		return getService().fetchType(typeId);
	}

	/**
	 * Returns the type matching the UUID and group.
	 *
	 * @param uuid the type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching type, or <code>null</code> if a matching type could not be found
	 */
	public static com.liferay.cm.model.Type fetchTypeByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchTypeByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the type with the primary key.
	 *
	 * @param typeId the primary key of the type
	 * @return the type
	 * @throws PortalException if a type with the primary key could not be found
	 */
	public static com.liferay.cm.model.Type getType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getType(typeId);
	}

	/**
	 * Returns the type matching the UUID and group.
	 *
	 * @param uuid the type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching type
	 * @throws PortalException if a matching type could not be found
	 */
	public static com.liferay.cm.model.Type getTypeByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getTypeByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.cm.model.impl.TypeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of types
	 * @param end the upper bound of the range of types (not inclusive)
	 * @return the range of types
	 */
	public static java.util.List<com.liferay.cm.model.Type> getTypes(
		int start, int end) {

		return getService().getTypes(start, end);
	}

	public static java.util.List<com.liferay.cm.model.Type> getTypesByGroupId(
		long groupId) {

		return getService().getTypesByGroupId(groupId);
	}

	public static java.util.List<com.liferay.cm.model.Type> getTypesByGroupId(
		long groupId, int start, int end) {

		return getService().getTypesByGroupId(groupId, start, end);
	}

	/**
	 * Returns all the types matching the UUID and company.
	 *
	 * @param uuid the UUID of the types
	 * @param companyId the primary key of the company
	 * @return the matching types, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.cm.model.Type>
		getTypesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getTypesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of types matching the UUID and company.
	 *
	 * @param uuid the UUID of the types
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of types
	 * @param end the upper bound of the range of types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching types, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.cm.model.Type>
		getTypesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.cm.model.Type> orderByComparator) {

		return getService().getTypesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of types.
	 *
	 * @return the number of types
	 */
	public static int getTypesCount() {
		return getService().getTypesCount();
	}

	public static int getTypesCountByGroupId(long groupId) {
		return getService().getTypesCountByGroupId(groupId);
	}

	public static com.liferay.cm.model.Type updateType(
			long typeId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, String description)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateType(
			typeId, serviceContext, name, description);
	}

	/**
	 * Updates the type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param type the type
	 * @return the type that was updated
	 */
	public static com.liferay.cm.model.Type updateType(
		com.liferay.cm.model.Type type) {

		return getService().updateType(type);
	}

	public static TypeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TypeLocalService, TypeLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TypeLocalService.class);

		ServiceTracker<TypeLocalService, TypeLocalService> serviceTracker =
			new ServiceTracker<TypeLocalService, TypeLocalService>(
				bundle.getBundleContext(), TypeLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}