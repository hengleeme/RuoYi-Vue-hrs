package com.henglee.hrp.hrs.contract.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.contract.mapper.HrsContractMapper;
import com.henglee.hrp.hrs.contract.domain.HrsContract;
import com.henglee.hrp.hrs.contract.service.IHrsContractService;

/**
 * 合同管理Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsContractServiceImpl implements IHrsContractService 
{
    @Autowired
    private HrsContractMapper hrsContractMapper;

    /**
     * 查询合同管理
     * 
     * @param contractId 合同管理主键
     * @return 合同管理
     */
    @Override
    public HrsContract selectHrsContractByContractId(Long contractId)
    {
        return hrsContractMapper.selectHrsContractByContractId(contractId);
    }

    /**
     * 查询合同管理列表
     * 
     * @param hrsContract 合同管理
     * @return 合同管理
     */
    @Override
    public List<HrsContract> selectHrsContractList(HrsContract hrsContract)
    {
        return hrsContractMapper.selectHrsContractList(hrsContract);
    }

    /**
     * 新增合同管理
     * 
     * @param hrsContract 合同管理
     * @return 结果
     */
    @Override
    public int insertHrsContract(HrsContract hrsContract)
    {
        return hrsContractMapper.insertHrsContract(hrsContract);
    }

    /**
     * 修改合同管理
     * 
     * @param hrsContract 合同管理
     * @return 结果
     */
    @Override
    public int updateHrsContract(HrsContract hrsContract)
    {
        return hrsContractMapper.updateHrsContract(hrsContract);
    }

    /**
     * 批量删除合同管理
     * 
     * @param contractIds 需要删除的合同管理主键
     * @return 结果
     */
    @Override
    public int deleteHrsContractByContractIds(Long[] contractIds)
    {
        return hrsContractMapper.deleteHrsContractByContractIds(contractIds);
    }

    /**
     * 删除合同管理信息
     * 
     * @param contractId 合同管理主键
     * @return 结果
     */
    @Override
    public int deleteHrsContractByContractId(Long contractId)
    {
        return hrsContractMapper.deleteHrsContractByContractId(contractId);
    }
} 