package com.henglee.hrp.hrs.contract.service;

import java.util.List;
import com.henglee.hrp.hrs.contract.domain.HrsContractChange;

/**
 * 合同变更记录Service接口
 * 
 * @author henglee
 */
public interface IHrsContractChangeService 
{
    /**
     * 查询合同变更记录
     * 
     * @param changeId 合同变更记录主键
     * @return 合同变更记录
     */
    public HrsContractChange selectHrsContractChangeByChangeId(Long changeId);

    /**
     * 查询合同变更记录列表
     * 
     * @param hrsContractChange 合同变更记录
     * @return 合同变更记录集合
     */
    public List<HrsContractChange> selectHrsContractChangeList(HrsContractChange hrsContractChange);

    /**
     * 新增合同变更记录
     * 
     * @param hrsContractChange 合同变更记录
     * @return 结果
     */
    public int insertHrsContractChange(HrsContractChange hrsContractChange);

    /**
     * 修改合同变更记录
     * 
     * @param hrsContractChange 合同变更记录
     * @return 结果
     */
    public int updateHrsContractChange(HrsContractChange hrsContractChange);

    /**
     * 批量删除合同变更记录
     * 
     * @param changeIds 需要删除的合同变更记录主键集合
     * @return 结果
     */
    public int deleteHrsContractChangeByChangeIds(Long[] changeIds);

    /**
     * 删除合同变更记录信息
     * 
     * @param changeId 合同变更记录主键
     * @return 结果
     */
    public int deleteHrsContractChangeByChangeId(Long changeId);

    /**
     * 查询合同的变更记录
     * 
     * @param contractId 合同ID
     * @return 合同变更记录集合
     */
    public List<HrsContractChange> selectHrsContractChangeByContractId(Long contractId);
} 