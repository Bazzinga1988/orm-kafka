--liquibase formatted sql


--changeset ctrl:create-operator_history runOnChange:false
drop table if exists operator_history;
create table operator_history
(
  id             bigint    not null,
  utc            timestamp not null,
  user_id        integer   not null,
  action_type    integer   not null,
  descr          text,
  operator_id    integer   not null,
  status         integer   not null,
  primary key (id)
);
comment on table  operator_history is 'История изменения оператора';
comment on column operator_history.id is 'ID';
comment on column operator_history.utc is 'Время изменения';
comment on column operator_history.user_id is 'Пользователь, осуществивший изменения';
comment on column operator_history.action_type is 'Идентификатор типа действия';
comment on column operator_history.descr is 'Описание';
comment on column operator_history.operator_id is 'Идентификатор оператора';
comment on column operator_history.status is 'Статус';
--rollback drop table operator_history;


--changeset ctrl:create-index-operator_history_idx_operator_id runOnChange:false
drop index if exists operator_history_idx_operator_id;
create index operator_history_idx_operator_id ON operator_history (operator_id);
--rollback drop index operator_history_idx_operator_id;