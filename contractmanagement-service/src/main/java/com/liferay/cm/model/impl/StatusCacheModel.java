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

package com.liferay.cm.model.impl;

import com.liferay.cm.model.Status;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Status in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class StatusCacheModel implements CacheModel<Status>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StatusCacheModel)) {
			return false;
		}

		StatusCacheModel statusCacheModel = (StatusCacheModel)obj;

		if (statusId == statusCacheModel.statusId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, statusId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", statusId=");
		sb.append(statusId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", modifierId=");
		sb.append(modifierId);
		sb.append(", modifierName=");
		sb.append(modifierName);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Status toEntityModel() {
		StatusImpl statusImpl = new StatusImpl();

		if (uuid == null) {
			statusImpl.setUuid("");
		}
		else {
			statusImpl.setUuid(uuid);
		}

		statusImpl.setStatusId(statusId);
		statusImpl.setGroupId(groupId);
		statusImpl.setCompanyId(companyId);
		statusImpl.setUserId(userId);

		if (userName == null) {
			statusImpl.setUserName("");
		}
		else {
			statusImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			statusImpl.setCreateDate(null);
		}
		else {
			statusImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			statusImpl.setModifiedDate(null);
		}
		else {
			statusImpl.setModifiedDate(new Date(modifiedDate));
		}

		statusImpl.setModifierId(modifierId);

		if (modifierName == null) {
			statusImpl.setModifierName("");
		}
		else {
			statusImpl.setModifierName(modifierName);
		}

		if (name == null) {
			statusImpl.setName("");
		}
		else {
			statusImpl.setName(name);
		}

		if (description == null) {
			statusImpl.setDescription("");
		}
		else {
			statusImpl.setDescription(description);
		}

		statusImpl.resetOriginalValues();

		return statusImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		statusId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		modifierId = objectInput.readLong();
		modifierName = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(statusId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(modifierId);

		if (modifierName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modifierName);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public String uuid;
	public long statusId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long modifierId;
	public String modifierName;
	public String name;
	public String description;

}