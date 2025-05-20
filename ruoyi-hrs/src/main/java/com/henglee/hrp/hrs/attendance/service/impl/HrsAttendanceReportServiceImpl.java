package com.henglee.hrp.hrs.attendance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.attendance.mapper.HrsAttendanceReportMapper;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceReport;
import com.henglee.hrp.hrs.attendance.service.IHrsAttendanceReportService;

/**
 * 考勤结果上报Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsAttendanceReportServiceImpl implements IHrsAttendanceReportService 
{
    @Autowired
    private HrsAttendanceReportMapper hrsAttendanceReportMapper;

    /**
     * 查询考勤结果上报
     * 
     * @param reportId 考勤结果上报主键
     * @return 考勤结果上报
     */
    @Override
    public HrsAttendanceReport selectHrsAttendanceReportByReportId(Long reportId)
    {
        return hrsAttendanceReportMapper.selectHrsAttendanceReportByReportId(reportId);
    }

    /**
     * 查询考勤结果上报列表
     * 
     * @param hrsAttendanceReport 考勤结果上报
     * @return 考勤结果上报
     */
    @Override
    public List<HrsAttendanceReport> selectHrsAttendanceReportList(HrsAttendanceReport hrsAttendanceReport)
    {
        return hrsAttendanceReportMapper.selectHrsAttendanceReportList(hrsAttendanceReport);
    }

    /**
     * 新增考勤结果上报
     * 
     * @param hrsAttendanceReport 考勤结果上报
     * @return 结果
     */
    @Override
    public int insertHrsAttendanceReport(HrsAttendanceReport hrsAttendanceReport)
    {
        return hrsAttendanceReportMapper.insertHrsAttendanceReport(hrsAttendanceReport);
    }

    /**
     * 修改考勤结果上报
     * 
     * @param hrsAttendanceReport 考勤结果上报
     * @return 结果
     */
    @Override
    public int updateHrsAttendanceReport(HrsAttendanceReport hrsAttendanceReport)
    {
        return hrsAttendanceReportMapper.updateHrsAttendanceReport(hrsAttendanceReport);
    }

    /**
     * 批量删除考勤结果上报
     * 
     * @param reportIds 需要删除的考勤结果上报主键
     * @return 结果
     */
    @Override
    public int deleteHrsAttendanceReportByReportIds(Long[] reportIds)
    {
        return hrsAttendanceReportMapper.deleteHrsAttendanceReportByReportIds(reportIds);
    }

    /**
     * 删除考勤结果上报信息
     * 
     * @param reportId 考勤结果上报主键
     * @return 结果
     */
    @Override
    public int deleteHrsAttendanceReportByReportId(Long reportId)
    {
        return hrsAttendanceReportMapper.deleteHrsAttendanceReportByReportId(reportId);
    }
} 