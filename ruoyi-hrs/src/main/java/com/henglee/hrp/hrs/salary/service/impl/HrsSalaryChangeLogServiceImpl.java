package com.henglee.hrp.hrs.salary.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.salary.mapper.HrsSalaryChangeLogMapper;
import com.henglee.hrp.hrs.salary.domain.HrsSalaryChangeLog;
import com.henglee.hrp.hrs.salary.service.IHrsSalaryChangeLogService;

/**
 * 薪酬变更日志Service业务层处理
 * 
 * @author henglee
 */
@Service
public class HrsSalaryChangeLogServiceImpl implements IHrsSalaryChangeLogService 
{
    @Autowired
    private HrsSalaryChangeLogMapper hrsSalaryChangeLogMapper;

    /**
     * 查询薪酬变更日志
     * 
     * @param logId 薪酬变更日志主键
     * @return 薪酬变更日志
     */
    @Override
    public HrsSalaryChangeLog selectHrsSalaryChangeLogByLogId(Long logId)
    {
        return hrsSalaryChangeLogMapper.selectHrsSalaryChangeLogByLogId(logId);
    }

    /**
     * 查询薪酬变更日志列表
     * 
     * @param hrsSalaryChangeLog 薪酬变更日志
     * @return 薪酬变更日志
     */
    @Override
    public List<HrsSalaryChangeLog> selectHrsSalaryChangeLogList(HrsSalaryChangeLog hrsSalaryChangeLog)
    {
        return hrsSalaryChangeLogMapper.selectHrsSalaryChangeLogList(hrsSalaryChangeLog);
    }

    /**
     * 新增薪酬变更日志
     * 
     * @param hrsSalaryChangeLog 薪酬变更日志
     * @return 结果
     */
    @Override
    public int insertHrsSalaryChangeLog(HrsSalaryChangeLog hrsSalaryChangeLog)
    {
        return hrsSalaryChangeLogMapper.insertHrsSalaryChangeLog(hrsSalaryChangeLog);
    }

    /**
     * 修改薪酬变更日志
     * 
     * @param hrsSalaryChangeLog 薪酬变更日志
     * @return 结果
     */
    @Override
    public int updateHrsSalaryChangeLog(HrsSalaryChangeLog hrsSalaryChangeLog)
    {
        return hrsSalaryChangeLogMapper.updateHrsSalaryChangeLog(hrsSalaryChangeLog);
    }

    /**
     * 批量删除薪酬变更日志
     * 
     * @param logIds 需要删除的薪酬变更日志主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalaryChangeLogByLogIds(Long[] logIds)
    {
        return hrsSalaryChangeLogMapper.deleteHrsSalaryChangeLogByLogIds(logIds);
    }

    /**
     * 删除薪酬变更日志信息
     * 
     * @param logId 薪酬变更日志主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalaryChangeLogByLogId(Long logId)
    {
        return hrsSalaryChangeLogMapper.deleteHrsSalaryChangeLogByLogId(logId);
    }
} 