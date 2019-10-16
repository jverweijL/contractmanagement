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
 * This class is a wrapper for {@link Contract}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Contract
 * @generated
 */
@ProviderType
public class ContractWrapper
	extends BaseModelWrapper<Contract>
	implements Contract, ModelWrapper<Contract> {

	public ContractWrapper(Contract contract) {
		super(contract);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("contractId", getContractId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifierId", getModifierId());
		attributes.put("modifierName", getModifierName());
		attributes.put("name", getName());
		attributes.put("version", getVersion());
		attributes.put("statusId", getStatusId());
		attributes.put("typeId", getTypeId());
		attributes.put("startdate", getStartdate());
		attributes.put("reviewdate", getReviewdate());
		attributes.put("autoextend", isAutoextend());
		attributes.put("termId", getTermId());
		attributes.put("remarks", getRemarks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long contractId = (Long)attributes.get("contractId");

		if (contractId != null) {
			setContractId(contractId);
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

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		Long statusId = (Long)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		Date startdate = (Date)attributes.get("startdate");

		if (startdate != null) {
			setStartdate(startdate);
		}

		Date reviewdate = (Date)attributes.get("reviewdate");

		if (reviewdate != null) {
			setReviewdate(reviewdate);
		}

		Boolean autoextend = (Boolean)attributes.get("autoextend");

		if (autoextend != null) {
			setAutoextend(autoextend);
		}

		Long termId = (Long)attributes.get("termId");

		if (termId != null) {
			setTermId(termId);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	/**
	 * Returns the autoextend of this contract.
	 *
	 * @return the autoextend of this contract
	 */
	@Override
	public boolean getAutoextend() {
		return model.getAutoextend();
	}

	/**
	 * Returns the company ID of this contract.
	 *
	 * @return the company ID of this contract
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contract ID of this contract.
	 *
	 * @return the contract ID of this contract
	 */
	@Override
	public long getContractId() {
		return model.getContractId();
	}

	/**
	 * Returns the create date of this contract.
	 *
	 * @return the create date of this contract
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this contract.
	 *
	 * @return the group ID of this contract
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this contract.
	 *
	 * @return the modified date of this contract
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the modifier ID of this contract.
	 *
	 * @return the modifier ID of this contract
	 */
	@Override
	public long getModifierId() {
		return model.getModifierId();
	}

	/**
	 * Returns the modifier name of this contract.
	 *
	 * @return the modifier name of this contract
	 */
	@Override
	public String getModifierName() {
		return model.getModifierName();
	}

	/**
	 * Returns the name of this contract.
	 *
	 * @return the name of this contract
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this contract.
	 *
	 * @return the primary key of this contract
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the remarks of this contract.
	 *
	 * @return the remarks of this contract
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the reviewdate of this contract.
	 *
	 * @return the reviewdate of this contract
	 */
	@Override
	public Date getReviewdate() {
		return model.getReviewdate();
	}

	/**
	 * Returns the startdate of this contract.
	 *
	 * @return the startdate of this contract
	 */
	@Override
	public Date getStartdate() {
		return model.getStartdate();
	}

	/**
	 * Returns the status ID of this contract.
	 *
	 * @return the status ID of this contract
	 */
	@Override
	public long getStatusId() {
		return model.getStatusId();
	}

	/**
	 * Returns the term ID of this contract.
	 *
	 * @return the term ID of this contract
	 */
	@Override
	public long getTermId() {
		return model.getTermId();
	}

	/**
	 * Returns the type ID of this contract.
	 *
	 * @return the type ID of this contract
	 */
	@Override
	public long getTypeId() {
		return model.getTypeId();
	}

	/**
	 * Returns the user ID of this contract.
	 *
	 * @return the user ID of this contract
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this contract.
	 *
	 * @return the user name of this contract
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this contract.
	 *
	 * @return the user uuid of this contract
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this contract.
	 *
	 * @return the uuid of this contract
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the version of this contract.
	 *
	 * @return the version of this contract
	 */
	@Override
	public String getVersion() {
		return model.getVersion();
	}

	/**
	 * Returns <code>true</code> if this contract is autoextend.
	 *
	 * @return <code>true</code> if this contract is autoextend; <code>false</code> otherwise
	 */
	@Override
	public boolean isAutoextend() {
		return model.isAutoextend();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this contract is autoextend.
	 *
	 * @param autoextend the autoextend of this contract
	 */
	@Override
	public void setAutoextend(boolean autoextend) {
		model.setAutoextend(autoextend);
	}

	/**
	 * Sets the company ID of this contract.
	 *
	 * @param companyId the company ID of this contract
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contract ID of this contract.
	 *
	 * @param contractId the contract ID of this contract
	 */
	@Override
	public void setContractId(long contractId) {
		model.setContractId(contractId);
	}

	/**
	 * Sets the create date of this contract.
	 *
	 * @param createDate the create date of this contract
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this contract.
	 *
	 * @param groupId the group ID of this contract
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this contract.
	 *
	 * @param modifiedDate the modified date of this contract
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the modifier ID of this contract.
	 *
	 * @param modifierId the modifier ID of this contract
	 */
	@Override
	public void setModifierId(long modifierId) {
		model.setModifierId(modifierId);
	}

	/**
	 * Sets the modifier name of this contract.
	 *
	 * @param modifierName the modifier name of this contract
	 */
	@Override
	public void setModifierName(String modifierName) {
		model.setModifierName(modifierName);
	}

	/**
	 * Sets the name of this contract.
	 *
	 * @param name the name of this contract
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this contract.
	 *
	 * @param primaryKey the primary key of this contract
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the remarks of this contract.
	 *
	 * @param remarks the remarks of this contract
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the reviewdate of this contract.
	 *
	 * @param reviewdate the reviewdate of this contract
	 */
	@Override
	public void setReviewdate(Date reviewdate) {
		model.setReviewdate(reviewdate);
	}

	/**
	 * Sets the startdate of this contract.
	 *
	 * @param startdate the startdate of this contract
	 */
	@Override
	public void setStartdate(Date startdate) {
		model.setStartdate(startdate);
	}

	/**
	 * Sets the status ID of this contract.
	 *
	 * @param statusId the status ID of this contract
	 */
	@Override
	public void setStatusId(long statusId) {
		model.setStatusId(statusId);
	}

	/**
	 * Sets the term ID of this contract.
	 *
	 * @param termId the term ID of this contract
	 */
	@Override
	public void setTermId(long termId) {
		model.setTermId(termId);
	}

	/**
	 * Sets the type ID of this contract.
	 *
	 * @param typeId the type ID of this contract
	 */
	@Override
	public void setTypeId(long typeId) {
		model.setTypeId(typeId);
	}

	/**
	 * Sets the user ID of this contract.
	 *
	 * @param userId the user ID of this contract
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this contract.
	 *
	 * @param userName the user name of this contract
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this contract.
	 *
	 * @param userUuid the user uuid of this contract
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this contract.
	 *
	 * @param uuid the uuid of this contract
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the version of this contract.
	 *
	 * @param version the version of this contract
	 */
	@Override
	public void setVersion(String version) {
		model.setVersion(version);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected ContractWrapper wrap(Contract contract) {
		return new ContractWrapper(contract);
	}

}