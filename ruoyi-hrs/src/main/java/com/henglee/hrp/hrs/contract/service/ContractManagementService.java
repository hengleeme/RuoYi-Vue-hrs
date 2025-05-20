package com.henglee.hrp.hrs.contract.service;

import com.henglee.hrp.hrs.contract.domain.Contract;
import java.util.List;

/**
 * 合同管理服务接口
 * 
 * @author cbh
 */
public interface ContractManagementService {
    /**
     * 获取合同列表
     * 
     * @return 合同列表
     */
    List<Contract> getContractList();

    /**
     * 添加合同
     * 
     * @param contract 合同信息
     */
    void addContract(Contract contract);

    /**
     * 更新合同
     * 
     * @param contract 合同信息
     */
    void updateContract(Contract contract);

    /**
     * 删除合同
     * 
     * @param id 合同ID
     */
    void deleteContract(Long id);
} 