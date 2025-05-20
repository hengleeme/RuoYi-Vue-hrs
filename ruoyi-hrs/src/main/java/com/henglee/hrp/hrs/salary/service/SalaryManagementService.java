package com.henglee.hrp.hrs.salary.service;

import com.henglee.hrp.hrs.salary.domain.Salary;
import java.util.List;

/**
 * 薪资管理服务接口
 * 
 * @author cbh
 */
public interface SalaryManagementService {
    /**
     * 获取薪资列表
     * 
     * @return 薪资列表
     */
    List<Salary> getSalaryList();

    /**
     * 计算薪资
     * 
     * @param month 月份
     */
    void calculateSalary(String month);

    /**
     * 发放薪资
     * 
     * @param month 月份
     */
    void paySalary(String month);
} 