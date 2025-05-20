package com.henglee.hrp.hrs.organization.service;

import java.util.List;
import com.henglee.hrp.hrs.organization.domain.Organization;

/**
 * 组织架构Service接口
 * 
 * @author cbh
 */
public interface IOrganizationService 
{
    /**
     * 查询组织架构
     * 
     * @param orgId 组织架构主键
     * @return 组织架构
     */
    public Organization selectOrganizationByOrgId(Long orgId);

    /**
     * 查询组织架构列表
     * 
     * @param organization 组织架构
     * @return 组织架构集合
     */
    public List<Organization> selectOrganizationList(Organization organization);

    /**
     * 新增组织架构
     * 
     * @param organization 组织架构
     * @return 结果
     */
    public int insertOrganization(Organization organization);

    /**
     * 修改组织架构
     * 
     * @param organization 组织架构
     * @return 结果
     */
    public int updateOrganization(Organization organization);

    /**
     * 批量删除组织架构
     * 
     * @param orgIds 需要删除的组织架构主键集合
     * @return 结果
     */
    public int deleteOrganizationByOrgIds(Long[] orgIds);

    /**
     * 删除组织架构信息
     * 
     * @param orgId 组织架构主键
     * @return 结果
     */
    public int deleteOrganizationByOrgId(Long orgId);
} 