create table CM_Contract (
	uuid_ VARCHAR(75) null,
	contractId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	modifierId LONG,
	modifierName VARCHAR(75) null,
	name VARCHAR(75) null,
	version VARCHAR(75) null,
	statusId LONG,
	typeId LONG,
	startdate DATE null,
	reviewdate DATE null,
	autoextend BOOLEAN,
	termId LONG,
	remarks STRING null
);

create table CM_Status (
	uuid_ VARCHAR(75) null,
	statusId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	modifierId LONG,
	modifierName VARCHAR(75) null,
	name VARCHAR(75) null,
	description STRING null
);

create table CM_Term (
	uuid_ VARCHAR(75) null,
	termId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	modifierId LONG,
	modifierName VARCHAR(75) null,
	name VARCHAR(75) null,
	description STRING null
);

create table CM_Type (
	uuid_ VARCHAR(75) null,
	typeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	modifierId LONG,
	modifierName VARCHAR(75) null,
	name VARCHAR(75) null,
	description STRING null
);