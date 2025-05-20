package com.henglee.hrp.hrs.attendance.mapper;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceLeaveType;

/**
 * 考勤请假类别Mapper接口
 * 
 * @author henglee
 */
public interface HrsAttendanceLeaveTypeMapper 
{
    /**
     * 查询考勤请假类别
     * 
     * @param typeId 考勤请假类别主键
     * @return 考勤请假类别
     */
    public HrsAttendanceLeaveType selectHrsAttendanceLeaveTypeByTypeId(Long typeId);

    /**
     * 查询考勤请假类别列表
     * 
     * @param hrsAttendanceLeaveType 考勤请假类别
     * @return 考勤请假类别集合
     */
    public List<HrsAttendanceLeaveType> selectHrsAttendanceLeaveTypeList(HrsAttendanceLeaveType hrsAttendanceLeaveType);

    /**
     * 新增考勤请假类别
     * 
     * @param hrsAttendanceLeaveType 考勤请假类别
     * @return 结果
     */
    public int insertHrsAttendanceLeaveType(HrsAttendanceLeaveType hrsAttendanceLeaveType);

    /**
     * 修改考勤请假类别
     * 
     * @param hrsAttendanceLeaveType 考勤请假类别
     * @return 结果
     */
    public int updateHrsAttendanceLeaveType(HrsAttendanceLeaveType hrsAttendanceLeaveType);

    /**
     * 删除考勤请假类别
     * 
     * @param typeId 考勤请假类别主键
     * @return 结果
     */
    public int deleteHrsAttendanceLeaveTypeByTypeId(Long typeId);

    /**
     * 批量删除考勤请假类别
     * 
     * @param typeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsAttendanceLeaveTypeByTypeIds(Long[] typeIds);
} 