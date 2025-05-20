package com.henglee.hrp.hrs.attendance.service;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceSummary;

/**
 * 考勤汇总Service接口
 * 
 * @author cbh
 */
public interface IHrsAttendanceSummaryService 
{
    /**
     * 查询考勤汇总
     * 
     * @param summaryId 考勤汇总主键
     * @return 考勤汇总
     */
    public HrsAttendanceSummary selectHrsAttendanceSummaryBySummaryId(Long summaryId);

    /**
     * 查询考勤汇总列表
     * 
     * @param hrsAttendanceSummary 考勤汇总
     * @return 考勤汇总集合
     */
    public List<HrsAttendanceSummary> selectHrsAttendanceSummaryList(HrsAttendanceSummary hrsAttendanceSummary);

    /**
     * 新增考勤汇总
     * 
     * @param hrsAttendanceSummary 考勤汇总
     * @return 结果
     */
    public int insertHrsAttendanceSummary(HrsAttendanceSummary hrsAttendanceSummary);

    /**
     * 修改考勤汇总
     * 
     * @param hrsAttendanceSummary 考勤汇总
     * @return 结果
     */
    public int updateHrsAttendanceSummary(HrsAttendanceSummary hrsAttendanceSummary);

    /**
     * 批量删除考勤汇总
     * 
     * @param summaryIds 需要删除的考勤汇总主键集合
     * @return 结果
     */
    public int deleteHrsAttendanceSummaryBySummaryIds(Long[] summaryIds);

    /**
     * 删除考勤汇总信息
     * 
     * @param summaryId 考勤汇总主键
     * @return 结果
     */
    public int deleteHrsAttendanceSummaryBySummaryId(Long summaryId);

    /**
     * 提交考勤汇总
     * 
     * @param summaryId 考勤汇总主键
     * @return 结果
     */
    public int submitHrsAttendanceSummary(Long summaryId);

    /**
     * 审批考勤汇总
     * 
     * @param hrsAttendanceSummary 考勤汇总
     * @return 结果
     */
    public int approveHrsAttendanceSummary(HrsAttendanceSummary hrsAttendanceSummary);
} 