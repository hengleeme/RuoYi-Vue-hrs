package com.henglee.hrp.hrs.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.mapper.EmployeeCollectMapper;
import com.henglee.hrp.hrs.domain.EmployeeCollect;
import com.henglee.hrp.hrs.service.IEmployeeCollectService;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;

/**
 * 人员信息采集Service业务层处理
 * 
 * @author cbh
 */
@Service
public class EmployeeCollectServiceImpl implements IEmployeeCollectService 
{
    @Autowired
    private EmployeeCollectMapper employeeCollectMapper;

    /**
     * 查询人员信息采集
     * 
     * @param collectId 人员信息采集主键
     * @return 人员信息采集
     */
    @Override
    public EmployeeCollect selectEmployeeCollectByCollectId(Long collectId)
    {
        return employeeCollectMapper.selectEmployeeCollectByCollectId(collectId);
    }

    /**
     * 查询人员信息采集列表
     * 
     * @param employeeCollect 人员信息采集
     * @return 人员信息采集
     */
    @Override
    public List<EmployeeCollect> selectEmployeeCollectList(EmployeeCollect employeeCollect)
    {
        return employeeCollectMapper.selectEmployeeCollectList(employeeCollect);
    }

    /**
     * 新增人员信息采集
     * 
     * @param employeeCollect 人员信息采集
     * @return 结果
     */
    @Override
    public int insertEmployeeCollect(EmployeeCollect employeeCollect)
    {
        employeeCollect.setCreateTime(DateUtils.getNowDate());
        return employeeCollectMapper.insertEmployeeCollect(employeeCollect);
    }

    /**
     * 修改人员信息采集
     * 
     * @param employeeCollect 人员信息采集
     * @return 结果
     */
    @Override
    public int updateEmployeeCollect(EmployeeCollect employeeCollect)
    {
        employeeCollect.setUpdateTime(DateUtils.getNowDate());
        return employeeCollectMapper.updateEmployeeCollect(employeeCollect);
    }

    /**
     * 批量删除人员信息采集
     * 
     * @param collectIds 需要删除的人员信息采集主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeCollectByCollectIds(String collectIds)
    {
        return employeeCollectMapper.deleteEmployeeCollectByCollectIds(Convert.toLongArray(collectIds));
    }

    /**
     * 删除人员信息采集信息
     * 
     * @param collectId 人员信息采集主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeCollectByCollectId(Long collectId)
    {
        return employeeCollectMapper.deleteEmployeeCollectByCollectId(collectId);
    }

    /**
     * 审核人员信息采集
     * 
     * @param employeeCollect 人员信息采集
     * @return 结果
     */
    @Override
    public int auditEmployeeCollect(EmployeeCollect employeeCollect)
    {
        employeeCollect.setAuditTime(DateUtils.getNowDate());
        return employeeCollectMapper.updateEmployeeCollect(employeeCollect);
    }
} 