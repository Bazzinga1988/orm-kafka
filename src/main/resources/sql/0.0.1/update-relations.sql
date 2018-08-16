--liquibase formatted sql


--changeset ctrl:create-fk_ctrl_object_type runOnChange:false
alter table ctrl_object add constraint fk_ctrl_object_type foreign key (type)
    references ctrl_object_type(id);
--rollback alter table ctrl_object drop constraint fk_ctrl_object_type;


--changeset ctrl:create-fk_ctrl_object_status runOnChange:false
alter table ctrl_object add constraint fk_ctrl_object_status foreign key (status)
    references ctrl_object_status(id);
--rollback alter table ctrl_object drop constraint fk_ctrl_object_status;


--changeset ctrl:create-fk_ctrl_object_group_type runOnChange:false
alter table ctrl_object add constraint fk_ctrl_object_group_type foreign key (type)
    references ctrl_object_group_type(id);
--rollback alter table ctrl_object drop constraint fk_ctrl_object_group_type;


--changeset ctrl:create-fk_ctrl_object_group_status runOnChange:false
alter table ctrl_object add constraint fk_ctrl_object_group_status foreign key (status)
    references ctrl_object_group_status(id);
--rollback alter table ctrl_object drop constraint fk_ctrl_object_group_status;


--changeset ctrl:create-fk_ctrl_object_group_member_ctrl_object_id runOnChange:false
alter table ctrl_object_group_member add constraint fk_ctrl_object_group_member_ctrl_object_id foreign key (ctrl_object_id)
    references ctrl_object(id);
--rollback alter table ctrl_object drop constraint fk_ctrl_object_group_member_ctrl_object_id;


--changeset ctrl:create-fk_ctrl_object_group_member_ctrl_object_group_id runOnChange:false
alter table ctrl_object_group_member add constraint fk_ctrl_object_group_member_ctrl_object_group_id foreign key (ctrl_object_group_id)
    references ctrl_object_group(id);
--rollback alter table ctrl_object drop constraint fk_ctrl_object_group_member_ctrl_object_group_id;


--changeset ctrl:create-fk_ctrl_object_group_tree_ctrl_object_group_id runOnChange:false
alter table ctrl_object_group_tree add constraint fk_ctrl_object_group_tree_ctrl_object_group_id foreign key (ctrl_object_group_id)
    references ctrl_object_group(id);
--rollback alter table ctrl_object drop constraint fk_ctrl_object_group_tree_ctrl_object_group_id;


--changeset ctrl:create-fk_ctrl_object_group_tree_parent_id runOnChange:false
alter table ctrl_object_group_tree add constraint fk_ctrl_object_group_tree_parent_id foreign key (parent_id)
    references ctrl_object_group(id);
--rollback alter table ctrl_object drop constraint fk_ctrl_object_group_tree_parent_id;


--changeset ctrl:create-fk_ctrl_object_tree_ctrl_object_id runOnChange:false
alter table ctrl_object_tree add constraint fk_ctrl_object_tree_ctrl_object_id foreign key (ctrl_object_id)
    references ctrl_object(id);
--rollback alter table ctrl_object drop constraint fk_ctrl_object_tree_ctrl_object_id;


--changeset ctrl:create-fk_ctrl_object_tree_parent_id runOnChange:false
alter table ctrl_object_tree add constraint fk_ctrl_object_tree_parent_id foreign key (parent_id)
    references ctrl_object(id);
--rollback alter table ctrl_object drop constraint fk_ctrl_object_tree_parent_id;


--changeset ctrl:create-fk_device_type runOnChange:false
alter table device add constraint fk_device_type foreign key (type)
    references device_type(id);
--rollback alter table device drop constraint fk_device_type;


--changeset ctrl:create-fk_device_status runOnChange:false
alter table device add constraint fk_device_status foreign key (status)
    references device_status(id);
--rollback alter table device drop constraint fk_device_status;


--changeset ctrl:create-fk_device_ctrl_object_devop runOnChange:false
alter table device_ctrl_object add constraint fk_device_ctrl_object_devop foreign key (device_id, operator_id)
    references device(device_id, operator_id);
--rollback alter table device drop constraint fk_device_ctrl_object_devop;


--changeset ctrl:create-fk_device_ctrl_object_ctrl_object_id runOnChange:false
alter table device_ctrl_object add constraint fk_device_ctrl_object_ctrl_object_id foreign key (ctrl_object_id)
    references ctrl_object(id);
--rollback alter table device drop constraint fk_device_ctrl_object_ctrl_object_id;


--changeset ctrl:create-fk_operator_type runOnChange:false
alter table operator add constraint fk_operator_type foreign key (type)
    references operator_type(id);
--rollback alter table device drop constraint fk_operator_type;


--changeset ctrl:create-fk_operator_status runOnChange:false
alter table operator add constraint fk_operator_status foreign key (status)
    references operator_status(id);
--rollback alter table device drop constraint fk_operator_status;