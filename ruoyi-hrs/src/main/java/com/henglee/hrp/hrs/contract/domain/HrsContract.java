package com.henglee.hrp.hrs.contract.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;

/**
 * 合同信息对象 hrs_contract
 * 
 * @author henglee
 */
public class HrsContract extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 合同ID */
    private Long contractId;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String contractNo;

    /** 员工ID */
    private Long employeeId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String employeeName;

    /** 合同类型（1固定期限 2无固定期限 3实习协议 4劳务协议） */
    @Excel(name = "合同类型", readConverterExp = "1=固定期限,2=无固定期限,3=实习协议,4=劳务协议")
    private String contractType;

    /** 合同状态（1生效 2到期 3终止 4解除） */
    @Excel(name = "合同状态", readConverterExp = "1=生效,2=到期,3=终止,4=解除")
    private String contractStatus;

    /** 开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 结束日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 试用期(月) */
    @Excel(name = "试用期(月)")
    private Integer probationMonths;

    /** 工作地点 */
    @Excel(name = "工作地点")
    private String workLocation;

    /** 职位 */
    @Excel(name = "职位")
    private String position;

    /** 部门 */
    @Excel(name = "部门")
    private String department;

    /** 薪资 */
    @Excel(name = "薪资")
    private BigDecimal salary;

    /** 合同文件 */
    private String contractFile;

    /** 签订日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "签订日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date signDate;

    /** 签订地点 */
    @Excel(name = "签订地点")
    private String signLocation;

    /** 甲方 */
    @Excel(name = "甲方")
    private String partyA;

    /** 乙方 */
    @Excel(name = "乙方")
    private String partyB;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setContractId(Long contractId) 
    {
        this.contractId = contractId;
    }

    public Long getContractId() 
    {
        return contractId;
    }

    public void setContractNo(String contractNo) 
    {
        this.contractNo = contractNo;
    }

    public String getContractNo() 
    {
        return contractNo;
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

    public void setContractType(String contractType) 
    {
        this.contractType = contractType;
    }

    public String getContractType() 
    {
        return contractType;
    }

    public void setContractStatus(String contractStatus) 
    {
        this.contractStatus = contractStatus;
    }

    public String getContractStatus() 
    {
        return contractStatus;
    }

    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

    public Date getStartDate() 
    {
        return startDate;
    }

    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
    }

    public void setProbationMonths(Integer probationMonths) 
    {
        this.probationMonths = probationMonths;
    }

    public Integer getProbationMonths() 
    {
        return probationMonths;
    }

    public void setWorkLocation(String workLocation) 
    {
        this.workLocation = workLocation;
    }

    public String getWorkLocation() 
    {
        return workLocation;
    }

    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }

    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }

    public void setSalary(BigDecimal salary) 
    {
        this.salary = salary;
    }

    public BigDecimal getSalary() 
    {
        return salary;
    }

    public void setContractFile(String contractFile) 
    {
        this.contractFile = contractFile;
    }

    public String getContractFile() 
    {
        return contractFile;
    }

    public void setSignDate(Date signDate) 
    {
        this.signDate = signDate;
    }

    public Date getSignDate() 
    {
        return signDate;
    }

    public void setSignLocation(String signLocation) 
    {
        this.signLocation = signLocation;
    }

    public String getSignLocation() 
    {
        return signLocation;
    }

    public void setPartyA(String partyA) 
    {
        this.partyA = partyA;
    }

    public String getPartyA() 
    {
        return partyA;
    }

    public void setPartyB(String partyB) 
    {
        this.partyB = partyB;
    }

    public String getPartyB() 
    {
        return partyB;
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
            .append("contractId", getContractId())
            .append("contractNo", getContractNo())
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("contractType", getContractType())
            .append("contractStatus", getContractStatus())
            .append("startDate", getStartDate())
            .append("endDate", getEndDate())
            .append("probationMonths", getProbationMonths())
            .append("workLocation", getWorkLocation())
            .append("position", getPosition())
            .append("department", getDepartment())
            .append("salary", getSalary())
            .append("contractFile", getContractFile())
            .append("signDate", getSignDate())
            .append("signLocation", getSignLocation())
            .append("partyA", getPartyA())
            .append("partyB", getPartyB())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
} 