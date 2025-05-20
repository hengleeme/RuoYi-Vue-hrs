package com.henglee.hrp.hrs.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人员编号规则对象 hrs_employee_code_rule
 * 
 * @author cbh
 */
public class EmployeeCodeRule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 规则ID */
    private Long ruleId;

    /** 规则名称 */
    @Excel(name = "规则名称")
    private String ruleName;

    /** 规则类型（1前缀 2日期 3序号 4后缀） */
    @Excel(name = "规则类型", readConverterExp = "1=前缀,2=日期,3=序号,4=后缀")
    private String ruleType;

    /** 规则值 */
    @Excel(name = "规则值")
    private String ruleValue;

    /** 规则顺序 */
    @Excel(name = "规则顺序")
    private Integer ruleOrder;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setRuleId(Long ruleId) 
    {
        this.ruleId = ruleId;
    }

    public Long getRuleId() 
    {
        return ruleId;
    }

    public void setRuleName(String ruleName) 
    {
        this.ruleName = ruleName;
    }

    public String getRuleName() 
    {
        return ruleName;
    }

    public void setRuleType(String ruleType) 
    {
        this.ruleType = ruleType;
    }

    public String getRuleType() 
    {
        return ruleType;
    }

    public void setRuleValue(String ruleValue) 
    {
        this.ruleValue = ruleValue;
    }

    public String getRuleValue() 
    {
        return ruleValue;
    }

    public void setRuleOrder(Integer ruleOrder) 
    {
        this.ruleOrder = ruleOrder;
    }

    public Integer getRuleOrder() 
    {
        return ruleOrder;
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
            .append("ruleId", getRuleId())
            .append("ruleName", getRuleName())
            .append("ruleType", getRuleType())
            .append("ruleValue", getRuleValue())
            .append("ruleOrder", getRuleOrder())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
} 