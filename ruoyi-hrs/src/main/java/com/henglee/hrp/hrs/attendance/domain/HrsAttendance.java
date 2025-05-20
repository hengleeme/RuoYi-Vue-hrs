package com.henglee.hrp.hrs.attendance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 考勤记录对象 hrs_attendance
 * 
 * @author cbh
 */
public class HrsAttendance extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 考勤ID */
    private Long attendanceId;

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

    /** 考勤日期 */
    @Excel(name = "考勤日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date attendanceDate;

    /** 签到时间 */
    @Excel(name = "签到时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date checkInTime;

    /** 签退时间 */
    @Excel(name = "签退时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date checkOutTime;

    /** 考勤状态（0正常 1迟到 2早退 3旷工 4请假） */
    @Excel(name = "考勤状态", readConverterExp = "0=正常,1=迟到,2=早退,3=旷工,4=请假")
    private String status;

    /** 考勤类型（1上班 2下班） */
    @Excel(name = "考勤类型", readConverterExp = "1=上班,2=下班")
    private String type;

    /** 考勤地点 */
    @Excel(name = "考勤地点")
    private String location;

    /** 考勤设备 */
    @Excel(name = "考勤设备")
    private String device;

    /** 考勤备注 */
    @Excel(name = "考勤备注")
    private String remark;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setAttendanceId(Long attendanceId) 
    {
        this.attendanceId = attendanceId;
    }

    public Long getAttendanceId() 
    {
        return attendanceId;
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

    public void setAttendanceDate(Date attendanceDate) 
    {
        this.attendanceDate = attendanceDate;
    }

    public Date getAttendanceDate() 
    {
        return attendanceDate;
    }

    public void setCheckInTime(Date checkInTime) 
    {
        this.checkInTime = checkInTime;
    }

    public Date getCheckInTime() 
    {
        return checkInTime;
    }

    public void setCheckOutTime(Date checkOutTime) 
    {
        this.checkOutTime = checkOutTime;
    }

    public Date getCheckOutTime() 
    {
        return checkOutTime;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }

    public void setDevice(String device) 
    {
        this.device = device;
    }

    public String getDevice() 
    {
        return device;
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
            .append("attendanceId", getAttendanceId())
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("attendanceDate", getAttendanceDate())
            .append("checkInTime", getCheckInTime())
            .append("checkOutTime", getCheckOutTime())
            .append("status", getStatus())
            .append("type", getType())
            .append("location", getLocation())
            .append("device", getDevice())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
} 