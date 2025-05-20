package com.henglee.hrp.hrs.contract.domain;

import java.util.Date;

/**
 * 合同实体类
 * 
 * @author cbh
 */
public class Contract {
    /** 合同ID */
    private Long id;
    
    /** 合同编号 */
    private String contractNo;
    
    /** 合同名称 */
    private String name;
    
    /** 合同类型 */
    private String type;
    
    /** 签订日期 */
    private Date signDate;
    
    /** 生效日期 */
    private Date effectiveDate;
    
    /** 到期日期 */
    private Date expiryDate;
    
    /** 合同状态 */
    private String status;
    
    /** 合同金额 */
    private Double amount;
    
    /** 合同描述 */
    private String description;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
} 