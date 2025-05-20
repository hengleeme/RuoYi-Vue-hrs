-- 薪酬体系表
create table hrs_salary_system (
  system_id         bigint(20)      not null auto_increment    comment '体系ID',
  system_name       varchar(100)    not null                   comment '体系名称',
  system_type       char(1)         not null                   comment '体系类型（1发放对象 2工资账套 3公式套）',
  system_code       varchar(50)     not null                   comment '体系编码',
  system_desc       varchar(500)    default null               comment '体系说明',
  status           char(1)         default '0'                comment '状态（0正常 1停用）',
  del_flag         char(1)         default '0'                comment '删除标志（0代表存在 1代表删除）',
  create_by        varchar(64)     default ''                 comment '创建者',
  create_time      datetime                                   comment '创建时间',
  update_by        varchar(64)     default ''                 comment '更新者',
  update_time      datetime                                   comment '更新时间',
  remark           varchar(500)    default null               comment '备注',
  primary key (system_id)
) engine=innodb auto_increment=100 comment = '薪酬体系表';

-- 薪酬体系菜单
insert into sys_menu values('3030', '薪酬体系', '3001', '4', 'system',    'hrs/salary/system/index',    '', 1, 0, 'C', '0', '0', 'hrs:salary:system:list',    'money',      'admin', sysdate(), '', null, '薪酬体系菜单');
insert into sys_menu values('3031', '薪酬体系查询', '3030', '1',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:system:query',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3032', '薪酬体系新增', '3030', '2',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:system:add',    '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3033', '薪酬体系修改', '3030', '3',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:system:edit',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3034', '薪酬体系删除', '3030', '4',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:system:remove', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3035', '薪酬体系导出', '3030', '5',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:system:export', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('3036', '薪酬体系导入', '3030', '6',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:salary:system:import', '#', 'admin', sysdate(), '', null, ''); 