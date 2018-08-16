--liquibase formatted sql


--changeset ctrl:create-ctrl_object_group runOnChange:false
drop table if exists ctrl_object_group;
create table ctrl_object_group
(
  id         bigint    not null,
  type       integer   not null,
  name       text      not null,
  status     integer   not null,
  status_utc timestamp not null,
  descr text,
  primary key (id)
);
comment on table  ctrl_object_group is 'Группа контролируемых объектов';
comment on column ctrl_object_group.id is 'ID';
comment on column ctrl_object_group.type is 'Тип группы контролируемых объектов';
comment on column ctrl_object_group.name is 'Наименование';
comment on column ctrl_object_group.status is 'Статус';
comment on column ctrl_object_group.status_utc is 'Время статуса';
comment on column ctrl_object_group.descr is 'Описание';
--rollback drop table ctrl_object_group;


--changeset ctrl:create-index-ctrl_object_group_idx_type runOnChange:false
drop index if exists ctrl_object_group_idx_type;
create index ctrl_object_group_idx_type ON ctrl_object_group (type);
--rollback drop index ctrl_object_group_idx_type;


--changeset ctrl:create-index-ctrl_object_idx_name runOnChange:false
drop table if exists ctrl_object_idx_name;
drop index if exists ctrl_object_idx_name;
create index ctrl_object_idx_name ON ctrl_object_group (name);
--rollback drop index ctrl_object_idx_name;