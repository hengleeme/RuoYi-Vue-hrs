package com.henglee.hrp.hrs.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.mapper.EmployeeLogMapper;
import com.henglee.hrp.hrs.domain.EmployeeLog;
import com.henglee.hrp.hrs.service.IEmployeeLogService;

/**
 * 人员信息变更日志Service业务层处理
 * 
 * @author cbh
 */
@Service
public class EmployeeLogServiceImpl implements IEmployeeLogService 
{
    @Autowired
    private EmployeeLogMapper employeeLogMapper;

    /**
     * 查询人员信息变更日志
     * 
     * @param logId 人员信息变更日志主键
     * @return 人员信息变更日志
     */
    @Override
    public EmployeeLog selectEmployeeLogByLogId(Long logId)
    {
        return employeeLogMapper.selectEmployeeLogByLogId(logId);
    }

    /**
     * 查询人员信息变更日志列表
     * 
     * @param employeeLog 人员信息变更日志
     * @return 人员信息变更日志
     */
    @Override
    public List<EmployeeLog> selectEmployeeLogList(EmployeeLog employeeLog)
    {
        return employeeLogMapper.selectEmployeeLogList(employeeLog);
    }

    /**
     * 新增人员信息变更日志
     * 
     * @param employeeLog 人员信息变更日志
     * @return 结果
     */
    @Override
    public int insertEmployeeLog(EmployeeLog employeeLog)
    {
        return employeeLogMapper.insertEmployeeLog(employeeLog);
    }

    /**
     * 修改人员信息变更日志
     * 
     * @param employeeLog 人员信息变更日志
     * @return 结果
     */
    @Override
    public int updateEmployeeLog(EmployeeLog employeeLog)
    {
        return employeeLogMapper.updateEmployeeLog(employeeLog);
    }

    /**
     * 批量删除人员信息变更日志
     * 
     * @param logIds 需要删除的人员信息变更日志主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeLogByLogIds(Long[] logIds)
    {
        return employeeLogMapper.deleteEmployeeLogByLogIds(logIds);
    }

    /**
     * 删除人员信息变更日志信息
     * 
     * @param logId 人员信息变更日志主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeLogByLogId(Long logId)
    {
        return employeeLogMapper.deleteEmployeeLogByLogId(logId);
    }
} 