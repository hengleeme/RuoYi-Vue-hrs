package com.henglee.hrp.hrs.salary.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 薪资管理对象 hrs_salary
 * 
 * @author cbh
 */
public class HrsSalary extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 薪资ID */
    private Long salaryId;

    /** 员工ID */
    @Excel(name = "员工ID")
    private Long empId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String empName;

    /** 工号 */
    @Excel(name = "工号")
    private String empNo;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 薪资月份 */
    @Excel(name = "薪资月份", dateFormat = "yyyy-MM")
    private String salaryMonth;

    /** 基本工资 */
    @Excel(name = "基本工资")
    private Double baseSalary;

    /** 绩效工资 */
    @Excel(name = "绩效工资")
    private Double performanceSalary;

    /** 加班工资 */
    @Excel(name = "加班工资")
    private Double overtimeSalary;

    /** 补贴 */
    @Excel(name = "补贴")
    private Double allowance;

    /** 扣款 */
    @Excel(name = "扣款")
    private Double deduction;

    /** 实发工资 */
    @Excel(name = "实发工资")
    private Double actualSalary;

    /** 状态（0未发放 1已发放） */
    @Excel(name = "状态", readConverterExp = "0=未发放,1=已发放")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setSalaryId(Long salaryId) {
        this.salaryId = salaryId;
    }

    public Long getSalaryId() {
        return salaryId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setSalaryMonth(String salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public String getSalaryMonth() {
        return salaryMonth;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setPerformanceSalary(Double performanceSalary) {
        this.performanceSalary = performanceSalary;
    }

    public Double getPerformanceSalary() {
        return performanceSalary;
    }

    public void setOvertimeSalary(Double overtimeSalary) {
        this.overtimeSalary = overtimeSalary;
    }

    public Double getOvertimeSalary() {
        return overtimeSalary;
    }

    public void setAllowance(Double allowance) {
        this.allowance = allowance;
    }

    public Double getAllowance() {
        return allowance;
    }

    public void setDeduction(Double deduction) {
        this.deduction = deduction;
    }

    public Double getDeduction() {
        return deduction;
    }

    public void setActualSalary(Double actualSalary) {
        this.actualSalary = actualSalary;
    }

    public Double getActualSalary() {
        return actualSalary;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getDelFlag() {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("salaryId", getSalaryId())
            .append("empId", getEmpId())
            .append("empName", getEmpName())
            .append("empNo", getEmpNo())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("salaryMonth", getSalaryMonth())
            .append("baseSalary", getBaseSalary())
            .append("performanceSalary", getPerformanceSalary())
            .append("overtimeSalary", getOvertimeSalary())
            .append("allowance", getAllowance())
            .append("deduction", getDeduction())
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