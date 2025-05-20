-- 工资信息表
create table hrs_salary_info (
  salary_id           bigint(20)      not null auto_increment    comment '工资ID',
  employee_id         bigint(20)      not null                   comment '员工ID',
  salary_year         int(4)          not null                   comment '工资年份',
  salary_month        int(2)          not null                   comment '工资月份',
  basic_salary        decimal(10,2)   not null                   comment '基本工资',
  position_salary     decimal(10,2)   default 0.00               comment '岗位工资',
  performance_salary  decimal(10,2)   default 0.00               comment '绩效工资',
  overtime_salary     decimal(10,2)   default 0.00               comment '加班工资',
  bonus              decimal(10,2)   default 0.00               comment '奖金',
  subsidy            decimal(10,2)   default 0.00               comment '补贴',
  social_security     decimal(10,2)   default 0.00               comment '社保扣款',
  housing_fund        decimal(10,2)   default 0.00               comment '公积金扣款',
  tax                decimal(10,2)   default 0.00               comment '个人所得税',
  other_deduction     decimal(10,2)   default 0.00               comment '其他扣款',
  actual_salary       decimal(10,2)   not null                   comment '实发工资',
  status             char(1)         default '0'                comment '状态（0草稿 1已提交 2已审核 3已发放）',
  del_flag           char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by          varchar(64)     default ''                 comment '创建者',
  create_time        datetime                                   comment '创建时间',
  update_by          varchar(64)     default ''                 comment '更新者',
  update_time        datetime                                   comment '更新时间',
  remark             varchar(500)    default null               comment '备注',
  primary key (salary_id)
) engine=innodb auto_increment=100 comment = '工资信息表';

-- 工资信息菜单
insert into sys_menu values('3001', '工资管理', '0', '5', 'salary',           null, '', 1, 0, 'M', '0', '0', '', 'money',   'admin', sysdate(), '', null, '工资管理目录');

-- 工资信息菜单
insert into sys_menu values('3002', '工资信息', '3001', '1', 'info',        'hrs/salary/info/index',    '', 1, 0, 'C', '0', '0', 'hrs:salary:info:list',    'money',      'admin', sysdate(), '', null, '工资信息菜单');
insert into sys_menu values('3003', '工资信息查询', '3002', '1',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:info:query',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3004', '工资信息新增', '3002', '2',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:info:add',    '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3005', '工资信息修改', '3002', '3',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:info:edit',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3006', '工资信息删除', '3002', '4',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:info:remove', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3007', '工资信息导出', '3002', '5',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:info:export', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3008', '工资信息导入', '3002', '6',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:info:import', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3009', '工资信息提交', '3002', '7',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:info:submit', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3010', '工资信息审核', '3002', '8',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:info:approve','#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3011', '工资信息发放', '3002', '9',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:info:pay',    '#', 'admin', sysdate(), '', null, ''); 