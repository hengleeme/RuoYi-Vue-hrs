package com.henglee.hrp.hrs.employee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.employee.mapper.HrsEmployeeMapper;
import com.henglee.hrp.hrs.employee.domain.HrsEmployee;
import com.henglee.hrp.hrs.employee.service.IHrsEmployeeService;

/**
 * 人员基本信息Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsEmployeeServiceImpl implements IHrsEmployeeService 
{
    @Autowired
    private HrsEmployeeMapper hrsEmployeeMapper;

    /**
     * 查询人员基本信息
     * 
     * @param employeeId 人员基本信息主键
     * @return 人员基本信息
     */
    @Override
    public HrsEmployee selectHrsEmployeeByEmployeeId(Long employeeId)
    {
        return hrsEmployeeMapper.selectHrsEmployeeByEmployeeId(employeeId);
    }

    /**
     * 查询人员基本信息列表
     * 
     * @param hrsEmployee 人员基本信息
     * @return 人员基本信息
     */
    @Override
    public List<HrsEmployee> selectHrsEmployeeList(HrsEmployee hrsEmployee)
    {
        return hrsEmployeeMapper.selectHrsEmployeeList(hrsEmployee);
    }

    /**
     * 新增人员基本信息
     * 
     * @param hrsEmployee 人员基本信息
     * @return 结果
     */
    @Override
    public int insertHrsEmployee(HrsEmployee hrsEmployee)
    {
        return hrsEmployeeMapper.insertHrsEmployee(hrsEmployee);
    }

    /**
     * 修改人员基本信息
     * 
     * @param hrsEmployee 人员基本信息
     * @return 结果
     */
    @Override
    public int updateHrsEmployee(HrsEmployee hrsEmployee)
    {
        return hrsEmployeeMapper.updateHrsEmployee(hrsEmployee);
    }

    /**
     * 批量删除人员基本信息
     * 
     * @param employeeIds 需要删除的人员基本信息主键
     * @return 结果
     */
    @Override
    public int deleteHrsEmployeeByEmployeeIds(Long[] employeeIds)
    {
        return hrsEmployeeMapper.deleteHrsEmployeeByEmployeeIds(employeeIds);
    }

    /**
     * 删除人员基本信息信息
     * 
     * @param employeeId 人员基本信息主键
     * @return 结果
     */
    @Override
    public int deleteHrsEmployeeByEmployeeId(Long employeeId)
    {
        return hrsEmployeeMapper.deleteHrsEmployeeByEmployeeId(employeeId);
    }

    /**
     * 根据工号查询人员信息
     * 
     * @param employeeNo 工号
     * @return 人员基本信息
     */
    @Override
    public HrsEmployee selectHrsEmployeeByEmployeeNo(String employeeNo)
    {
        return hrsEmployeeMapper.selectHrsEmployeeByEmployeeNo(employeeNo);
    }

    /**
     * 根据身份证号查询人员信息
     * 
     * @param idCard 身份证号
     * @return 人员基本信息
     */
    @Override
    public HrsEmployee selectHrsEmployeeByIdCard(String idCard)
    {
        return hrsEmployeeMapper.selectHrsEmployeeByIdCard(idCard);
    }

    /**
     * 更新人员工龄
     * 
     * @param employeeId 人员ID
     * @return 结果
     */
    @Override
    public int updateHrsEmployeeWorkYears(Long employeeId)
    {
        return hrsEmployeeMapper.updateHrsEmployeeWorkYears(employeeId);
    }

    /**
     * 批量更新人员工龄
     * 
     * @return 结果
     */
    @Override
    public int updateHrsEmployeeWorkYearsBatch()
    {
        List<HrsEmployee> employeeList = hrsEmployeeMapper.selectHrsEmployeeList(new HrsEmployee());
        int rows = 0;
        for (HrsEmployee employee : employeeList)
        {
            rows += hrsEmployeeMapper.updateHrsEmployeeWorkYears(employee.getEmployeeId());
        }
        return rows;
    }
} 