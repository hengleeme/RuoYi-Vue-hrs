package com.henglee.hrp.hrs.attendance.mapper;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceLeave;

/**
 * 请假管理Mapper接口
 * 
 * @author cbh
 */
public interface HrsAttendanceLeaveMapper 
{
    /**
     * 查询请假
     * 
     * @param leaveId 请假主键
     * @return 请假
     */
    public HrsAttendanceLeave selectHrsAttendanceLeaveByLeaveId(Long leaveId);

    /**
     * 查询请假列表
     * 
     * @param hrsAttendanceLeave 请假
     * @return 请假集合
     */
    public List<HrsAttendanceLeave> selectHrsAttendanceLeaveList(HrsAttendanceLeave hrsAttendanceLeave);

    /**
     * 新增请假
     * 
     * @param hrsAttendanceLeave 请假
     * @return 结果
     */
    public int insertHrsAttendanceLeave(HrsAttendanceLeave hrsAttendanceLeave);

    /**
     * 修改请假
     * 
     * @param hrsAttendanceLeave 请假
     * @return 结果
     */
    public int updateHrsAttendanceLeave(HrsAttendanceLeave hrsAttendanceLeave);

    /**
     * 删除请假
     * 
     * @param leaveId 请假主键
     * @return 结果
     */
    public int deleteHrsAttendanceLeaveByLeaveId(Long leaveId);

    /**
     * 批量删除请假
     * 
     * @param leaveIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsAttendanceLeaveByLeaveIds(Long[] leaveIds);
} 