package com.henglee.hrp.hrs.salary.domain;

/**
 * 薪资实体类
 * 
 * @author cbh
 */
public class Salary {
    /** 薪资ID */
    private Long id;
    
    /** 员工ID */
    private Long employeeId;
    
    /** 员工姓名 */
    private String employeeName;
    
    /** 月份 */
    private String month;
    
    /** 基本工资 */
    private Double baseSalary;
    
    /** 绩效工资 */
    private Double performanceSalary;
    
    /** 加班工资 */
    private Double overtimeSalary;
    
    /** 补贴 */
    private Double allowance;
    
    /** 扣除项 */
    private Double deduction;
    
    /** 实发工资 */
    private Double actualSalary;
    
    /** 发放状态 */
    private String status;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getPerformanceSalary() {
        return performanceSalary;
    }

    public void setPerformanceSalary(Double performanceSalary) {
        this.performanceSalary = performanceSalary;
    }

    public Double getOvertimeSalary() {
        return overtimeSalary;
    }

    public void setOvertimeSalary(Double overtimeSalary) {
        this.overtimeSalary = overtimeSalary;
    }

    public Double getAllowance() {
        return allowance;
    }

    public void setAllowance(Double allowance) {
        this.allowance = allowance;
    }

    public Double getDeduction() {
        return deduction;
    }

    public void setDeduction(Double deduction) {
        this.deduction = deduction;
    }

    public Double getActualSalary() {
        return actualSalary;
    }

    public void setActualSalary(Double actualSalary) {
        this.actualSalary = actualSalary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
 