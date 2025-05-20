package com.henglee.hrp.hrs.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人员信息变更日志对象 hrs_employee_log
 * 
 * @author cbh
 */
public class EmployeeLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 日志ID */
    private Long logId;

    /** 人员ID */
    @Excel(name = "人员ID")
    private Long employeeId;

    /** 变更类型 */
    @Excel(name = "变更类型")
    private String changeType;

    /** 变更字段 */
    @Excel(name = "变更字段")
    private String changeField;

    /** 原值 */
    @Excel(name = "原值")
    private String oldValue;

    /** 新值 */
    @Excel(name = "新值")
    private String newValue;

    /** 变更时间 */
    @Excel(name = "变更时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String changeTime;

    /** 变更人 */
    @Excel(name = "变更人")
    private String changeBy;

    public void setLogId(Long logId) 
    {
        this.logId = logId;
    }

    public Long getLogId() 
    {
        return logId;
    }

    public void setEmployeeId(Long employeeId) 
    {
        this.employeeId = employeeId;
    }

    public Long getEmployeeId() 
    {
        return employeeId;
    }

    public void setChangeType(String changeType) 
    {
        this.changeType = changeType;
    }

    public String getChangeType() 
    {
        return changeType;
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

    public void setChangeTime(String changeTime) 
    {
        this.changeTime = changeTime;
    }

    public String getChangeTime() 
    {
        return changeTime;
    }

    public void setChangeBy(String changeBy) 
    {
        this.changeBy = changeBy;
    }

    public String getChangeBy() 
    {
        return changeBy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("logId", getLogId())
            .append("employeeId", getEmployeeId())
            .append("changeType", getChangeType())
            .append("changeField", getChangeField())
            .append("oldValue", getOldValue())
            .append("newValue", getNewValue())
            .append("changeTime", getChangeTime())
            .append("changeBy", getChangeBy())
            .append("remark", getRemark())
            .toString();
    }
} 