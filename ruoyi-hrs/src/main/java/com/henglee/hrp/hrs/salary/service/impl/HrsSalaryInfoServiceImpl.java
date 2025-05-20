package com.henglee.hrp.hrs.salary.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.salary.mapper.HrsSalaryInfoMapper;
import com.henglee.hrp.hrs.salary.domain.HrsSalaryInfo;
import com.henglee.hrp.hrs.salary.service.IHrsSalaryInfoService;

/**
 * 工资信息Service业务层处理
 * 
 * @author henglee
 */
@Service
public class HrsSalaryInfoServiceImpl implements IHrsSalaryInfoService 
{
    @Autowired
    private HrsSalaryInfoMapper hrsSalaryInfoMapper;

    /**
     * 查询工资信息
     * 
     * @param salaryId 工资信息主键
     * @return 工资信息
     */
    @Override
    public HrsSalaryInfo selectHrsSalaryInfoBySalaryId(Long salaryId)
    {
        return hrsSalaryInfoMapper.selectHrsSalaryInfoBySalaryId(salaryId);
    }

    /**
     * 查询工资信息列表
     * 
     * @param hrsSalaryInfo 工资信息
     * @return 工资信息
     */
    @Override
    public List<HrsSalaryInfo> selectHrsSalaryInfoList(HrsSalaryInfo hrsSalaryInfo)
    {
        return hrsSalaryInfoMapper.selectHrsSalaryInfoList(hrsSalaryInfo);
    }

    /**
     * 新增工资信息
     * 
     * @param hrsSalaryInfo 工资信息
     * @return 结果
     */
    @Override
    public int insertHrsSalaryInfo(HrsSalaryInfo hrsSalaryInfo)
    {
        return hrsSalaryInfoMapper.insertHrsSalaryInfo(hrsSalaryInfo);
    }

    /**
     * 修改工资信息
     * 
     * @param hrsSalaryInfo 工资信息
     * @return 结果
     */
    @Override
    public int updateHrsSalaryInfo(HrsSalaryInfo hrsSalaryInfo)
    {
        return hrsSalaryInfoMapper.updateHrsSalaryInfo(hrsSalaryInfo);
    }

    /**
     * 批量删除工资信息
     * 
     * @param salaryIds 需要删除的工资信息主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalaryInfoBySalaryIds(Long[] salaryIds)
    {
        return hrsSalaryInfoMapper.deleteHrsSalaryInfoBySalaryIds(salaryIds);
    }

    /**
     * 删除工资信息信息
     * 
     * @param salaryId 工资信息主键
     * @return 结果
     */
    @Override
    public int deleteHrsSalaryInfoBySalaryId(Long salaryId)
    {
        return hrsSalaryInfoMapper.deleteHrsSalaryInfoBySalaryId(salaryId);
    }

    /**
     * 提交工资信息
     * 
     * @param salaryId 工资信息主键
     * @return 结果
     */
    @Override
    public int submitHrsSalaryInfo(Long salaryId)
    {
        return hrsSalaryInfoMapper.submitHrsSalaryInfo(salaryId);
    }

    /**
     * 审批工资信息
     * 
     * @param hrsSalaryInfo 工资信息
     * @return 结果
     */
    @Override
    public int approveHrsSalaryInfo(HrsSalaryInfo hrsSalaryInfo)
    {
        return hrsSalaryInfoMapper.approveHrsSalaryInfo(hrsSalaryInfo);
    }

    /**
     * 发放工资信息
     * 
     * @param salaryId 工资信息主键
     * @return 结果
     */
    @Override
    public int payHrsSalaryInfo(Long salaryId)
    {
        return hrsSalaryInfoMapper.payHrsSalaryInfo(salaryId);
    }
} 