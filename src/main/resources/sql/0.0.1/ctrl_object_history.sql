--liquibase formatted sql


--changeset ctrl:create-ctrl_object_history runOnChange:false
drop table if exists ctrl_object_history;
create table ctrl_object_history
(
  id             bigint    not null,
  type           integer   not null,
  utc            timestamp not null,
  user_id        integer   not null,
  action_type    integer   not null,
  descr          text,
  ctrl_object_id bigint    not null,
  status         integer   not null,
  main_device_id bigint    not null,
  primary key (id)
);
comment on table  ctrl_object_history is 'История изменения оператора';
comment on column ctrl_object_history.id is 'ID';
comment on column ctrl_object_history.type is 'Тип контролируемого объекта';
comment on column ctrl_object_history.utc is 'Время изменения';
comment on column ctrl_object_history.user_id is 'Пользователь, осуществивший изменения';
comment on column ctrl_object_history.action_type is 'Идентификатор типа действия';
comment on column ctrl_object_history.descr is 'Описание';
comment on column ctrl_object_history.ctrl_object_id is 'Идентификатор контролируемого объекта';
comment on column ctrl_object_history.status is 'Статус';
comment on column ctrl_object_history.main_device_id is 'Идентификатор главного устройства';
--rollback drop table ctrl_object_history;


--changeset ctrl:create-index-ctrl_object_history_idx_ctrl_object_id runOnChange:false
drop index if exists ctrl_object_history_idx_ctrl_object_id;
create index ctrl_object_history_idx_ctrl_object_id ON ctrl_object_history (ctrl_object_id);
--rollback drop index ctrl_object_history_idx_ctrl_object_id;