package com.henglee.hrp.hrs.organization.mapper;

import java.util.List;
import com.henglee.hrp.hrs.organization.domain.Organization;

/**
 * 组织规划Mapper接口
 * 
 * @author cbh
 */
public interface OrganizationMapper {
    /**
     * 查询组织规划信息
     * 
     * @param orgId 组织规划主键
     * @return 组织规划信息
     */
    public Organization selectOrganizationById(Long orgId);

    /**
     * 查询组织规划列表
     * 
     * @param organization 组织规划信息
     * @return 组织规划集合
     */
    public List<Organization> selectOrganizationList(Organization organization);

    /**
     * 新增组织规划
     * 
     * @param organization 组织规划信息
     * @return 结果
     */
    public int insertOrganization(Organization organization);

    /**
     * 修改组织规划
     * 
     * @param organization 组织规划信息
     * @return 结果
     */
    public int updateOrganization(Organization organization);

    /**
     * 删除组织规划
     * 
     * @param orgId 组织规划主键
     * @return 结果
     */
    public int deleteOrganizationById(Long orgId);

    /**
     * 批量删除组织规划
     * 
     * @param orgIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrganizationByIds(Long[] orgIds);
} 