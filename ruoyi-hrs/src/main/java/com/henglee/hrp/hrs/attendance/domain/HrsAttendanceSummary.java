package com.henglee.hrp.hrs.attendance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 考勤汇总对象 hrs_attendance_summary
 * 
 * @author cbh
 */
public class HrsAttendanceSummary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 汇总ID */
    private Long summaryId;

    /** 员工ID */
    @Excel(name = "员工ID")
    private Long employeeId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String employeeName;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 汇总年份 */
    @Excel(name = "汇总年份")
    private Integer summaryYear;

    /** 汇总月份 */
    @Excel(name = "汇总月份")
    private Integer summaryMonth;

    /** 应出勤天数 */
    @Excel(name = "应出勤天数")
    private Double shouldWorkDays;

    /** 实出勤天数 */
    @Excel(name = "实出勤天数")
    private Double actualWorkDays;

    /** 病假天数 */
    @Excel(name = "病假天数")
    private Double sickLeaveDays;

    /** 事假天数 */
    @Excel(name = "事假天数")
    private Double personalLeaveDays;

    /** 婚假天数 */
    @Excel(name = "婚假天数")
    private Double marriageLeaveDays;

    /** 产假天数 */
    @Excel(name = "产假天数")
    private Double maternityLeaveDays;

    /** 丧假天数 */
    @Excel(name = "丧假天数")
    private Double bereavementLeaveDays;

    /** 年假天数 */
    @Excel(name = "年假天数")
    private Double annualLeaveDays;

    /** 调休天数 */
    @Excel(name = "调休天数")
    private Double compensatoryLeaveDays;

    /** 出差天数 */
    @Excel(name = "出差天数")
    private Double businessTripDays;

    /** 迟到次数 */
    @Excel(name = "迟到次数")
    private Integer lateTimes;

    /** 早退次数 */
    @Excel(name = "早退次数")
    private Integer earlyLeaveTimes;

    /** 旷工次数 */
    @Excel(name = "旷工次数")
    private Integer absentTimes;

    /** 状态（0草稿 1待审核 2已通过 3已驳回） */
    @Excel(name = "状态", readConverterExp = "0=草稿,1=待审核,2=已通过,3=已驳回")
    private String status;

    /** 提交人 */
    @Excel(name = "提交人")
    private String submitter;

    /** 提交时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "提交时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date submitTime;

    /** 审批人 */
    @Excel(name = "审批人")
    private String approver;

    /** 审批时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "审批时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date approveTime;

    /** 审批备注 */
    @Excel(name = "审批备注")
    private String approveRemark;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setSummaryId(Long summaryId) 
    {
        this.summaryId = summaryId;
    }

    public Long getSummaryId() 
    {
        return summaryId;
    }
    public void setEmployeeId(Long employeeId) 
    {
        this.employeeId = employeeId;
    }

    public Long getEmployeeId() 
    {
        return employeeId;
    }
    public void setEmployeeName(String employeeName) 
    {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() 
    {
        return employeeName;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
    }
    public void setSummaryYear(Integer summaryYear) 
    {
        this.summaryYear = summaryYear;
    }

    public Integer getSummaryYear() 
    {
        return summaryYear;
    }
    public void setSummaryMonth(Integer summaryMonth) 
    {
        this.summaryMonth = summaryMonth;
    }

    public Integer getSummaryMonth() 
    {
        return summaryMonth;
    }
    public void setShouldWorkDays(Double shouldWorkDays) 
    {
        this.shouldWorkDays = shouldWorkDays;
    }

    public Double getShouldWorkDays() 
    {
        return shouldWorkDays;
    }
    public void setActualWorkDays(Double actualWorkDays) 
    {
        this.actualWorkDays = actualWorkDays;
    }

    public Double getActualWorkDays() 
    {
        return actualWorkDays;
    }
    public void setSickLeaveDays(Double sickLeaveDays) 
    {
        this.sickLeaveDays = sickLeaveDays;
    }

    public Double getSickLeaveDays() 
    {
        return sickLeaveDays;
    }
    public void setPersonalLeaveDays(Double personalLeaveDays) 
    {
        this.personalLeaveDays = personalLeaveDays;
    }

    public Double getPersonalLeaveDays() 
    {
        return personalLeaveDays;
    }
    public void setMarriageLeaveDays(Double marriageLeaveDays) 
    {
        this.marriageLeaveDays = marriageLeaveDays;
    }

    public Double getMarriageLeaveDays() 
    {
        return marriageLeaveDays;
    }
    public void setMaternityLeaveDays(Double maternityLeaveDays) 
    {
        this.maternityLeaveDays = maternityLeaveDays;
    }

    public Double getMaternityLeaveDays() 
    {
        return maternityLeaveDays;
    }
    public void setBereavementLeaveDays(Double bereavementLeaveDays) 
    {
        this.bereavementLeaveDays = bereavementLeaveDays;
    }

    public Double getBereavementLeaveDays() 
    {
        return bereavementLeaveDays;
    }
    public void setAnnualLeaveDays(Double annualLeaveDays) 
    {
        this.annualLeaveDays = annualLeaveDays;
    }

    public Double getAnnualLeaveDays() 
    {
        return annualLeaveDays;
    }
    public void setCompensatoryLeaveDays(Double compensatoryLeaveDays) 
    {
        this.compensatoryLeaveDays = compensatoryLeaveDays;
    }

    public Double getCompensatoryLeaveDays() 
    {
        return compensatoryLeaveDays;
    }
    public void setBusinessTripDays(Double businessTripDays) 
    {
        this.businessTripDays = businessTripDays;
    }

    public Double getBusinessTripDays() 
    {
        return businessTripDays;
    }
    public void setLateTimes(Integer lateTimes) 
    {
        this.lateTimes = lateTimes;
    }

    public Integer getLateTimes() 
    {
        return lateTimes;
    }
    public void setEarlyLeaveTimes(Integer earlyLeaveTimes) 
    {
        this.earlyLeaveTimes = earlyLeaveTimes;
    }

    public Integer getEarlyLeaveTimes() 
    {
        return earlyLeaveTimes;
    }
    public void setAbsentTimes(Integer absentTimes) 
    {
        this.absentTimes = absentTimes;
    }

    public Integer getAbsentTimes() 
    {
        return absentTimes;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setSubmitter(String submitter) 
    {
        this.submitter = submitter;
    }

    public String getSubmitter() 
    {
        return submitter;
    }
    public void setSubmitTime(Date submitTime) 
    {
        this.submitTime = submitTime;
    }

    public Date getSubmitTime() 
    {
        return submitTime;
    }
    public void setApprover(String approver) 
    {
        this.approver = approver;
    }

    public String getApprover() 
    {
        return approver;
    }
    public void setApproveTime(Date approveTime) 
    {
        this.approveTime = approveTime;
    }

    public Date getApproveTime() 
    {
        return approveTime;
    }
    public void setApproveRemark(String approveRemark) 
    {
        this.approveRemark = approveRemark;
    }

    public String getApproveRemark() 
    {
        return approveRemark;
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
            .append("summaryId", getSummaryId())
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("summaryYear", getSummaryYear())
            .append("summaryMonth", getSummaryMonth())
            .append("shouldWorkDays", getShouldWorkDays())
            .append("actualWorkDays", getActualWorkDays())
            .append("sickLeaveDays", getSickLeaveDays())
            .append("personalLeaveDays", getPersonalLeaveDays())
            .append("marriageLeaveDays", getMarriageLeaveDays())
            .append("maternityLeaveDays", getMaternityLeaveDays())
            .append("bereavementLeaveDays", getBereavementLeaveDays())
            .append("annualLeaveDays", getAnnualLeaveDays())
            .append("compensatoryLeaveDays", getCompensatoryLeaveDays())
            .append("businessTripDays", getBusinessTripDays())
            .append("lateTimes", getLateTimes())
            .append("earlyLeaveTimes", getEarlyLeaveTimes())
            .append("absentTimes", getAbsentTimes())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("submitter", getSubmitter())
            .append("submitTime", getSubmitTime())
            .append("approver", getApprover())
            .append("approveTime", getApproveTime())
            .append("approveRemark", getApproveRemark())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
} 