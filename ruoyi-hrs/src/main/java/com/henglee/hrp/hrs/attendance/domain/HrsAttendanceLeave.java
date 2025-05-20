package com.henglee.hrp.hrs.attendance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 请假管理对象 hrs_attendance_leave
 * 
 * @author cbh
 */
public class HrsAttendanceLeave extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 请假ID */
    private Long leaveId;

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

    /** 请假类型（1事假 2病假 3婚假 4产假 5丧假 6年假 7调休） */
    @Excel(name = "请假类型", readConverterExp = "1=事假,2=病假,3=婚假,4=产假,5=丧假,6=年假,7=调休")
    private String leaveType;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /** 请假时长（小时） */
    @Excel(name = "请假时长", readConverterExp = "小时")
    private Double leaveHours;

    /** 请假原因 */
    @Excel(name = "请假原因")
    private String leaveReason;

    /** 审批状态（0待审批 1已通过 2已驳回） */
    @Excel(name = "审批状态", readConverterExp = "0=待审批,1=已通过,2=已驳回")
    private String status;

    /** 审批人 */
    @Excel(name = "审批人")
    private String approver;

    /** 审批时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "审批时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date approveTime;

    /** 审批意见 */
    @Excel(name = "审批意见")
    private String approveComment;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setLeaveId(Long leaveId) 
    {
        this.leaveId = leaveId;
    }

    public Long getLeaveId() 
    {
        return leaveId;
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
    public void setLeaveType(String leaveType) 
    {
        this.leaveType = leaveType;
    }

    public String getLeaveType() 
    {
        return leaveType;
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
    public void setLeaveHours(Double leaveHours) 
    {
        this.leaveHours = leaveHours;
    }

    public Double getLeaveHours() 
    {
        return leaveHours;
    }
    public void setLeaveReason(String leaveReason) 
    {
        this.leaveReason = leaveReason;
    }

    public String getLeaveReason() 
    {
        return leaveReason;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setApprover(String approver) 
    {
        this.approver = approver;
    }

    public String getApprover() 
    {
        return approver;
    }
    public void setApproveTime(Date approveTime) 
    {
        this.approveTime = approveTime;
    }

    public Date getApproveTime() 
    {
        return approveTime;
    }
    public void setApproveComment(String approveComment) 
    {
        this.approveComment = approveComment;
    }

    public String getApproveComment() 
    {
        return approveComment;
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
            .append("leaveId", getLeaveId())
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("leaveType", getLeaveType())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("leaveHours", getLeaveHours())
            .append("leaveReason", getLeaveReason())
            .append("status", getStatus())
            .append("approver", getApprover())
            .append("approveTime", getApproveTime())
            .append("approveComment", getApproveComment())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
} 