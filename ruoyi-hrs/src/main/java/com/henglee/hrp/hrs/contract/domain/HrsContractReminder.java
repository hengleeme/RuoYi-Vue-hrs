package com.henglee.hrp.hrs.contract.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 合同到期提醒对象 hrs_contract_reminder
 * 
 * @author henglee
 */
public class HrsContractReminder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 提醒ID */
    private Long reminderId;

    /** 合同ID */
    private Long contractId;

    /** 提醒类型（1到期提醒 2试用期到期提醒） */
    @Excel(name = "提醒类型", readConverterExp = "1=到期提醒,2=试用期到期提醒")
    private String reminderType;

    /** 提醒日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "提醒日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reminderDate;

    /** 提醒状态（0未处理 1已处理） */
    @Excel(name = "提醒状态", readConverterExp = "0=未处理,1=已处理")
    private String reminderStatus;

    /** 处理结果 */
    @Excel(name = "处理结果")
    private String handleResult;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setReminderId(Long reminderId) 
    {
        this.reminderId = reminderId;
    }

    public Long getReminderId() 
    {
        return reminderId;
    }

    public void setContractId(Long contractId) 
    {
        this.contractId = contractId;
    }

    public Long getContractId() 
    {
        return contractId;
    }

    public void setReminderType(String reminderType) 
    {
        this.reminderType = reminderType;
    }

    public String getReminderType() 
    {
        return reminderType;
    }

    public void setReminderDate(Date reminderDate) 
    {
        this.reminderDate = reminderDate;
    }

    public Date getReminderDate() 
    {
        return reminderDate;
    }

    public void setReminderStatus(String reminderStatus) 
    {
        this.reminderStatus = reminderStatus;
    }

    public String getReminderStatus() 
    {
        return reminderStatus;
    }

    public void setHandleResult(String handleResult) 
    {
        this.handleResult = handleResult;
    }

    public String getHandleResult() 
    {
        return handleResult;
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
            .append("reminderId", getReminderId())
            .append("contractId", getContractId())
            .append("reminderType", getReminderType())
            .append("reminderDate", getReminderDate())
            .append("reminderStatus", getReminderStatus())
            .append("handleResult", getHandleResult())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
} 