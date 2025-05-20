-- 人员异动类型字典数据
insert into sys_dict_type(dict_name, dict_type, status, create_by, remark)
values ('异动类型', 'hrs_transfer_type', '0', 'admin', '人员异动类型字典');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (1, '科室调配', '1', 'hrs_transfer_type', '', 'default', 'Y', '0', 'admin', '科室调配');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (2, '人员类别变动', '2', 'hrs_transfer_type', '', 'default', 'N', '0', 'admin', '人员类别变动');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (3, '人员离职', '3', 'hrs_transfer_type', '', 'default', 'N', '0', 'admin', '人员离职');

-- 人员异动表
drop table if exists hrs_employee_transfer;
create table hrs_employee_transfer (
  transfer_id         bigint(20)      not null auto_increment    comment '异动ID',
  employee_id         bigint(20)      not null                   comment '人员ID',
  transfer_type       varchar(20)     not null                   comment '异动类型（1科室调配 2人员类别变动 3人员离职）',
  transfer_date       datetime        not null                   comment '异动日期',
  before_dept_id      bigint(20)                                comment '异动前科室ID',
  after_dept_id       bigint(20)                                comment '异动后科室ID',
  before_category     varchar(20)                               comment '异动前人员类别',
  after_category      varchar(20)                               comment '异动后人员类别',
  transfer_reason     varchar(500)    not null                   comment '异动原因',
  transfer_file       varchar(500)                               comment '异动附件',
  status              char(1)         default '0'                comment '状态（0待审核 1已审核 2已驳回）',
  audit_by            varchar(64)     default ''                 comment '审核人',
  audit_time          datetime                                   comment '审核时间',
  audit_remark        varchar(500)    default null               comment '审核备注',
  remark              varchar(500)    default null               comment '备注',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  primary key (transfer_id)
) engine=innodb auto_increment=100 comment = '人员异动表';

-- 初始化-人员异动表数据
insert into hrs_employee_transfer values(1, 1, '1', '2023-01-01', 1, 2, null, null, '工作需要', '/profile/upload/2023/01/01/transfer1.pdf', '1', 'admin', sysdate(), '同意', '科室调配', 'admin', sysdate(), '', null);
insert into hrs_employee_transfer values(2, 1, '2', '2023-02-01', null, null, '1', '2', '工作需要', '/profile/upload/2023/02/01/transfer2.pdf', '1', 'admin', sysdate(), '同意', '人员类别变动', 'admin', sysdate(), '', null); 