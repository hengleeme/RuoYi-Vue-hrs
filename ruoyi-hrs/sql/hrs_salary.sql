-- ----------------------------
-- 1、薪资信息表
-- ----------------------------
drop table if exists hrs_salary;
create table hrs_salary (
  salary_id           bigint(20)      not null auto_increment    comment '薪资ID',
  emp_id             bigint(20)      not null                   comment '员工ID',
  emp_name           varchar(30)     not null                   comment '员工姓名',
  emp_no             varchar(20)     not null                   comment '员工工号',
  dept_id            bigint(20)      not null                   comment '部门ID',
  dept_name          varchar(30)     not null                   comment '部门名称',
  salary_month       varchar(7)      not null                   comment '薪资月份',
  base_salary        decimal(10,2)   not null                   comment '基本工资',
  performance_salary decimal(10,2)   default 0.00               comment '绩效工资',
  overtime_salary    decimal(10,2)   default 0.00               comment '加班工资',
  allowance          decimal(10,2)   default 0.00               comment '津贴',
  deduction          decimal(10,2)   default 0.00               comment '扣款',
  actual_salary      decimal(10,2)   not null                   comment '实发工资',
  status             char(1)         default '0'                comment '状态（0正常 1停用）',
  del_flag           char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by          varchar(64)     default ''                 comment '创建者',
  create_time        datetime                                   comment '创建时间',
  update_by          varchar(64)     default ''                 comment '更新者',
  update_time        datetime                                   comment '更新时间',
  remark             varchar(500)    default null               comment '备注',
  primary key (salary_id)
) engine=innodb auto_increment=100 comment = '薪资信息表'; 