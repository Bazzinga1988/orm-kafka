--liquibase formatted sql


--changeset ctrl:create-ctrl_object_group_member_history runOnChange:false
drop table if exists ctrl_object_group_member_history;
create table ctrl_object_group_member_history
(
  id                   bigint    not null,
  utc                  timestamp not null,
  user_id              integer   not null,
  action_type          integer   not null,
  descr                text,
  ctrl_object_id       bigint    not null,
  ctrl_object_group_id bigint    not null,
  primary key (id)
);
comment on table  ctrl_object_group_member_history is 'История назначения контролируемого объекта в группу';
comment on column ctrl_object_group_member_history.id is 'ID';
comment on column ctrl_object_group_member_history.utc is 'Время изменения';
comment on column ctrl_object_group_member_history.user_id is 'Пользователь, осуществивший изменения';
comment on column ctrl_object_group_member_history.action_type is 'Идентификатор типа действия';
comment on column ctrl_object_group_member_history.descr is 'Описание';
comment on column ctrl_object_group_member_history.ctrl_object_id is 'Идентификатор контролируемого объекта';
comment on column ctrl_object_group_member_history.ctrl_object_group_id is 'Идентификатор группы контролируемого объекта';
--rollback drop table ctrl_object_group_member_history;


--changeset ctrl:create-index-ctrl_object_group_member_history_idx_ctrl_object_id runOnChange:false
drop index if exists ctrl_object_group_member_history_idx_ctrl_object_id;
create index ctrl_object_group_member_history_idx_ctrl_object_id ON ctrl_object_group_member_history (ctrl_object_id);
--rollback drop index ctrl_object_group_member_history_idx_ctrl_object_id;


--changeset ctrl:create-index-ctrl_object_group_member_history_idx_ctrl_object_group_id runOnChange:false
drop index if exists ctrl_object_group_member_history_idx_ctrl_object_group_id;
create index ctrl_object_group_member_history_idx_ctrl_object_group_id ON ctrl_object_group_member_history (ctrl_object_group_id);
--rollback drop index ctrl_object_group_member_history_idx_ctrl_object_group_id;