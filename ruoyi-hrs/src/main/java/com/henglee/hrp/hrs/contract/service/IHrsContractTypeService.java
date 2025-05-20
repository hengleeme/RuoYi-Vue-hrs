package com.henglee.hrp.hrs.contract.service;

import java.util.List;
import com.henglee.hrp.hrs.contract.domain.HrsContractType;

/**
 * 合同类型Service接口
 * 
 * @author cbh
 */
public interface IHrsContractTypeService 
{
    /**
     * 查询合同类型
     * 
     * @param typeId 合同类型主键
     * @return 合同类型
     */
    public HrsContractType selectHrsContractTypeByTypeId(Long typeId);

    /**
     * 查询合同类型列表
     * 
     * @param hrsContractType 合同类型
     * @return 合同类型集合
     */
    public List<HrsContractType> selectHrsContractTypeList(HrsContractType hrsContractType);

    /**
     * 新增合同类型
     * 
     * @param hrsContractType 合同类型
     * @return 结果
     */
    public int insertHrsContractType(HrsContractType hrsContractType);

    /**
     * 修改合同类型
     * 
     * @param hrsContractType 合同类型
     * @return 结果
     */
    public int updateHrsContractType(HrsContractType hrsContractType);

    /**
     * 批量删除合同类型
     * 
     * @param typeIds 需要删除的合同类型主键集合
     * @return 结果
     */
    public int deleteHrsContractTypeByTypeIds(Long[] typeIds);

    /**
     * 删除合同类型信息
     * 
     * @param typeId 合同类型主键
     * @return 结果
     */
    public int deleteHrsContractTypeByTypeId(Long typeId);
} 