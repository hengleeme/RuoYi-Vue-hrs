package com.henglee.hrp.hrs.organization.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.henglee.hrp.common.annotation.Excel;
import com.henglee.hrp.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 组织架构对象 hrs_organization
 * 
 * @author cbh
 */
public class Organization extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 组织ID */
    private Long orgId;

    /** 组织名称 */
    @Excel(name = "组织名称")
    private String orgName;

    /** 组织编码 */
    @Excel(name = "组织编码")
    private String orgCode;

    /** 父组织ID */
    @Excel(name = "父组织ID")
    private Long parentId;

    /** 组织类型（1公司 2部门 3岗位） */
    @Excel(name = "组织类型", readConverterExp = "1=公司,2=部门,3=岗位")
    private String orgType;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Integer orderNum;

    /** 负责人 */
    @Excel(name = "负责人")
    private String leader;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 规划名称 */
    @Excel(name = "规划名称")
    private String planName;

    /** 规划类型（1组织架构 2岗位设置 3人员编制 4成本预算） */
    @Excel(name = "规划类型", readConverterExp = "1=组织架构,2=岗位设置,3=人员编制,4=成本预算")
    private String planType;

    /** 规划年份 */
    @Excel(name = "规划年份")
    private String planYear;

    /** 规划季度（1第一季度 2第二季度 3第三季度 4第四季度） */
    @Excel(name = "规划季度", readConverterExp = "1=第一季度,2=第二季度,3=第三季度,4=第四季度")
    private String planQuarter;

    /** 规划月份 */
    @Excel(name = "规划月份")
    private String planMonth;

    /** 规划内容 */
    @Excel(name = "规划内容")
    private String planContent;

    /** 规划目标 */
    @Excel(name = "规划目标")
    private String planTarget;

    /** 实施计划 */
    @Excel(name = "实施计划")
    private String implementationPlan;

    /** 预算金额 */
    @Excel(name = "预算金额")
    private BigDecimal budgetAmount;

    /** 实际金额 */
    @Excel(name = "实际金额")
    private BigDecimal actualAmount;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 子组织列表 */
    private List<Organization> children;

    // Getters and Setters
    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
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

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getPlanYear() {
        return planYear;
    }

    public void setPlanYear(String planYear) {
        this.planYear = planYear;
    }

    public String getPlanQuarter() {
        return planQuarter;
    }

    public void setPlanQuarter(String planQuarter) {
        this.planQuarter = planQuarter;
    }

    public String getPlanMonth() {
        return planMonth;
    }

    public void setPlanMonth(String planMonth) {
        this.planMonth = planMonth;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    public String getPlanTarget() {
        return planTarget;
    }

    public void setPlanTarget(String planTarget) {
        this.planTarget = planTarget;
    }

    public String getImplementationPlan() {
        return implementationPlan;
    }

    public void setImplementationPlan(String implementationPlan) {
        this.implementationPlan = implementationPlan;
    }

    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public List<Organization> getChildren() {
        return children;
    }

    public void setChildren(List<Organization> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("orgId", getOrgId())
            .append("orgName", getOrgName())
            .append("orgCode", getOrgCode())
            .append("parentId", getParentId())
            .append("orgType", getOrgType())
            .append("orderNum", getOrderNum())
            .append("leader", getLeader())
            .append("phone", getPhone())
            .append("email", getEmail())
            .append("planName", getPlanName())
            .append("planType", getPlanType())
            .append("planYear", getPlanYear())
            .append("planQuarter", getPlanQuarter())
            .append("planMonth", getPlanMonth())
            .append("planContent", getPlanContent())
            .append("planTarget", getPlanTarget())
            .append("implementationPlan", getImplementationPlan())
            .append("budgetAmount", getBudgetAmount())
            .append("actualAmount", getActualAmount())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
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