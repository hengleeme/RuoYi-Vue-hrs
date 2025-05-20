package com.henglee.hrp.hrs.self.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 员工自助平台对象 hrs_self_service
 * 
 * @author cbh
 */
public class HrsSelfService extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自助服务ID */
    private Long serviceId;

    /** 员工ID */
    @Excel(name = "员工ID")
    private Long empId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String empName;

    /** 员工工号 */
    @Excel(name = "员工工号")
    private String empNo;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 服务类型（1请假 2加班 3报销 4培训 5绩效） */
    @Excel(name = "服务类型", readConverterExp = "1=请假,2=加班,3=报销,4=培训,5=绩效")
    private String serviceType;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /** 服务内容 */
    @Excel(name = "服务内容")
    private String serviceContent;

    /** 附件URL */
    private String attachmentUrl;

    /** 审批状态（0待审批 1已通过 2已驳回） */
    @Excel(name = "审批状态", readConverterExp = "0=待审批,1=已通过,2=已驳回")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setServiceId(Long serviceId) 
    {
        this.serviceId = serviceId;
    }

    public Long getServiceId() 
    {
        return serviceId;
    }

    public void setEmpId(Long empId) 
    {
        this.empId = empId;
    }

    public Long getEmpId() 
    {
        return empId;
    }

    public void setEmpName(String empName) 
    {
        this.empName = empName;
    }

    public String getEmpName() 
    {
        return empName;
    }

    public void setEmpNo(String empNo) 
    {
        this.empNo = empNo;
    }

    public String getEmpNo() 
    {
        return empNo;
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

    public void setServiceType(String serviceType) 
    {
        this.serviceType = serviceType;
    }

    public String getServiceType() 
    {
        return serviceType;
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

    public void setServiceContent(String serviceContent) 
    {
        this.serviceContent = serviceContent;
    }

    public String getServiceContent() 
    {
        return serviceContent;
    }

    public void setAttachmentUrl(String attachmentUrl) 
    {
        this.attachmentUrl = attachmentUrl;
    }

    public String getAttachmentUrl() 
    {
        return attachmentUrl;
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
            .append("serviceId", getServiceId())
            .append("empId", getEmpId())
            .append("empName", getEmpName())
            .append("empNo", getEmpNo())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("serviceType", getServiceType())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("serviceContent", getServiceContent())
            .append("attachmentUrl", getAttachmentUrl())
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