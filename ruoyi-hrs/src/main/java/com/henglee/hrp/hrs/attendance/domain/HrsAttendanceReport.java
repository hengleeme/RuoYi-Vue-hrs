package com.henglee.hrp.hrs.attendance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 考勤结果上报对象 hrs_attendance_report
 * 
 * @author cbh
 */
public class HrsAttendanceReport extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 上报ID */
    private Long reportId;

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
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "考勤日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date attendanceDate;

    /** 签到时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "签到时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date checkInTime;

    /** 签退时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "签退时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date checkOutTime;

    /** 考勤状态（0正常 1迟到 2早退 3旷工 4请假 5出差） */
    @Excel(name = "考勤状态", readConverterExp = "0=正常,1=迟到,2=早退,3=旷工,4=请假,5=出差")
    private String status;

    /** 工作时长（小时） */
    @Excel(name = "工作时长", readConverterExp = "小时")
    private Double workHours;

    /** 备注说明 */
    @Excel(name = "备注说明")
    private String remark;

    /** 上报人 */
    @Excel(name = "上报人")
    private String reporter;

    /** 上报时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "上报时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date reportTime;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setReportId(Long reportId) 
    {
        this.reportId = reportId;
    }

    public Long getReportId() 
    {
        return reportId;
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
    public void setWorkHours(Double workHours) 
    {
        this.workHours = workHours;
    }

    public Double getWorkHours() 
    {
        return workHours;
    }
    public void setReporter(String reporter) 
    {
        this.reporter = reporter;
    }

    public String getReporter() 
    {
        return reporter;
    }
    public void setReportTime(Date reportTime) 
    {
        this.reportTime = reportTime;
    }

    public Date getReportTime() 
    {
        return reportTime;
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
            .append("reportId", getReportId())
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("attendanceDate", getAttendanceDate())
            .append("checkInTime", getCheckInTime())
            .append("checkOutTime", getCheckOutTime())
            .append("status", getStatus())
            .append("workHours", getWorkHours())
            .append("remark", getRemark())
            .append("reporter", getReporter())
            .append("reportTime", getReportTime())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
} 