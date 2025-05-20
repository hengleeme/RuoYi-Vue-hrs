package com.henglee.hrp.hrs.contract.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.contract.mapper.HrsContractChangeMapper;
import com.henglee.hrp.hrs.contract.domain.HrsContractChange;
import com.henglee.hrp.hrs.contract.service.IHrsContractChangeService;

/**
 * 合同变更记录Service业务层处理
 * 
 * @author henglee
 */
@Service
public class HrsContractChangeServiceImpl implements IHrsContractChangeService 
{
    @Autowired
    private HrsContractChangeMapper hrsContractChangeMapper;

    /**
     * 查询合同变更记录
     * 
     * @param changeId 合同变更记录主键
     * @return 合同变更记录
     */
    @Override
    public HrsContractChange selectHrsContractChangeByChangeId(Long changeId)
    {
        return hrsContractChangeMapper.selectHrsContractChangeByChangeId(changeId);
    }

    /**
     * 查询合同变更记录列表
     * 
     * @param hrsContractChange 合同变更记录
     * @return 合同变更记录
     */
    @Override
    public List<HrsContractChange> selectHrsContractChangeList(HrsContractChange hrsContractChange)
    {
        return hrsContractChangeMapper.selectHrsContractChangeList(hrsContractChange);
    }

    /**
     * 新增合同变更记录
     * 
     * @param hrsContractChange 合同变更记录
     * @return 结果
     */
    @Override
    public int insertHrsContractChange(HrsContractChange hrsContractChange)
    {
        return hrsContractChangeMapper.insertHrsContractChange(hrsContractChange);
    }

    /**
     * 修改合同变更记录
     * 
     * @param hrsContractChange 合同变更记录
     * @return 结果
     */
    @Override
    public int updateHrsContractChange(HrsContractChange hrsContractChange)
    {
        return hrsContractChangeMapper.updateHrsContractChange(hrsContractChange);
    }

    /**
     * 批量删除合同变更记录
     * 
     * @param changeIds 需要删除的合同变更记录主键
     * @return 结果
     */
    @Override
    public int deleteHrsContractChangeByChangeIds(Long[] changeIds)
    {
        return hrsContractChangeMapper.deleteHrsContractChangeByChangeIds(changeIds);
    }

    /**
     * 删除合同变更记录信息
     * 
     * @param changeId 合同变更记录主键
     * @return 结果
     */
    @Override
    public int deleteHrsContractChangeByChangeId(Long changeId)
    {
        return hrsContractChangeMapper.deleteHrsContractChangeByChangeId(changeId);
    }

    /**
     * 查询合同的变更记录
     * 
     * @param contractId 合同ID
     * @return 合同变更记录集合
     */
    @Override
    public List<HrsContractChange> selectHrsContractChangeByContractId(Long contractId)
    {
        return hrsContractChangeMapper.selectHrsContractChangeByContractId(contractId);
    }
} 