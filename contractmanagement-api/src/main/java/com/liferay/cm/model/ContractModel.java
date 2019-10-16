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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Contract service. Represents a row in the &quot;CM_Contract&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.cm.model.impl.ContractModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.cm.model.impl.ContractImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Contract
 * @generated
 */
@ProviderType
public interface ContractModel
	extends BaseModel<Contract>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a contract model instance should use the {@link Contract} interface instead.
	 */

	/**
	 * Returns the primary key of this contract.
	 *
	 * @return the primary key of this contract
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this contract.
	 *
	 * @param primaryKey the primary key of this contract
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this contract.
	 *
	 * @return the uuid of this contract
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this contract.
	 *
	 * @param uuid the uuid of this contract
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the contract ID of this contract.
	 *
	 * @return the contract ID of this contract
	 */
	public long getContractId();

	/**
	 * Sets the contract ID of this contract.
	 *
	 * @param contractId the contract ID of this contract
	 */
	public void setContractId(long contractId);

	/**
	 * Returns the group ID of this contract.
	 *
	 * @return the group ID of this contract
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this contract.
	 *
	 * @param groupId the group ID of this contract
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this contract.
	 *
	 * @return the company ID of this contract
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this contract.
	 *
	 * @param companyId the company ID of this contract
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this contract.
	 *
	 * @return the user ID of this contract
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this contract.
	 *
	 * @param userId the user ID of this contract
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this contract.
	 *
	 * @return the user uuid of this contract
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this contract.
	 *
	 * @param userUuid the user uuid of this contract
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this contract.
	 *
	 * @return the user name of this contract
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this contract.
	 *
	 * @param userName the user name of this contract
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this contract.
	 *
	 * @return the create date of this contract
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this contract.
	 *
	 * @param createDate the create date of this contract
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this contract.
	 *
	 * @return the modified date of this contract
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this contract.
	 *
	 * @param modifiedDate the modified date of this contract
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the modifier ID of this contract.
	 *
	 * @return the modifier ID of this contract
	 */
	public long getModifierId();

	/**
	 * Sets the modifier ID of this contract.
	 *
	 * @param modifierId the modifier ID of this contract
	 */
	public void setModifierId(long modifierId);

	/**
	 * Returns the modifier name of this contract.
	 *
	 * @return the modifier name of this contract
	 */
	@AutoEscape
	public String getModifierName();

	/**
	 * Sets the modifier name of this contract.
	 *
	 * @param modifierName the modifier name of this contract
	 */
	public void setModifierName(String modifierName);

	/**
	 * Returns the name of this contract.
	 *
	 * @return the name of this contract
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this contract.
	 *
	 * @param name the name of this contract
	 */
	public void setName(String name);

	/**
	 * Returns the version of this contract.
	 *
	 * @return the version of this contract
	 */
	@AutoEscape
	public String getVersion();

	/**
	 * Sets the version of this contract.
	 *
	 * @param version the version of this contract
	 */
	public void setVersion(String version);

	/**
	 * Returns the status ID of this contract.
	 *
	 * @return the status ID of this contract
	 */
	public long getStatusId();

	/**
	 * Sets the status ID of this contract.
	 *
	 * @param statusId the status ID of this contract
	 */
	public void setStatusId(long statusId);

	/**
	 * Returns the type ID of this contract.
	 *
	 * @return the type ID of this contract
	 */
	public long getTypeId();

	/**
	 * Sets the type ID of this contract.
	 *
	 * @param typeId the type ID of this contract
	 */
	public void setTypeId(long typeId);

	/**
	 * Returns the startdate of this contract.
	 *
	 * @return the startdate of this contract
	 */
	public Date getStartdate();

	/**
	 * Sets the startdate of this contract.
	 *
	 * @param startdate the startdate of this contract
	 */
	public void setStartdate(Date startdate);

	/**
	 * Returns the reviewdate of this contract.
	 *
	 * @return the reviewdate of this contract
	 */
	public Date getReviewdate();

	/**
	 * Sets the reviewdate of this contract.
	 *
	 * @param reviewdate the reviewdate of this contract
	 */
	public void setReviewdate(Date reviewdate);

	/**
	 * Returns the autoextend of this contract.
	 *
	 * @return the autoextend of this contract
	 */
	public boolean getAutoextend();

	/**
	 * Returns <code>true</code> if this contract is autoextend.
	 *
	 * @return <code>true</code> if this contract is autoextend; <code>false</code> otherwise
	 */
	public boolean isAutoextend();

	/**
	 * Sets whether this contract is autoextend.
	 *
	 * @param autoextend the autoextend of this contract
	 */
	public void setAutoextend(boolean autoextend);

	/**
	 * Returns the term ID of this contract.
	 *
	 * @return the term ID of this contract
	 */
	public long getTermId();

	/**
	 * Sets the term ID of this contract.
	 *
	 * @param termId the term ID of this contract
	 */
	public void setTermId(long termId);

	/**
	 * Returns the remarks of this contract.
	 *
	 * @return the remarks of this contract
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this contract.
	 *
	 * @param remarks the remarks of this contract
	 */
	public void setRemarks(String remarks);

}