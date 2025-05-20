package com.henglee.hrp.hrs.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人员类别对象 hrs_employee_type
 * 
 * @author cbh
 */
public class EmployeeType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 类别ID */
    private Long typeId;

    /** 类别名称 */
    @Excel(name = "类别名称")
    private String typeName;

    /** 类别编码 */
    @Excel(name = "类别编码")
    private String typeCode;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setTypeId(Long typeId) 
    {
        this.typeId = typeId;
    }

    public Long getTypeId() 
    {
        return typeId;
    }

    public void setTypeName(String typeName) 
    {
        this.typeName = typeName;
    }

    public String getTypeName() 
    {
        return typeName;
    }

    public void setTypeCode(String typeCode) 
    {
        this.typeCode = typeCode;
    }

    public String getTypeCode() 
    {
        return typeCode;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("typeId", getTypeId())
            .append("typeName", getTypeName())
            .append("typeCode", getTypeCode())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
} 