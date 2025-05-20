package com.henglee.hrp.hrs.salary.service;

import java.util.List;
import com.henglee.hrp.hrs.salary.domain.HrsSalarySystem;

/**
 * 薪酬体系Service接口
 * 
 * @author henglee
 */
public interface IHrsSalarySystemService 
{
    /**
     * 查询薪酬体系
     * 
     * @param systemId 薪酬体系主键
     * @return 薪酬体系
     */
    public HrsSalarySystem selectHrsSalarySystemBySystemId(Long systemId);

    /**
     * 查询薪酬体系列表
     * 
     * @param hrsSalarySystem 薪酬体系
     * @return 薪酬体系集合
     */
    public List<HrsSalarySystem> selectHrsSalarySystemList(HrsSalarySystem hrsSalarySystem);

    /**
     * 新增薪酬体系
     * 
     * @param hrsSalarySystem 薪酬体系
     * @return 结果
     */
    public int insertHrsSalarySystem(HrsSalarySystem hrsSalarySystem);

    /**
     * 修改薪酬体系
     * 
     * @param hrsSalarySystem 薪酬体系
     * @return 结果
     */
    public int updateHrsSalarySystem(HrsSalarySystem hrsSalarySystem);

    /**
     * 批量删除薪酬体系
     * 
     * @param systemIds 需要删除的薪酬体系主键集合
     * @return 结果
     */
    public int deleteHrsSalarySystemBySystemIds(Long[] systemIds);

    /**
     * 删除薪酬体系信息
     * 
     * @param systemId 薪酬体系主键
     * @return 结果
     */
    public int deleteHrsSalarySystemBySystemId(Long systemId);
} 