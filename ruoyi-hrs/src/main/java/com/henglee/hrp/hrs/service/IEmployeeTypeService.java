package com.henglee.hrp.hrs.service;

import java.util.List;
import com.henglee.hrp.hrs.domain.EmployeeType;

/**
 * 人员类别Service接口
 * 
 * @author cbh
 */
public interface IEmployeeTypeService 
{
    /**
     * 查询人员类别
     * 
     * @param typeId 人员类别主键
     * @return 人员类别
     */
    public EmployeeType selectEmployeeTypeByTypeId(Long typeId);

    /**
     * 查询人员类别列表
     * 
     * @param employeeType 人员类别
     * @return 人员类别集合
     */
    public List<EmployeeType> selectEmployeeTypeList(EmployeeType employeeType);

    /**
     * 新增人员类别
     * 
     * @param employeeType 人员类别
     * @return 结果
     */
    public int insertEmployeeType(EmployeeType employeeType);

    /**
     * 修改人员类别
     * 
     * @param employeeType 人员类别
     * @return 结果
     */
    public int updateEmployeeType(EmployeeType employeeType);

    /**
     * 批量删除人员类别
     * 
     * @param typeIds 需要删除的人员类别主键集合
     * @return 结果
     */
    public int deleteEmployeeTypeByTypeIds(Long[] typeIds);

    /**
     * 删除人员类别信息
     * 
     * @param typeId 人员类别主键
     * @return 结果
     */
    public int deleteEmployeeTypeByTypeId(Long typeId);
} 