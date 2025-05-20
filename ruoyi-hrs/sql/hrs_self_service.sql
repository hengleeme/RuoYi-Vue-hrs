-- ----------------------------
-- 1、员工自助服务表
-- ----------------------------
drop table if exists hrs_self_service;
create table hrs_self_service (
  service_id         bigint(20)      not null auto_increment    comment '自助服务ID',
  emp_id            bigint(20)      not null                   comment '员工ID',
  emp_name          varchar(30)     not null                   comment '员工姓名',
  emp_no            varchar(20)     not null                   comment '员工工号',
  dept_id           bigint(20)      not null                   comment '部门ID',
  dept_name         varchar(30)     not null                   comment '部门名称',
  service_type      char(1)         not null                   comment '服务类型（1请假 2加班 3报销 4培训 5绩效）',
  start_time        datetime        not null                   comment '开始时间',
  end_time          datetime        not null                   comment '结束时间',
  service_content   varchar(500)    not null                   comment '服务内容',
  attachment_url    varchar(500)    default null               comment '附件URL',
  status            char(1)         default '0'                comment '审批状态（0待审批 1已通过 2已驳回）',
  del_flag          char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (service_id)
) engine=innodb auto_increment=100 comment = '员工自助服务表'; 