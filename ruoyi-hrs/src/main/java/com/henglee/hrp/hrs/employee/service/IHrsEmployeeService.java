package com.henglee.hrp.hrs.employee.service;

import java.util.List;
import com.henglee.hrp.hrs.employee.domain.HrsEmployee;

/**
 * 人员基本信息Service接口
 * 
 * @author cbh
 */
public interface IHrsEmployeeService 
{
    /**
     * 查询人员基本信息
     * 
     * @param employeeId 人员基本信息主键
     * @return 人员基本信息
     */
    public HrsEmployee selectHrsEmployeeByEmployeeId(Long employeeId);

    /**
     * 查询人员基本信息列表
     * 
     * @param hrsEmployee 人员基本信息
     * @return 人员基本信息集合
     */
    public List<HrsEmployee> selectHrsEmployeeList(HrsEmployee hrsEmployee);

    /**
     * 新增人员基本信息
     * 
     * @param hrsEmployee 人员基本信息
     * @return 结果
     */
    public int insertHrsEmployee(HrsEmployee hrsEmployee);

    /**
     * 修改人员基本信息
     * 
     * @param hrsEmployee 人员基本信息
     * @return 结果
     */
    public int updateHrsEmployee(HrsEmployee hrsEmployee);

    /**
     * 批量删除人员基本信息
     * 
     * @param employeeIds 需要删除的人员基本信息主键集合
     * @return 结果
     */
    public int deleteHrsEmployeeByEmployeeIds(Long[] employeeIds);

    /**
     * 删除人员基本信息信息
     * 
     * @param employeeId 人员基本信息主键
     * @return 结果
     */
    public int deleteHrsEmployeeByEmployeeId(Long employeeId);

    /**
     * 根据工号查询人员信息
     * 
     * @param employeeNo 工号
     * @return 人员基本信息
     */
    public HrsEmployee selectHrsEmployeeByEmployeeNo(String employeeNo);

    /**
     * 根据身份证号查询人员信息
     * 
     * @param idCard 身份证号
     * @return 人员基本信息
     */
    public HrsEmployee selectHrsEmployeeByIdCard(String idCard);

    /**
     * 更新人员工龄
     * 
     * @param employeeId 人员ID
     * @return 结果
     */
    public int updateHrsEmployeeWorkYears(Long employeeId);

    /**
     * 批量更新人员工龄
     * 
     * @return 结果
     */
    public int updateHrsEmployeeWorkYearsBatch();
} 