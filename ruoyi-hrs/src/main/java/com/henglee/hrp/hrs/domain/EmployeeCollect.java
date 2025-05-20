package com.henglee.hrp.hrs.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人员信息采集对象 hrs_employee_collect
 * 
 * @author cbh
 */
public class EmployeeCollect extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 采集ID */
    private Long collectId;

    /** 人员ID */
    @Excel(name = "人员ID")
    private Long employeeId;

    /** 人员姓名 */
    @Excel(name = "人员姓名")
    private String employeeName;

    /** 采集类型（1基本信息 2教育经历 3工作经历 4资格证书） */
    @Excel(name = "采集类型", readConverterExp = "1=基本信息,2=教育经历,3=工作经历,4=资格证书")
    private String collectType;

    /** 采集内容 */
    @Excel(name = "采集内容")
    private String collectContent;

    /** 采集附件 */
    @Excel(name = "采集附件")
    private String collectFile;

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

    public void setCollectId(Long collectId) 
    {
        this.collectId = collectId;
    }

    public Long getCollectId() 
    {
        return collectId;
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

    public void setCollectType(String collectType) 
    {
        this.collectType = collectType;
    }

    public String getCollectType() 
    {
        return collectType;
    }

    public void setCollectContent(String collectContent) 
    {
        this.collectContent = collectContent;
    }

    public String getCollectContent() 
    {
        return collectContent;
    }

    public void setCollectFile(String collectFile) 
    {
        this.collectFile = collectFile;
    }

    public String getCollectFile() 
    {
        return collectFile;
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
            .append("collectId", getCollectId())
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("collectType", getCollectType())
            .append("collectContent", getCollectContent())
            .append("collectFile", getCollectFile())
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