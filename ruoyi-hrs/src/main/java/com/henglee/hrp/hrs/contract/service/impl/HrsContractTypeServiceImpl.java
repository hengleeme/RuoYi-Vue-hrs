package com.henglee.hrp.hrs.contract.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.contract.mapper.HrsContractTypeMapper;
import com.henglee.hrp.hrs.contract.domain.HrsContractType;
import com.henglee.hrp.hrs.contract.service.IHrsContractTypeService;

/**
 * 合同类型Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsContractTypeServiceImpl implements IHrsContractTypeService 
{
    @Autowired
    private HrsContractTypeMapper hrsContractTypeMapper;

    /**
     * 查询合同类型
     * 
     * @param typeId 合同类型主键
     * @return 合同类型
     */
    @Override
    public HrsContractType selectHrsContractTypeByTypeId(Long typeId)
    {
        return hrsContractTypeMapper.selectHrsContractTypeByTypeId(typeId);
    }

    /**
     * 查询合同类型列表
     * 
     * @param hrsContractType 合同类型
     * @return 合同类型
     */
    @Override
    public List<HrsContractType> selectHrsContractTypeList(HrsContractType hrsContractType)
    {
        return hrsContractTypeMapper.selectHrsContractTypeList(hrsContractType);
    }

    /**
     * 新增合同类型
     * 
     * @param hrsContractType 合同类型
     * @return 结果
     */
    @Override
    public int insertHrsContractType(HrsContractType hrsContractType)
    {
        return hrsContractTypeMapper.insertHrsContractType(hrsContractType);
    }

    /**
     * 修改合同类型
     * 
     * @param hrsContractType 合同类型
     * @return 结果
     */
    @Override
    public int updateHrsContractType(HrsContractType hrsContractType)
    {
        return hrsContractTypeMapper.updateHrsContractType(hrsContractType);
    }

    /**
     * 批量删除合同类型
     * 
     * @param typeIds 需要删除的合同类型主键
     * @return 结果
     */
    @Override
    public int deleteHrsContractTypeByTypeIds(Long[] typeIds)
    {
        return hrsContractTypeMapper.deleteHrsContractTypeByTypeIds(typeIds);
    }

    /**
     * 删除合同类型信息
     * 
     * @param typeId 合同类型主键
     * @return 结果
     */
    @Override
    public int deleteHrsContractTypeByTypeId(Long typeId)
    {
        return hrsContractTypeMapper.deleteHrsContractTypeByTypeId(typeId);
    }
} 