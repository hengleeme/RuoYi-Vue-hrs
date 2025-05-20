package com.henglee.hrp.hrs.mapper;

import java.util.List;
import com.henglee.hrp.hrs.domain.EmployeeCodeRule;

/**
 * 人员编号规则Mapper接口
 * 
 * @author cbh
 */
public interface EmployeeCodeRuleMapper 
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
     * 删除人员编号规则
     * 
     * @param ruleId 人员编号规则主键
     * @return 结果
     */
    public int deleteEmployeeCodeRuleByRuleId(Long ruleId);

    /**
     * 批量删除人员编号规则
     * 
     * @param ruleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeeCodeRuleByRuleIds(Long[] ruleIds);
} 