package com.henglee.hrp.hrs.contract.mapper;

import java.util.List;
import com.henglee.hrp.hrs.contract.domain.HrsContract;

/**
 * 合同信息Mapper接口
 * 
 * @author henglee
 */
public interface HrsContractMapper 
{
    /**
     * 查询合同信息
     * 
     * @param contractId 合同信息主键
     * @return 合同信息
     */
    public HrsContract selectHrsContractByContractId(Long contractId);

    /**
     * 查询合同信息列表
     * 
     * @param hrsContract 合同信息
     * @return 合同信息集合
     */
    public List<HrsContract> selectHrsContractList(HrsContract hrsContract);

    /**
     * 新增合同信息
     * 
     * @param hrsContract 合同信息
     * @return 结果
     */
    public int insertHrsContract(HrsContract hrsContract);

    /**
     * 修改合同信息
     * 
     * @param hrsContract 合同信息
     * @return 结果
     */
    public int updateHrsContract(HrsContract hrsContract);

    /**
     * 删除合同信息
     * 
     * @param contractId 合同信息主键
     * @return 结果
     */
    public int deleteHrsContractByContractId(Long contractId);

    /**
     * 批量删除合同信息
     * 
     * @param contractIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsContractByContractIds(Long[] contractIds);

    /**
     * 查询即将到期的合同
     * 
     * @param days 提前提醒天数
     * @return 合同信息集合
     */
    public List<HrsContract> selectExpiringContracts(int days);

    /**
     * 查询即将结束试用期的合同
     * 
     * @param days 提前提醒天数
     * @return 合同信息集合
     */
    public List<HrsContract> selectExpiringProbationContracts(int days);
} 