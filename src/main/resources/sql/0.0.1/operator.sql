--liquibase formatted sql


--changeset ctrl:create-operator runOnChange:false
drop table if exists operator;
create table operator
(
  id         integer   not null,
  type       integer   not null,
  name       text      not null,
  status     integer   not null,
  status_utc timestamp not null,
  descr      text,
  primary key (id)
);
comment on table  operator is 'Оператор';
comment on column operator.id is 'ID';
comment on column operator.type is 'Тип оператора';
comment on column operator.name is 'Наименование';
comment on column operator.status is 'Статус';
comment on column operator.status_utc is 'Время статуса';
comment on column operator.descr is 'Описание';
--rollback drop table operator;
