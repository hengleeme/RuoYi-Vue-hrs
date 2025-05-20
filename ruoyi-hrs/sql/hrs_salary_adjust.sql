-- 定薪调薪记录表
create table hrs_salary_adjust (
  adjust_id           bigint(20)      not null auto_increment    comment '调整ID',
  employee_id         bigint(20)      not null                   comment '员工ID',
  adjust_type         char(1)         not null                   comment '调整类型（1定薪 2调薪）',
  adjust_date         date            not null                   comment '调整日期',
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
  adjust_reason       varchar(500)    default null               comment '调整原因',
  status             char(1)         default '0'                comment '状态（0草稿 1已提交 2已审核）',
  del_flag           char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by          varchar(64)     default ''                 comment '创建者',
  create_time        datetime                                   comment '创建时间',
  update_by          varchar(64)     default ''                 comment '更新者',
  update_time        datetime                                   comment '更新时间',
  remark             varchar(500)    default null               comment '备注',
  primary key (adjust_id)
) engine=innodb auto_increment=100 comment = '定薪调薪记录表';

-- 定薪调薪菜单
insert into sys_menu values('3012', '定薪调薪', '3001', '2', 'adjust',      'hrs/salary/adjust/index',    '', 1, 0, 'C', '0', '0', 'hrs:salary:adjust:list',    'money',      'admin', sysdate(), '', null, '定薪调薪菜单');
insert into sys_menu values('3013', '定薪调薪查询', '3012', '1',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:adjust:query',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3014', '定薪调薪新增', '3012', '2',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:adjust:add',    '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3015', '定薪调薪修改', '3012', '3',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:adjust:edit',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3016', '定薪调薪删除', '3012', '4',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:adjust:remove', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3017', '定薪调薪导出', '3012', '5',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:adjust:export', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3018', '定薪调薪提交', '3012', '6',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:adjust:submit', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3019', '定薪调薪审核', '3012', '7',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:adjust:approve','#', 'admin', sysdate(), '', null, ''); 