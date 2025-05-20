-- ----------------------------
-- 考勤汇总表
-- ----------------------------
drop table if exists hrs_attendance_summary;
create table hrs_attendance_summary (
  summary_id           bigint(20)      not null auto_increment    comment '汇总ID',
  employee_id         bigint(20)      not null                   comment '员工ID',
  employee_name       varchar(50)     not null                   comment '员工姓名',
  dept_id             bigint(20)      not null                   comment '部门ID',
  dept_name           varchar(50)     not null                   comment '部门名称',
  summary_year        int(4)          not null                   comment '汇总年份',
  summary_month       int(2)          not null                   comment '汇总月份',
  should_work_days    decimal(5,2)    not null                   comment '应出勤天数',
  actual_work_days    decimal(5,2)    not null                   comment '实出勤天数',
  sick_leave_days     decimal(5,2)    default 0                  comment '病假天数',
  personal_leave_days decimal(5,2)    default 0                  comment '事假天数',
  marriage_leave_days decimal(5,2)    default 0                  comment '婚假天数',
  maternity_leave_days decimal(5,2)   default 0                  comment '产假天数',
  bereavement_leave_days decimal(5,2) default 0                  comment '丧假天数',
  annual_leave_days   decimal(5,2)    default 0                  comment '年假天数',
  compensatory_leave_days decimal(5,2) default 0                 comment '调休天数',
  business_trip_days  decimal(5,2)    default 0                  comment '出差天数',
  late_times          int(4)          default 0                  comment '迟到次数',
  early_leave_times   int(4)          default 0                  comment '早退次数',
  absent_times        int(4)          default 0                  comment '旷工次数',
  status              char(1)         default '0'                comment '状态（0草稿 1待审核 2已通过 3已驳回）',
  remark              varchar(500)                               comment '备注',
  submitter           varchar(50)     not null                   comment '提交人',
  submit_time         datetime                                   comment '提交时间',
  approver            varchar(50)                                comment '审批人',
  approve_time        datetime                                   comment '审批时间',
  approve_remark      varchar(500)                               comment '审批备注',
  del_flag            char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  primary key (summary_id)
) engine=innodb auto_increment=100 comment = '考勤汇总表';

-- ----------------------------
-- 初始化-考勤汇总表数据
-- ----------------------------
insert into hrs_attendance_summary values(1, 1, '张三', 100, '研发部', 2024, 3, 22.00, 20.00, 1.00, 0.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1, 0, 0, '0', '正常出勤', 'admin', '2024-03-31 18:30:00', null, null, null, '0', 'admin', sysdate(), '', null);
insert into hrs_attendance_summary values(2, 2, '李四', 100, '研发部', 2024, 3, 22.00, 19.50, 2.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.50, 2, 1, 0, '0', '病假2天', 'admin', '2024-03-31 18:30:00', null, null, null, '0', 'admin', sysdate(), '', null);
insert into hrs_attendance_summary values(3, 3, '王五', 101, '市场部', 2024, 3, 22.00, 21.00, 0.00, 1.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0, 0, 0, '0', '事假1天', 'admin', '2024-03-31 18:30:00', null, null, null, '0', 'admin', sysdate(), '', null); 