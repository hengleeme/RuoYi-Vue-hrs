-- ----------------------------
-- 1、组织规划表
-- ----------------------------
drop table if exists hrs_organization;
create table hrs_organization (
  plan_id            bigint(20)      not null auto_increment    comment '规划ID',
  plan_name          varchar(100)    not null                   comment '规划名称',
  plan_type          char(1)         not null                   comment '规划类型（1组织架构 2岗位设置 3人员编制 4成本预算）',
  dept_id            bigint(20)      not null                   comment '部门ID',
  dept_name          varchar(30)     not null                   comment '部门名称',
  plan_year          varchar(4)      not null                   comment '规划年份',
  plan_quarter       char(1)         default null               comment '规划季度（1第一季度 2第二季度 3第三季度 4第四季度）',
  plan_month         char(2)         default null               comment '规划月份',
  plan_content       varchar(500)    not null                   comment '规划内容',
  plan_target        varchar(500)    not null                   comment '规划目标',
  implementation_plan varchar(500)   not null                   comment '实施计划',
  budget_amount      decimal(10,2)   default 0.00               comment '预算金额',
  actual_amount      decimal(10,2)   default 0.00               comment '实际金额',
  start_time         date            not null                   comment '开始时间',
  end_time           date            not null                   comment '结束时间',
  status             char(1)         default '0'                comment '状态（0草稿 1待审核 2已通过 3已驳回）',
  del_flag           char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by          varchar(64)     default ''                 comment '创建者',
  create_time        datetime                                   comment '创建时间',
  update_by          varchar(64)     default ''                 comment '更新者',
  update_time        datetime                                   comment '更新时间',
  remark             varchar(500)    default null               comment '备注',
  primary key (plan_id)
) engine=innodb auto_increment=100 comment = '组织规划表'; 