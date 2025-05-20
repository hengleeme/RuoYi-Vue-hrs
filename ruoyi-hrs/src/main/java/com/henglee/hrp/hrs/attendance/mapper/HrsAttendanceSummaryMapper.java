package com.henglee.hrp.hrs.attendance.mapper;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceSummary;

/**
 * 考勤汇总Mapper接口
 * 
 * @author cbh
 */
public interface HrsAttendanceSummaryMapper 
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
     * 删除考勤汇总
     * 
     * @param summaryId 考勤汇总主键
     * @return 结果
     */
    public int deleteHrsAttendanceSummaryBySummaryId(Long summaryId);

    /**
     * 批量删除考勤汇总
     * 
     * @param summaryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsAttendanceSummaryBySummaryIds(Long[] summaryIds);
} 