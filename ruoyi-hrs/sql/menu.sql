-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('人事管理', '0', '1', 'hrs', null, 1, 0, 'M', '0', '0', '', 'peoples', 'admin', sysdate(), '', null, '人事管理目录');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('人员管理', @parentId, '1', 'employee', 'hrs/employee/index', 1, 0, 'C', '0', '0', 'hrs:employee:list', 'user', 'admin', sysdate(), '', null, '人员管理菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('人员查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('人员新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('人员修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('人员删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('人员导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:export',       '#', 'admin', sysdate(), '', null, ''); 