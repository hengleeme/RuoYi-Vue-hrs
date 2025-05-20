package com.henglee.hrp.hrs.settings.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.settings.mapper.HrsSettingsMapper;
import com.henglee.hrp.hrs.settings.domain.HrsSettings;
import com.henglee.hrp.hrs.settings.service.IHrsSettingsService;

/**
 * 系统设置Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsSettingsServiceImpl implements IHrsSettingsService 
{
    @Autowired
    private HrsSettingsMapper hrsSettingsMapper;

    /**
     * 查询系统设置
     * 
     * @param settingsId 系统设置主键
     * @return 系统设置
     */
    @Override
    public HrsSettings selectHrsSettingsBySettingsId(Long settingsId)
    {
        return hrsSettingsMapper.selectHrsSettingsBySettingsId(settingsId);
    }

    /**
     * 查询系统设置列表
     * 
     * @param hrsSettings 系统设置
     * @return 系统设置
     */
    @Override
    public List<HrsSettings> selectHrsSettingsList(HrsSettings hrsSettings)
    {
        return hrsSettingsMapper.selectHrsSettingsList(hrsSettings);
    }

    /**
     * 新增系统设置
     * 
     * @param hrsSettings 系统设置
     * @return 结果
     */
    @Override
    public int insertHrsSettings(HrsSettings hrsSettings)
    {
        return hrsSettingsMapper.insertHrsSettings(hrsSettings);
    }

    /**
     * 修改系统设置
     * 
     * @param hrsSettings 系统设置
     * @return 结果
     */
    @Override
    public int updateHrsSettings(HrsSettings hrsSettings)
    {
        return hrsSettingsMapper.updateHrsSettings(hrsSettings);
    }

    /**
     * 批量删除系统设置
     * 
     * @param settingsIds 需要删除的系统设置主键
     * @return 结果
     */
    @Override
    public int deleteHrsSettingsBySettingsIds(Long[] settingsIds)
    {
        return hrsSettingsMapper.deleteHrsSettingsBySettingsIds(settingsIds);
    }

    /**
     * 删除系统设置信息
     * 
     * @param settingsId 系统设置主键
     * @return 结果
     */
    @Override
    public int deleteHrsSettingsBySettingsId(Long settingsId)
    {
        return hrsSettingsMapper.deleteHrsSettingsBySettingsId(settingsId);
    }
} 