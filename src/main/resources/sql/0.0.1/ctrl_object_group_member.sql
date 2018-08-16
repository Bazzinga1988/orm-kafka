--liquibase formatted sql


--changeset ctrl:create-ctrl_object_group_member runOnChange:false
drop table if exists ctrl_object_group_member;
create table ctrl_object_group_member
(
  ctrl_object_id       bigint not null,
  ctrl_object_group_id bigint not null,
  utc                  text   not null,
  unique (ctrl_object_id, ctrl_object_group_id)
);
comment on table  ctrl_object_group_member is 'Участник группы контролируемых объектов';
comment on column ctrl_object_group_member.ctrl_object_id is 'Идентификатор контролируемого объекта';
comment on column ctrl_object_group_member.ctrl_object_group_id is 'Идентификатор группы контролируемого объекта';
comment on column ctrl_object_group_member.utc is 'Время последнего изменения';
--rollback drop table ctrl_object_group_member;


--changeset ctrl:create-index-ctrl_object_group_member_idx_ctrl_object_id runOnChange:false
drop index if exists ctrl_object_group_member_idx_ctrl_object_id;
create index ctrl_object_group_member_idx_ctrl_object_id ON ctrl_object_group_member (ctrl_object_id);
--rollback drop index ctrl_object_group_member_idx_ctrl_object_id;


--changeset ctrl:create-index-ctrl_object_group_member_idx_ctrl_object_group_id runOnChange:false
drop table if exists ctrl_object_group_member_idx_ctrl_object_group_id;
drop index if exists ctrl_object_group_member_idx_ctrl_object_group_id;
create index ctrl_object_group_member_idx_ctrl_object_group_id ON ctrl_object_group_member (ctrl_object_group_id);
--rollback drop index ctrl_object_group_member_idx_ctrl_object_group_id;