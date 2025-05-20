package com.henglee.hrp.hrs.attendance.service;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceReport;

/**
 * 考勤结果上报Service接口
 * 
 * @author cbh
 */
public interface IHrsAttendanceReportService 
{
    /**
     * 查询考勤结果上报
     * 
     * @param reportId 考勤结果上报主键
     * @return 考勤结果上报
     */
    public HrsAttendanceReport selectHrsAttendanceReportByReportId(Long reportId);

    /**
     * 查询考勤结果上报列表
     * 
     * @param hrsAttendanceReport 考勤结果上报
     * @return 考勤结果上报集合
     */
    public List<HrsAttendanceReport> selectHrsAttendanceReportList(HrsAttendanceReport hrsAttendanceReport);

    /**
     * 新增考勤结果上报
     * 
     * @param hrsAttendanceReport 考勤结果上报
     * @return 结果
     */
    public int insertHrsAttendanceReport(HrsAttendanceReport hrsAttendanceReport);

    /**
     * 修改考勤结果上报
     * 
     * @param hrsAttendanceReport 考勤结果上报
     * @return 结果
     */
    public int updateHrsAttendanceReport(HrsAttendanceReport hrsAttendanceReport);

    /**
     * 批量删除考勤结果上报
     * 
     * @param reportIds 需要删除的考勤结果上报主键集合
     * @return 结果
     */
    public int deleteHrsAttendanceReportByReportIds(Long[] reportIds);

    /**
     * 删除考勤结果上报信息
     * 
     * @param reportId 考勤结果上报主键
     * @return 结果
     */
    public int deleteHrsAttendanceReportByReportId(Long reportId);
} 