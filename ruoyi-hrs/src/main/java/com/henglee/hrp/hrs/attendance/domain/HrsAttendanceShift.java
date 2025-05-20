package com.henglee.hrp.hrs.attendance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 考勤班次对象 hrs_attendance_shift
 * 
 * @author henglee
 */
public class HrsAttendanceShift extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 班次ID */
    private Long shiftId;

    /** 班次名称 */
    @Excel(name = "班次名称")
    private String shiftName;

    /** 上班时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @Excel(name = "上班时间", width = 30, dateFormat = "HH:mm:ss")
    private Date startTime;

    /** 下班时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @Excel(name = "下班时间", width = 30, dateFormat = "HH:mm:ss")
    private Date endTime;

    /** 迟到判定时间(分钟) */
    @Excel(name = "迟到判定时间(分钟)")
    private Integer lateMinutes;

    /** 早退判定时间(分钟) */
    @Excel(name = "早退判定时间(分钟)")
    private Integer earlyMinutes;

    /** 旷工判定时间(分钟) */
    @Excel(name = "旷工判定时间(分钟)")
    private Integer absentMinutes;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setShiftId(Long shiftId) 
    {
        this.shiftId = shiftId;
    }

    public Long getShiftId() 
    {
        return shiftId;
    }
    public void setShiftName(String shiftName) 
    {
        this.shiftName = shiftName;
    }

    public String getShiftName() 
    {
        return shiftName;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setLateMinutes(Integer lateMinutes) 
    {
        this.lateMinutes = lateMinutes;
    }

    public Integer getLateMinutes() 
    {
        return lateMinutes;
    }
    public void setEarlyMinutes(Integer earlyMinutes) 
    {
        this.earlyMinutes = earlyMinutes;
    }

    public Integer getEarlyMinutes() 
    {
        return earlyMinutes;
    }
    public void setAbsentMinutes(Integer absentMinutes) 
    {
        this.absentMinutes = absentMinutes;
    }

    public Integer getAbsentMinutes() 
    {
        return absentMinutes;
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
            .append("shiftId", getShiftId())
            .append("shiftName", getShiftName())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("lateMinutes", getLateMinutes())
            .append("earlyMinutes", getEarlyMinutes())
            .append("absentMinutes", getAbsentMinutes())
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