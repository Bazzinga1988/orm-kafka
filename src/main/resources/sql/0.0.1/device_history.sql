--liquibase formatted sql


--changeset ctrl:create-device_history runOnChange:false
drop table if exists device_history;
create table device_history
(
  id             bigint    not null,
  utc            timestamp not null,
  user_id        integer   not null,
  action_type    integer   not null,
  descr          text,
  device_id      integer   not null,
  operator_id    integer   not null,
  status         integer   not null,
  primary key (id)
);
comment on table  device_history is 'История изменений конфигурации устройства';
comment on column device_history.id is 'ID';
comment on column device_history.utc is 'Время изменения';
comment on column device_history.user_id is 'Пользователь, осуществивший изменения';
comment on column device_history.action_type is 'Идентификатор типа действия';
comment on column device_history.descr is 'Описание';
comment on column device_history.device_id is 'Идентификатор устройства';
comment on column device_history.operator_id is 'Идентификатор оператора';
comment on column device_history.status is 'Статус';
--rollback drop table device_history;


--changeset ctrl:create-index-device_history_idx_device_id runOnChange:false
drop index if exists device_history_idx_device_id;
create index device_history_idx_device_id ON device_history (device_id);
--rollback drop index device_history_idx_device_id;


--changeset ctrl:create-index-device_history_idx_operator_id runOnChange:false
drop index if exists device_history_idx_operator_id;
create index device_history_idx_operator_id ON device (operator_id);
--rollback drop index device_history_idx_operator_id;