package com.henglee.hrp.hrs.salary.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 薪酬体系对象 hrs_salary_system
 * 
 * @author henglee
 */
public class HrsSalarySystem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 体系ID */
    private Long systemId;

    /** 体系名称 */
    @Excel(name = "体系名称")
    private String systemName;

    /** 体系类型（1发放对象 2工资账套 3公式套） */
    @Excel(name = "体系类型", readConverterExp = "1=发放对象,2=工资账套,3=公式套")
    private String systemType;

    /** 体系编码 */
    @Excel(name = "体系编码")
    private String systemCode;

    /** 体系说明 */
    @Excel(name = "体系说明")
    private String systemDesc;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setSystemId(Long systemId) 
    {
        this.systemId = systemId;
    }

    public Long getSystemId() 
    {
        return systemId;
    }

    public void setSystemName(String systemName) 
    {
        this.systemName = systemName;
    }

    public String getSystemName() 
    {
        return systemName;
    }

    public void setSystemType(String systemType) 
    {
        this.systemType = systemType;
    }

    public String getSystemType() 
    {
        return systemType;
    }

    public void setSystemCode(String systemCode) 
    {
        this.systemCode = systemCode;
    }

    public String getSystemCode() 
    {
        return systemCode;
    }

    public void setSystemDesc(String systemDesc) 
    {
        this.systemDesc = systemDesc;
    }

    public String getSystemDesc() 
    {
        return systemDesc;
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
            .append("systemId", getSystemId())
            .append("systemName", getSystemName())
            .append("systemType", getSystemType())
            .append("systemCode", getSystemCode())
            .append("systemDesc", getSystemDesc())
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