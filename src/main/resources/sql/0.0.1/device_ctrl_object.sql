--liquibase formatted sql


--changeset ctrl:create-device_ctrl_object runOnChange:false
drop table if exists device_ctrl_object;
create table device_ctrl_object
(
  device_id      integer   not null,
  operator_id    integer   not null,
  ctrl_object_id bigint    not null,
  utc            timestamp not null,
  unique (device_id, operator_id, ctrl_object_id)
);
comment on table  device_ctrl_object is 'Оператор';
comment on column device_ctrl_object.device_id is 'Идентификатор устройства';
comment on column device_ctrl_object.operator_id is 'Идентификатор оператора';
comment on column device_ctrl_object.ctrl_object_id is 'Идентификатор контролируемого объекта';
comment on column device_ctrl_object.utc is 'Время последнего назначения';
--rollback drop table device_ctrl_object;


--changeset ctrl:create-index-device_ctrl_object_idx_devop runOnChange:false
drop index if exists device_ctrl_object_idx_devop;
create index device_ctrl_object_idx_devop ON device_ctrl_object (device_id, operator_id);
--rollback drop index device_ctrl_object_idx_devop;


--changeset ctrl:create-index-device_ctrl_object_idx_ctrl_object_id runOnChange:false
drop index if exists device_ctrl_object_idx_ctrl_object_id;
create index device_ctrl_object_idx_ctrl_object_id ON device_ctrl_object (ctrl_object_id);
--rollback drop index device_ctrl_object_idx_ctrl_object_id;