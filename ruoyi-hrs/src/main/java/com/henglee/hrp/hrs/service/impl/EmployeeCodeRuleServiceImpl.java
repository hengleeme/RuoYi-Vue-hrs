package com.henglee.hrp.hrs.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.mapper.EmployeeCodeRuleMapper;
import com.henglee.hrp.hrs.domain.EmployeeCodeRule;
import com.henglee.hrp.hrs.service.IEmployeeCodeRuleService;

/**
 * 人员编号规则Service业务层处理
 * 
 * @author cbh
 */
@Service
public class EmployeeCodeRuleServiceImpl implements IEmployeeCodeRuleService 
{
    @Autowired
    private EmployeeCodeRuleMapper employeeCodeRuleMapper;

    /**
     * 查询人员编号规则
     * 
     * @param ruleId 人员编号规则主键
     * @return 人员编号规则
     */
    @Override
    public EmployeeCodeRule selectEmployeeCodeRuleByRuleId(Long ruleId)
    {
        return employeeCodeRuleMapper.selectEmployeeCodeRuleByRuleId(ruleId);
    }

    /**
     * 查询人员编号规则列表
     * 
     * @param employeeCodeRule 人员编号规则
     * @return 人员编号规则
     */
    @Override
    public List<EmployeeCodeRule> selectEmployeeCodeRuleList(EmployeeCodeRule employeeCodeRule)
    {
        return employeeCodeRuleMapper.selectEmployeeCodeRuleList(employeeCodeRule);
    }

    /**
     * 新增人员编号规则
     * 
     * @param employeeCodeRule 人员编号规则
     * @return 结果
     */
    @Override
    public int insertEmployeeCodeRule(EmployeeCodeRule employeeCodeRule)
    {
        return employeeCodeRuleMapper.insertEmployeeCodeRule(employeeCodeRule);
    }

    /**
     * 修改人员编号规则
     * 
     * @param employeeCodeRule 人员编号规则
     * @return 结果
     */
    @Override
    public int updateEmployeeCodeRule(EmployeeCodeRule employeeCodeRule)
    {
        return employeeCodeRuleMapper.updateEmployeeCodeRule(employeeCodeRule);
    }

    /**
     * 批量删除人员编号规则
     * 
     * @param ruleIds 需要删除的人员编号规则主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeCodeRuleByRuleIds(Long[] ruleIds)
    {
        return employeeCodeRuleMapper.deleteEmployeeCodeRuleByRuleIds(ruleIds);
    }

    /**
     * 删除人员编号规则信息
     * 
     * @param ruleId 人员编号规则主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeCodeRuleByRuleId(Long ruleId)
    {
        return employeeCodeRuleMapper.deleteEmployeeCodeRuleByRuleId(ruleId);
    }
} 