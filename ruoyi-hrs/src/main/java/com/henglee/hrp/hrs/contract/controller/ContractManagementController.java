package com.henglee.hrp.hrs.contract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.henglee.hrp.hrs.contract.service.ContractManagementService;
import com.henglee.hrp.hrs.contract.domain.Contract;
import java.util.List;

/**
 * 合同管理控制器
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/contract")
public class ContractManagementController {

    @Autowired
    private ContractManagementService contractManagementService;

    /**
     * 获取合同列表
     * 
     * @return 合同列表
     */
    @GetMapping("/list")
    public List<Contract> getContractList() {
        return contractManagementService.getContractList();
    }

    /**
     * 添加合同
     * 
     * @param contract 合同信息
     */
    @PostMapping("/add")
    public void addContract(@RequestBody Contract contract) {
        contractManagementService.addContract(contract);
    }

    /**
     * 更新合同
     * 
     * @param contract 合同信息
     */
    @PutMapping("/update")
    public void updateContract(@RequestBody Contract contract) {
        contractManagementService.updateContract(contract);
    }

    /**
     * 删除合同
     * 
     * @param id 合同ID
     */
    @DeleteMapping("/delete/{id}")
    public void deleteContract(@PathVariable Long id) {
        contractManagementService.deleteContract(id);
    }
} 