-- ----------------------------
-- 1、考勤记录表
-- ----------------------------
drop table if exists hrs_attendance;
create table hrs_attendance (
  attendance_id        bigint(20)      not null auto_increment    comment '考勤ID',
  employee_id         bigint(20)      not null                   comment '员工ID',
  employee_name       varchar(50)     not null                   comment '员工姓名',
  dept_id             bigint(20)      not null                   comment '部门ID',
  dept_name           varchar(50)     not null                   comment '部门名称',
  attendance_date     date            not null                   comment '考勤日期',
  check_in_time       datetime                                   comment '签到时间',
  check_out_time      datetime                                   comment '签退时间',
  status              char(1)         default '0'                comment '考勤状态（0正常 1迟到 2早退 3旷工 4请假）',
  type                char(1)         default '1'                comment '考勤类型（1上班 2下班）',
  location            varchar(100)                               comment '考勤地点',
  device              varchar(100)                               comment '考勤设备',
  del_flag            char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  remark              varchar(500)    default null               comment '备注',
  primary key (attendance_id)
) engine=innodb auto_increment=100 comment = '考勤记录表';

-- ----------------------------
-- 初始化-考勤记录表数据
-- ----------------------------
insert into hrs_attendance values(1, 1, '张三', 100, '研发部', '2024-03-20', '2024-03-20 09:00:00', '2024-03-20 18:00:00', '0', '1', '公司', '指纹打卡机', '0', 'admin', sysdate(), '', null, '正常打卡');
insert into hrs_attendance values(2, 2, '李四', 100, '研发部', '2024-03-20', '2024-03-20 09:15:00', '2024-03-20 18:00:00', '1', '1', '公司', '指纹打卡机', '0', 'admin', sysdate(), '', null, '迟到15分钟');
insert into hrs_attendance values(3, 3, '王五', 101, '市场部', '2024-03-20', '2024-03-20 09:00:00', '2024-03-20 17:30:00', '2', '1', '公司', '指纹打卡机', '0', 'admin', sysdate(), '', null, '早退30分钟');
insert into hrs_attendance values(4, 4, '赵六', 101, '市场部', '2024-03-20', null, null, '3', '1', null, null, '0', 'admin', sysdate(), '', null, '未打卡');
insert into hrs_attendance values(5, 5, '钱七', 102, '人事部', '2024-03-20', null, null, '4', '1', null, null, '0', 'admin', sysdate(), '', null, '请假'); 