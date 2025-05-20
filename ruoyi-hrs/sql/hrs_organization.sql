-- ----------------------------
-- 1、组织架构表
-- ----------------------------
drop table if exists hrs_organization;
create table hrs_organization (
  org_id              bigint(20)      not null auto_increment    comment '组织ID',
  org_name            varchar(50)     not null                   comment '组织名称',
  org_code            varchar(50)     not null                   comment '组织编码',
  parent_id           bigint(20)      default 0                  comment '父组织ID',
  org_type            char(1)         default '0'                comment '组织类型（1公司 2部门 3岗位）',
  order_num           int(4)          default 0                  comment '显示顺序',
  leader              varchar(50)     default null               comment '负责人',
  phone               varchar(11)     default null               comment '联系电话',
  email               varchar(50)     default null               comment '邮箱',
  plan_name           varchar(100)    default null               comment '规划名称',
  plan_type           char(1)         default null               comment '规划类型（1组织架构 2岗位设置 3人员编制 4成本预算）',
  plan_year           varchar(4)      default null               comment '规划年份',
  plan_quarter        char(1)         default null               comment '规划季度（1第一季度 2第二季度 3第三季度 4第四季度）',
  plan_month          varchar(2)      default null               comment '规划月份',
  plan_content        text                                       comment '规划内容',
  plan_target         text                                       comment '规划目标',
  implementation_plan text                                       comment '实施计划',
  budget_amount       decimal(10,2)   default 0.00              comment '预算金额',
  actual_amount       decimal(10,2)   default 0.00              comment '实际金额',
  start_time          date            default null               comment '开始时间',
  end_time            date            default null               comment '结束时间',
  status              char(1)         default '0'                comment '状态（0正常 1停用）',
  del_flag            char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  remark              varchar(500)    default null               comment '备注',
  primary key (org_id)
) engine=innodb auto_increment=100 comment = '组织架构表';

-- ----------------------------
-- 初始化-组织架构表数据
-- ----------------------------
insert into hrs_organization values(1, '总公司', 'HQ001', 0, '1', 1, '张三', '13800138000', 'zhangsan@example.com', '2024年组织架构规划', '1', '2024', '1', '01', '优化组织架构，提升管理效率', '建立扁平化管理体系', '1. 调整部门设置\n2. 优化岗位配置\n3. 完善管理制度', 1000000.00, 0.00, '2024-01-01', '2024-12-31', '0', '0', 'admin', sysdate(), '', null, '总公司组织架构');
insert into hrs_organization values(2, '研发部', 'DEV001', 1, '2', 1, '李四', '13800138001', 'lisi@example.com', '2024年研发部规划', '2', '2024', '1', '01', '加强技术研发，提升产品竞争力', '完成核心产品升级', '1. 招聘高级工程师\n2. 优化开发流程\n3. 加强技术培训', 500000.00, 0.00, '2024-01-01', '2024-12-31', '0', '0', 'admin', sysdate(), '', null, '研发部规划');
insert into hrs_organization values(3, '市场部', 'MKT001', 1, '2', 2, '王五', '13800138002', 'wangwu@example.com', '2024年市场部规划', '2', '2024', '1', '01', '扩大市场份额，提升品牌影响力', '实现销售额增长30%', '1. 制定营销策略\n2. 拓展销售渠道\n3. 加强品牌建设', 300000.00, 0.00, '2024-01-01', '2024-12-31', '0', '0', 'admin', sysdate(), '', null, '市场部规划');
insert into hrs_organization values(4, '人事部', 'HR001', 1, '2', 3, '赵六', '13800138003', 'zhaoliu@example.com', '2024年人事部规划', '2', '2024', '1', '01', '优化人才结构，提升员工满意度', '员工满意度提升20%', '1. 完善培训体系\n2. 优化绩效考核\n3. 加强员工关怀', 200000.00, 0.00, '2024-01-01', '2024-12-31', '0', '0', 'admin', sysdate(), '', null, '人事部规划');
insert into hrs_organization values(5, '财务部', 'FIN001', 1, '2', 4, '钱七', '13800138004', 'qianqi@example.com', '2024年财务部规划', '2', '2024', '1', '01', '加强财务管理，提升资金使用效率', '降低运营成本10%', '1. 优化预算管理\n2. 加强成本控制\n3. 完善财务制度', 150000.00, 0.00, '2024-01-01', '2024-12-31', '0', '0', 'admin', sysdate(), '', null, '财务部规划'); 