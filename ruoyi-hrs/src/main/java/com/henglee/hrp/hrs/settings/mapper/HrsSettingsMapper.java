package com.henglee.hrp.hrs.settings.mapper;

import java.util.List;
import com.henglee.hrp.hrs.settings.domain.HrsSettings;

/**
 * 系统设置Mapper接口
 * 
 * @author cbh
 */
public interface HrsSettingsMapper 
{
    /**
     * 查询系统设置
     * 
     * @param settingsId 系统设置主键
     * @return 系统设置
     */
    public HrsSettings selectHrsSettingsBySettingsId(Long settingsId);

    /**
     * 查询系统设置列表
     * 
     * @param hrsSettings 系统设置
     * @return 系统设置集合
     */
    public List<HrsSettings> selectHrsSettingsList(HrsSettings hrsSettings);

    /**
     * 新增系统设置
     * 
     * @param hrsSettings 系统设置
     * @return 结果
     */
    public int insertHrsSettings(HrsSettings hrsSettings);

    /**
     * 修改系统设置
     * 
     * @param hrsSettings 系统设置
     * @return 结果
     */
    public int updateHrsSettings(HrsSettings hrsSettings);

    /**
     * 删除系统设置
     * 
     * @param settingsId 系统设置主键
     * @return 结果
     */
    public int deleteHrsSettingsBySettingsId(Long settingsId);

    /**
     * 批量删除系统设置
     * 
     * @param settingsIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsSettingsBySettingsIds(Long[] settingsIds);
} 