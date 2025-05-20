package com.henglee.hrp.hrs.service;

import java.util.List;
import com.henglee.hrp.hrs.domain.EmployeeCodeRule;

/**
 * 人员编号规则Service接口
 * 
 * @author cbh
 */
public interface IEmployeeCodeRuleService 
{
    /**
     * 查询人员编号规则
     * 
     * @param ruleId 人员编号规则主键
     * @return 人员编号规则
     */
    public EmployeeCodeRule selectEmployeeCodeRuleByRuleId(Long ruleId);

    /**
     * 查询人员编号规则列表
     * 
     * @param employeeCodeRule 人员编号规则
     * @return 人员编号规则集合
     */
    public List<EmployeeCodeRule> selectEmployeeCodeRuleList(EmployeeCodeRule employeeCodeRule);

    /**
     * 新增人员编号规则
     * 
     * @param employeeCodeRule 人员编号规则
     * @return 结果
     */
    public int insertEmployeeCodeRule(EmployeeCodeRule employeeCodeRule);

    /**
     * 修改人员编号规则
     * 
     * @param employeeCodeRule 人员编号规则
     * @return 结果
     */
    public int updateEmployeeCodeRule(EmployeeCodeRule employeeCodeRule);

    /**
     * 批量删除人员编号规则
     * 
     * @param ruleIds 需要删除的人员编号规则主键集合
     * @return 结果
     */
    public int deleteEmployeeCodeRuleByRuleIds(Long[] ruleIds);

    /**
     * 删除人员编号规则信息
     * 
     * @param ruleId 人员编号规则主键
     * @return 结果
     */
    public int deleteEmployeeCodeRuleByRuleId(Long ruleId);
} 