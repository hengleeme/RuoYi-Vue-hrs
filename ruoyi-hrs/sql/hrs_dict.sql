-- ----------------------------
-- 1、请假类型字典
-- ----------------------------
insert into sys_dict_type values(11, '请假类型', 'hrs_leave_type', '0', 'admin', sysdate(), '', null, '请假类型列表');

insert into sys_dict_data values(30, 1,  '事假', '1', 'hrs_leave_type', '', 'primary', 'Y', '0', 'admin', sysdate(), '', null, '事假');
insert into sys_dict_data values(31, 2,  '病假', '2', 'hrs_leave_type', '', 'primary', 'Y', '0', 'admin', sysdate(), '', null, '病假');
insert into sys_dict_data values(32, 3,  '婚假', '3', 'hrs_leave_type', '', 'primary', 'Y', '0', 'admin', sysdate(), '', null, '婚假');
insert into sys_dict_data values(33, 4,  '产假', '4', 'hrs_leave_type', '', 'primary', 'Y', '0', 'admin', sysdate(), '', null, '产假');
insert into sys_dict_data values(34, 5,  '丧假', '5', 'hrs_leave_type', '', 'primary', 'Y', '0', 'admin', sysdate(), '', null, '丧假');
insert into sys_dict_data values(35, 6,  '年假', '6', 'hrs_leave_type', '', 'primary', 'Y', '0', 'admin', sysdate(), '', null, '年假');
insert into sys_dict_data values(36, 7,  '调休', '7', 'hrs_leave_type', '', 'primary', 'Y', '0', 'admin', sysdate(), '', null, '调休');

-- ----------------------------
-- 2、请假状态字典
-- ----------------------------
insert into sys_dict_type values(12, '请假状态', 'hrs_leave_status', '0', 'admin', sysdate(), '', null, '请假状态列表');

insert into sys_dict_data values(37, 1,  '待审批', '0', 'hrs_leave_status', '', 'info',    'Y', '0', 'admin', sysdate(), '', null, '待审批');
insert into sys_dict_data values(38, 2,  '已通过', '1', 'hrs_leave_status', '', 'success', 'Y', '0', 'admin', sysdate(), '', null, '已通过');
insert into sys_dict_data values(39, 3,  '已驳回', '2', 'hrs_leave_status', '', 'danger',  'Y', '0', 'admin', sysdate(), '', null, '已驳回');

-- 考勤状态字典类型
insert into sys_dict_type(dict_name, dict_type, status, create_by, create_time, update_by, update_time, remark)
values ('考勤状态', 'hrs_attendance_status', '0', 'admin', sysdate(), '', null, '考勤状态列表');

-- 考勤状态字典数据
insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values (1,  '正常', '0', 'hrs_attendance_status', '', 'success', 'Y', '0', 'admin', sysdate(), '', null, '正常出勤');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values (2,  '迟到', '1', 'hrs_attendance_status', '', 'warning', 'N', '0', 'admin', sysdate(), '', null, '迟到');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values (3,  '早退', '2', 'hrs_attendance_status', '', 'warning', 'N', '0', 'admin', sysdate(), '', null, '早退');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values (4,  '旷工', '3', 'hrs_attendance_status', '', 'danger', 'N', '0', 'admin', sysdate(), '', null, '旷工');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values (5,  '请假', '4', 'hrs_attendance_status', '', 'info', 'N', '0', 'admin', sysdate(), '', null, '请假');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values (6,  '出差', '5', 'hrs_attendance_status', '', 'primary', 'N', '0', 'admin', sysdate(), '', null, '出差');

-- ----------------------------
-- 考勤汇总状态字典类型
-- ----------------------------
insert into sys_dict_type values(13, '考勤汇总状态', 'hrs_summary_status', '0', 'admin', sysdate(), '', null, '考勤汇总状态列表');

insert into sys_dict_data values(40, 1,  '草稿', '0', 'hrs_summary_status', '', 'info',    'Y', '0', 'admin', sysdate(), '', null, '草稿');
insert into sys_dict_data values(41, 2,  '待审核', '1', 'hrs_summary_status', '', 'warning', 'Y', '0', 'admin', sysdate(), '', null, '待审核');
insert into sys_dict_data values(42, 3,  '已通过', '2', 'hrs_summary_status', '', 'success', 'Y', '0', 'admin', sysdate(), '', null, '已通过');
insert into sys_dict_data values(43, 4,  '已驳回', '3', 'hrs_summary_status', '', 'danger',  'Y', '0', 'admin', sysdate(), '', null, '已驳回'); 