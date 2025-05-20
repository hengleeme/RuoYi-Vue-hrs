package com.henglee.hrp.hrs.attendance.mapper;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendancePersonnel;

/**
 * 考勤人员管理Mapper接口
 * 
 * @author cbh
 */
public interface HrsAttendancePersonnelMapper 
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
     * 删除考勤人员
     * 
     * @param personnelId 考勤人员主键
     * @return 结果
     */
    public int deleteHrsAttendancePersonnelByPersonnelId(Long personnelId);

    /**
     * 批量删除考勤人员
     * 
     * @param personnelIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsAttendancePersonnelByPersonnelIds(Long[] personnelIds);
} 