package com.henglee.hrp.hrs.service;

import java.util.List;
import com.henglee.hrp.hrs.domain.EmployeeCollect;

/**
 * 人员信息采集Service接口
 * 
 * @author cbh
 */
public interface IEmployeeCollectService 
{
    /**
     * 查询人员信息采集
     * 
     * @param collectId 人员信息采集主键
     * @return 人员信息采集
     */
    public EmployeeCollect selectEmployeeCollectByCollectId(Long collectId);

    /**
     * 查询人员信息采集列表
     * 
     * @param employeeCollect 人员信息采集
     * @return 人员信息采集集合
     */
    public List<EmployeeCollect> selectEmployeeCollectList(EmployeeCollect employeeCollect);

    /**
     * 新增人员信息采集
     * 
     * @param employeeCollect 人员信息采集
     * @return 结果
     */
    public int insertEmployeeCollect(EmployeeCollect employeeCollect);

    /**
     * 修改人员信息采集
     * 
     * @param employeeCollect 人员信息采集
     * @return 结果
     */
    public int updateEmployeeCollect(EmployeeCollect employeeCollect);

    /**
     * 批量删除人员信息采集
     * 
     * @param collectIds 需要删除的人员信息采集主键集合
     * @return 结果
     */
    public int deleteEmployeeCollectByCollectIds(Long[] collectIds);

    /**
     * 删除人员信息采集信息
     * 
     * @param collectId 人员信息采集主键
     * @return 结果
     */
    public int deleteEmployeeCollectByCollectId(Long collectId);

    /**
     * 审核人员信息采集
     * 
     * @param employeeCollect 人员信息采集
     * @return 结果
     */
    public int auditEmployeeCollect(EmployeeCollect employeeCollect);
} 