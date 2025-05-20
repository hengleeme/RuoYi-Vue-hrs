package com.henglee.hrp.hrs.mapper;

import java.util.List;
import com.henglee.hrp.hrs.domain.EmployeeTransfer;

/**
 * 人员异动Mapper接口
 * 
 * @author cbh
 */
public interface EmployeeTransferMapper 
{
    /**
     * 查询人员异动
     * 
     * @param transferId 人员异动主键
     * @return 人员异动
     */
    public EmployeeTransfer selectEmployeeTransferByTransferId(Long transferId);

    /**
     * 查询人员异动列表
     * 
     * @param employeeTransfer 人员异动
     * @return 人员异动集合
     */
    public List<EmployeeTransfer> selectEmployeeTransferList(EmployeeTransfer employeeTransfer);

    /**
     * 新增人员异动
     * 
     * @param employeeTransfer 人员异动
     * @return 结果
     */
    public int insertEmployeeTransfer(EmployeeTransfer employeeTransfer);

    /**
     * 修改人员异动
     * 
     * @param employeeTransfer 人员异动
     * @return 结果
     */
    public int updateEmployeeTransfer(EmployeeTransfer employeeTransfer);

    /**
     * 删除人员异动
     * 
     * @param transferId 人员异动主键
     * @return 结果
     */
    public int deleteEmployeeTransferByTransferId(Long transferId);

    /**
     * 批量删除人员异动
     * 
     * @param transferIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeeTransferByTransferIds(Long[] transferIds);
} 