--liquibase formatted sql


--changeset ctrl:create-function-get_new_device_id runOnChange:false
create or replace function get_new_device_id(integer) returns integer
    as 'select coalesce(max(device_id), 0) + 1 from device where operator_id = $1;'
    language SQL
    immutable
    returns NULL on NULL input;
comment on function get_new_device_id(integer) is 'Получение нового ID устройства для оператора';
--rollback drop function get_new_device_id;