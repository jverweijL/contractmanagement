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

import com.liferay.cm.model.Contract;
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
 * The cache model class for representing Contract in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ContractCacheModel
	implements CacheModel<Contract>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContractCacheModel)) {
			return false;
		}

		ContractCacheModel contractCacheModel = (ContractCacheModel)obj;

		if (contractId == contractCacheModel.contractId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, contractId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", contractId=");
		sb.append(contractId);
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
		sb.append(", version=");
		sb.append(version);
		sb.append(", statusId=");
		sb.append(statusId);
		sb.append(", typeId=");
		sb.append(typeId);
		sb.append(", startdate=");
		sb.append(startdate);
		sb.append(", reviewdate=");
		sb.append(reviewdate);
		sb.append(", autoextend=");
		sb.append(autoextend);
		sb.append(", termId=");
		sb.append(termId);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Contract toEntityModel() {
		ContractImpl contractImpl = new ContractImpl();

		if (uuid == null) {
			contractImpl.setUuid("");
		}
		else {
			contractImpl.setUuid(uuid);
		}

		contractImpl.setContractId(contractId);
		contractImpl.setGroupId(groupId);
		contractImpl.setCompanyId(companyId);
		contractImpl.setUserId(userId);

		if (userName == null) {
			contractImpl.setUserName("");
		}
		else {
			contractImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			contractImpl.setCreateDate(null);
		}
		else {
			contractImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			contractImpl.setModifiedDate(null);
		}
		else {
			contractImpl.setModifiedDate(new Date(modifiedDate));
		}

		contractImpl.setModifierId(modifierId);

		if (modifierName == null) {
			contractImpl.setModifierName("");
		}
		else {
			contractImpl.setModifierName(modifierName);
		}

		if (name == null) {
			contractImpl.setName("");
		}
		else {
			contractImpl.setName(name);
		}

		if (version == null) {
			contractImpl.setVersion("");
		}
		else {
			contractImpl.setVersion(version);
		}

		contractImpl.setStatusId(statusId);
		contractImpl.setTypeId(typeId);

		if (startdate == Long.MIN_VALUE) {
			contractImpl.setStartdate(null);
		}
		else {
			contractImpl.setStartdate(new Date(startdate));
		}

		if (reviewdate == Long.MIN_VALUE) {
			contractImpl.setReviewdate(null);
		}
		else {
			contractImpl.setReviewdate(new Date(reviewdate));
		}

		contractImpl.setAutoextend(autoextend);
		contractImpl.setTermId(termId);

		if (remarks == null) {
			contractImpl.setRemarks("");
		}
		else {
			contractImpl.setRemarks(remarks);
		}

		contractImpl.resetOriginalValues();

		return contractImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		contractId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		modifierId = objectInput.readLong();
		modifierName = objectInput.readUTF();
		name = objectInput.readUTF();
		version = objectInput.readUTF();

		statusId = objectInput.readLong();

		typeId = objectInput.readLong();
		startdate = objectInput.readLong();
		reviewdate = objectInput.readLong();

		autoextend = objectInput.readBoolean();

		termId = objectInput.readLong();
		remarks = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(contractId);

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

		if (version == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(version);
		}

		objectOutput.writeLong(statusId);

		objectOutput.writeLong(typeId);
		objectOutput.writeLong(startdate);
		objectOutput.writeLong(reviewdate);

		objectOutput.writeBoolean(autoextend);

		objectOutput.writeLong(termId);

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}
	}

	public String uuid;
	public long contractId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long modifierId;
	public String modifierName;
	public String name;
	public String version;
	public long statusId;
	public long typeId;
	public long startdate;
	public long reviewdate;
	public boolean autoextend;
	public long termId;
	public String remarks;

}