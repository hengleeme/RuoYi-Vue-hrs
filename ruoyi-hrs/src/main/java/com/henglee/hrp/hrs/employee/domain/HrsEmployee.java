package com.henglee.hrp.hrs.employee.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.henglee.common.annotation.Excel;
import com.henglee.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 人员基本信息对象 hrs_employee
 * 
 * @author cbh
 */
public class HrsEmployee extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 人员ID */
    private Long employeeId;

    /** 工号 */
    @Excel(name = "工号")
    private String employeeNo;

    /** 姓名 */
    @Excel(name = "姓名")
    private String employeeName;

    /** 性别（0男 1女） */
    @Excel(name = "性别", readConverterExp = "0=男,1=女")
    private String gender;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCard;

    /** 政治面貌（0群众 1党员 2团员） */
    @Excel(name = "政治面貌", readConverterExp = "0=群众,1=党员,2=团员")
    private String politicalStatus;

    /** 民族 */
    @Excel(name = "民族")
    private String nation;

    /** 婚姻状况（0未婚 1已婚 2离异 3丧偶） */
    @Excel(name = "婚姻状况", readConverterExp = "0=未婚,1=已婚,2=离异,3=丧偶")
    private String maritalStatus;

    /** 最高学历 */
    @Excel(name = "最高学历")
    private String education;

    /** 最高学位 */
    @Excel(name = "最高学位")
    private String degree;

    /** 毕业院校 */
    @Excel(name = "毕业院校")
    private String graduateSchool;

    /** 专业 */
    @Excel(name = "专业")
    private String major;

    /** 毕业时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "毕业时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date graduateDate;

    /** 参加工作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "参加工作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workDate;

    /** 入职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date entryDate;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 职位ID */
    @Excel(name = "职位ID")
    private Long positionId;

    /** 职位名称 */
    @Excel(name = "职位名称")
    private String positionName;

    /** 职级 */
    @Excel(name = "职级")
    private String jobLevel;

    /** 职称 */
    @Excel(name = "职称")
    private String jobTitle;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 电子邮箱 */
    @Excel(name = "电子邮箱")
    private String email;

    /** 现居地址 */
    @Excel(name = "现居地址")
    private String address;

    /** 户籍地址 */
    @Excel(name = "户籍地址")
    private String registeredAddress;

    /** 紧急联系人 */
    @Excel(name = "紧急联系人")
    private String emergencyContact;

    /** 紧急联系人电话 */
    @Excel(name = "紧急联系人电话")
    private String emergencyPhone;

    /** 状态（0在职 1离职 2退休） */
    @Excel(name = "状态", readConverterExp = "0=在职,1=离职,2=退休")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 工龄（年） */
    @Excel(name = "工龄")
    private Double workYears;

    public void setEmployeeId(Long employeeId) 
    {
        this.employeeId = employeeId;
    }

    public Long getEmployeeId() 
    {
        return employeeId;
    }

    public void setEmployeeNo(String employeeNo) 
    {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeNo() 
    {
        return employeeNo;
    }

    public void setEmployeeName(String employeeName) 
    {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() 
    {
        return employeeName;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }

    public void setIdCard(String idCard) 
    {
        this.idCard = idCard;
    }

    public String getIdCard() 
    {
        return idCard;
    }

    public void setPoliticalStatus(String politicalStatus) 
    {
        this.politicalStatus = politicalStatus;
    }

    public String getPoliticalStatus() 
    {
        return politicalStatus;
    }

    public void setNation(String nation) 
    {
        this.nation = nation;
    }

    public String getNation() 
    {
        return nation;
    }

    public void setMaritalStatus(String maritalStatus) 
    {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() 
    {
        return maritalStatus;
    }

    public void setEducation(String education) 
    {
        this.education = education;
    }

    public String getEducation() 
    {
        return education;
    }

    public void setDegree(String degree) 
    {
        this.degree = degree;
    }

    public String getDegree() 
    {
        return degree;
    }

    public void setGraduateSchool(String graduateSchool) 
    {
        this.graduateSchool = graduateSchool;
    }

    public String getGraduateSchool() 
    {
        return graduateSchool;
    }

    public void setMajor(String major) 
    {
        this.major = major;
    }

    public String getMajor() 
    {
        return major;
    }

    public void setGraduateDate(Date graduateDate) 
    {
        this.graduateDate = graduateDate;
    }

    public Date getGraduateDate() 
    {
        return graduateDate;
    }

    public void setWorkDate(Date workDate) 
    {
        this.workDate = workDate;
    }

    public Date getWorkDate() 
    {
        return workDate;
    }

    public void setEntryDate(Date entryDate) 
    {
        this.entryDate = entryDate;
    }

    public Date getEntryDate() 
    {
        return entryDate;
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

    public void setPositionId(Long positionId) 
    {
        this.positionId = positionId;
    }

    public Long getPositionId() 
    {
        return positionId;
    }

    public void setPositionName(String positionName) 
    {
        this.positionName = positionName;
    }

    public String getPositionName() 
    {
        return positionName;
    }

    public void setJobLevel(String jobLevel) 
    {
        this.jobLevel = jobLevel;
    }

    public String getJobLevel() 
    {
        return jobLevel;
    }

    public void setJobTitle(String jobTitle) 
    {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() 
    {
        return jobTitle;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setRegisteredAddress(String registeredAddress) 
    {
        this.registeredAddress = registeredAddress;
    }

    public String getRegisteredAddress() 
    {
        return registeredAddress;
    }

    public void setEmergencyContact(String emergencyContact) 
    {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyContact() 
    {
        return emergencyContact;
    }

    public void setEmergencyPhone(String emergencyPhone) 
    {
        this.emergencyPhone = emergencyPhone;
    }

    public String getEmergencyPhone() 
    {
        return emergencyPhone;
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

    public void setWorkYears(Double workYears) 
    {
        this.workYears = workYears;
    }

    public Double getWorkYears() 
    {
        return workYears;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("employeeId", getEmployeeId())
            .append("employeeNo", getEmployeeNo())
            .append("employeeName", getEmployeeName())
            .append("gender", getGender())
            .append("birthday", getBirthday())
            .append("idCard", getIdCard())
            .append("politicalStatus", getPoliticalStatus())
            .append("nation", getNation())
            .append("maritalStatus", getMaritalStatus())
            .append("education", getEducation())
            .append("degree", getDegree())
            .append("graduateSchool", getGraduateSchool())
            .append("major", getMajor())
            .append("graduateDate", getGraduateDate())
            .append("workDate", getWorkDate())
            .append("entryDate", getEntryDate())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("positionId", getPositionId())
            .append("positionName", getPositionName())
            .append("jobLevel", getJobLevel())
            .append("jobTitle", getJobTitle())
            .append("phone", getPhone())
            .append("email", getEmail())
            .append("address", getAddress())
            .append("registeredAddress", getRegisteredAddress())
            .append("emergencyContact", getEmergencyContact())
            .append("emergencyPhone", getEmergencyPhone())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("workYears", getWorkYears())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
} 