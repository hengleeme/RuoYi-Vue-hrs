package com.henglee.hrp.hrs.attendance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 排班管理对象 hrs_attendance_schedule
 * 
 * @author cbh
 */
public class HrsAttendanceSchedule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 排班ID */
    private Long scheduleId;

    /** 员工ID */
    @Excel(name = "员工ID")
    private Long employeeId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String employeeName;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 排班日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "排班日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date scheduleDate;

    /** 班次ID */
    @Excel(name = "班次ID")
    private Long shiftId;

    /** 班次名称 */
    @Excel(name = "班次名称")
    private String shiftName;

    /** 开始时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @Excel(name = "开始时间", width = 30, dateFormat = "HH:mm:ss")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @Excel(name = "结束时间", width = 30, dateFormat = "HH:mm:ss")
    private Date endTime;

    /** 排班状态（0正常 1停用） */
    @Excel(name = "排班状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setScheduleId(Long scheduleId) 
    {
        this.scheduleId = scheduleId;
    }

    public Long getScheduleId() 
    {
        return scheduleId;
    }

    public void setEmployeeId(Long employeeId) 
    {
        this.employeeId = employeeId;
    }

    public Long getEmployeeId() 
    {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) 
    {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() 
    {
        return employeeName;
    }

    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }

    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
    }

    public void setScheduleDate(Date scheduleDate) 
    {
        this.scheduleDate = scheduleDate;
    }

    public Date getScheduleDate() 
    {
        return scheduleDate;
    }

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
            .append("scheduleId", getScheduleId())
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("scheduleDate", getScheduleDate())
            .append("shiftId", getShiftId())
            .append("shiftName", getShiftName())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
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