-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('教育背景', @parentId, '2', 'education', 'hrs/employee/education/index', 1, 0, 'C', '0', '0', 'hrs:employee:education:list', 'education', 'admin', sysdate(), '', null, '教育背景菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('教育背景查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:education:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('教育背景新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:education:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('教育背景修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:education:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('教育背景删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:education:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('教育背景导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:education:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('资格证执业证', @parentId, '3', 'certificate', 'hrs/employee/certificate/index', 1, 0, 'C', '0', '0', 'hrs:employee:certificate:list', 'certificate', 'admin', sysdate(), '', null, '资格证执业证菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('资格证执业证查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:certificate:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('资格证执业证新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:certificate:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('资格证执业证修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:certificate:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('资格证执业证删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:certificate:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('资格证执业证导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'hrs:employee:certificate:export',       '#', 'admin', sysdate(), '', null, ''); 