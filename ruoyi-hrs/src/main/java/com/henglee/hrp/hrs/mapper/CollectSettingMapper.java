package com.henglee.hrp.hrs.mapper;

import java.util.List;
import com.henglee.hrp.hrs.domain.CollectSetting;

/**
 * 信息采集设置Mapper接口
 * 
 * @author cbh
 */
public interface CollectSettingMapper 
{
    /**
     * 查询信息采集设置
     * 
     * @param settingId 信息采集设置主键
     * @return 信息采集设置
     */
    public CollectSetting selectCollectSettingBySettingId(Long settingId);

    /**
     * 查询信息采集设置列表
     * 
     * @param collectSetting 信息采集设置
     * @return 信息采集设置集合
     */
    public List<CollectSetting> selectCollectSettingList(CollectSetting collectSetting);

    /**
     * 新增信息采集设置
     * 
     * @param collectSetting 信息采集设置
     * @return 结果
     */
    public int insertCollectSetting(CollectSetting collectSetting);

    /**
     * 修改信息采集设置
     * 
     * @param collectSetting 信息采集设置
     * @return 结果
     */
    public int updateCollectSetting(CollectSetting collectSetting);

    /**
     * 删除信息采集设置
     * 
     * @param settingId 信息采集设置主键
     * @return 结果
     */
    public int deleteCollectSettingBySettingId(Long settingId);

    /**
     * 批量删除信息采集设置
     * 
     * @param settingIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCollectSettingBySettingIds(Long[] settingIds);
} 