package com.henglee.hrp.hrs.attendance.mapper;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendancePeriod;

/**
 * 考勤周期设置Mapper接口
 * 
 * @author henglee
 */
public interface HrsAttendancePeriodMapper 
{
    /**
     * 查询考勤周期设置
     * 
     * @param periodId 考勤周期设置主键
     * @return 考勤周期设置
     */
    public HrsAttendancePeriod selectHrsAttendancePeriodByPeriodId(Long periodId);

    /**
     * 查询考勤周期设置列表
     * 
     * @param hrsAttendancePeriod 考勤周期设置
     * @return 考勤周期设置集合
     */
    public List<HrsAttendancePeriod> selectHrsAttendancePeriodList(HrsAttendancePeriod hrsAttendancePeriod);

    /**
     * 新增考勤周期设置
     * 
     * @param hrsAttendancePeriod 考勤周期设置
     * @return 结果
     */
    public int insertHrsAttendancePeriod(HrsAttendancePeriod hrsAttendancePeriod);

    /**
     * 修改考勤周期设置
     * 
     * @param hrsAttendancePeriod 考勤周期设置
     * @return 结果
     */
    public int updateHrsAttendancePeriod(HrsAttendancePeriod hrsAttendancePeriod);

    /**
     * 删除考勤周期设置
     * 
     * @param periodId 考勤周期设置主键
     * @return 结果
     */
    public int deleteHrsAttendancePeriodByPeriodId(Long periodId);

    /**
     * 批量删除考勤周期设置
     * 
     * @param periodIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsAttendancePeriodByPeriodIds(Long[] periodIds);
} 