package com.henglee.hrp.hrs.settings.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 系统设置对象 hrs_settings
 * 
 * @author cbh
 */
public class HrsSettings extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设置ID */
    private Long settingsId;

    /** 设置类型 */
    @Excel(name = "设置类型")
    private String settingsType;

    /** 设置键 */
    @Excel(name = "设置键")
    private String settingsKey;

    /** 设置值 */
    @Excel(name = "设置值")
    private String settingsValue;

    /** 设置描述 */
    @Excel(name = "设置描述")
    private String settingsDesc;

    /** 是否系统内置（0否 1是） */
    @Excel(name = "是否系统内置", readConverterExp = "0=否,1=是")
    private String isSystem;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setSettingsId(Long settingsId) 
    {
        this.settingsId = settingsId;
    }

    public Long getSettingsId() 
    {
        return settingsId;
    }

    public void setSettingsType(String settingsType) 
    {
        this.settingsType = settingsType;
    }

    public String getSettingsType() 
    {
        return settingsType;
    }

    public void setSettingsKey(String settingsKey) 
    {
        this.settingsKey = settingsKey;
    }

    public String getSettingsKey() 
    {
        return settingsKey;
    }

    public void setSettingsValue(String settingsValue) 
    {
        this.settingsValue = settingsValue;
    }

    public String getSettingsValue() 
    {
        return settingsValue;
    }

    public void setSettingsDesc(String settingsDesc) 
    {
        this.settingsDesc = settingsDesc;
    }

    public String getSettingsDesc() 
    {
        return settingsDesc;
    }

    public void setIsSystem(String isSystem) 
    {
        this.isSystem = isSystem;
    }

    public String getIsSystem() 
    {
        return isSystem;
    }

    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("settingsId", getSettingsId())
            .append("settingsType", getSettingsType())
            .append("settingsKey", getSettingsKey())
            .append("settingsValue", getSettingsValue())
            .append("settingsDesc", getSettingsDesc())
            .append("isSystem", getIsSystem())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
} 