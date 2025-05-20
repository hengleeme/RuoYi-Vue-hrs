package com.henglee.hrp.hrs.attendance.mapper;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendance;

/**
 * 考勤记录Mapper接口
 * 
 * @author cbh
 */
public interface HrsAttendanceMapper 
{
    /**
     * 查询考勤记录
     * 
     * @param attendanceId 考勤记录主键
     * @return 考勤记录
     */
    public HrsAttendance selectHrsAttendanceByAttendanceId(Long attendanceId);

    /**
     * 查询考勤记录列表
     * 
     * @param hrsAttendance 考勤记录
     * @return 考勤记录集合
     */
    public List<HrsAttendance> selectHrsAttendanceList(HrsAttendance hrsAttendance);

    /**
     * 新增考勤记录
     * 
     * @param hrsAttendance 考勤记录
     * @return 结果
     */
    public int insertHrsAttendance(HrsAttendance hrsAttendance);

    /**
     * 修改考勤记录
     * 
     * @param hrsAttendance 考勤记录
     * @return 结果
     */
    public int updateHrsAttendance(HrsAttendance hrsAttendance);

    /**
     * 删除考勤记录
     * 
     * @param attendanceId 考勤记录主键
     * @return 结果
     */
    public int deleteHrsAttendanceByAttendanceId(Long attendanceId);

    /**
     * 批量删除考勤记录
     * 
     * @param attendanceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsAttendanceByAttendanceIds(Long[] attendanceIds);
} 