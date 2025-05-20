-- ----------------------------
-- 1、招聘信息表
-- ----------------------------
drop table if exists hrs_recruitment;
create table hrs_recruitment (
  recruitment_id      bigint(20)      not null auto_increment    comment '招聘ID',
  position_name       varchar(50)     not null                   comment '职位名称',
  dept_id             bigint(20)      not null                   comment '部门ID',
  dept_name           varchar(50)     not null                   comment '部门名称',
  recruit_number      int(4)          not null                   comment '招聘人数',
  work_location       varchar(100)    not null                   comment '工作地点',
  salary_range        varchar(50)     not null                   comment '薪资范围',
  education           varchar(20)     not null                   comment '学历要求',
  experience          varchar(50)     not null                   comment '工作经验',
  description         text                                       comment '职位描述',
  requirement         text                                       comment '任职要求',
  status              char(1)         default '0'                comment '招聘状态（0进行中 1已结束 2已暂停）',
  start_time          date            not null                   comment '开始时间',
  end_time            date            not null                   comment '结束时间',
  del_flag            char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  remark              varchar(500)    default null               comment '备注',
  primary key (recruitment_id)
) engine=innodb auto_increment=100 comment = '招聘信息表';

-- ----------------------------
-- 初始化-招聘信息表数据
-- ----------------------------
insert into hrs_recruitment values(1, 'Java开发工程师', 100, '研发部', 2, '北京', '15k-25k', '本科', '3-5年', '负责公司核心业务系统的开发与维护', '1. 精通Java编程，熟悉Spring、SpringBoot等框架\n2. 熟悉MySQL数据库，了解数据库优化\n3. 熟悉Redis、MongoDB等NoSQL数据库\n4. 有良好的编码习惯和文档编写能力', '0', '2024-03-20', '2024-04-20', '0', 'admin', sysdate(), '', null, '急招');
insert into hrs_recruitment values(2, '前端开发工程师', 100, '研发部', 1, '北京', '12k-20k', '本科', '1-3年', '负责公司产品的前端开发工作', '1. 精通HTML、CSS、JavaScript\n2. 熟悉Vue、React等前端框架\n3. 了解前端工程化和性能优化\n4. 有良好的团队协作能力', '0', '2024-03-20', '2024-04-20', '0', 'admin', sysdate(), '', null, '急招');
insert into hrs_recruitment values(3, '产品经理', 101, '市场部', 1, '北京', '15k-25k', '本科', '3-5年', '负责公司产品的规划和设计', '1. 有互联网产品设计经验\n2. 熟悉产品设计流程和工具\n3. 有良好的沟通能力和团队协作能力\n4. 有项目管理经验优先', '0', '2024-03-20', '2024-04-20', '0', 'admin', sysdate(), '', null, '急招');
insert into hrs_recruitment values(4, 'UI设计师', 101, '市场部', 1, '北京', '10k-18k', '本科', '1-3年', '负责公司产品的UI设计工作', '1. 精通Photoshop、Sketch等设计工具\n2. 有良好的审美能力和设计理念\n3. 了解用户体验设计\n4. 有移动端设计经验优先', '0', '2024-03-20', '2024-04-20', '0', 'admin', sysdate(), '', null, '急招');
insert into hrs_recruitment values(5, '人力资源专员', 102, '人事部', 1, '北京', '8k-15k', '本科', '1-3年', '负责公司人力资源相关工作', '1. 熟悉人力资源六大模块\n2. 有招聘、培训、绩效等工作经验\n3. 有良好的沟通能力和服务意识\n4. 有HRBP经验优先', '0', '2024-03-20', '2024-04-20', '0', 'admin', sysdate(), '', null, '急招'); 