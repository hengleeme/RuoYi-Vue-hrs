package com.henglee.hrp.hrs.personnel.mapper;

import java.util.List;
import com.henglee.hrp.hrs.personnel.domain.HrsPersonnel;

/**
 * 人事管理Mapper接口
 * 
 * @author cbh
 */
public interface HrsPersonnelMapper 
{
    /**
     * 查询人事管理
     * 
     * @param personnelId 人事管理主键
     * @return 人事管理
     */
    public HrsPersonnel selectHrsPersonnelByPersonnelId(Long personnelId);

    /**
     * 查询人事管理列表
     * 
     * @param hrsPersonnel 人事管理
     * @return 人事管理集合
     */
    public List<HrsPersonnel> selectHrsPersonnelList(HrsPersonnel hrsPersonnel);

    /**
     * 新增人事管理
     * 
     * @param hrsPersonnel 人事管理
     * @return 结果
     */
    public int insertHrsPersonnel(HrsPersonnel hrsPersonnel);

    /**
     * 修改人事管理
     * 
     * @param hrsPersonnel 人事管理
     * @return 结果
     */
    public int updateHrsPersonnel(HrsPersonnel hrsPersonnel);

    /**
     * 删除人事管理
     * 
     * @param personnelId 人事管理主键
     * @return 结果
     */
    public int deleteHrsPersonnelByPersonnelId(Long personnelId);

    /**
     * 批量删除人事管理
     * 
     * @param personnelIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsPersonnelByPersonnelIds(Long[] personnelIds);
} 