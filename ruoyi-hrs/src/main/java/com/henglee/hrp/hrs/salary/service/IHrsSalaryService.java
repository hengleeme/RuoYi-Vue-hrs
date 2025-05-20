package com.henglee.hrp.hrs.salary.service;

import java.util.List;
import com.henglee.hrp.hrs.salary.domain.HrsSalary;

/**
 * 薪资管理Service接口
 * 
 * @author cbh
 */
public interface IHrsSalaryService {
    /**
     * 查询薪资管理
     * 
     * @param salaryId 薪资管理主键
     * @return 薪资管理
     */
    public HrsSalary selectHrsSalaryBySalaryId(Long salaryId);

    /**
     * 查询薪资管理列表
     * 
     * @param hrsSalary 薪资管理
     * @return 薪资管理集合
     */
    public List<HrsSalary> selectHrsSalaryList(HrsSalary hrsSalary);

    /**
     * 新增薪资管理
     * 
     * @param hrsSalary 薪资管理
     * @return 结果
     */
    public int insertHrsSalary(HrsSalary hrsSalary);

    /**
     * 修改薪资管理
     * 
     * @param hrsSalary 薪资管理
     * @return 结果
     */
    public int updateHrsSalary(HrsSalary hrsSalary);

    /**
     * 批量删除薪资管理
     * 
     * @param salaryIds 需要删除的薪资管理主键集合
     * @return 结果
     */
    public int deleteHrsSalaryBySalaryIds(Long[] salaryIds);

    /**
     * 删除薪资管理信息
     * 
     * @param salaryId 薪资管理主键
     * @return 结果
     */
    public int deleteHrsSalaryBySalaryId(Long salaryId);
} 