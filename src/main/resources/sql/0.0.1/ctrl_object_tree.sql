--liquibase formatted sql


--changeset ctrl:create-ctrl_object_tree runOnChange:false
drop table if exists ctrl_object_tree;
create table ctrl_object_tree
(
  ctrl_object_id bigint not null,
  parent_id      bigint not null,
  level          integer not null,
  unique (ctrl_object_id, parent_id, level),
  check (ctrl_object_id != parent_id)
);
comment on table  ctrl_object_tree is 'Иерархия контролируемых объектов';
comment on column ctrl_object_tree.ctrl_object_id is 'Идентификатор контролируемого объекта';
comment on column ctrl_object_tree.parent_id is 'Идентификатор родительского контролируемого объекта';
comment on column ctrl_object_tree.level is 'Уроверь иерархии';
--rollback drop table ctrl_object_tree;


--changeset ctrl:create-index-ctrl_object_tree_idx_ctrl_object_id runOnChange:false
drop index if exists ctrl_object_tree_idx_ctrl_object_id;
create index ctrl_object_tree_idx_ctrl_object_id ON ctrl_object_tree (ctrl_object_id);
--rollback drop index ctrl_object_tree_idx_ctrl_object_id;