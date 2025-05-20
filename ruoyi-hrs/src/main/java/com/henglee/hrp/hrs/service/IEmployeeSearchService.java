package com.henglee.hrp.hrs.service;

import java.util.List;
import com.henglee.hrp.hrs.domain.EmployeeSearch;

/**
 * 人员综合查询Service接口
 * 
 * @author cbh
 */
public interface IEmployeeSearchService 
{
    /**
     * 查询人员综合信息列表
     * 
     * @param employeeSearch 查询条件
     * @return 人员综合信息列表
     */
    public List<EmployeeSearch> selectEmployeeSearchList(EmployeeSearch employeeSearch);

    /**
     * 导出人员综合信息列表
     * 
     * @param employeeSearch 查询条件
     * @return 人员综合信息列表
     */
    public List<EmployeeSearch> selectEmployeeSearchExport(EmployeeSearch employeeSearch);
} 