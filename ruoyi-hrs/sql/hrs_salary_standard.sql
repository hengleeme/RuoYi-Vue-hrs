-- 薪资标准表
create table hrs_salary_standard (
  standard_id         bigint(20)      not null auto_increment    comment '标准ID',
  standard_name       varchar(100)    not null                   comment '标准名称',
  standard_type       char(1)         not null                   comment '标准类型（1基本工资 2岗位工资 3绩效工资）',
  standard_value      decimal(10,2)   not null                   comment '标准值',
  standard_unit       varchar(20)     not null                   comment '单位（元/月、元/小时等）',
  standard_desc       varchar(500)    default null               comment '标准说明',
  status             char(1)         default '0'                comment '状态（0正常 1停用）',
  del_flag           char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by          varchar(64)     default ''                 comment '创建者',
  create_time        datetime                                   comment '创建时间',
  update_by          varchar(64)     default ''                 comment '更新者',
  update_time        datetime                                   comment '更新时间',
  remark             varchar(500)    default null               comment '备注',
  primary key (standard_id)
) engine=innodb auto_increment=100 comment = '薪资标准表';

-- 薪资标准菜单
insert into sys_menu values('3020', '薪资标准', '3001', '3', 'standard',    'hrs/salary/standard/index',    '', 1, 0, 'C', '0', '0', 'hrs:salary:standard:list',    'money',      'admin', sysdate(), '', null, '薪资标准菜单');
insert into sys_menu values('3021', '薪资标准查询', '3020', '1',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:standard:query',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3022', '薪资标准新增', '3020', '2',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:standard:add',    '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3023', '薪资标准修改', '3020', '3',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:standard:edit',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3024', '薪资标准删除', '3020', '4',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:standard:remove', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3025', '薪资标准导出', '3020', '5',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:standard:export', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3026', '薪资标准导入', '3020', '6',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:standard:import', '#', 'admin', sysdate(), '', null, ''); 