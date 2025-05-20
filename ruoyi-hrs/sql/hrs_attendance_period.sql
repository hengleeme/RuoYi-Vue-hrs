-- 考勤周期设置表
create table hrs_attendance_period (
  period_id           bigint(20)      not null auto_increment    comment '周期ID',
  period_name         varchar(50)     not null                   comment '周期名称',
  start_date          date            not null                   comment '开始日期',
  end_date           date            not null                   comment '结束日期',
  submit_start_time   datetime        not null                   comment '允许上报考勤开始时间',
  submit_end_time     datetime        not null                   comment '允许上报考勤结束时间',
  remind_time         datetime                                   comment '提醒时间',
  remind_role_ids     varchar(500)                               comment '提醒角色ID列表',
  status             char(1)         default '0'                comment '状态（0正常 1停用）',
  del_flag           char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by          varchar(64)     default ''                 comment '创建者',
  create_time        datetime                                   comment '创建时间',
  update_by          varchar(64)     default ''                 comment '更新者',
  update_time        datetime                                   comment '更新时间',
  remark             varchar(500)    default null               comment '备注',
  primary key (period_id)
) engine=innodb auto_increment=100 comment = '考勤周期设置表';

-- 考勤班次表
create table hrs_attendance_shift (
  shift_id           bigint(20)      not null auto_increment    comment '班次ID',
  shift_name         varchar(50)     not null                   comment '班次名称',
  start_time         time            not null                   comment '上班时间',
  end_time          time            not null                   comment '下班时间',
  late_minutes      int(4)          default 0                  comment '迟到判定时间(分钟)',
  early_minutes     int(4)          default 0                  comment '早退判定时间(分钟)',
  absent_minutes    int(4)          default 0                  comment '旷工判定时间(分钟)',
  status            char(1)         default '0'                comment '状态（0正常 1停用）',
  del_flag          char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (shift_id)
) engine=innodb auto_increment=100 comment = '考勤班次表';

-- 考勤请假类别表
create table hrs_attendance_leave_type (
  type_id            bigint(20)      not null auto_increment    comment '类别ID',
  type_name          varchar(50)     not null                   comment '类别名称',
  type_code          varchar(20)     not null                   comment '类别编码',
  max_days           int(4)          default 0                  comment '最大请假天数',
  need_approve       char(1)         default '1'                comment '是否需要审批（0否 1是）',
  status             char(1)         default '0'                comment '状态（0正常 1停用）',
  del_flag           char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by          varchar(64)     default ''                 comment '创建者',
  create_time        datetime                                   comment '创建时间',
  update_by          varchar(64)     default ''                 comment '更新者',
  update_time        datetime                                   comment '更新时间',
  remark             varchar(500)    default null               comment '备注',
  primary key (type_id)
) engine=innodb auto_increment=100 comment = '考勤请假类别表';

-- 考勤休息日套表
create table hrs_attendance_rest_template (
  template_id        bigint(20)      not null auto_increment    comment '模板ID',
  template_name      varchar(50)     not null                   comment '模板名称',
  monday            char(1)         default '0'                comment '周一是否休息（0否 1是）',
  tuesday           char(1)         default '0'                comment '周二是否休息（0否 1是）',
  wednesday         char(1)         default '0'                comment '周三是否休息（0否 1是）',
  thursday          char(1)         default '0'                comment '周四是否休息（0否 1是）',
  friday            char(1)         default '0'                comment '周五是否休息（0否 1是）',
  saturday          char(1)         default '1'                comment '周六是否休息（0否 1是）',
  sunday            char(1)         default '1'                comment '周日是否休息（0否 1是）',
  status            char(1)         default '0'                comment '状态（0正常 1停用）',
  del_flag          char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (template_id)
) engine=innodb auto_increment=100 comment = '考勤休息日套表';

-- 初始化-考勤班次表数据
insert into hrs_attendance_shift values(1, '标准班次', '09:00:00', '18:00:00', 30, 30, 120, '0', '0', 'admin', sysdate(), '', null, '标准工作时间');
insert into hrs_attendance_shift values(2, '早班', '08:00:00', '17:00:00', 30, 30, 120, '0', '0', 'admin', sysdate(), '', null, '早班工作时间');
insert into hrs_attendance_shift values(3, '晚班', '13:00:00', '22:00:00', 30, 30, 120, '0', '0', 'admin', sysdate(), '', null, '晚班工作时间');

-- 初始化-考勤请假类别表数据
insert into hrs_attendance_leave_type values(1, '事假', 'personal', 30, '1', '0', '0', 'admin', sysdate(), '', null, '事假');
insert into hrs_attendance_leave_type values(2, '病假', 'sick', 90, '1', '0', '0', 'admin', sysdate(), '', null, '病假');
insert into hrs_attendance_leave_type values(3, '婚假', 'marriage', 15, '1', '0', '0', 'admin', sysdate(), '', null, '婚假');
insert into hrs_attendance_leave_type values(4, '产假', 'maternity', 180, '1', '0', '0', 'admin', sysdate(), '', null, '产假');
insert into hrs_attendance_leave_type values(5, '丧假', 'bereavement', 7, '1', '0', '0', 'admin', sysdate(), '', null, '丧假');
insert into hrs_attendance_leave_type values(6, '年假', 'annual', 15, '1', '0', '0', 'admin', sysdate(), '', null, '年假');
insert into hrs_attendance_leave_type values(7, '调休', 'compensatory', 30, '1', '0', '0', 'admin', sysdate(), '', null, '调休');

-- 初始化-考勤休息日套表数据
insert into hrs_attendance_rest_template values(1, '标准休息日', '0', '0', '0', '0', '0', '1', '1', '0', '0', 'admin', sysdate(), '', null, '标准双休日');
insert into hrs_attendance_rest_template values(2, '单休', '0', '0', '0', '0', '0', '1', '0', '0', '0', 'admin', sysdate(), '', null, '周日休息'); 