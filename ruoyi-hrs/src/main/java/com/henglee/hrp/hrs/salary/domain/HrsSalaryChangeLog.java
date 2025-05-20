package com.henglee.hrp.hrs.salary.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 薪酬变更日志对象 hrs_salary_change_log
 * 
 * @author henglee
 */
public class HrsSalaryChangeLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 日志ID */
    private Long logId;

    /** 变更类型（1标准 2体系） */
    @Excel(name = "变更类型", readConverterExp = "1=标准,2=体系")
    private String changeType;

    /** 变更对象ID */
    private Long changeId;

    /** 变更对象名称 */
    @Excel(name = "变更对象名称")
    private String changeName;

    /** 变更字段 */
    @Excel(name = "变更字段")
    private String changeField;

    /** 原值 */
    @Excel(name = "原值")
    private String oldValue;

    /** 新值 */
    @Excel(name = "新值")
    private String newValue;

    /** 变更原因 */
    @Excel(name = "变更原因")
    private String changeReason;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setLogId(Long logId) 
    {
        this.logId = logId;
    }

    public Long getLogId() 
    {
        return logId;
    }

    public void setChangeType(String changeType) 
    {
        this.changeType = changeType;
    }

    public String getChangeType() 
    {
        return changeType;
    }

    public void setChangeId(Long changeId) 
    {
        this.changeId = changeId;
    }

    public Long getChangeId() 
    {
        return changeId;
    }

    public void setChangeName(String changeName) 
    {
        this.changeName = changeName;
    }

    public String getChangeName() 
    {
        return changeName;
    }

    public void setChangeField(String changeField) 
    {
        this.changeField = changeField;
    }

    public String getChangeField() 
    {
        return changeField;
    }

    public void setOldValue(String oldValue) 
    {
        this.oldValue = oldValue;
    }

    public String getOldValue() 
    {
        return oldValue;
    }

    public void setNewValue(String newValue) 
    {
        this.newValue = newValue;
    }

    public String getNewValue() 
    {
        return newValue;
    }

    public void setChangeReason(String changeReason) 
    {
        this.changeReason = changeReason;
    }

    public String getChangeReason() 
    {
        return changeReason;
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
            .append("logId", getLogId())
            .append("changeType", getChangeType())
            .append("changeId", getChangeId())
            .append("changeName", getChangeName())
            .append("changeField", getChangeField())
            .append("oldValue", getOldValue())
            .append("newValue", getNewValue())
            .append("changeReason", getChangeReason())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
} 