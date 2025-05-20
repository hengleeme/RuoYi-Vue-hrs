package com.henglee.hrp.hrs.salary.mapper;

import java.util.List;
import com.henglee.hrp.hrs.salary.domain.HrsSalaryStandard;

/**
 * 薪资标准Mapper接口
 * 
 * @author henglee
 */
public interface HrsSalaryStandardMapper 
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
     * 删除薪资标准
     * 
     * @param standardId 薪资标准主键
     * @return 结果
     */
    public int deleteHrsSalaryStandardByStandardId(Long standardId);

    /**
     * 批量删除薪资标准
     * 
     * @param standardIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsSalaryStandardByStandardIds(Long[] standardIds);
} 