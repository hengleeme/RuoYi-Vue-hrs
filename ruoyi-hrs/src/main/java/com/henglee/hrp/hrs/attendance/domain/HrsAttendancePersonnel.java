package com.henglee.hrp.hrs.attendance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 考勤人员管理对象 hrs_attendance_personnel
 * 
 * @author cbh
 */
public class HrsAttendancePersonnel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 考勤人员ID */
    private Long personnelId;

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

    /** 考勤状态（0参加考勤 1不参加考勤） */
    @Excel(name = "考勤状态", readConverterExp = "0=参加考勤,1=不参加考勤")
    private String attendanceStatus;

    /** 考勤账套ID */
    @Excel(name = "考勤账套ID")
    private Long attendanceAccountId;

    /** 考勤账套名称 */
    @Excel(name = "考勤账套名称")
    private String attendanceAccountName;

    /** 人员分类（1医生 2护士 3行政人员） */
    @Excel(name = "人员分类", readConverterExp = "1=医生,2=护士,3=行政人员")
    private String personnelType;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Integer displayOrder;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setPersonnelId(Long personnelId) 
    {
        this.personnelId = personnelId;
    }

    public Long getPersonnelId() 
    {
        return personnelId;
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

    public void setAttendanceStatus(String attendanceStatus) 
    {
        this.attendanceStatus = attendanceStatus;
    }

    public String getAttendanceStatus() 
    {
        return attendanceStatus;
    }

    public void setAttendanceAccountId(Long attendanceAccountId) 
    {
        this.attendanceAccountId = attendanceAccountId;
    }

    public Long getAttendanceAccountId() 
    {
        return attendanceAccountId;
    }

    public void setAttendanceAccountName(String attendanceAccountName) 
    {
        this.attendanceAccountName = attendanceAccountName;
    }

    public String getAttendanceAccountName() 
    {
        return attendanceAccountName;
    }

    public void setPersonnelType(String personnelType) 
    {
        this.personnelType = personnelType;
    }

    public String getPersonnelType() 
    {
        return personnelType;
    }

    public void setDisplayOrder(Integer displayOrder) 
    {
        this.displayOrder = displayOrder;
    }

    public Integer getDisplayOrder() 
    {
        return displayOrder;
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
            .append("personnelId", getPersonnelId())
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("attendanceStatus", getAttendanceStatus())
            .append("attendanceAccountId", getAttendanceAccountId())
            .append("attendanceAccountName", getAttendanceAccountName())
            .append("personnelType", getPersonnelType())
            .append("displayOrder", getDisplayOrder())
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