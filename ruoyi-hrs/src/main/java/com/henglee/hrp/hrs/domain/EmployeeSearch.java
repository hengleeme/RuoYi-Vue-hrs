package com.henglee.hrp.hrs.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人员综合查询对象
 * 
 * @author cbh
 */
public class EmployeeSearch extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 人员ID */
    @Excel(name = "人员ID")
    private Long employeeId;

    /** 人员编号 */
    @Excel(name = "人员编号")
    private String employeeCode;

    /** 人员姓名 */
    @Excel(name = "人员姓名")
    private String employeeName;

    /** 性别（0男 1女 2未知） */
    @Excel(name = "性别", readConverterExp = "0=男,1=女,2=未知")
    private String gender;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private String birthday;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCard;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 人员类别 */
    @Excel(name = "人员类别")
    private String employeeType;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 职位 */
    @Excel(name = "职位")
    private String position;

    /** 入职日期 */
    @Excel(name = "入职日期", width = 30, dateFormat = "yyyy-MM-dd")
    private String entryDate;

    /** 离职日期 */
    @Excel(name = "离职日期", width = 30, dateFormat = "yyyy-MM-dd")
    private String leaveDate;

    /** 状态（0在职 1离职 2退休） */
    @Excel(name = "状态", readConverterExp = "0=在职,1=离职,2=退休")
    private String status;

    /** 学历 */
    @Excel(name = "学历")
    private String education;

    /** 专业 */
    @Excel(name = "专业")
    private String major;

    /** 毕业院校 */
    @Excel(name = "毕业院校")
    private String school;

    /** 工作年限 */
    @Excel(name = "工作年限")
    private Integer workYears;

    /** 婚姻状况（0未婚 1已婚 2离异 3丧偶） */
    @Excel(name = "婚姻状况", readConverterExp = "0=未婚,1=已婚,2=离异,3=丧偶")
    private String maritalStatus;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String politicalStatus;

    /** 民族 */
    @Excel(name = "民族")
    private String nation;

    /** 籍贯 */
    @Excel(name = "籍贯")
    private String nativePlace;

    /** 现居地址 */
    @Excel(name = "现居地址")
    private String address;

    /** 紧急联系人 */
    @Excel(name = "紧急联系人")
    private String emergencyContact;

    /** 紧急联系人电话 */
    @Excel(name = "紧急联系人电话")
    private String emergencyPhone;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getWorkYears() {
        return workYears;
    }

    public void setWorkYears(Integer workYears) {
        this.workYears = workYears;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("employeeId", getEmployeeId())
            .append("employeeCode", getEmployeeCode())
            .append("employeeName", getEmployeeName())
            .append("gender", getGender())
            .append("birthday", getBirthday())
            .append("idCard", getIdCard())
            .append("phone", getPhone())
            .append("email", getEmail())
            .append("employeeType", getEmployeeType())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("position", getPosition())
            .append("entryDate", getEntryDate())
            .append("leaveDate", getLeaveDate())
            .append("status", getStatus())
            .append("education", getEducation())
            .append("major", getMajor())
            .append("school", getSchool())
            .append("workYears", getWorkYears())
            .append("maritalStatus", getMaritalStatus())
            .append("politicalStatus", getPoliticalStatus())
            .append("nation", getNation())
            .append("nativePlace", getNativePlace())
            .append("address", getAddress())
            .append("emergencyContact", getEmergencyContact())
            .append("emergencyPhone", getEmergencyPhone())
            .toString();
    }
} 