package com.henglee.hrp.hrs.salary.service;

import java.util.List;
import com.henglee.hrp.hrs.salary.domain.HrsSalaryStandard;

/**
 * 薪资标准Service接口
 * 
 * @author henglee
 */
public interface IHrsSalaryStandardService 
{
    /**
     * 查询薪资标准
     * 
     * @param standardId 薪资标准主键
     * @return 薪资标准
     */
    public HrsSalaryStandard selectHrsSalaryStandardByStandardId(Long standardId);

    /**
     * 查询薪资标准列表
     * 
     * @param hrsSalaryStandard 薪资标准
     * @return 薪资标准集合
     */
    public List<HrsSalaryStandard> selectHrsSalaryStandardList(HrsSalaryStandard hrsSalaryStandard);

    /**
     * 新增薪资标准
     * 
     * @param hrsSalaryStandard 薪资标准
     * @return 结果
     */
    public int insertHrsSalaryStandard(HrsSalaryStandard hrsSalaryStandard);

    /**
     * 修改薪资标准
     * 
     * @param hrsSalaryStandard 薪资标准
     * @return 结果
     */
    public int updateHrsSalaryStandard(HrsSalaryStandard hrsSalaryStandard);

    /**
     * 批量删除薪资标准
     * 
     * @param standardIds 需要删除的薪资标准主键集合
     * @return 结果
     */
    public int deleteHrsSalaryStandardByStandardIds(Long[] standardIds);

    /**
     * 删除薪资标准信息
     * 
     * @param standardId 薪资标准主键
     * @return 结果
     */
    public int deleteHrsSalaryStandardByStandardId(Long standardId);
} 