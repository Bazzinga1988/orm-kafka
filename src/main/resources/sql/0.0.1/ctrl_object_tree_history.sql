--liquibase formatted sql


--changeset ctrl:create-ctrl_object_tree_history runOnChange:false
drop table if exists ctrl_object_tree_history;
create table ctrl_object_tree_history
(
  id             bigint    not null,
  utc            timestamp not null,
  user_id        integer   not null,
  action_type    integer   not null,
  descr          text,
  ctrl_object_id bigint    not null,
  parent_id      bigint    not null,
  level          integer   not null,
  primary key (id)
);
comment on table  ctrl_object_tree_history is 'История изменения группы контролируемых объектов';
comment on column ctrl_object_tree_history.id is 'ID';
comment on column ctrl_object_tree_history.utc is 'Время изменения';
comment on column ctrl_object_tree_history.user_id is 'Пользователь, осуществивший изменения';
comment on column ctrl_object_tree_history.action_type is 'Идентификатор типа действия';
comment on column ctrl_object_tree_history.descr is 'Описание';
comment on column ctrl_object_tree_history.ctrl_object_id is 'Идентификатор контролируемого объекта';
comment on column ctrl_object_tree_history.parent_id is 'Идентификатор родительского контролируемого объекта';
comment on column ctrl_object_tree_history.level is 'Уроверь иерархии';
--rollback drop table ctrl_object_tree_history;


--changeset ctrl:create-index-ctrl_object_tree_history_idx_ctrl_object_id runOnChange:false
drop index if exists ctrl_object_tree_history_idx_ctrl_object_id;
create index ctrl_object_tree_history_idx_ctrl_object_id ON ctrl_object_tree_history (ctrl_object_id);
--rollback drop index ctrl_object_tree_history_idx_ctrl_object_id;