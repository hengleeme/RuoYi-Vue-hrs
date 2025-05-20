-- 政治面貌字典数据
insert into sys_dict_type(dict_name, dict_type, status, create_by, remark)
values ('政治面貌', 'hrs_political_status', '0', 'admin', '政治面貌字典');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (1, '群众', '0', 'hrs_political_status', '', 'default', 'Y', '0', 'admin', '群众');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (2, '党员', '1', 'hrs_political_status', '', 'success', 'N', '0', 'admin', '党员');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (3, '团员', '2', 'hrs_political_status', '', 'info', 'N', '0', 'admin', '团员');

-- 民族字典数据
insert into sys_dict_type(dict_name, dict_type, status, create_by, remark)
values ('民族', 'hrs_nation', '0', 'admin', '民族字典');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (1, '汉族', '汉族', 'hrs_nation', '', 'default', 'Y', '0', 'admin', '汉族');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (2, '满族', '满族', 'hrs_nation', '', 'default', 'N', '0', 'admin', '满族');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (3, '蒙古族', '蒙古族', 'hrs_nation', '', 'default', 'N', '0', 'admin', '蒙古族');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (4, '回族', '回族', 'hrs_nation', '', 'default', 'N', '0', 'admin', '回族');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (5, '藏族', '藏族', 'hrs_nation', '', 'default', 'N', '0', 'admin', '藏族');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (6, '维吾尔族', '维吾尔族', 'hrs_nation', '', 'default', 'N', '0', 'admin', '维吾尔族');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (7, '苗族', '苗族', 'hrs_nation', '', 'default', 'N', '0', 'admin', '苗族');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (8, '彝族', '彝族', 'hrs_nation', '', 'default', 'N', '0', 'admin', '彝族');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (9, '壮族', '壮族', 'hrs_nation', '', 'default', 'N', '0', 'admin', '壮族');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (10, '其他', '其他', 'hrs_nation', '', 'default', 'N', '0', 'admin', '其他');

-- 婚姻状况字典数据
insert into sys_dict_type(dict_name, dict_type, status, create_by, remark)
values ('婚姻状况', 'hrs_marital_status', '0', 'admin', '婚姻状况字典');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (1, '未婚', '0', 'hrs_marital_status', '', 'default', 'Y', '0', 'admin', '未婚');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (2, '已婚', '1', 'hrs_marital_status', '', 'success', 'N', '0', 'admin', '已婚');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (3, '离异', '2', 'hrs_marital_status', '', 'warning', 'N', '0', 'admin', '离异');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (4, '丧偶', '3', 'hrs_marital_status', '', 'danger', 'N', '0', 'admin', '丧偶');

-- 学历字典数据
insert into sys_dict_type(dict_name, dict_type, status, create_by, remark)
values ('学历', 'hrs_education', '0', 'admin', '学历字典');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (1, '小学', '小学', 'hrs_education', '', 'default', 'Y', '0', 'admin', '小学');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (2, '初中', '初中', 'hrs_education', '', 'default', 'N', '0', 'admin', '初中');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (3, '高中', '高中', 'hrs_education', '', 'default', 'N', '0', 'admin', '高中');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (4, '中专', '中专', 'hrs_education', '', 'default', 'N', '0', 'admin', '中专');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (5, '大专', '大专', 'hrs_education', '', 'default', 'N', '0', 'admin', '大专');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (6, '本科', '本科', 'hrs_education', '', 'default', 'N', '0', 'admin', '本科');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (7, '硕士', '硕士', 'hrs_education', '', 'default', 'N', '0', 'admin', '硕士');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (8, '博士', '博士', 'hrs_education', '', 'default', 'N', '0', 'admin', '博士');

-- 学位字典数据
insert into sys_dict_type(dict_name, dict_type, status, create_by, remark)
values ('学位', 'hrs_degree', '0', 'admin', '学位字典');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (1, '无', '无', 'hrs_degree', '', 'default', 'Y', '0', 'admin', '无');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (2, '学士', '学士', 'hrs_degree', '', 'default', 'N', '0', 'admin', '学士');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (3, '硕士', '硕士', 'hrs_degree', '', 'default', 'N', '0', 'admin', '硕士');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (4, '博士', '博士', 'hrs_degree', '', 'default', 'N', '0', 'admin', '博士');

-- 职级字典数据
insert into sys_dict_type(dict_name, dict_type, status, create_by, remark)
values ('职级', 'hrs_job_level', '0', 'admin', '职级字典');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (1, '初级', '初级', 'hrs_job_level', '', 'default', 'Y', '0', 'admin', '初级');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (2, '中级', '中级', 'hrs_job_level', '', 'default', 'N', '0', 'admin', '中级');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (3, '高级', '高级', 'hrs_job_level', '', 'default', 'N', '0', 'admin', '高级');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (4, '资深', '资深', 'hrs_job_level', '', 'default', 'N', '0', 'admin', '资深');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (5, '专家', '专家', 'hrs_job_level', '', 'default', 'N', '0', 'admin', '专家'); 