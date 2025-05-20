package com.henglee.hrp.hrs.salary.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.salary.mapper.HrsSalaryAdjustMapper;
import com.henglee.hrp.hrs.salary.domain.HrsSalaryAdjust;
import com.henglee.hrp.hrs.salary.service.IHrsSalaryAdjustService;

/**
 * 定薪调薪Service业务层处理
 * 
 * @author henglee
 * @date 2024-03-20
 */
@Service
public class HrsSalaryAdjustServiceImpl implements IHrsSalaryAdjustService 
{
    @Autowired
    private HrsSalaryAdjustMapper hrsSalaryAdjustMapper;

    /**
     * 查询定薪调薪
     * 
     * @param adjustId 定薪调薪主键
     * @return 定薪调薪
     */
    @Override
    public HrsSalaryAdjust selectHrsSalaryAdjustByAdjustId(Long adjustId)
    {
        return hrsSalaryAdjustMapper.selectHrsSalaryAdjustByAdjustId(adjustId);
    }

    /**
     * 查询定薪调薪列表
     * 
     * @param hrsSalaryAdjust 定薪调薪
     * @return 定薪调薪
     */
    @Override
    public List<HrsSalaryAdjust> selectHrsSalaryAdjustList(HrsSalaryAdjust hrsSalaryAdjust)
    {
        return hrsSalaryAdjustMapper.selectHrsSalaryAdjustList(hrsSalaryAdjust);
    }

    /**
     * 新增定薪调薪
     * 
     * @param hrsSalaryAdjust 定薪调薪
     * @return 结果
     */
    @Override
    public int insertHrsSalaryAdjust(HrsSalaryAdjust hrsSalaryAdjust)
    {
        return hrsSalaryAdjustMapper.insertHrsSalaryAdjust(hrsSalaryAdjust);
    }

    /**
     * 修改定薪调薪
     * 
     * @param hrsSalaryAdjust 定薪调薪
     * @return 结果
     */
    @Override
    public int updateHrsSalaryAdjust(HrsSalaryAdjust hrsSalaryAdjust)
    {
        return hrsSalaryAdjustMapper.updateHrsSalaryAdjust(hrsSalaryAdjust);
    }

    /**
     * 批量删除定薪调薪
     * 
     * @param adjustIds 需要删除的定薪调薪主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalaryAdjustByAdjustIds(Long[] adjustIds)
    {
        return hrsSalaryAdjustMapper.deleteHrsSalaryAdjustByAdjustIds(adjustIds);
    }

    /**
     * 删除定薪调薪信息
     * 
     * @param adjustId 定薪调薪主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalaryAdjustByAdjustId(Long adjustId)
    {
        return hrsSalaryAdjustMapper.deleteHrsSalaryAdjustByAdjustId(adjustId);
    }

    /**
     * 提交定薪调薪
     * 
     * @param adjustId 定薪调薪主键
     * @return 结果
     */
    @Override
    public int submitHrsSalaryAdjust(Long adjustId)
    {
        return hrsSalaryAdjustMapper.submitHrsSalaryAdjust(adjustId);
    }

    /**
     * 审批定薪调薪
     * 
     * @param hrsSalaryAdjust 定薪调薪
     * @return 结果
     */
    @Override
    public int approveHrsSalaryAdjust(HrsSalaryAdjust hrsSalaryAdjust)
    {
        return hrsSalaryAdjustMapper.approveHrsSalaryAdjust(hrsSalaryAdjust);
    }
} 