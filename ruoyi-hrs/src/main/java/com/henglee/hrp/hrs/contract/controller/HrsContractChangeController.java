package com.henglee.hrp.hrs.contract.controller;

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
import com.henglee.common.annotation.Log;
import com.henglee.common.core.controller.BaseController;
import com.henglee.common.core.domain.AjaxResult;
import com.henglee.common.enums.BusinessType;
import com.henglee.hrp.hrs.contract.domain.HrsContractChange;
import com.henglee.hrp.hrs.contract.service.IHrsContractChangeService;
import com.henglee.common.utils.poi.ExcelUtil;
import com.henglee.common.core.page.TableDataInfo;

/**
 * 合同变更记录Controller
 * 
 * @author henglee
 */
@RestController
@RequestMapping("/hrs/contract/change")
public class HrsContractChangeController extends BaseController
{
    @Autowired
    private IHrsContractChangeService hrsContractChangeService;

    /**
     * 查询合同变更记录列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:change:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsContractChange hrsContractChange)
    {
        startPage();
        List<HrsContractChange> list = hrsContractChangeService.selectHrsContractChangeList(hrsContractChange);
        return getDataTable(list);
    }

    /**
     * 导出合同变更记录列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:change:export')")
    @Log(title = "合同变更记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsContractChange hrsContractChange)
    {
        List<HrsContractChange> list = hrsContractChangeService.selectHrsContractChangeList(hrsContractChange);
        ExcelUtil<HrsContractChange> util = new ExcelUtil<HrsContractChange>(HrsContractChange.class);
        util.exportExcel(response, list, "合同变更记录数据");
    }

    /**
     * 获取合同变更记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:change:query')")
    @GetMapping(value = "/{changeId}")
    public AjaxResult getInfo(@PathVariable("changeId") Long changeId)
    {
        return success(hrsContractChangeService.selectHrsContractChangeByChangeId(changeId));
    }

    /**
     * 新增合同变更记录
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:change:add')")
    @Log(title = "合同变更记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsContractChange hrsContractChange)
    {
        return toAjax(hrsContractChangeService.insertHrsContractChange(hrsContractChange));
    }

    /**
     * 修改合同变更记录
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:change:edit')")
    @Log(title = "合同变更记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsContractChange hrsContractChange)
    {
        return toAjax(hrsContractChangeService.updateHrsContractChange(hrsContractChange));
    }

    /**
     * 删除合同变更记录
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:change:remove')")
    @Log(title = "合同变更记录", businessType = BusinessType.DELETE)
    @DeleteMapping("/{changeIds}")
    public AjaxResult remove(@PathVariable Long[] changeIds)
    {
        return toAjax(hrsContractChangeService.deleteHrsContractChangeByChangeIds(changeIds));
    }

    /**
     * 获取合同的变更记录
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:change:query')")
    @GetMapping(value = "/contract/{contractId}")
    public AjaxResult getContractChanges(@PathVariable("contractId") Long contractId)
    {
        return success(hrsContractChangeService.selectHrsContractChangeByContractId(contractId));
    }
} 