package com.henglee.hrp.hrs.recruitment.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 招聘信息对象 hrs_recruitment
 * 
 * @author cbh
 */
public class HrsRecruitment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 招聘ID */
    private Long recruitmentId;

    /** 职位名称 */
    @Excel(name = "职位名称")
    private String positionName;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 招聘人数 */
    @Excel(name = "招聘人数")
    private Integer recruitNumber;

    /** 工作地点 */
    @Excel(name = "工作地点")
    private String workLocation;

    /** 薪资范围 */
    @Excel(name = "薪资范围")
    private String salaryRange;

    /** 学历要求 */
    @Excel(name = "学历要求")
    private String education;

    /** 工作经验 */
    @Excel(name = "工作经验")
    private String experience;

    /** 职位描述 */
    @Excel(name = "职位描述")
    private String description;

    /** 任职要求 */
    @Excel(name = "任职要求")
    private String requirement;

    /** 招聘状态（0进行中 1已结束 2已暂停） */
    @Excel(name = "招聘状态", readConverterExp = "0=进行中,1=已结束,2=已暂停")
    private String status;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setRecruitmentId(Long recruitmentId) 
    {
        this.recruitmentId = recruitmentId;
    }

    public Long getRecruitmentId() 
    {
        return recruitmentId;
    }

    public void setPositionName(String positionName) 
    {
        this.positionName = positionName;
    }

    public String getPositionName() 
    {
        return positionName;
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

    public void setRecruitNumber(Integer recruitNumber) 
    {
        this.recruitNumber = recruitNumber;
    }

    public Integer getRecruitNumber() 
    {
        return recruitNumber;
    }

    public void setWorkLocation(String workLocation) 
    {
        this.workLocation = workLocation;
    }

    public String getWorkLocation() 
    {
        return workLocation;
    }

    public void setSalaryRange(String salaryRange) 
    {
        this.salaryRange = salaryRange;
    }

    public String getSalaryRange() 
    {
        return salaryRange;
    }

    public void setEducation(String education) 
    {
        this.education = education;
    }

    public String getEducation() 
    {
        return education;
    }

    public void setExperience(String experience) 
    {
        this.experience = experience;
    }

    public String getExperience() 
    {
        return experience;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setRequirement(String requirement) 
    {
        this.requirement = requirement;
    }

    public String getRequirement() 
    {
        return requirement;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }

    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
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
            .append("recruitmentId", getRecruitmentId())
            .append("positionName", getPositionName())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("recruitNumber", getRecruitNumber())
            .append("workLocation", getWorkLocation())
            .append("salaryRange", getSalaryRange())
            .append("education", getEducation())
            .append("experience", getExperience())
            .append("description", getDescription())
            .append("requirement", getRequirement())
            .append("status", getStatus())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
} 