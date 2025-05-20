-- ----------------------------
-- 系统设置表
-- ----------------------------
drop table if exists hrs_settings;
create table hrs_settings (
  settings_id           bigint(20)      not null auto_increment    comment '设置ID',
  settings_type         varchar(50)     not null                   comment '设置类型',
  settings_key          varchar(100)    not null                   comment '设置键',
  settings_value        varchar(500)    not null                   comment '设置值',
  settings_desc         varchar(500)                               comment '设置描述',
  is_system            char(1)         default '0'                comment '是否系统内置（0否 1是）',
  del_flag             char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by            varchar(64)     default ''                 comment '创建者',
  create_time          datetime                                   comment '创建时间',
  update_by            varchar(64)     default ''                 comment '更新者',
  update_time          datetime                                   comment '更新时间',
  remark               varchar(500)    default null               comment '备注',
  primary key (settings_id)
) engine=innodb auto_increment=100 comment = '系统设置表';

-- ----------------------------
-- 初始化-系统设置表数据
-- ----------------------------
insert into hrs_settings values(1, 'system', 'hrs.system.name', '人事管理系统', '系统名称', '1', '0', 'admin', sysdate(), '', null, '系统名称');
insert into hrs_settings values(2, 'system', 'hrs.system.version', '1.0.0', '系统版本', '1', '0', 'admin', sysdate(), '', null, '系统版本');
insert into hrs_settings values(3, 'system', 'hrs.system.copyright', 'Copyright © 2024 恒力软件', '系统版权', '1', '0', 'admin', sysdate(), '', null, '系统版权');
insert into hrs_settings values(4, 'system', 'hrs.system.company', '恒力软件', '公司名称', '1', '0', 'admin', sysdate(), '', null, '公司名称');
insert into hrs_settings values(5, 'system', 'hrs.system.website', 'http://www.henglee.com', '公司网站', '1', '0', 'admin', sysdate(), '', null, '公司网站');
insert into hrs_settings values(6, 'system', 'hrs.system.contact', 'admin@henglee.com', '联系方式', '1', '0', 'admin', sysdate(), '', null, '联系方式');
insert into hrs_settings values(7, 'system', 'hrs.system.address', '广东省深圳市南山区', '公司地址', '1', '0', 'admin', sysdate(), '', null, '公司地址');
insert into hrs_settings values(8, 'system', 'hrs.system.logo', '/profile/logo.png', '系统Logo', '1', '0', 'admin', sysdate(), '', null, '系统Logo');
insert into hrs_settings values(9, 'system', 'hrs.system.favicon', '/profile/favicon.ico', '系统图标', '1', '0', 'admin', sysdate(), '', null, '系统图标');
insert into hrs_settings values(10, 'system', 'hrs.system.title', '人事管理系统', '系统标题', '1', '0', 'admin', sysdate(), '', null, '系统标题'); 