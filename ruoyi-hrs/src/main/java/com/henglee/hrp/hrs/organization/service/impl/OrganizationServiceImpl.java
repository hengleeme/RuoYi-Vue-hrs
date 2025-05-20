package com.henglee.hrp.hrs.organization.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.organization.mapper.OrganizationMapper;
import com.henglee.hrp.hrs.organization.domain.Organization;
import com.henglee.hrp.hrs.organization.service.IOrganizationService;

/**
 * 组织规划服务实现
 * 
 * @author cbh
 */
@Service
public class OrganizationServiceImpl implements IOrganizationService {
    @Autowired
    private OrganizationMapper organizationMapper;

    /**
     * 查询组织规划信息
     * 
     * @param orgId 组织规划主键
     * @return 组织规划信息
     */
    @Override
    public Organization selectOrganizationById(Long orgId) {
        return organizationMapper.selectOrganizationById(orgId);
    }

    /**
     * 查询组织规划列表
     * 
     * @param organization 组织规划信息
     * @return 组织规划集合
     */
    @Override
    public List<Organization> selectOrganizationList(Organization organization) {
        return organizationMapper.selectOrganizationList(organization);
    }

    /**
     * 新增组织规划
     * 
     * @param organization 组织规划信息
     * @return 结果
     */
    @Override
    public int insertOrganization(Organization organization) {
        return organizationMapper.insertOrganization(organization);
    }

    /**
     * 修改组织规划
     * 
     * @param organization 组织规划信息
     * @return 结果
     */
    @Override
    public int updateOrganization(Organization organization) {
        return organizationMapper.updateOrganization(organization);
    }

    /**
     * 批量删除组织规划
     * 
     * @param orgIds 需要删除的组织规划主键集合
     * @return 结果
     */
    @Override
    public int deleteOrganizationByIds(Long[] orgIds) {
        return organizationMapper.deleteOrganizationByIds(orgIds);
    }

    /**
     * 删除组织规划信息
     * 
     * @param orgId 组织规划主键
     * @return 结果
     */
    @Override
    public int deleteOrganizationById(Long orgId) {
        return organizationMapper.deleteOrganizationById(orgId);
    }

    /**
     * 构建前端所需要的组织树结构
     * 
     * @param organizations 组织列表
     * @return 组织树结构
     */
    @Override
    public List<Organization> buildOrganizationTree(List<Organization> organizations) {
        List<Organization> returnList = new ArrayList<Organization>();
        List<Long> tempList = new ArrayList<Long>();
        for (Organization organization : organizations) {
            tempList.add(organization.getOrgId());
        }
        for (Iterator<Organization> iterator = organizations.iterator(); iterator.hasNext();) {
            Organization organization = (Organization) iterator.next();
            // 如果是顶级节点, 遍历该父节点的所有子节点
            if (!tempList.contains(organization.getParentId())) {
                recursionFn(organizations, organization);
                returnList.add(organization);
            }
        }
        if (returnList.isEmpty()) {
            returnList = organizations;
        }
        return returnList;
    }

    /**
     * 递归列表
     */
    private void recursionFn(List<Organization> list, Organization t) {
        // 得到子节点列表
        List<Organization> childList = getChildList(list, t);
        t.setChildren(childList);
        for (Organization tChild : childList) {
            if (hasChild(list, tChild)) {
                recursionFn(list, tChild);
            }
        }
    }

    /**
     * 得到子节点列表
     */
    private List<Organization> getChildList(List<Organization> list, Organization t) {
        List<Organization> tlist = new ArrayList<Organization>();
        Iterator<Organization> it = list.iterator();
        while (it.hasNext()) {
            Organization n = (Organization) it.next();
            if (n.getParentId().longValue() == t.getOrgId().longValue()) {
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 判断是否有子节点
     */
    private boolean hasChild(List<Organization> list, Organization t) {
        return getChildList(list, t).size() > 0;
    }
} 