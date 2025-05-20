package com.henglee.hrp.hrs.contract.controller;

import java.util.List;
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
import com.henglee.hrp.hrs.contract.domain.HrsContractType;
import com.henglee.hrp.hrs.contract.service.IHrsContractTypeService;
import com.henglee.common.utils.poi.ExcelUtil;
import com.henglee.common.core.page.TableDataInfo;

/**
 * 合同类型Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/contract/type")
public class HrsContractTypeController extends BaseController
{
    @Autowired
    private IHrsContractTypeService hrsContractTypeService;

    /**
     * 查询合同类型列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:type:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsContractType hrsContractType)
    {
        startPage();
        List<HrsContractType> list = hrsContractTypeService.selectHrsContractTypeList(hrsContractType);
        return getDataTable(list);
    }

    /**
     * 导出合同类型列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:type:export')")
    @Log(title = "合同类型", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HrsContractType hrsContractType)
    {
        List<HrsContractType> list = hrsContractTypeService.selectHrsContractTypeList(hrsContractType);
        ExcelUtil<HrsContractType> util = new ExcelUtil<HrsContractType>(HrsContractType.class);
        return util.exportExcel(list, "合同类型数据");
    }

    /**
     * 获取合同类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:type:query')")
    @GetMapping(value = "/{typeId}")
    public AjaxResult getInfo(@PathVariable("typeId") Long typeId)
    {
        return success(hrsContractTypeService.selectHrsContractTypeByTypeId(typeId));
    }

    /**
     * 新增合同类型
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:type:add')")
    @Log(title = "合同类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsContractType hrsContractType)
    {
        return toAjax(hrsContractTypeService.insertHrsContractType(hrsContractType));
    }

    /**
     * 修改合同类型
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:type:edit')")
    @Log(title = "合同类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsContractType hrsContractType)
    {
        return toAjax(hrsContractTypeService.updateHrsContractType(hrsContractType));
    }

    /**
     * 删除合同类型
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:type:remove')")
    @Log(title = "合同类型", businessType = BusinessType.DELETE)
    @DeleteMapping("/{typeIds}")
    public AjaxResult remove(@PathVariable Long[] typeIds)
    {
        return toAjax(hrsContractTypeService.deleteHrsContractTypeByTypeIds(typeIds));
    }
} 