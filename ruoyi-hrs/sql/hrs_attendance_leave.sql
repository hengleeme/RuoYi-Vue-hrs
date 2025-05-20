-- ----------------------------
-- 1、请假管理表
-- ----------------------------
drop table if exists hrs_attendance_leave;
create table hrs_attendance_leave (
  leave_id             bigint(20)      not null auto_increment    comment '请假ID',
  employee_id          bigint(20)      not null                   comment '员工ID',
  employee_name        varchar(30)     not null                   comment '员工姓名',
  dept_id              bigint(20)      not null                   comment '部门ID',
  dept_name            varchar(30)     not null                   comment '部门名称',
  leave_type           char(1)         not null                   comment '请假类型（1事假 2病假 3婚假 4产假 5丧假 6年假 7调休）',
  start_time           datetime        not null                   comment '开始时间',
  end_time             datetime        not null                   comment '结束时间',
  leave_hours          decimal(10,1)   not null                   comment '请假时长（小时）',
  leave_reason         varchar(500)    not null                   comment '请假原因',
  status               char(1)         default '0'                comment '审批状态（0待审批 1已通过 2已驳回）',
  approver             varchar(64)     default ''                 comment '审批人',
  approve_time         datetime                                   comment '审批时间',
  approve_comment      varchar(500)    default null               comment '审批意见',
  del_flag             char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by            varchar(64)     default ''                 comment '创建者',
  create_time          datetime                                   comment '创建时间',
  update_by            varchar(64)     default ''                 comment '更新者',
  update_time          datetime                                   comment '更新时间',
  remark               varchar(500)    default null               comment '备注',
  primary key (leave_id)
) engine=innodb auto_increment=100 comment = '请假管理表';

-- ----------------------------
-- 初始化-请假管理表数据
-- ----------------------------
insert into hrs_attendance_leave values(1, 1, '张三', 100, '研发部门', '1', '2024-03-20 09:00:00', '2024-03-20 18:00:00', 8.0, '家中有事', '1', 'admin', '2024-03-19 16:00:00', '同意', '0', 'admin', sysdate(), '', null, '事假');
insert into hrs_attendance_leave values(2, 2, '李四', 100, '研发部门', '2', '2024-03-21 09:00:00', '2024-03-22 18:00:00', 16.0, '感冒发烧', '1', 'admin', '2024-03-20 16:00:00', '同意', '0', 'admin', sysdate(), '', null, '病假');
insert into hrs_attendance_leave values(3, 3, '王五', 100, '研发部门', '6', '2024-03-25 09:00:00', '2024-03-26 18:00:00', 16.0, '年假休息', '0', '', null, null, '0', 'admin', sysdate(), '', null, '年假'); 