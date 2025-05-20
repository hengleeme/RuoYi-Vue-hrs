package com.henglee.hrp.hrs.salary.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.salary.mapper.HrsSalarySystemMapper;
import com.henglee.hrp.hrs.salary.domain.HrsSalarySystem;
import com.henglee.hrp.hrs.salary.service.IHrsSalarySystemService;

/**
 * 薪酬体系Service业务层处理
 * 
 * @author henglee
 */
@Service
public class HrsSalarySystemServiceImpl implements IHrsSalarySystemService 
{
    @Autowired
    private HrsSalarySystemMapper hrsSalarySystemMapper;

    /**
     * 查询薪酬体系
     * 
     * @param systemId 薪酬体系主键
     * @return 薪酬体系
     */
    @Override
    public HrsSalarySystem selectHrsSalarySystemBySystemId(Long systemId)
    {
        return hrsSalarySystemMapper.selectHrsSalarySystemBySystemId(systemId);
    }

    /**
     * 查询薪酬体系列表
     * 
     * @param hrsSalarySystem 薪酬体系
     * @return 薪酬体系
     */
    @Override
    public List<HrsSalarySystem> selectHrsSalarySystemList(HrsSalarySystem hrsSalarySystem)
    {
        return hrsSalarySystemMapper.selectHrsSalarySystemList(hrsSalarySystem);
    }

    /**
     * 新增薪酬体系
     * 
     * @param hrsSalarySystem 薪酬体系
     * @return 结果
     */
    @Override
    public int insertHrsSalarySystem(HrsSalarySystem hrsSalarySystem)
    {
        return hrsSalarySystemMapper.insertHrsSalarySystem(hrsSalarySystem);
    }

    /**
     * 修改薪酬体系
     * 
     * @param hrsSalarySystem 薪酬体系
     * @return 结果
     */
    @Override
    public int updateHrsSalarySystem(HrsSalarySystem hrsSalarySystem)
    {
        return hrsSalarySystemMapper.updateHrsSalarySystem(hrsSalarySystem);
    }

    /**
     * 批量删除薪酬体系
     * 
     * @param systemIds 需要删除的薪酬体系主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalarySystemBySystemIds(Long[] systemIds)
    {
        return hrsSalarySystemMapper.deleteHrsSalarySystemBySystemIds(systemIds);
    }

    /**
     * 删除薪酬体系信息
     * 
     * @param systemId 薪酬体系主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalarySystemBySystemId(Long systemId)
    {
        return hrsSalarySystemMapper.deleteHrsSalarySystemBySystemId(systemId);
    }
} 