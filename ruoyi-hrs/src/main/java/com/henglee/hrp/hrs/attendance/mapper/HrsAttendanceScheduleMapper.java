package com.henglee.hrp.hrs.attendance.mapper;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceSchedule;

/**
 * 排班管理Mapper接口
 * 
 * @author cbh
 */
public interface HrsAttendanceScheduleMapper 
{
    /**
     * 查询排班
     * 
     * @param scheduleId 排班主键
     * @return 排班
     */
    public HrsAttendanceSchedule selectHrsAttendanceScheduleByScheduleId(Long scheduleId);

    /**
     * 查询排班列表
     * 
     * @param hrsAttendanceSchedule 排班
     * @return 排班集合
     */
    public List<HrsAttendanceSchedule> selectHrsAttendanceScheduleList(HrsAttendanceSchedule hrsAttendanceSchedule);

    /**
     * 新增排班
     * 
     * @param hrsAttendanceSchedule 排班
     * @return 结果
     */
    public int insertHrsAttendanceSchedule(HrsAttendanceSchedule hrsAttendanceSchedule);

    /**
     * 修改排班
     * 
     * @param hrsAttendanceSchedule 排班
     * @return 结果
     */
    public int updateHrsAttendanceSchedule(HrsAttendanceSchedule hrsAttendanceSchedule);

    /**
     * 删除排班
     * 
     * @param scheduleId 排班主键
     * @return 结果
     */
    public int deleteHrsAttendanceScheduleByScheduleId(Long scheduleId);

    /**
     * 批量删除排班
     * 
     * @param scheduleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsAttendanceScheduleByScheduleIds(Long[] scheduleIds);
} 