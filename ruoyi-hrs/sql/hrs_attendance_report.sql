-- ----------------------------
-- 考勤结果上报表
-- ----------------------------
drop table if exists hrs_attendance_report;
create table hrs_attendance_report (
  report_id           bigint(20)      not null auto_increment    comment '上报ID',
  employee_id         bigint(20)      not null                   comment '员工ID',
  employee_name       varchar(50)     not null                   comment '员工姓名',
  dept_id             bigint(20)      not null                   comment '部门ID',
  dept_name           varchar(50)     not null                   comment '部门名称',
  attendance_date     date            not null                   comment '考勤日期',
  check_in_time       datetime                                   comment '签到时间',
  check_out_time      datetime                                   comment '签退时间',
  status              char(1)         not null                   comment '考勤状态（0正常 1迟到 2早退 3旷工 4请假 5出差）',
  work_hours          decimal(5,2)                               comment '工作时长',
  remark              varchar(500)                               comment '备注',
  reporter            varchar(50)     not null                   comment '上报人',
  report_time         datetime        not null                   comment '上报时间',
  del_flag            char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  primary key (report_id)
) engine=innodb auto_increment=100 comment = '考勤结果上报表';

-- ----------------------------
-- 初始化-考勤结果上报表数据
-- ----------------------------
insert into hrs_attendance_report values(1, 1, '张三', 100, '研发部', '2024-03-01', '2024-03-01 09:00:00', '2024-03-01 18:00:00', '0', 8.00, '正常出勤', 'admin', '2024-03-01 18:30:00', '0', 'admin', sysdate(), '', null);
insert into hrs_attendance_report values(2, 2, '李四', 100, '研发部', '2024-03-01', '2024-03-01 09:30:00', '2024-03-01 18:00:00', '1', 7.50, '迟到30分钟', 'admin', '2024-03-01 18:30:00', '0', 'admin', sysdate(), '', null);
insert into hrs_attendance_report values(3, 3, '王五', 101, '市场部', '2024-03-01', '2024-03-01 09:00:00', '2024-03-01 17:30:00', '2', 7.50, '早退30分钟', 'admin', '2024-03-01 18:30:00', '0', 'admin', sysdate(), '', null); 