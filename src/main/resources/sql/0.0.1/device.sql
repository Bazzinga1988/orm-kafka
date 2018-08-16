--liquibase formatted sql


--changeset ctrl:create-device runOnChange:false
drop table if exists device;
create table device
(
  device_id   integer   not null,
  operator_id integer   not null,
  type        integer   not null,
  name        text      not null,
  model       text      not null,
  status      integer   not null,
  status_utc  timestamp not null,
  auth_id     integer   not null,
  auth_type   integer   not null,
  descr       text,
  primary key (device_id, operator_id)
);
comment on table  device is 'Устройство (АНТ)';
comment on column device.device_id is 'Идентификатор устройства';
comment on column device.operator_id is 'Идентификатор оператора';
comment on column device.type is 'Тип устройства';
comment on column device.name is 'Наименование';
comment on column device.model is 'Модель';
comment on column device.status is 'Статус';
comment on column device.status_utc is 'Время статуса';
comment on column device.auth_id is '????? auth_id';
comment on column device.auth_type is '????? auth_type';
comment on column device.descr is 'Описание';
--rollback drop table device;


--changeset ctrl:create-index-device_idx_device_id runOnChange:false
drop index if exists device_idx_device_id;
create index device_idx_device_id ON device (device_id);
--rollback drop index device_idx_device_id;


--changeset ctrl:create-index-device_idx_operator_id runOnChange:false
drop table if exists device_idx_operator_id;
drop index if exists device_idx_operator_id;
create index device_idx_operator_id ON device (operator_id);
--rollback drop index device_idx_operator_id;