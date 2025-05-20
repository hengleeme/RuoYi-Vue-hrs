package com.henglee.hrp.hrs.salary.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.salary.mapper.HrsSalaryMapper;
import com.henglee.hrp.hrs.salary.domain.HrsSalary;
import com.henglee.hrp.hrs.salary.service.IHrsSalaryService;

/**
 * 薪资管理Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsSalaryServiceImpl implements IHrsSalaryService {
    @Autowired
    private HrsSalaryMapper hrsSalaryMapper;

    /**
     * 查询薪资管理
     * 
     * @param salaryId 薪资管理主键
     * @return 薪资管理
     */
    @Override
    public HrsSalary selectHrsSalaryBySalaryId(Long salaryId) {
        return hrsSalaryMapper.selectHrsSalaryBySalaryId(salaryId);
    }

    /**
     * 查询薪资管理列表
     * 
     * @param hrsSalary 薪资管理
     * @return 薪资管理
     */
    @Override
    public List<HrsSalary> selectHrsSalaryList(HrsSalary hrsSalary) {
        return hrsSalaryMapper.selectHrsSalaryList(hrsSalary);
    }

    /**
     * 新增薪资管理
     * 
     * @param hrsSalary 薪资管理
     * @return 结果
     */
    @Override
    public int insertHrsSalary(HrsSalary hrsSalary) {
        return hrsSalaryMapper.insertHrsSalary(hrsSalary);
    }

    /**
     * 修改薪资管理
     * 
     * @param hrsSalary 薪资管理
     * @return 结果
     */
    @Override
    public int updateHrsSalary(HrsSalary hrsSalary) {
        return hrsSalaryMapper.updateHrsSalary(hrsSalary);
    }

    /**
     * 批量删除薪资管理
     * 
     * @param salaryIds 需要删除的薪资管理主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalaryBySalaryIds(Long[] salaryIds) {
        return hrsSalaryMapper.deleteHrsSalaryBySalaryIds(salaryIds);
    }

    /**
     * 删除薪资管理信息
     * 
     * @param salaryId 薪资管理主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalaryBySalaryId(Long salaryId) {
        return hrsSalaryMapper.deleteHrsSalaryBySalaryId(salaryId);
    }
} 