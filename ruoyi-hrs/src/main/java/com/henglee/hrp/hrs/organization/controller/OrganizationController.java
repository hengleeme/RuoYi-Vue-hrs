package com.henglee.hrp.hrs.organization.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.henglee.hrp.hrs.organization.domain.Organization;
import com.henglee.hrp.hrs.organization.service.IOrganizationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 组织架构Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/organization")
public class OrganizationController extends BaseController
{
    @Autowired
    private IOrganizationService organizationService;

    /**
     * 查询组织架构列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:organization:list')")
    @GetMapping("/list")
    public TableDataInfo list(Organization organization)
    {
        startPage();
        List<Organization> list = organizationService.selectOrganizationList(organization);
        return getDataTable(list);
    }

    /**
     * 导出组织架构列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:organization:export')")
    @Log(title = "组织架构", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Organization organization)
    {
        List<Organization> list = organizationService.selectOrganizationList(organization);
        ExcelUtil<Organization> util = new ExcelUtil<Organization>(Organization.class);
        util.exportExcel(response, list, "组织架构数据");
    }

    /**
     * 获取组织架构详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:organization:query')")
    @GetMapping(value = "/{orgId}")
    public AjaxResult getInfo(@PathVariable("orgId") Long orgId)
    {
        return success(organizationService.selectOrganizationByOrgId(orgId));
    }

    /**
     * 新增组织架构
     */
    @PreAuthorize("@ss.hasPermi('hrs:organization:add')")
    @Log(title = "组织架构", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Organization organization)
    {
        return toAjax(organizationService.insertOrganization(organization));
    }

    /**
     * 修改组织架构
     */
    @PreAuthorize("@ss.hasPermi('hrs:organization:edit')")
    @Log(title = "组织架构", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Organization organization)
    {
        return toAjax(organizationService.updateOrganization(organization));
    }

    /**
     * 删除组织架构
     */
    @PreAuthorize("@ss.hasPermi('hrs:organization:remove')")
    @Log(title = "组织架构", businessType = BusinessType.DELETE)
    @DeleteMapping("/{orgIds}")
    public AjaxResult remove(@PathVariable Long[] orgIds)
    {
        return toAjax(organizationService.deleteOrganizationByOrgIds(orgIds));
    }
} 