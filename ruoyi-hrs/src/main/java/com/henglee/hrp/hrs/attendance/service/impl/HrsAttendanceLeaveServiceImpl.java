package com.henglee.hrp.hrs.attendance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.attendance.mapper.HrsAttendanceLeaveMapper;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceLeave;
import com.henglee.hrp.hrs.attendance.service.IHrsAttendanceLeaveService;

/**
 * 请假管理Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsAttendanceLeaveServiceImpl implements IHrsAttendanceLeaveService 
{
    @Autowired
    private HrsAttendanceLeaveMapper hrsAttendanceLeaveMapper;

    /**
     * 查询请假
     * 
     * @param leaveId 请假主键
     * @return 请假
     */
    @Override
    public HrsAttendanceLeave selectHrsAttendanceLeaveByLeaveId(Long leaveId)
    {
        return hrsAttendanceLeaveMapper.selectHrsAttendanceLeaveByLeaveId(leaveId);
    }

    /**
     * 查询请假列表
     * 
     * @param hrsAttendanceLeave 请假
     * @return 请假
     */
    @Override
    public List<HrsAttendanceLeave> selectHrsAttendanceLeaveList(HrsAttendanceLeave hrsAttendanceLeave)
    {
        return hrsAttendanceLeaveMapper.selectHrsAttendanceLeaveList(hrsAttendanceLeave);
    }

    /**
     * 新增请假
     * 
     * @param hrsAttendanceLeave 请假
     * @return 结果
     */
    @Override
    public int insertHrsAttendanceLeave(HrsAttendanceLeave hrsAttendanceLeave)
    {
        return hrsAttendanceLeaveMapper.insertHrsAttendanceLeave(hrsAttendanceLeave);
    }

    /**
     * 修改请假
     * 
     * @param hrsAttendanceLeave 请假
     * @return 结果
     */
    @Override
    public int updateHrsAttendanceLeave(HrsAttendanceLeave hrsAttendanceLeave)
    {
        return hrsAttendanceLeaveMapper.updateHrsAttendanceLeave(hrsAttendanceLeave);
    }

    /**
     * 批量删除请假
     * 
     * @param leaveIds 需要删除的请假主键
     * @return 结果
     */
    @Override
    public int deleteHrsAttendanceLeaveByLeaveIds(Long[] leaveIds)
    {
        return hrsAttendanceLeaveMapper.deleteHrsAttendanceLeaveByLeaveIds(leaveIds);
    }

    /**
     * 删除请假信息
     * 
     * @param leaveId 请假主键
     * @return 结果
     */
    @Override
    public int deleteHrsAttendanceLeaveByLeaveId(Long leaveId)
    {
        return hrsAttendanceLeaveMapper.deleteHrsAttendanceLeaveByLeaveId(leaveId);
    }
} 