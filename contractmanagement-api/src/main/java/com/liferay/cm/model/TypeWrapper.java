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

package com.liferay.cm.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Type}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Type
 * @generated
 */
@ProviderType
public class TypeWrapper
	extends BaseModelWrapper<Type> implements Type, ModelWrapper<Type> {

	public TypeWrapper(Type type) {
		super(type);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("typeId", getTypeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifierId", getModifierId());
		attributes.put("modifierName", getModifierName());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long modifierId = (Long)attributes.get("modifierId");

		if (modifierId != null) {
			setModifierId(modifierId);
		}

		String modifierName = (String)attributes.get("modifierName");

		if (modifierName != null) {
			setModifierName(modifierName);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	 * Returns the company ID of this type.
	 *
	 * @return the company ID of this type
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this type.
	 *
	 * @return the create date of this type
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this type.
	 *
	 * @return the description of this type
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this type.
	 *
	 * @return the group ID of this type
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this type.
	 *
	 * @return the modified date of this type
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the modifier ID of this type.
	 *
	 * @return the modifier ID of this type
	 */
	@Override
	public long getModifierId() {
		return model.getModifierId();
	}

	/**
	 * Returns the modifier name of this type.
	 *
	 * @return the modifier name of this type
	 */
	@Override
	public String getModifierName() {
		return model.getModifierName();
	}

	/**
	 * Returns the name of this type.
	 *
	 * @return the name of this type
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this type.
	 *
	 * @return the primary key of this type
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type ID of this type.
	 *
	 * @return the type ID of this type
	 */
	@Override
	public long getTypeId() {
		return model.getTypeId();
	}

	/**
	 * Returns the user ID of this type.
	 *
	 * @return the user ID of this type
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this type.
	 *
	 * @return the user name of this type
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this type.
	 *
	 * @return the user uuid of this type
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this type.
	 *
	 * @return the uuid of this type
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this type.
	 *
	 * @param companyId the company ID of this type
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this type.
	 *
	 * @param createDate the create date of this type
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this type.
	 *
	 * @param description the description of this type
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this type.
	 *
	 * @param groupId the group ID of this type
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this type.
	 *
	 * @param modifiedDate the modified date of this type
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the modifier ID of this type.
	 *
	 * @param modifierId the modifier ID of this type
	 */
	@Override
	public void setModifierId(long modifierId) {
		model.setModifierId(modifierId);
	}

	/**
	 * Sets the modifier name of this type.
	 *
	 * @param modifierName the modifier name of this type
	 */
	@Override
	public void setModifierName(String modifierName) {
		model.setModifierName(modifierName);
	}

	/**
	 * Sets the name of this type.
	 *
	 * @param name the name of this type
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this type.
	 *
	 * @param primaryKey the primary key of this type
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type ID of this type.
	 *
	 * @param typeId the type ID of this type
	 */
	@Override
	public void setTypeId(long typeId) {
		model.setTypeId(typeId);
	}

	/**
	 * Sets the user ID of this type.
	 *
	 * @param userId the user ID of this type
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this type.
	 *
	 * @param userName the user name of this type
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this type.
	 *
	 * @param userUuid the user uuid of this type
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this type.
	 *
	 * @param uuid the uuid of this type
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected TypeWrapper wrap(Type type) {
		return new TypeWrapper(type);
	}

}