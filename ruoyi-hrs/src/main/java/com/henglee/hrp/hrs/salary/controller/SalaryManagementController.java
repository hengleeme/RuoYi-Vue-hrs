package com.henglee.hrp.hrs.salary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.henglee.hrp.hrs.salary.service.SalaryManagementService;
import com.henglee.hrp.hrs.salary.domain.Salary;
import java.util.List;

/**
 * 薪资管理控制器
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/salary")
public class SalaryManagementController {

    @Autowired
    private SalaryManagementService salaryManagementService;

    /**
     * 获取薪资列表
     * 
     * @return 薪资列表
     */
    @GetMapping("/list")
    public List<Salary> getSalaryList() {
        return salaryManagementService.getSalaryList();
    }

    /**
     * 计算薪资
     * 
     * @param month 月份
     */
    @PostMapping("/calculate/{month}")
    public void calculateSalary(@PathVariable String month) {
        salaryManagementService.calculateSalary(month);
    }

    /**
     * 发放薪资
     * 
     * @param month 月份
     */
    @PostMapping("/pay/{month}")
    public void paySalary(@PathVariable String month) {
        salaryManagementService.paySalary(month);
    }
} 