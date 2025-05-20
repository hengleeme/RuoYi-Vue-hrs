package com.henglee.hrp.hrs.salary.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 定薪调薪对象 hrs_salary_adjust
 * 
 * @author henglee
 */
public class HrsSalaryAdjust extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 调整ID */
    private Long adjustId;

    /** 员工ID */
    @Excel(name = "员工ID")
    private Long employeeId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String employeeName;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 调整类型（1定薪 2调薪） */
    @Excel(name = "调整类型", readConverterExp = "1=定薪,2=调薪")
    private String adjustType;

    /** 调整日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "调整日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date adjustDate;

    /** 基本工资 */
    @Excel(name = "基本工资")
    private BigDecimal basicSalary;

    /** 岗位工资 */
    @Excel(name = "岗位工资")
    private BigDecimal positionSalary;

    /** 绩效工资 */
    @Excel(name = "绩效工资")
    private BigDecimal performanceSalary;

    /** 加班工资 */
    @Excel(name = "加班工资")
    private BigDecimal overtimeSalary;

    /** 奖金 */
    @Excel(name = "奖金")
    private BigDecimal bonus;

    /** 补贴 */
    @Excel(name = "补贴")
    private BigDecimal subsidy;

    /** 社保扣款 */
    @Excel(name = "社保扣款")
    private BigDecimal socialSecurity;

    /** 公积金扣款 */
    @Excel(name = "公积金扣款")
    private BigDecimal housingFund;

    /** 个人所得税 */
    @Excel(name = "个人所得税")
    private BigDecimal tax;

    /** 其他扣款 */
    @Excel(name = "其他扣款")
    private BigDecimal otherDeduction;

    /** 实发工资 */
    @Excel(name = "实发工资")
    private BigDecimal actualSalary;

    /** 调整原因 */
    @Excel(name = "调整原因")
    private String adjustReason;

    /** 状态（0草稿 1已提交 2已审核） */
    @Excel(name = "状态", readConverterExp = "0=草稿,1=已提交,2=已审核")
    private String status;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setAdjustId(Long adjustId) 
    {
        this.adjustId = adjustId;
    }

    public Long getAdjustId() 
    {
        return adjustId;
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

    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
    }

    public void setAdjustType(String adjustType) 
    {
        this.adjustType = adjustType;
    }

    public String getAdjustType() 
    {
        return adjustType;
    }

    public void setAdjustDate(Date adjustDate) 
    {
        this.adjustDate = adjustDate;
    }

    public Date getAdjustDate() 
    {
        return adjustDate;
    }

    public void setBasicSalary(BigDecimal basicSalary) 
    {
        this.basicSalary = basicSalary;
    }

    public BigDecimal getBasicSalary() 
    {
        return basicSalary;
    }

    public void setPositionSalary(BigDecimal positionSalary) 
    {
        this.positionSalary = positionSalary;
    }

    public BigDecimal getPositionSalary() 
    {
        return positionSalary;
    }

    public void setPerformanceSalary(BigDecimal performanceSalary) 
    {
        this.performanceSalary = performanceSalary;
    }

    public BigDecimal getPerformanceSalary() 
    {
        return performanceSalary;
    }

    public void setOvertimeSalary(BigDecimal overtimeSalary) 
    {
        this.overtimeSalary = overtimeSalary;
    }

    public BigDecimal getOvertimeSalary() 
    {
        return overtimeSalary;
    }

    public void setBonus(BigDecimal bonus) 
    {
        this.bonus = bonus;
    }

    public BigDecimal getBonus() 
    {
        return bonus;
    }

    public void setSubsidy(BigDecimal subsidy) 
    {
        this.subsidy = subsidy;
    }

    public BigDecimal getSubsidy() 
    {
        return subsidy;
    }

    public void setSocialSecurity(BigDecimal socialSecurity) 
    {
        this.socialSecurity = socialSecurity;
    }

    public BigDecimal getSocialSecurity() 
    {
        return socialSecurity;
    }

    public void setHousingFund(BigDecimal housingFund) 
    {
        this.housingFund = housingFund;
    }

    public BigDecimal getHousingFund() 
    {
        return housingFund;
    }

    public void setTax(BigDecimal tax) 
    {
        this.tax = tax;
    }

    public BigDecimal getTax() 
    {
        return tax;
    }

    public void setOtherDeduction(BigDecimal otherDeduction) 
    {
        this.otherDeduction = otherDeduction;
    }

    public BigDecimal getOtherDeduction() 
    {
        return otherDeduction;
    }

    public void setActualSalary(BigDecimal actualSalary) 
    {
        this.actualSalary = actualSalary;
    }

    public BigDecimal getActualSalary() 
    {
        return actualSalary;
    }

    public void setAdjustReason(String adjustReason) 
    {
        this.adjustReason = adjustReason;
    }

    public String getAdjustReason() 
    {
        return adjustReason;
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
            .append("adjustId", getAdjustId())
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("deptName", getDeptName())
            .append("adjustType", getAdjustType())
            .append("adjustDate", getAdjustDate())
            .append("basicSalary", getBasicSalary())
            .append("positionSalary", getPositionSalary())
            .append("performanceSalary", getPerformanceSalary())
            .append("overtimeSalary", getOvertimeSalary())
            .append("bonus", getBonus())
            .append("subsidy", getSubsidy())
            .append("socialSecurity", getSocialSecurity())
            .append("housingFund", getHousingFund())
            .append("tax", getTax())
            .append("otherDeduction", getOtherDeduction())
            .append("actualSalary", getActualSalary())
            .append("adjustReason", getAdjustReason())
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