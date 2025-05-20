package com.henglee.hrp.hrs.attendance.mapper;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceShift;

/**
 * 考勤班次Mapper接口
 * 
 * @author henglee
 */
public interface HrsAttendanceShiftMapper 
{
    /**
     * 查询考勤班次
     * 
     * @param shiftId 考勤班次主键
     * @return 考勤班次
     */
    public HrsAttendanceShift selectHrsAttendanceShiftByShiftId(Long shiftId);

    /**
     * 查询考勤班次列表
     * 
     * @param hrsAttendanceShift 考勤班次
     * @return 考勤班次集合
     */
    public List<HrsAttendanceShift> selectHrsAttendanceShiftList(HrsAttendanceShift hrsAttendanceShift);

    /**
     * 新增考勤班次
     * 
     * @param hrsAttendanceShift 考勤班次
     * @return 结果
     */
    public int insertHrsAttendanceShift(HrsAttendanceShift hrsAttendanceShift);

    /**
     * 修改考勤班次
     * 
     * @param hrsAttendanceShift 考勤班次
     * @return 结果
     */
    public int updateHrsAttendanceShift(HrsAttendanceShift hrsAttendanceShift);

    /**
     * 删除考勤班次
     * 
     * @param shiftId 考勤班次主键
     * @return 结果
     */
    public int deleteHrsAttendanceShiftByShiftId(Long shiftId);

    /**
     * 批量删除考勤班次
     * 
     * @param shiftIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsAttendanceShiftByShiftIds(Long[] shiftIds);
} 