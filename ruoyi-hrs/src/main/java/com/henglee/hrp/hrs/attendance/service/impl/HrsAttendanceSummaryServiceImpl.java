package com.henglee.hrp.hrs.attendance.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.attendance.mapper.HrsAttendanceSummaryMapper;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceSummary;
import com.henglee.hrp.hrs.attendance.service.IHrsAttendanceSummaryService;
import com.henglee.hrp.common.utils.SecurityUtils;

/**
 * 考勤汇总Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsAttendanceSummaryServiceImpl implements IHrsAttendanceSummaryService 
{
    @Autowired
    private HrsAttendanceSummaryMapper hrsAttendanceSummaryMapper;

    /**
     * 查询考勤汇总
     * 
     * @param summaryId 考勤汇总主键
     * @return 考勤汇总
     */
    @Override
    public HrsAttendanceSummary selectHrsAttendanceSummaryBySummaryId(Long summaryId)
    {
        return hrsAttendanceSummaryMapper.selectHrsAttendanceSummaryBySummaryId(summaryId);
    }

    /**
     * 查询考勤汇总列表
     * 
     * @param hrsAttendanceSummary 考勤汇总
     * @return 考勤汇总
     */
    @Override
    public List<HrsAttendanceSummary> selectHrsAttendanceSummaryList(HrsAttendanceSummary hrsAttendanceSummary)
    {
        return hrsAttendanceSummaryMapper.selectHrsAttendanceSummaryList(hrsAttendanceSummary);
    }

    /**
     * 新增考勤汇总
     * 
     * @param hrsAttendanceSummary 考勤汇总
     * @return 结果
     */
    @Override
    public int insertHrsAttendanceSummary(HrsAttendanceSummary hrsAttendanceSummary)
    {
        hrsAttendanceSummary.setCreateTime(new Date());
        hrsAttendanceSummary.setCreateBy(SecurityUtils.getUsername());
        hrsAttendanceSummary.setStatus("0"); // 设置状态为草稿
        return hrsAttendanceSummaryMapper.insertHrsAttendanceSummary(hrsAttendanceSummary);
    }

    /**
     * 修改考勤汇总
     * 
     * @param hrsAttendanceSummary 考勤汇总
     * @return 结果
     */
    @Override
    public int updateHrsAttendanceSummary(HrsAttendanceSummary hrsAttendanceSummary)
    {
        hrsAttendanceSummary.setUpdateTime(new Date());
        hrsAttendanceSummary.setUpdateBy(SecurityUtils.getUsername());
        return hrsAttendanceSummaryMapper.updateHrsAttendanceSummary(hrsAttendanceSummary);
    }

    /**
     * 批量删除考勤汇总
     * 
     * @param summaryIds 需要删除的考勤汇总主键
     * @return 结果
     */
    @Override
    public int deleteHrsAttendanceSummaryBySummaryIds(Long[] summaryIds)
    {
        return hrsAttendanceSummaryMapper.deleteHrsAttendanceSummaryBySummaryIds(summaryIds);
    }

    /**
     * 删除考勤汇总信息
     * 
     * @param summaryId 考勤汇总主键
     * @return 结果
     */
    @Override
    public int deleteHrsAttendanceSummaryBySummaryId(Long summaryId)
    {
        return hrsAttendanceSummaryMapper.deleteHrsAttendanceSummaryBySummaryId(summaryId);
    }

    /**
     * 提交考勤汇总
     * 
     * @param summaryId 考勤汇总主键
     * @return 结果
     */
    @Override
    public int submitHrsAttendanceSummary(Long summaryId)
    {
        HrsAttendanceSummary summary = new HrsAttendanceSummary();
        summary.setSummaryId(summaryId);
        summary.setStatus("1"); // 设置状态为待审核
        summary.setSubmitter(SecurityUtils.getUsername());
        summary.setSubmitTime(new Date());
        summary.setUpdateTime(new Date());
        summary.setUpdateBy(SecurityUtils.getUsername());
        return hrsAttendanceSummaryMapper.updateHrsAttendanceSummary(summary);
    }

    /**
     * 审批考勤汇总
     * 
     * @param hrsAttendanceSummary 考勤汇总
     * @return 结果
     */
    @Override
    public int approveHrsAttendanceSummary(HrsAttendanceSummary hrsAttendanceSummary)
    {
        hrsAttendanceSummary.setApprover(SecurityUtils.getUsername());
        hrsAttendanceSummary.setApproveTime(new Date());
        hrsAttendanceSummary.setUpdateTime(new Date());
        hrsAttendanceSummary.setUpdateBy(SecurityUtils.getUsername());
        return hrsAttendanceSummaryMapper.updateHrsAttendanceSummary(hrsAttendanceSummary);
    }
} 