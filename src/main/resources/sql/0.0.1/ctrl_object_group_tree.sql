--liquibase formatted sql


--changeset ctrl:create-ctrl_object_group_tree runOnChange:false
drop table if exists ctrl_object_group_tree;
create table ctrl_object_group_tree
(
  ctrl_object_group_id bigint not null,
  parent_id            bigint not null,
  level                integer not null,
  unique (ctrl_object_group_id, parent_id, level),
  check (ctrl_object_group_id != parent_id)
);
comment on table  ctrl_object_group_tree is 'Иерархия групп контролируемых объектов';
comment on column ctrl_object_group_tree.ctrl_object_group_id is 'Идентификатор группы контролируемых объектов';
comment on column ctrl_object_group_tree.parent_id is 'Идентификатор родительской группы контролируемых объектов';
comment on column ctrl_object_group_tree.level is 'Уроверь иерархии';
--rollback drop table ctrl_object_group_tree;


--changeset ctrl:create-index-ctrl_object_group_tree_idx_ctrl_object_group_id runOnChange:false
drop index if exists ctrl_object_group_tree_idx_ctrl_object_group_id;
create index ctrl_object_group_tree_idx_ctrl_object_group_id ON ctrl_object_group_tree (ctrl_object_group_id);
--rollback drop index ctrl_object_group_tree_idx_ctrl_object_group_id;