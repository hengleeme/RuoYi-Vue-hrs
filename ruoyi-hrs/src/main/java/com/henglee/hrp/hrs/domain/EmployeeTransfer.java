package com.henglee.hrp.hrs.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人员异动对象 hrs_employee_transfer
 * 
 * @author cbh
 */
public class EmployeeTransfer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 异动ID */
    private Long transferId;

    /** 人员ID */
    @Excel(name = "人员ID")
    private Long employeeId;

    /** 人员姓名 */
    @Excel(name = "人员姓名")
    private String employeeName;

    /** 异动类型（1科室调配 2人员类别变动 3人员离职） */
    @Excel(name = "异动类型", readConverterExp = "1=科室调配,2=人员类别变动,3=人员离职")
    private String transferType;

    /** 异动日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "异动日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date transferDate;

    /** 异动前科室ID */
    @Excel(name = "异动前科室ID")
    private Long beforeDeptId;

    /** 异动前科室名称 */
    @Excel(name = "异动前科室名称")
    private String beforeDeptName;

    /** 异动后科室ID */
    @Excel(name = "异动后科室ID")
    private Long afterDeptId;

    /** 异动后科室名称 */
    @Excel(name = "异动后科室名称")
    private String afterDeptName;

    /** 异动前人员类别 */
    @Excel(name = "异动前人员类别")
    private String beforeCategory;

    /** 异动后人员类别 */
    @Excel(name = "异动后人员类别")
    private String afterCategory;

    /** 异动原因 */
    @Excel(name = "异动原因")
    private String transferReason;

    /** 异动附件 */
    @Excel(name = "异动附件")
    private String transferFile;

    /** 状态（0待审核 1已审核 2已驳回） */
    @Excel(name = "状态", readConverterExp = "0=待审核,1=已审核,2=已驳回")
    private String status;

    /** 审核人 */
    @Excel(name = "审核人")
    private String auditBy;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    /** 审核备注 */
    @Excel(name = "审核备注")
    private String auditRemark;

    public void setTransferId(Long transferId) 
    {
        this.transferId = transferId;
    }

    public Long getTransferId() 
    {
        return transferId;
    }

    public void setEmployeeId(Long employeeId) 
    {
        this.employeeId = employeeId;
    }

    public Long getEmployeeId() 
    {
        return employeeId;
    }

    public String getEmployeeName() 
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) 
    {
        this.employeeName = employeeName;
    }

    public void setTransferType(String transferType) 
    {
        this.transferType = transferType;
    }

    public String getTransferType() 
    {
        return transferType;
    }

    public void setTransferDate(Date transferDate) 
    {
        this.transferDate = transferDate;
    }

    public Date getTransferDate() 
    {
        return transferDate;
    }

    public void setBeforeDeptId(Long beforeDeptId) 
    {
        this.beforeDeptId = beforeDeptId;
    }

    public Long getBeforeDeptId() 
    {
        return beforeDeptId;
    }

    public String getBeforeDeptName() 
    {
        return beforeDeptName;
    }

    public void setBeforeDeptName(String beforeDeptName) 
    {
        this.beforeDeptName = beforeDeptName;
    }

    public void setAfterDeptId(Long afterDeptId) 
    {
        this.afterDeptId = afterDeptId;
    }

    public Long getAfterDeptId() 
    {
        return afterDeptId;
    }

    public String getAfterDeptName() 
    {
        return afterDeptName;
    }

    public void setAfterDeptName(String afterDeptName) 
    {
        this.afterDeptName = afterDeptName;
    }

    public void setBeforeCategory(String beforeCategory) 
    {
        this.beforeCategory = beforeCategory;
    }

    public String getBeforeCategory() 
    {
        return beforeCategory;
    }

    public void setAfterCategory(String afterCategory) 
    {
        this.afterCategory = afterCategory;
    }

    public String getAfterCategory() 
    {
        return afterCategory;
    }

    public void setTransferReason(String transferReason) 
    {
        this.transferReason = transferReason;
    }

    public String getTransferReason() 
    {
        return transferReason;
    }

    public void setTransferFile(String transferFile) 
    {
        this.transferFile = transferFile;
    }

    public String getTransferFile() 
    {
        return transferFile;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setAuditBy(String auditBy) 
    {
        this.auditBy = auditBy;
    }

    public String getAuditBy() 
    {
        return auditBy;
    }

    public void setAuditTime(Date auditTime) 
    {
        this.auditTime = auditTime;
    }

    public Date getAuditTime() 
    {
        return auditTime;
    }

    public void setAuditRemark(String auditRemark) 
    {
        this.auditRemark = auditRemark;
    }

    public String getAuditRemark() 
    {
        return auditRemark;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("transferId", getTransferId())
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("transferType", getTransferType())
            .append("transferDate", getTransferDate())
            .append("beforeDeptId", getBeforeDeptId())
            .append("beforeDeptName", getBeforeDeptName())
            .append("afterDeptId", getAfterDeptId())
            .append("afterDeptName", getAfterDeptName())
            .append("beforeCategory", getBeforeCategory())
            .append("afterCategory", getAfterCategory())
            .append("transferReason", getTransferReason())
            .append("transferFile", getTransferFile())
            .append("status", getStatus())
            .append("auditBy", getAuditBy())
            .append("auditTime", getAuditTime())
            .append("auditRemark", getAuditRemark())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
} 