-- ----------------------------
-- 1、合同管理表
-- ----------------------------
drop table if exists hrs_contract;
create table hrs_contract (
  contract_id         bigint(20)      not null auto_increment    comment '合同ID',
  contract_no         varchar(50)     not null                   comment '合同编号',
  employee_id         bigint(20)      not null                   comment '员工ID',
  employee_name       varchar(50)     not null                   comment '员工姓名',
  contract_type       char(1)         not null                   comment '合同类型（1固定期限 2无固定期限 3实习协议 4劳务协议）',
  contract_status     char(1)         not null                   comment '合同状态（1生效 2到期 3终止 4解除）',
  start_date          date            not null                   comment '开始日期',
  end_date            date            default null               comment '结束日期',
  probation_months    int(2)          default 0                  comment '试用期(月)',
  work_location       varchar(100)    not null                   comment '工作地点',
  position            varchar(50)     not null                   comment '职位',
  department          varchar(50)     not null                   comment '部门',
  salary              decimal(10,2)   not null                   comment '薪资',
  contract_file       varchar(500)    default null               comment '合同文件',
  sign_date           date            not null                   comment '签订日期',
  sign_location       varchar(100)    not null                   comment '签订地点',
  party_a             varchar(100)    not null                   comment '甲方',
  party_b             varchar(100)    not null                   comment '乙方',
  del_flag            char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  remark              varchar(500)    default null               comment '备注',
  primary key (contract_id)
) engine=innodb auto_increment=100 comment = '合同信息表';

-- 合同变更记录表
create table hrs_contract_change (
  change_id           bigint(20)      not null auto_increment    comment '变更ID',
  contract_id         bigint(20)      not null                   comment '合同ID',
  change_type         char(1)         not null                   comment '变更类型（1续签 2变更 3解除 4终止）',
  change_reason       varchar(500)    not null                   comment '变更原因',
  change_date         date            not null                   comment '变更日期',
  change_file         varchar(500)    default null               comment '变更文件',
  del_flag            char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  remark              varchar(500)    default null               comment '备注',
  primary key (change_id)
) engine=innodb auto_increment=100 comment = '合同变更记录表';

-- 合同到期提醒表
create table hrs_contract_reminder (
  reminder_id         bigint(20)      not null auto_increment    comment '提醒ID',
  contract_id         bigint(20)      not null                   comment '合同ID',
  reminder_type       char(1)         not null                   comment '提醒类型（1到期提醒 2试用期到期提醒）',
  reminder_date       date            not null                   comment '提醒日期',
  reminder_status     char(1)         not null                   comment '提醒状态（0未处理 1已处理）',
  handle_result       varchar(500)    default null               comment '处理结果',
  del_flag            char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  remark              varchar(500)    default null               comment '备注',
  primary key (reminder_id)
) engine=innodb auto_increment=100 comment = '合同到期提醒表';

-- 菜单 SQL
insert into sys_menu values('3050', '合同管理', '3001', '6', 'system',    'hrs/contract/index',    '', 1, 0, 'C', '0', '0', 'hrs:contract:list',    'documentation', 'admin', sysdate(), '', null, '合同管理菜单');
insert into sys_menu values('3051', '合同管理查询', '3050', '1',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:contract:query',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3052', '合同管理新增', '3050', '2',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:contract:add',    '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3053', '合同管理修改', '3050', '3',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:contract:edit',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3054', '合同管理删除', '3050', '4',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:contract:remove', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3055', '合同管理导出', '3050', '5',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:contract:export', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3056', '合同管理导入', '3050', '6',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:contract:import', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3057', '合同续签', '3050', '7',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:contract:renew',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3058', '合同变更', '3050', '8',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:contract:change',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3059', '合同解除', '3050', '9',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:contract:terminate','#', 'admin', sysdate(), '', null, ''); 