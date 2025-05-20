-- 薪酬变更日志表
create table hrs_salary_change_log (
  log_id         bigint(20)      not null auto_increment    comment '日志ID',
  change_type    char(1)         not null                   comment '变更类型（1标准 2体系）',
  change_id      bigint(20)      not null                   comment '变更对象ID',
  change_name    varchar(100)    not null                   comment '变更对象名称',
  change_field   varchar(50)     not null                   comment '变更字段',
  old_value      varchar(500)    default null               comment '原值',
  new_value      varchar(500)    default null               comment '新值',
  change_reason  varchar(500)    default null               comment '变更原因',
  del_flag       char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by      varchar(64)     default ''                 comment '创建者',
  create_time    datetime                                   comment '创建时间',
  update_by      varchar(64)     default ''                 comment '更新者',
  update_time    datetime                                   comment '更新时间',
  remark         varchar(500)    default null               comment '备注',
  primary key (log_id)
) engine=innodb auto_increment=100 comment = '薪酬变更日志表';

-- 薪酬变更日志菜单
insert into sys_menu values('3040', '薪酬变更日志', '3001', '5', 'system',    'hrs/salary/log/index',    '', 1, 0, 'C', '0', '0', 'hrs:salary:log:list',    'log',      'admin', sysdate(), '', null, '薪酬变更日志菜单');
insert into sys_menu values('3041', '薪酬变更日志查询', '3040', '1',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:log:query',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3042', '薪酬变更日志导出', '3040', '2',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:log:export', '#', 'admin', sysdate(), '', null, ''); 