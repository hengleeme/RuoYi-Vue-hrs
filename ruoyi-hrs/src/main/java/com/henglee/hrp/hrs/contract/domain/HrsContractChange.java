package com.henglee.hrp.hrs.contract.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 合同变更记录对象 hrs_contract_change
 * 
 * @author henglee
 */
public class HrsContractChange extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 变更ID */
    private Long changeId;

    /** 合同ID */
    private Long contractId;

    /** 变更类型（1续签 2变更 3解除 4终止） */
    @Excel(name = "变更类型", readConverterExp = "1=续签,2=变更,3=解除,4=终止")
    private String changeType;

    /** 变更原因 */
    @Excel(name = "变更原因")
    private String changeReason;

    /** 变更日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "变更日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date changeDate;

    /** 变更文件 */
    private String changeFile;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setChangeId(Long changeId) 
    {
        this.changeId = changeId;
    }

    public Long getChangeId() 
    {
        return changeId;
    }

    public void setContractId(Long contractId) 
    {
        this.contractId = contractId;
    }

    public Long getContractId() 
    {
        return contractId;
    }

    public void setChangeType(String changeType) 
    {
        this.changeType = changeType;
    }

    public String getChangeType() 
    {
        return changeType;
    }

    public void setChangeReason(String changeReason) 
    {
        this.changeReason = changeReason;
    }

    public String getChangeReason() 
    {
        return changeReason;
    }

    public void setChangeDate(Date changeDate) 
    {
        this.changeDate = changeDate;
    }

    public Date getChangeDate() 
    {
        return changeDate;
    }

    public void setChangeFile(String changeFile) 
    {
        this.changeFile = changeFile;
    }

    public String getChangeFile() 
    {
        return changeFile;
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
            .append("changeId", getChangeId())
            .append("contractId", getContractId())
            .append("changeType", getChangeType())
            .append("changeReason", getChangeReason())
            .append("changeDate", getChangeDate())
            .append("changeFile", getChangeFile())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
} 