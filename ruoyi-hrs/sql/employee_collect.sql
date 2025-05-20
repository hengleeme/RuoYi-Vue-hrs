-- 人员信息采集表
create table hrs_employee_collect (
  collect_id           bigint(20)      not null auto_increment    comment '采集ID',
  employee_id          bigint(20)      not null                   comment '人员ID',
  employee_name        varchar(50)     not null                   comment '人员姓名',
  collect_type         char(1)         not null                   comment '采集类型（1基本信息 2教育经历 3工作经历 4资格证书）',
  collect_content      text            not null                   comment '采集内容',
  collect_file         varchar(500)    default ''                 comment '采集附件',
  status              char(1)         default '0'                comment '状态（0待审核 1已审核 2已驳回）',
  audit_by            varchar(64)     default ''                 comment '审核人',
  audit_time          datetime                                   comment '审核时间',
  audit_remark        varchar(500)    default ''                 comment '审核备注',
  remark              varchar(500)    default null               comment '备注',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  primary key (collect_id)
) engine=innodb auto_increment=100 comment = '人员信息采集表';

-- 初始化-字典类型表数据
insert into sys_dict_type values(11, '采集类型', 'hrs_collect_type', '0', 'admin', sysdate(), '', null, '人员信息采集类型字典');

-- 初始化-字典数据表数据
insert into sys_dict_data values(30, 1,  '基本信息', '1', 'hrs_collect_type',   '',   'primary',   'Y', '0', 'admin', sysdate(), '', null, '基本信息采集');
insert into sys_dict_data values(31, 2,  '教育经历', '2', 'hrs_collect_type',   '',   'success',   'Y', '0', 'admin', sysdate(), '', null, '教育经历采集');
insert into sys_dict_data values(32, 3,  '工作经历', '3', 'hrs_collect_type',   '',   'info',      'Y', '0', 'admin', sysdate(), '', null, '工作经历采集');
insert into sys_dict_data values(33, 4,  '资格证书', '4', 'hrs_collect_type',   '',   'warning',   'Y', '0', 'admin', sysdate(), '', null, '资格证书采集');

-- 初始化-菜单权限
insert into sys_menu values('2000', '人员信息采集', '0', '4', 'collect',           null, '', 1, 0, 'M', '0', '0', '', 'form',   'admin', sysdate(), '', null, '人员信息采集菜单');
insert into sys_menu values('2001', '采集管理', '2000', '1', 'collect',        'hrs/employee/collect/index',    '', 1, 0, 'C', '0', '0', 'hrs:employee:collect:list',    'edit',   'admin', sysdate(), '', null, '采集管理菜单');
insert into sys_menu values('2002', '采集查询', '2000', '2', 'collect',        'hrs/employee/collect/index',    '', 1, 0, 'C', '0', '0', 'hrs:employee:collect:query',   'search',  'admin', sysdate(), '', null, '采集查询菜单');

-- 采集管理按钮
insert into sys_menu values('2003', '采集新增', '2001', '1',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:employee:collect:add',          '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2004', '采集修改', '2001', '2',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:employee:collect:edit',         '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2005', '采集删除', '2001', '3',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:employee:collect:remove',       '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2006', '采集导出', '2001', '4',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:employee:collect:export',       '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2007', '采集审核', '2001', '5',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:employee:collect:audit',        '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2008', '采集上传', '2001', '6',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:employee:collect:upload',       '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('2009', '采集下载', '2001', '7',  '', '', '', 1, 0, 'F', '0', '0', 'hrs:employee:collect:download',     '#', 'admin', sysdate(), '', null, ''); 