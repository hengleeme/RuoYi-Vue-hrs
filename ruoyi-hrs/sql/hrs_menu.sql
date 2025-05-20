-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('排班管理', '3', '1', 'schedule', 'hrs/attendance/schedule/index', 1, 0, 'C', '0', '0', 'hrs:attendance:schedule:list', 'calendar', 'admin', sysdate(), '', null, '排班管理菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('排班查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:schedule:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('排班新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:schedule:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('排班修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:schedule:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('排班删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:schedule:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('排班导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:schedule:export',       '#', 'admin', sysdate(), '', null, '');

-- ----------------------------
-- 1、请假管理菜单
-- ----------------------------
insert into sys_menu values('2001', '请假管理', '3', '2', 'leave',           'hrs/attendance/leave/index',    '', 1, 0, 'M', '0', '0', '', 'form',   'admin', sysdate(), '', null, '请假管理菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu values('2002', '请假查询', @parentId, '1',  '#', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:leave:list',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu values('2003', '请假新增', @parentId, '2',  '#', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:leave:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu values('2004', '请假修改', @parentId, '3',  '#', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:leave:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu values('2005', '请假删除', @parentId, '4',  '#', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:leave:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu values('2006', '请假导出', @parentId, '5',  '#', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:leave:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤结果上报', '3', '1', 'hrs/attendance/report/index', 'hrs/attendance/report/index', 1, 0, 'C', '0', '0', 'hrs:attendance:report:list', 'form', 'admin', sysdate(), '', null, '考勤结果上报菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤结果上报查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:report:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤结果上报新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:report:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤结果上报修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:report:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤结果上报删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:report:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤结果上报导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:report:export',       '#', 'admin', sysdate(), '', null, '');

-- ----------------------------
-- 考勤汇总菜单
-- ----------------------------
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤汇总', '3', '3', 'summary', 'hrs/attendance/summary/index', 1, 0, 'C', '0', '0', 'hrs:attendance:summary:list', 'chart', 'admin', sysdate(), '', null, '考勤汇总菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤汇总查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:summary:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤汇总新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:summary:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤汇总修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:summary:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤汇总删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:summary:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤汇总提交', @parentId, '6',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:summary:submit',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('考勤汇总审批', @parentId, '7',  '#', '', 1, 0, 'F', '0', '0', 'hrs:attendance:summary:approve',      '#', 'admin', sysdate(), '', null, '');

-- 考勤基础设置菜单
insert into sys_menu values('2001', '考勤基础设置', '0', '4', 'setting',           null, '', 1, 0, 'M', '0', '0', '', 'setting',   'admin', sysdate(), '', null, '考勤基础设置目录');

-- 考勤周期设置菜单
insert into sys_menu values('2002', '考勤周期设置', '2001', '1', 'period',        'hrs/attendance/period/index',    '', 1, 0, 'C', '0', '0', 'hrs:attendance:period:list',    'date',      'admin', sysdate(), '', null, '考勤周期设置菜单');
insert into sys_menu values('2003', '考勤周期查询', '2002', '1',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:period:query',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2004', '考勤周期新增', '2002', '2',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:period:add',    '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2005', '考勤周期修改', '2002', '3',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:period:edit',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2006', '考勤周期删除', '2002', '4',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:period:remove', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2007', '考勤周期导出', '2002', '5',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:period:export', '#', 'admin', sysdate(), '', null, '');

-- 考勤班次管理菜单
insert into sys_menu values('2008', '考勤班次管理', '2001', '2', 'shift',         'hrs/attendance/shift/index',     '', 1, 0, 'C', '0', '0', 'hrs:attendance:shift:list',     'time',      'admin', sysdate(), '', null, '考勤班次管理菜单');
insert into sys_menu values('2009', '考勤班次查询', '2008', '1',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:shift:query',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2010', '考勤班次新增', '2008', '2',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:shift:add',     '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2011', '考勤班次修改', '2008', '3',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:shift:edit',    '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2012', '考勤班次删除', '2008', '4',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:shift:remove',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2013', '考勤班次导出', '2008', '5',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:shift:export',  '#', 'admin', sysdate(), '', null, '');

-- 考勤请假类别菜单
insert into sys_menu values('2014', '考勤请假类别', '2001', '3', 'leave-type',    'hrs/attendance/leave-type/index', '', 1, 0, 'C', '0', '0', 'hrs:attendance:leave-type:list', 'form',      'admin', sysdate(), '', null, '考勤请假类别菜单');
insert into sys_menu values('2015', '请假类别查询', '2014', '1',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:leave-type:query', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2016', '请假类别新增', '2014', '2',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:leave-type:add',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2017', '请假类别修改', '2014', '3',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:leave-type:edit',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2018', '请假类别删除', '2014', '4',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:leave-type:remove','#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2019', '请假类别导出', '2014', '5',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:leave-type:export','#', 'admin', sysdate(), '', null, '');

-- 考勤休息日套菜单
insert into sys_menu values('2020', '考勤休息日套', '2001', '4', 'rest-template', 'hrs/attendance/rest-template/index', '', 1, 0, 'C', '0', '0', 'hrs:attendance:rest-template:list', 'calendar', 'admin', sysdate(), '', null, '考勤休息日套菜单');
insert into sys_menu values('2021', '休息日套查询', '2020', '1',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:rest-template:query', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2022', '休息日套新增', '2020', '2',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:rest-template:add',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2023', '休息日套修改', '2020', '3',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:rest-template:edit',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2024', '休息日套删除', '2020', '4',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:rest-template:remove','#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2025', '休息日套导出', '2020', '5',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:attendance:rest-template:export','#', 'admin', sysdate(), '', null, ''); 