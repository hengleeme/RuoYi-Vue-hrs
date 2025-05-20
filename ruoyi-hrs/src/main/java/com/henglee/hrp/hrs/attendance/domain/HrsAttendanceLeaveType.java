package com.henglee.hrp.hrs.attendance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 考勤请假类别对象 hrs_attendance_leave_type
 * 
 * @author henglee
 */
public class HrsAttendanceLeaveType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 类别ID */
    private Long typeId;

    /** 类别名称 */
    @Excel(name = "类别名称")
    private String typeName;

    /** 类别编码 */
    @Excel(name = "类别编码")
    private String typeCode;

    /** 最大请假天数 */
    @Excel(name = "最大请假天数")
    private Integer maxDays;

    /** 是否需要审批（0否 1是） */
    @Excel(name = "是否需要审批", readConverterExp = "0=否,1=是")
    private String needApprove;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setTypeId(Long typeId) 
    {
        this.typeId = typeId;
    }

    public Long getTypeId() 
    {
        return typeId;
    }
    public void setTypeName(String typeName) 
    {
        this.typeName = typeName;
    }

    public String getTypeName() 
    {
        return typeName;
    }
    public void setTypeCode(String typeCode) 
    {
        this.typeCode = typeCode;
    }

    public String getTypeCode() 
    {
        return typeCode;
    }
    public void setMaxDays(Integer maxDays) 
    {
        this.maxDays = maxDays;
    }

    public Integer getMaxDays() 
    {
        return maxDays;
    }
    public void setNeedApprove(String needApprove) 
    {
        this.needApprove = needApprove;
    }

    public String getNeedApprove() 
    {
        return needApprove;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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
            .append("typeId", getTypeId())
            .append("typeName", getTypeName())
            .append("typeCode", getTypeCode())
            .append("maxDays", getMaxDays())
            .append("needApprove", getNeedApprove())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
} 