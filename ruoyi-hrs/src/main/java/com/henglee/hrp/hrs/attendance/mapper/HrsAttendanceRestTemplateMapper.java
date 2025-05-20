package com.henglee.hrp.hrs.attendance.mapper;

import java.util.List;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceRestTemplate;

/**
 * 考勤休息日套Mapper接口
 * 
 * @author henglee
 */
public interface HrsAttendanceRestTemplateMapper 
{
    /**
     * 查询考勤休息日套
     * 
     * @param templateId 考勤休息日套主键
     * @return 考勤休息日套
     */
    public HrsAttendanceRestTemplate selectHrsAttendanceRestTemplateByTemplateId(Long templateId);

    /**
     * 查询考勤休息日套列表
     * 
     * @param hrsAttendanceRestTemplate 考勤休息日套
     * @return 考勤休息日套集合
     */
    public List<HrsAttendanceRestTemplate> selectHrsAttendanceRestTemplateList(HrsAttendanceRestTemplate hrsAttendanceRestTemplate);

    /**
     * 新增考勤休息日套
     * 
     * @param hrsAttendanceRestTemplate 考勤休息日套
     * @return 结果
     */
    public int insertHrsAttendanceRestTemplate(HrsAttendanceRestTemplate hrsAttendanceRestTemplate);

    /**
     * 修改考勤休息日套
     * 
     * @param hrsAttendanceRestTemplate 考勤休息日套
     * @return 结果
     */
    public int updateHrsAttendanceRestTemplate(HrsAttendanceRestTemplate hrsAttendanceRestTemplate);

    /**
     * 删除考勤休息日套
     * 
     * @param templateId 考勤休息日套主键
     * @return 结果
     */
    public int deleteHrsAttendanceRestTemplateByTemplateId(Long templateId);

    /**
     * 批量删除考勤休息日套
     * 
     * @param templateIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsAttendanceRestTemplateByTemplateIds(Long[] templateIds);
} 