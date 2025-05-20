package com.henglee.hrp.hrs.attendance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.attendance.mapper.HrsAttendanceMapper;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendance;
import com.henglee.hrp.hrs.attendance.service.IHrsAttendanceService;

/**
 * 考勤记录Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsAttendanceServiceImpl implements IHrsAttendanceService 
{
    @Autowired
    private HrsAttendanceMapper hrsAttendanceMapper;

    /**
     * 查询考勤记录
     * 
     * @param attendanceId 考勤记录主键
     * @return 考勤记录
     */
    @Override
    public HrsAttendance selectHrsAttendanceByAttendanceId(Long attendanceId)
    {
        return hrsAttendanceMapper.selectHrsAttendanceByAttendanceId(attendanceId);
    }

    /**
     * 查询考勤记录列表
     * 
     * @param hrsAttendance 考勤记录
     * @return 考勤记录
     */
    @Override
    public List<HrsAttendance> selectHrsAttendanceList(HrsAttendance hrsAttendance)
    {
        return hrsAttendanceMapper.selectHrsAttendanceList(hrsAttendance);
    }

    /**
     * 新增考勤记录
     * 
     * @param hrsAttendance 考勤记录
     * @return 结果
     */
    @Override
    public int insertHrsAttendance(HrsAttendance hrsAttendance)
    {
        return hrsAttendanceMapper.insertHrsAttendance(hrsAttendance);
    }

    /**
     * 修改考勤记录
     * 
     * @param hrsAttendance 考勤记录
     * @return 结果
     */
    @Override
    public int updateHrsAttendance(HrsAttendance hrsAttendance)
    {
        return hrsAttendanceMapper.updateHrsAttendance(hrsAttendance);
    }

    /**
     * 批量删除考勤记录
     * 
     * @param attendanceIds 需要删除的考勤记录主键
     * @return 结果
     */
    @Override
    public int deleteHrsAttendanceByAttendanceIds(Long[] attendanceIds)
    {
        return hrsAttendanceMapper.deleteHrsAttendanceByAttendanceIds(attendanceIds);
    }

    /**
     * 删除考勤记录信息
     * 
     * @param attendanceId 考勤记录主键
     * @return 结果
     */
    @Override
    public int deleteHrsAttendanceByAttendanceId(Long attendanceId)
    {
        return hrsAttendanceMapper.deleteHrsAttendanceByAttendanceId(attendanceId);
    }
} 