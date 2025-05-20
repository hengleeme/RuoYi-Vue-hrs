package com.henglee.hrp.hrs.salary.service;

import java.util.List;
import com.henglee.hrp.hrs.salary.domain.HrsSalaryChangeLog;

/**
 * 薪酬变更日志Service接口
 * 
 * @author henglee
 */
public interface IHrsSalaryChangeLogService 
{
    /**
     * 查询薪酬变更日志
     * 
     * @param logId 薪酬变更日志主键
     * @return 薪酬变更日志
     */
    public HrsSalaryChangeLog selectHrsSalaryChangeLogByLogId(Long logId);

    /**
     * 查询薪酬变更日志列表
     * 
     * @param hrsSalaryChangeLog 薪酬变更日志
     * @return 薪酬变更日志集合
     */
    public List<HrsSalaryChangeLog> selectHrsSalaryChangeLogList(HrsSalaryChangeLog hrsSalaryChangeLog);

    /**
     * 新增薪酬变更日志
     * 
     * @param hrsSalaryChangeLog 薪酬变更日志
     * @return 结果
     */
    public int insertHrsSalaryChangeLog(HrsSalaryChangeLog hrsSalaryChangeLog);

    /**
     * 修改薪酬变更日志
     * 
     * @param hrsSalaryChangeLog 薪酬变更日志
     * @return 结果
     */
    public int updateHrsSalaryChangeLog(HrsSalaryChangeLog hrsSalaryChangeLog);

    /**
     * 批量删除薪酬变更日志
     * 
     * @param logIds 需要删除的薪酬变更日志主键集合
     * @return 结果
     */
    public int deleteHrsSalaryChangeLogByLogIds(Long[] logIds);

    /**
     * 删除薪酬变更日志信息
     * 
     * @param logId 薪酬变更日志主键
     * @return 结果
     */
    public int deleteHrsSalaryChangeLogByLogId(Long logId);
} 