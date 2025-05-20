-- 人员信息变更日志表
create table hrs_employee_log (
  log_id           bigint(20)      not null auto_increment    comment '日志ID',
  employee_id      bigint(20)      not null                   comment '人员ID',
  change_type      varchar(50)     not null                   comment '变更类型',
  change_field     varchar(50)     not null                   comment '变更字段',
  old_value        varchar(500)    default null               comment '原值',
  new_value        varchar(500)    default null               comment '新值',
  change_time      datetime                                   comment '变更时间',
  change_by        varchar(64)     default ''                 comment '变更人',
  remark           varchar(500)    default null               comment '备注',
  primary key (log_id)
) engine=innodb auto_increment=100 comment = '人员信息变更日志表'; 