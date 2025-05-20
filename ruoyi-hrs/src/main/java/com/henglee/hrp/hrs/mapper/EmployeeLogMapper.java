package com.henglee.hrp.hrs.mapper;

import java.util.List;
import com.henglee.hrp.hrs.domain.EmployeeLog;

/**
 * 人员信息变更日志Mapper接口
 * 
 * @author cbh
 */
public interface EmployeeLogMapper 
{
    /**
     * 查询人员信息变更日志
     * 
     * @param logId 人员信息变更日志主键
     * @return 人员信息变更日志
     */
    public EmployeeLog selectEmployeeLogByLogId(Long logId);

    /**
     * 查询人员信息变更日志列表
     * 
     * @param employeeLog 人员信息变更日志
     * @return 人员信息变更日志集合
     */
    public List<EmployeeLog> selectEmployeeLogList(EmployeeLog employeeLog);

    /**
     * 新增人员信息变更日志
     * 
     * @param employeeLog 人员信息变更日志
     * @return 结果
     */
    public int insertEmployeeLog(EmployeeLog employeeLog);

    /**
     * 修改人员信息变更日志
     * 
     * @param employeeLog 人员信息变更日志
     * @return 结果
     */
    public int updateEmployeeLog(EmployeeLog employeeLog);

    /**
     * 删除人员信息变更日志
     * 
     * @param logId 人员信息变更日志主键
     * @return 结果
     */
    public int deleteEmployeeLogByLogId(Long logId);

    /**
     * 批量删除人员信息变更日志
     * 
     * @param logIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeeLogByLogIds(Long[] logIds);
} 