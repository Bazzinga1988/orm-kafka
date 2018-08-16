--liquibase formatted sql


--changeset ctrl:create-ctrl_object runOnChange:false
drop table if exists ctrl_object;
create table ctrl_object
(
  id             bigint    not null,
  type           integer   not null,
  name           text      not null,
  status         integer   not null,
  status_utc     timestamp not null,
  reg_number     text      not null,
  model          text      not null,
  attr1          text,
  attr2          text,
  descr          text,
  main_device_id bigint,
  primary key (id)
);
comment on table  ctrl_object is 'Контролируемый объект';
comment on column ctrl_object.id is 'ID';
comment on column ctrl_object.type is 'Тип контролируемого объекта';
comment on column ctrl_object.name is 'Наименование';
comment on column ctrl_object.status is 'Статус';
comment on column ctrl_object.status_utc is 'Время статуса';
comment on column ctrl_object.reg_number is 'Регистрационный номер';
comment on column ctrl_object.model is 'Модель';
comment on column ctrl_object.attr1 is 'Атрибут 1';
comment on column ctrl_object.attr2 is 'Атрибут 2';
comment on column ctrl_object.descr is 'Описание';
comment on column ctrl_object.main_device_id is 'Идентификатор главного устройства';
--rollback drop table ctrl_object;


--changeset ctrl:create-index-ctrl_object_idx_type runOnChange:false
drop index if exists ctrl_object_idx_type;
create index ctrl_object_idx_type ON ctrl_object (type);
--rollback drop index ctrl_object_idx_type;


--changeset ctrl:create-index-ctrl_object_idx_reg_number runOnChange:false
drop index if exists ctrl_object_idx_reg_number;
create index ctrl_object_idx_reg_number ON ctrl_object (reg_number);
--rollback drop index ctrl_object_idx_reg_number;


--changeset ctrl:create-index-ctrl_object_idx_model runOnChange:false
drop index if exists ctrl_object_idx_model;
create index ctrl_object_idx_model ON ctrl_object (model);
--rollback drop index ctrl_object_idx_model;


--changeset ctrl:create-index-ctrl_object_idx_attr1 runOnChange:false
drop index if exists ctrl_object_idx_attr1;
create index ctrl_object_idx_attr1 ON ctrl_object (attr1);
--rollback drop index ctrl_object_idx_attr1;


--changeset ctrl:create-index-ctrl_object_idx_attr2 runOnChange:false
drop index if exists ctrl_object_idx_attr2;
create index ctrl_object_idx_attr2 ON ctrl_object (attr2);
--rollback drop index ctrl_object_idx_attr2;