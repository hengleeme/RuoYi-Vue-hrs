-- 人员基本信息表
drop table if exists hrs_employee;
create table hrs_employee (
  employee_id           bigint(20)      not null auto_increment    comment '人员ID',
  employee_no           varchar(30)     not null                   comment '工号',
  employee_name         varchar(30)     not null                   comment '姓名',
  gender               char(1)         default '0'                comment '性别（0男 1女 2未知）',
  birthday             datetime                                   comment '出生日期',
  id_card              varchar(18)                                comment '身份证号',
  political_status     char(1)         default '0'                comment '政治面貌（0群众 1党员 2团员）',
  nation               varchar(20)                                comment '民族',
  marital_status       char(1)         default '0'                comment '婚姻状况（0未婚 1已婚 2离异 3丧偶）',
  education            varchar(20)                                comment '学历',
  degree               varchar(20)                                comment '学位',
  graduate_school      varchar(100)                               comment '毕业院校',
  major                varchar(100)                               comment '专业',
  graduate_date        datetime                                   comment '毕业日期',
  work_date            datetime                                   comment '参加工作时间',
  entry_date           datetime                                   comment '入职日期',
  dept_id              bigint(20)                                comment '部门ID',
  dept_name            varchar(30)                                comment '部门名称',
  position_id          bigint(20)                                comment '职位ID',
  position_name        varchar(30)                                comment '职位名称',
  job_level            varchar(20)                                comment '职级',
  job_title            varchar(30)                                comment '职称',
  phone                varchar(11)                                comment '手机号码',
  email                varchar(50)                                comment '邮箱',
  address              varchar(200)                               comment '现居地址',
  registered_address   varchar(200)                               comment '户籍地址',
  emergency_contact    varchar(30)                                comment '紧急联系人',
  emergency_phone      varchar(11)                                comment '紧急联系电话',
  status               char(1)         default '0'                comment '状态（0正常 1停用）',
  del_flag             char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  work_years           int(11)         default 0                  comment '工作年限',
  create_by            varchar(64)     default ''                 comment '创建者',
  create_time          datetime                                   comment '创建时间',
  update_by            varchar(64)     default ''                 comment '更新者',
  update_time          datetime                                   comment '更新时间',
  remark               varchar(500)    default null               comment '备注',
  primary key (employee_id)
) engine=innodb auto_increment=100 comment = '人员基本信息表';

-- 初始化-人员基本信息表数据
insert into hrs_employee values(1, '1001', '张三', '0', '1990-01-01', '110101199001011234', '1', '汉族', '1', '本科', '学士', '北京大学', '计算机科学与技术', '2012-07-01', '2012-07-01', '2012-07-01', 100, '研发部', 1, 'Java开发工程师', '中级', '工程师', '13800138000', 'zhangsan@example.com', '北京市海淀区', '北京市海淀区', '李四', '13900139000', '0', '0', 10, 'admin', sysdate(), '', null, '测试数据');
insert into hrs_employee values(2, '1002', '李四', '1', '1992-02-02', '110101199202022345', '0', '汉族', '0', '硕士', '硕士', '清华大学', '软件工程', '2014-07-01', '2014-07-01', '2014-07-01', 100, '研发部', 2, '前端开发工程师', '高级', '高级工程师', '13800138001', 'lisi@example.com', '北京市朝阳区', '北京市朝阳区', '王五', '13900139001', '0', '0', 8, 'admin', sysdate(), '', null, '测试数据'); 