-- 人员教育背景表
drop table if exists hrs_employee_education;
create table hrs_employee_education (
  education_id         bigint(20)      not null auto_increment    comment '教育背景ID',
  employee_id          bigint(20)      not null                   comment '人员ID',
  education_type       varchar(20)     not null                   comment '教育类型（1学历教育 2培训教育）',
  school_name          varchar(100)    not null                   comment '学校/培训机构名称',
  major               varchar(100)                               comment '专业',
  degree              varchar(20)                                comment '学位',
  start_date          datetime                                   comment '开始日期',
  end_date            datetime                                   comment '结束日期',
  is_graduated        char(1)         default '0'                comment '是否毕业（0否 1是）',
  certificate_no      varchar(50)                                comment '证书编号',
  certificate_file    varchar(500)                               comment '证书附件',
  remark              varchar(500)    default null               comment '备注',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  primary key (education_id)
) engine=innodb auto_increment=100 comment = '人员教育背景表';

-- 医护人员资格证执业证表
drop table if exists hrs_employee_certificate;
create table hrs_employee_certificate (
  certificate_id      bigint(20)      not null auto_increment    comment '证书ID',
  employee_id         bigint(20)      not null                   comment '人员ID',
  certificate_type    varchar(20)     not null                   comment '证书类型（1资格证 2执业证）',
  certificate_name    varchar(100)    not null                   comment '证书名称',
  certificate_no      varchar(50)     not null                   comment '证书编号',
  issue_date          datetime                                   comment '发证日期',
  valid_date          datetime                                   comment '有效期',
  issue_org           varchar(100)                               comment '发证机构',
  certificate_file    varchar(500)                               comment '证书附件',
  status              char(1)         default '0'                comment '状态（0正常 1过期）',
  remark              varchar(500)    default null               comment '备注',
  create_by           varchar(64)     default ''                 comment '创建者',
  create_time         datetime                                   comment '创建时间',
  update_by           varchar(64)     default ''                 comment '更新者',
  update_time         datetime                                   comment '更新时间',
  primary key (certificate_id)
) engine=innodb auto_increment=100 comment = '医护人员资格证执业证表';

-- 初始化-人员教育背景表数据
insert into hrs_employee_education values(1, 1, '1', '北京大学', '计算机科学与技术', '学士', '2008-09-01', '2012-07-01', '1', '2012001', '/profile/upload/2023/01/01/cert1.pdf', '本科学历', 'admin', sysdate(), '', null);
insert into hrs_employee_education values(2, 1, '2', 'Oracle培训中心', 'Java高级开发', null, '2013-01-01', '2013-03-01', '1', '2013001', '/profile/upload/2023/01/01/cert2.pdf', 'Oracle认证', 'admin', sysdate(), '', null);

-- 初始化-医护人员资格证执业证表数据
insert into hrs_employee_certificate values(1, 1, '1', '医师资格证', '2012001', '2012-07-01', '2022-07-01', '卫生部', '/profile/upload/2023/01/01/cert3.pdf', '0', '医师资格证', 'admin', sysdate(), '', null);
insert into hrs_employee_certificate values(2, 1, '2', '医师执业证', '2012002', '2012-07-01', '2022-07-01', '卫生部', '/profile/upload/2023/01/01/cert4.pdf', '0', '医师执业证', 'admin', sysdate(), '', null); 