-- ----------------------------
-- 1、排班管理表
-- ----------------------------
drop table if exists hrs_attendance_schedule;
create table hrs_attendance_schedule (
  schedule_id           bigint(20)      not null auto_increment    comment '排班ID',
  employee_id          bigint(20)      not null                   comment '员工ID',
  employee_name        varchar(30)     not null                   comment '员工姓名',
  dept_id              bigint(20)      not null                   comment '部门ID',
  dept_name            varchar(30)     not null                   comment '部门名称',
  schedule_date        date            not null                   comment '排班日期',
  shift_id             bigint(20)      not null                   comment '班次ID',
  shift_name           varchar(30)     not null                   comment '班次名称',
  start_time           datetime        not null                   comment '开始时间',
  end_time             datetime        not null                   comment '结束时间',
  status               char(1)         default '0'                comment '排班状态（0正常 1停用）',
  del_flag             char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by            varchar(64)     default ''                 comment '创建者',
  create_time          datetime                                   comment '创建时间',
  update_by            varchar(64)     default ''                 comment '更新者',
  update_time          datetime                                   comment '更新时间',
  remark               varchar(500)    default null               comment '备注',
  primary key (schedule_id)
) engine=innodb auto_increment=100 comment = '排班管理表';

-- ----------------------------
-- 初始化-排班管理表数据
-- ----------------------------
insert into hrs_attendance_schedule values(1, 1, '张三', 100, '研发部门', '2024-03-20', 1, '早班', '2024-03-20 08:00:00', '2024-03-20 16:00:00', '0', '0', 'admin', sysdate(), '', null, '早班排班');
insert into hrs_attendance_schedule values(2, 2, '李四', 100, '研发部门', '2024-03-20', 2, '中班', '2024-03-20 16:00:00', '2024-03-20 23:00:00', '0', '0', 'admin', sysdate(), '', null, '中班排班');
insert into hrs_attendance_schedule values(3, 3, '王五', 100, '研发部门', '2024-03-20', 3, '晚班', '2024-03-20 23:00:00', '2024-03-21 08:00:00', '0', '0', 'admin', sysdate(), '', null, '晚班排班'); 