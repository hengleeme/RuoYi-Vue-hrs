package com.henglee.hrp.hrs.attendance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.attendance.mapper.HrsAttendancePersonnelMapper;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendancePersonnel;
import com.henglee.hrp.hrs.attendance.service.IHrsAttendancePersonnelService;

/**
 * 考勤人员管理Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsAttendancePersonnelServiceImpl implements IHrsAttendancePersonnelService 
{
    @Autowired
    private HrsAttendancePersonnelMapper hrsAttendancePersonnelMapper;

    /**
     * 查询考勤人员
     * 
     * @param personnelId 考勤人员主键
     * @return 考勤人员
     */
    @Override
    public HrsAttendancePersonnel selectHrsAttendancePersonnelByPersonnelId(Long personnelId)
    {
        return hrsAttendancePersonnelMapper.selectHrsAttendancePersonnelByPersonnelId(personnelId);
    }

    /**
     * 查询考勤人员列表
     * 
     * @param hrsAttendancePersonnel 考勤人员
     * @return 考勤人员
     */
    @Override
    public List<HrsAttendancePersonnel> selectHrsAttendancePersonnelList(HrsAttendancePersonnel hrsAttendancePersonnel)
    {
        return hrsAttendancePersonnelMapper.selectHrsAttendancePersonnelList(hrsAttendancePersonnel);
    }

    /**
     * 新增考勤人员
     * 
     * @param hrsAttendancePersonnel 考勤人员
     * @return 结果
     */
    @Override
    public int insertHrsAttendancePersonnel(HrsAttendancePersonnel hrsAttendancePersonnel)
    {
        return hrsAttendancePersonnelMapper.insertHrsAttendancePersonnel(hrsAttendancePersonnel);
    }

    /**
     * 修改考勤人员
     * 
     * @param hrsAttendancePersonnel 考勤人员
     * @return 结果
     */
    @Override
    public int updateHrsAttendancePersonnel(HrsAttendancePersonnel hrsAttendancePersonnel)
    {
        return hrsAttendancePersonnelMapper.updateHrsAttendancePersonnel(hrsAttendancePersonnel);
    }

    /**
     * 批量删除考勤人员
     * 
     * @param personnelIds 需要删除的考勤人员主键
     * @return 结果
     */
    @Override
    public int deleteHrsAttendancePersonnelByPersonnelIds(Long[] personnelIds)
    {
        return hrsAttendancePersonnelMapper.deleteHrsAttendancePersonnelByPersonnelIds(personnelIds);
    }

    /**
     * 删除考勤人员信息
     * 
     * @param personnelId 考勤人员主键
     * @return 结果
     */
    @Override
    public int deleteHrsAttendancePersonnelByPersonnelId(Long personnelId)
    {
        return hrsAttendancePersonnelMapper.deleteHrsAttendancePersonnelByPersonnelId(personnelId);
    }
} 