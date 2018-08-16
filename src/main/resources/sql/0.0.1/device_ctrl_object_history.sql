--liquibase formatted sql


--changeset ctrl:create-device_ctrl_object_history runOnChange:false
drop table if exists device_ctrl_object_history;
create table device_ctrl_object_history
(
  id             bigint    not null,
  utc            timestamp not null,
  user_id        integer   not null,
  action_type    integer   not null,
  descr          text,
  device_id      integer   not null,
  operator_id    integer   not null,
  ctrl_object_id bigint    not null,
  primary key (id)
);
comment on table  device_ctrl_object_history is 'История назначений устройства на контролируемый объект';
comment on column device_ctrl_object_history.id is 'ID';
comment on column device_ctrl_object_history.utc is 'Время изменения';
comment on column device_ctrl_object_history.user_id is 'Пользователь, осуществивший изменения';
comment on column device_ctrl_object_history.action_type is 'Идентификатор типа действия';
comment on column device_ctrl_object_history.descr is 'Описание';
comment on column device_ctrl_object_history.device_id is 'Идентификатор устройства';
comment on column device_ctrl_object_history.operator_id is 'Идентификатор оператора';
comment on column device_ctrl_object_history.ctrl_object_id is 'Идентификатор контролируемого объекта';
--rollback drop table device_ctrl_object_history;


--changeset ctrl:create-index-device_ctrl_object_history_idx_devop runOnChange:false
drop index if exists device_ctrl_object_history_idx_devop;
create index device_ctrl_object_history_idx_devop ON device_ctrl_object_history (device_id, operator_id);
--rollback drop index device_ctrl_object_history_idx_devop;


--changeset ctrl:create-index-device_ctrl_object_history_idx_ctrl_object_id runOnChange:false
drop index if exists device_ctrl_object_history_idx_ctrl_object_id;
create index device_ctrl_object_history_idx_ctrl_object_id ON device_ctrl_object_history (ctrl_object_id);
--rollback drop index device_ctrl_object_history_idx_ctrl_object_id;