package com.henglee.hrp.hrs.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 信息采集设置对象 hrs_collect_setting
 * 
 * @author cbh
 */
public class CollectSetting extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设置ID */
    private Long settingId;

    /** 设置名称 */
    @Excel(name = "设置名称")
    private String settingName;

    /** 设置类型 */
    @Excel(name = "设置类型")
    private String settingType;

    /** 是否必填（0否 1是） */
    @Excel(name = "是否必填", readConverterExp = "0=否,1=是")
    private String isRequired;

    /** 是否显示（0否 1是） */
    @Excel(name = "是否显示", readConverterExp = "0=否,1=是")
    private String isVisible;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setSettingId(Long settingId) 
    {
        this.settingId = settingId;
    }

    public Long getSettingId() 
    {
        return settingId;
    }

    public void setSettingName(String settingName) 
    {
        this.settingName = settingName;
    }

    public String getSettingName() 
    {
        return settingName;
    }

    public void setSettingType(String settingType) 
    {
        this.settingType = settingType;
    }

    public String getSettingType() 
    {
        return settingType;
    }

    public void setIsRequired(String isRequired) 
    {
        this.isRequired = isRequired;
    }

    public String getIsRequired() 
    {
        return isRequired;
    }

    public void setIsVisible(String isVisible) 
    {
        this.isVisible = isVisible;
    }

    public String getIsVisible() 
    {
        return isVisible;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("settingId", getSettingId())
            .append("settingName", getSettingName())
            .append("settingType", getSettingType())
            .append("isRequired", getIsRequired())
            .append("isVisible", getIsVisible())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
} 