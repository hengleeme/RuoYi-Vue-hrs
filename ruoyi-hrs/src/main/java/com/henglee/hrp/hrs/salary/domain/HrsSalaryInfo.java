package com.henglee.hrp.hrs.salary.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 工资信息对象 hrs_salary_info
 * 
 * @author henglee
 */
public class HrsSalaryInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工资ID */
    private Long salaryId;

    /** 员工ID */
    @Excel(name = "员工ID")
    private Long employeeId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String employeeName;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 工资年份 */
    @Excel(name = "工资年份")
    private Integer salaryYear;

    /** 工资月份 */
    @Excel(name = "工资月份")
    private Integer salaryMonth;

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

    /** 状态（0草稿 1已提交 2已审核 3已发放） */
    @Excel(name = "状态", readConverterExp = "0=草稿,1=已提交,2=已审核,3=已发放")
    private String status;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setSalaryId(Long salaryId) 
    {
        this.salaryId = salaryId;
    }

    public Long getSalaryId() 
    {
        return salaryId;
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

    public void setSalaryYear(Integer salaryYear) 
    {
        this.salaryYear = salaryYear;
    }

    public Integer getSalaryYear() 
    {
        return salaryYear;
    }

    public void setSalaryMonth(Integer salaryMonth) 
    {
        this.salaryMonth = salaryMonth;
    }

    public Integer getSalaryMonth() 
    {
        return salaryMonth;
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
            .append("salaryId", getSalaryId())
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("deptName", getDeptName())
            .append("salaryYear", getSalaryYear())
            .append("salaryMonth", getSalaryMonth())
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