create index IX_1A8AF15E on CM_Contract (groupId, contractId);
create index IX_B58C1C21 on CM_Contract (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_71FF36E3 on CM_Contract (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D79FDE on CM_Status (groupId, statusId);
create index IX_53829C41 on CM_Status (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A5D73F03 on CM_Status (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E0F6571E on CM_Term (groupId, termId);
create index IX_E8AB50FB on CM_Term (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_8939DA3D on CM_Term (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_2B4A815E on CM_Type (groupId, typeId);
create index IX_42B828C9 on CM_Type (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_48964D8B on CM_Type (uuid_[$COLUMN_LENGTH:75$], groupId);