-- 教育类型字典数据
insert into sys_dict_type(dict_name, dict_type, status, create_by, remark)
values ('教育类型', 'hrs_education_type', '0', 'admin', '教育类型字典');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (1, '学历教育', '1', 'hrs_education_type', '', 'default', 'Y', '0', 'admin', '学历教育');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (2, '培训教育', '2', 'hrs_education_type', '', 'default', 'N', '0', 'admin', '培训教育');

-- 证书类型字典数据
insert into sys_dict_type(dict_name, dict_type, status, create_by, remark)
values ('证书类型', 'hrs_certificate_type', '0', 'admin', '证书类型字典');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (1, '资格证', '1', 'hrs_certificate_type', '', 'default', 'Y', '0', 'admin', '资格证');

insert into sys_dict_data(dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, remark)
values (2, '执业证', '2', 'hrs_certificate_type', '', 'default', 'N', '0', 'admin', '执业证'); 