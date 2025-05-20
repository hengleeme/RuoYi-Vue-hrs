package com.henglee.hrp.hrs.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.mapper.EmployeeTransferMapper;
import com.henglee.hrp.hrs.domain.EmployeeTransfer;
import com.henglee.hrp.hrs.service.IEmployeeTransferService;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;

/**
 * 人员异动Service业务层处理
 * 
 * @author cbh
 */
@Service
public class EmployeeTransferServiceImpl implements IEmployeeTransferService 
{
    @Autowired
    private EmployeeTransferMapper employeeTransferMapper;

    /**
     * 查询人员异动
     * 
     * @param transferId 人员异动主键
     * @return 人员异动
     */
    @Override
    public EmployeeTransfer selectEmployeeTransferByTransferId(Long transferId)
    {
        return employeeTransferMapper.selectEmployeeTransferByTransferId(transferId);
    }

    /**
     * 查询人员异动列表
     * 
     * @param employeeTransfer 人员异动
     * @return 人员异动
     */
    @Override
    public List<EmployeeTransfer> selectEmployeeTransferList(EmployeeTransfer employeeTransfer)
    {
        return employeeTransferMapper.selectEmployeeTransferList(employeeTransfer);
    }

    /**
     * 新增人员异动
     * 
     * @param employeeTransfer 人员异动
     * @return 结果
     */
    @Override
    public int insertEmployeeTransfer(EmployeeTransfer employeeTransfer)
    {
        employeeTransfer.setCreateTime(DateUtils.getNowDate());
        return employeeTransferMapper.insertEmployeeTransfer(employeeTransfer);
    }

    /**
     * 修改人员异动
     * 
     * @param employeeTransfer 人员异动
     * @return 结果
     */
    @Override
    public int updateEmployeeTransfer(EmployeeTransfer employeeTransfer)
    {
        employeeTransfer.setUpdateTime(DateUtils.getNowDate());
        return employeeTransferMapper.updateEmployeeTransfer(employeeTransfer);
    }

    /**
     * 批量删除人员异动
     * 
     * @param transferIds 需要删除的人员异动主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeTransferByTransferIds(String transferIds)
    {
        return employeeTransferMapper.deleteEmployeeTransferByTransferIds(Convert.toLongArray(transferIds));
    }

    /**
     * 删除人员异动信息
     * 
     * @param transferId 人员异动主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeTransferByTransferId(Long transferId)
    {
        return employeeTransferMapper.deleteEmployeeTransferByTransferId(transferId);
    }

    /**
     * 审核人员异动
     * 
     * @param employeeTransfer 人员异动
     * @return 结果
     */
    @Override
    public int auditEmployeeTransfer(EmployeeTransfer employeeTransfer)
    {
        employeeTransfer.setAuditTime(DateUtils.getNowDate());
        return employeeTransferMapper.updateEmployeeTransfer(employeeTransfer);
    }
} 