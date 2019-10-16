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
 * The base model interface for the Term service. Represents a row in the &quot;CM_Term&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.cm.model.impl.TermModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.cm.model.impl.TermImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Term
 * @generated
 */
@ProviderType
public interface TermModel
	extends BaseModel<Term>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a term model instance should use the {@link Term} interface instead.
	 */

	/**
	 * Returns the primary key of this term.
	 *
	 * @return the primary key of this term
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this term.
	 *
	 * @param primaryKey the primary key of this term
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this term.
	 *
	 * @return the uuid of this term
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this term.
	 *
	 * @param uuid the uuid of this term
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the term ID of this term.
	 *
	 * @return the term ID of this term
	 */
	public long getTermId();

	/**
	 * Sets the term ID of this term.
	 *
	 * @param termId the term ID of this term
	 */
	public void setTermId(long termId);

	/**
	 * Returns the group ID of this term.
	 *
	 * @return the group ID of this term
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this term.
	 *
	 * @param groupId the group ID of this term
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this term.
	 *
	 * @return the company ID of this term
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this term.
	 *
	 * @param companyId the company ID of this term
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this term.
	 *
	 * @return the user ID of this term
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this term.
	 *
	 * @param userId the user ID of this term
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this term.
	 *
	 * @return the user uuid of this term
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this term.
	 *
	 * @param userUuid the user uuid of this term
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this term.
	 *
	 * @return the user name of this term
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this term.
	 *
	 * @param userName the user name of this term
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this term.
	 *
	 * @return the create date of this term
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this term.
	 *
	 * @param createDate the create date of this term
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this term.
	 *
	 * @return the modified date of this term
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this term.
	 *
	 * @param modifiedDate the modified date of this term
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the modifier ID of this term.
	 *
	 * @return the modifier ID of this term
	 */
	public long getModifierId();

	/**
	 * Sets the modifier ID of this term.
	 *
	 * @param modifierId the modifier ID of this term
	 */
	public void setModifierId(long modifierId);

	/**
	 * Returns the modifier name of this term.
	 *
	 * @return the modifier name of this term
	 */
	@AutoEscape
	public String getModifierName();

	/**
	 * Sets the modifier name of this term.
	 *
	 * @param modifierName the modifier name of this term
	 */
	public void setModifierName(String modifierName);

	/**
	 * Returns the name of this term.
	 *
	 * @return the name of this term
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this term.
	 *
	 * @param name the name of this term
	 */
	public void setName(String name);

	/**
	 * Returns the description of this term.
	 *
	 * @return the description of this term
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this term.
	 *
	 * @param description the description of this term
	 */
	public void setDescription(String description);

}