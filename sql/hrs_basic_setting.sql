-- 人员类别表
create table hrs_employee_type (
  type_id           bigint(20)      not null auto_increment    comment '类别ID',
  type_name         varchar(50)     not null                   comment '类别名称',
  type_code         varchar(20)     not null                   comment '类别编码',
  status            char(1)         default '0'                comment '状态（0正常 1停用）',
  remark            varchar(500)    default null               comment '备注',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (type_id)
) engine=innodb auto_increment=100 comment = '人员类别表';

-- 人员编号规则表
create table hrs_employee_code_rule (
  rule_id           bigint(20)      not null auto_increment    comment '规则ID',
  rule_name         varchar(50)     not null                   comment '规则名称',
  rule_type         char(1)         not null                   comment '规则类型（1前缀 2日期 3序号 4后缀）',
  rule_value        varchar(50)     not null                   comment '规则值',
  rule_order        int(4)          not null                   comment '规则顺序',
  status            char(1)         default '0'                comment '状态（0正常 1停用）',
  remark            varchar(500)    default null               comment '备注',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (rule_id)
) engine=innodb auto_increment=100 comment = '人员编号规则表';

-- 信息采集设置表
create table hrs_collect_setting (
  setting_id        bigint(20)      not null auto_increment    comment '设置ID',
  setting_name      varchar(50)     not null                   comment '设置名称',
  setting_type      varchar(20)     not null                   comment '设置类型',
  is_required       char(1)         default '0'                comment '是否必填（0否 1是）',
  is_visible        char(1)         default '1'                comment '是否显示（0否 1是）',
  status            char(1)         default '0'                comment '状态（0正常 1停用）',
  remark            varchar(500)    default null               comment '备注',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (setting_id)
) engine=innodb auto_increment=100 comment = '信息采集设置表'; 