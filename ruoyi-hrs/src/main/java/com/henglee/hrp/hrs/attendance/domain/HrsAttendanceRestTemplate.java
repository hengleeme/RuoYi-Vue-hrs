package com.henglee.hrp.hrs.attendance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 考勤休息日套对象 hrs_attendance_rest_template
 * 
 * @author henglee
 */
public class HrsAttendanceRestTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 模板ID */
    private Long templateId;

    /** 模板名称 */
    @Excel(name = "模板名称")
    private String templateName;

    /** 周一是否休息（0否 1是） */
    @Excel(name = "周一是否休息", readConverterExp = "0=否,1=是")
    private String monday;

    /** 周二是否休息（0否 1是） */
    @Excel(name = "周二是否休息", readConverterExp = "0=否,1=是")
    private String tuesday;

    /** 周三是否休息（0否 1是） */
    @Excel(name = "周三是否休息", readConverterExp = "0=否,1=是")
    private String wednesday;

    /** 周四是否休息（0否 1是） */
    @Excel(name = "周四是否休息", readConverterExp = "0=否,1=是")
    private String thursday;

    /** 周五是否休息（0否 1是） */
    @Excel(name = "周五是否休息", readConverterExp = "0=否,1=是")
    private String friday;

    /** 周六是否休息（0否 1是） */
    @Excel(name = "周六是否休息", readConverterExp = "0=否,1=是")
    private String saturday;

    /** 周日是否休息（0否 1是） */
    @Excel(name = "周日是否休息", readConverterExp = "0=否,1=是")
    private String sunday;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setTemplateId(Long templateId) 
    {
        this.templateId = templateId;
    }

    public Long getTemplateId() 
    {
        return templateId;
    }
    public void setTemplateName(String templateName) 
    {
        this.templateName = templateName;
    }

    public String getTemplateName() 
    {
        return templateName;
    }
    public void setMonday(String monday) 
    {
        this.monday = monday;
    }

    public String getMonday() 
    {
        return monday;
    }
    public void setTuesday(String tuesday) 
    {
        this.tuesday = tuesday;
    }

    public String getTuesday() 
    {
        return tuesday;
    }
    public void setWednesday(String wednesday) 
    {
        this.wednesday = wednesday;
    }

    public String getWednesday() 
    {
        return wednesday;
    }
    public void setThursday(String thursday) 
    {
        this.thursday = thursday;
    }

    public String getThursday() 
    {
        return thursday;
    }
    public void setFriday(String friday) 
    {
        this.friday = friday;
    }

    public String getFriday() 
    {
        return friday;
    }
    public void setSaturday(String saturday) 
    {
        this.saturday = saturday;
    }

    public String getSaturday() 
    {
        return saturday;
    }
    public void setSunday(String sunday) 
    {
        this.sunday = sunday;
    }

    public String getSunday() 
    {
        return sunday;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("templateId", getTemplateId())
            .append("templateName", getTemplateName())
            .append("monday", getMonday())
            .append("tuesday", getTuesday())
            .append("wednesday", getWednesday())
            .append("thursday", getThursday())
            .append("friday", getFriday())
            .append("saturday", getSaturday())
            .append("sunday", getSunday())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
} 