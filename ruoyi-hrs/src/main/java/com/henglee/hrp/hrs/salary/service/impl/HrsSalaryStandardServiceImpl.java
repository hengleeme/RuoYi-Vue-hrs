package com.henglee.hrp.hrs.salary.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.salary.mapper.HrsSalaryStandardMapper;
import com.henglee.hrp.hrs.salary.domain.HrsSalaryStandard;
import com.henglee.hrp.hrs.salary.service.IHrsSalaryStandardService;

/**
 * 薪资标准Service业务层处理
 * 
 * @author henglee
 */
@Service
public class HrsSalaryStandardServiceImpl implements IHrsSalaryStandardService 
{
    @Autowired
    private HrsSalaryStandardMapper hrsSalaryStandardMapper;

    /**
     * 查询薪资标准
     * 
     * @param standardId 薪资标准主键
     * @return 薪资标准
     */
    @Override
    public HrsSalaryStandard selectHrsSalaryStandardByStandardId(Long standardId)
    {
        return hrsSalaryStandardMapper.selectHrsSalaryStandardByStandardId(standardId);
    }

    /**
     * 查询薪资标准列表
     * 
     * @param hrsSalaryStandard 薪资标准
     * @return 薪资标准
     */
    @Override
    public List<HrsSalaryStandard> selectHrsSalaryStandardList(HrsSalaryStandard hrsSalaryStandard)
    {
        return hrsSalaryStandardMapper.selectHrsSalaryStandardList(hrsSalaryStandard);
    }

    /**
     * 新增薪资标准
     * 
     * @param hrsSalaryStandard 薪资标准
     * @return 结果
     */
    @Override
    public int insertHrsSalaryStandard(HrsSalaryStandard hrsSalaryStandard)
    {
        return hrsSalaryStandardMapper.insertHrsSalaryStandard(hrsSalaryStandard);
    }

    /**
     * 修改薪资标准
     * 
     * @param hrsSalaryStandard 薪资标准
     * @return 结果
     */
    @Override
    public int updateHrsSalaryStandard(HrsSalaryStandard hrsSalaryStandard)
    {
        return hrsSalaryStandardMapper.updateHrsSalaryStandard(hrsSalaryStandard);
    }

    /**
     * 批量删除薪资标准
     * 
     * @param standardIds 需要删除的薪资标准主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalaryStandardByStandardIds(Long[] standardIds)
    {
        return hrsSalaryStandardMapper.deleteHrsSalaryStandardByStandardIds(standardIds);
    }

    /**
     * 删除薪资标准信息
     * 
     * @param standardId 薪资标准主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalaryStandardByStandardId(Long standardId)
    {
        return hrsSalaryStandardMapper.deleteHrsSalaryStandardByStandardId(standardId);
    }
} 