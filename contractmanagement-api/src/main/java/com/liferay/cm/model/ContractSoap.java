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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.cm.service.http.ContractServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ContractSoap implements Serializable {

	public static ContractSoap toSoapModel(Contract model) {
		ContractSoap soapModel = new ContractSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setContractId(model.getContractId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifierId(model.getModifierId());
		soapModel.setModifierName(model.getModifierName());
		soapModel.setName(model.getName());
		soapModel.setVersion(model.getVersion());
		soapModel.setStatusId(model.getStatusId());
		soapModel.setTypeId(model.getTypeId());
		soapModel.setStartdate(model.getStartdate());
		soapModel.setReviewdate(model.getReviewdate());
		soapModel.setAutoextend(model.isAutoextend());
		soapModel.setTermId(model.getTermId());
		soapModel.setRemarks(model.getRemarks());

		return soapModel;
	}

	public static ContractSoap[] toSoapModels(Contract[] models) {
		ContractSoap[] soapModels = new ContractSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ContractSoap[][] toSoapModels(Contract[][] models) {
		ContractSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ContractSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ContractSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ContractSoap[] toSoapModels(List<Contract> models) {
		List<ContractSoap> soapModels = new ArrayList<ContractSoap>(
			models.size());

		for (Contract model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ContractSoap[soapModels.size()]);
	}

	public ContractSoap() {
	}

	public long getPrimaryKey() {
		return _contractId;
	}

	public void setPrimaryKey(long pk) {
		setContractId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getContractId() {
		return _contractId;
	}

	public void setContractId(long contractId) {
		_contractId = contractId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getModifierId() {
		return _modifierId;
	}

	public void setModifierId(long modifierId) {
		_modifierId = modifierId;
	}

	public String getModifierName() {
		return _modifierName;
	}

	public void setModifierName(String modifierName) {
		_modifierName = modifierName;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getVersion() {
		return _version;
	}

	public void setVersion(String version) {
		_version = version;
	}

	public long getStatusId() {
		return _statusId;
	}

	public void setStatusId(long statusId) {
		_statusId = statusId;
	}

	public long getTypeId() {
		return _typeId;
	}

	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	public Date getStartdate() {
		return _startdate;
	}

	public void setStartdate(Date startdate) {
		_startdate = startdate;
	}

	public Date getReviewdate() {
		return _reviewdate;
	}

	public void setReviewdate(Date reviewdate) {
		_reviewdate = reviewdate;
	}

	public boolean getAutoextend() {
		return _autoextend;
	}

	public boolean isAutoextend() {
		return _autoextend;
	}

	public void setAutoextend(boolean autoextend) {
		_autoextend = autoextend;
	}

	public long getTermId() {
		return _termId;
	}

	public void setTermId(long termId) {
		_termId = termId;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	private String _uuid;
	private long _contractId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _modifierId;
	private String _modifierName;
	private String _name;
	private String _version;
	private long _statusId;
	private long _typeId;
	private Date _startdate;
	private Date _reviewdate;
	private boolean _autoextend;
	private long _termId;
	private String _remarks;

}