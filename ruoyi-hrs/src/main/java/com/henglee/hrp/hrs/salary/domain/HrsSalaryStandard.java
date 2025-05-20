package com.henglee.hrp.hrs.salary.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 薪资标准对象 hrs_salary_standard
 * 
 * @author henglee
 */
public class HrsSalaryStandard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标准ID */
    private Long standardId;

    /** 标准名称 */
    @Excel(name = "标准名称")
    private String standardName;

    /** 标准类型（1基本工资 2岗位工资 3绩效工资） */
    @Excel(name = "标准类型", readConverterExp = "1=基本工资,2=岗位工资,3=绩效工资")
    private String standardType;

    /** 标准值 */
    @Excel(name = "标准值")
    private BigDecimal standardValue;

    /** 单位（元/月、元/小时等） */
    @Excel(name = "单位")
    private String standardUnit;

    /** 标准说明 */
    @Excel(name = "标准说明")
    private String standardDesc;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setStandardId(Long standardId) 
    {
        this.standardId = standardId;
    }

    public Long getStandardId() 
    {
        return standardId;
    }

    public void setStandardName(String standardName) 
    {
        this.standardName = standardName;
    }

    public String getStandardName() 
    {
        return standardName;
    }

    public void setStandardType(String standardType) 
    {
        this.standardType = standardType;
    }

    public String getStandardType() 
    {
        return standardType;
    }

    public void setStandardValue(BigDecimal standardValue) 
    {
        this.standardValue = standardValue;
    }

    public BigDecimal getStandardValue() 
    {
        return standardValue;
    }

    public void setStandardUnit(String standardUnit) 
    {
        this.standardUnit = standardUnit;
    }

    public String getStandardUnit() 
    {
        return standardUnit;
    }

    public void setStandardDesc(String standardDesc) 
    {
        this.standardDesc = standardDesc;
    }

    public String getStandardDesc() 
    {
        return standardDesc;
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
            .append("standardId", getStandardId())
            .append("standardName", getStandardName())
            .append("standardType", getStandardType())
            .append("standardValue", getStandardValue())
            .append("standardUnit", getStandardUnit())
            .append("standardDesc", getStandardDesc())
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