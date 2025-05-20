package com.henglee.hrp.hrs.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.mapper.EmployeeSearchMapper;
import com.henglee.hrp.hrs.domain.EmployeeSearch;
import com.henglee.hrp.hrs.service.IEmployeeSearchService;

/**
 * 人员综合查询Service业务层处理
 * 
 * @author cbh
 */
@Service
public class EmployeeSearchServiceImpl implements IEmployeeSearchService 
{
    @Autowired
    private EmployeeSearchMapper employeeSearchMapper;

    /**
     * 查询人员综合信息列表
     * 
     * @param employeeSearch 查询条件
     * @return 人员综合信息列表
     */
    @Override
    public List<EmployeeSearch> selectEmployeeSearchList(EmployeeSearch employeeSearch)
    {
        return employeeSearchMapper.selectEmployeeSearchList(employeeSearch);
    }

    /**
     * 导出人员综合信息列表
     * 
     * @param employeeSearch 查询条件
     * @return 人员综合信息列表
     */
    @Override
    public List<EmployeeSearch> selectEmployeeSearchExport(EmployeeSearch employeeSearch)
    {
        return employeeSearchMapper.selectEmployeeSearchExport(employeeSearch);
    }
} 