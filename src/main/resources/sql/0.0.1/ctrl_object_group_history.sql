--liquibase formatted sql


--changeset ctrl:create-ctrl_object_group_history runOnChange:false
drop table if exists ctrl_object_group_history;
create table ctrl_object_group_history
(
  id                   bigint    not null,
  utc                  timestamp not null,
  user_id              integer   not null,
  action_type          integer   not null,
  descr                text,
  ctrl_object_group_id integer   not null,
  status               integer   not null,
  primary key (id)
);
comment on table  ctrl_object_group_history is 'История изменения группы контролируемых объектов';
comment on column ctrl_object_group_history.id is 'ID';
comment on column ctrl_object_group_history.utc is 'Время изменения';
comment on column ctrl_object_group_history.user_id is 'Пользователь, осуществивший изменения';
comment on column ctrl_object_group_history.action_type is 'Идентификатор типа действия';
comment on column ctrl_object_group_history.descr is 'Описание';
comment on column ctrl_object_group_history.ctrl_object_group_id is 'Идентификатор группы контролируемых объектов';
comment on column ctrl_object_group_history.status is 'Статус';
--rollback drop table ctrl_object_group_history;


--changeset ctrl:create-index-ctrl_object_group_history_idx_ctrl_object_group_id runOnChange:false
drop index if exists ctrl_object_group_history_idx_ctrl_object_group_id;
create index ctrl_object_group_history_idx_ctrl_object_group_id ON ctrl_object_group_history (ctrl_object_group_id);
--rollback drop index ctrl_object_group_history_idx_ctrl_object_group_id;