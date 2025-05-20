package com.henglee.hrp.hrs.attendance.service;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendancePersonnel;

/**
 * 考勤人员管理Service接口
 * 
 * @author cbh
 */
public interface IHrsAttendancePersonnelService 
{
    /**
     * 查询考勤人员
     * 
     * @param personnelId 考勤人员主键
     * @return 考勤人员
     */
    public HrsAttendancePersonnel selectHrsAttendancePersonnelByPersonnelId(Long personnelId);

    /**
     * 查询考勤人员列表
     * 
     * @param hrsAttendancePersonnel 考勤人员
     * @return 考勤人员集合
     */
    public List<HrsAttendancePersonnel> selectHrsAttendancePersonnelList(HrsAttendancePersonnel hrsAttendancePersonnel);

    /**
     * 新增考勤人员
     * 
     * @param hrsAttendancePersonnel 考勤人员
     * @return 结果
     */
    public int insertHrsAttendancePersonnel(HrsAttendancePersonnel hrsAttendancePersonnel);

    /**
     * 修改考勤人员
     * 
     * @param hrsAttendancePersonnel 考勤人员
     * @return 结果
     */
    public int updateHrsAttendancePersonnel(HrsAttendancePersonnel hrsAttendancePersonnel);

    /**
     * 批量删除考勤人员
     * 
     * @param personnelIds 需要删除的考勤人员主键集合
     * @return 结果
     */
    public int deleteHrsAttendancePersonnelByPersonnelIds(Long[] personnelIds);

    /**
     * 删除考勤人员信息
     * 
     * @param personnelId 考勤人员主键
     * @return 结果
     */
    public int deleteHrsAttendancePersonnelByPersonnelId(Long personnelId);
} 