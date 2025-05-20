package com.henglee.hrp.hrs.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.mapper.CollectSettingMapper;
import com.henglee.hrp.hrs.domain.CollectSetting;
import com.henglee.hrp.hrs.service.ICollectSettingService;

/**
 * 信息采集设置Service业务层处理
 * 
 * @author cbh
 */
@Service
public class CollectSettingServiceImpl implements ICollectSettingService 
{
    @Autowired
    private CollectSettingMapper collectSettingMapper;

    /**
     * 查询信息采集设置
     * 
     * @param settingId 信息采集设置主键
     * @return 信息采集设置
     */
    @Override
    public CollectSetting selectCollectSettingBySettingId(Long settingId)
    {
        return collectSettingMapper.selectCollectSettingBySettingId(settingId);
    }

    /**
     * 查询信息采集设置列表
     * 
     * @param collectSetting 信息采集设置
     * @return 信息采集设置
     */
    @Override
    public List<CollectSetting> selectCollectSettingList(CollectSetting collectSetting)
    {
        return collectSettingMapper.selectCollectSettingList(collectSetting);
    }

    /**
     * 新增信息采集设置
     * 
     * @param collectSetting 信息采集设置
     * @return 结果
     */
    @Override
    public int insertCollectSetting(CollectSetting collectSetting)
    {
        return collectSettingMapper.insertCollectSetting(collectSetting);
    }

    /**
     * 修改信息采集设置
     * 
     * @param collectSetting 信息采集设置
     * @return 结果
     */
    @Override
    public int updateCollectSetting(CollectSetting collectSetting)
    {
        return collectSettingMapper.updateCollectSetting(collectSetting);
    }

    /**
     * 批量删除信息采集设置
     * 
     * @param settingIds 需要删除的信息采集设置主键
     * @return 结果
     */
    @Override
    public int deleteCollectSettingBySettingIds(Long[] settingIds)
    {
        return collectSettingMapper.deleteCollectSettingBySettingIds(settingIds);
    }

    /**
     * 删除信息采集设置信息
     * 
     * @param settingId 信息采集设置主键
     * @return 结果
     */
    @Override
    public int deleteCollectSettingBySettingId(Long settingId)
    {
        return collectSettingMapper.deleteCollectSettingBySettingId(settingId);
    }
} 