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
import com.henglee.hrp.hrs.contract.domain.HrsContract;
import com.henglee.hrp.hrs.contract.service.IHrsContractService;
import com.henglee.common.utils.poi.ExcelUtil;
import com.henglee.common.core.page.TableDataInfo;

/**
 * 合同信息Controller
 * 
 * @author henglee
 */
@RestController
@RequestMapping("/hrs/contract")
public class HrsContractController extends BaseController
{
    @Autowired
    private IHrsContractService hrsContractService;

    /**
     * 查询合同信息列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsContract hrsContract)
    {
        startPage();
        List<HrsContract> list = hrsContractService.selectHrsContractList(hrsContract);
        return getDataTable(list);
    }

    /**
     * 导出合同信息列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:export')")
    @Log(title = "合同信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsContract hrsContract)
    {
        List<HrsContract> list = hrsContractService.selectHrsContractList(hrsContract);
        ExcelUtil<HrsContract> util = new ExcelUtil<HrsContract>(HrsContract.class);
        util.exportExcel(response, list, "合同信息数据");
    }

    /**
     * 获取合同信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:query')")
    @GetMapping(value = "/{contractId}")
    public AjaxResult getInfo(@PathVariable("contractId") Long contractId)
    {
        return success(hrsContractService.selectHrsContractByContractId(contractId));
    }

    /**
     * 新增合同信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:add')")
    @Log(title = "合同信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsContract hrsContract)
    {
        return toAjax(hrsContractService.insertHrsContract(hrsContract));
    }

    /**
     * 修改合同信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:edit')")
    @Log(title = "合同信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsContract hrsContract)
    {
        return toAjax(hrsContractService.updateHrsContract(hrsContract));
    }

    /**
     * 删除合同信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:remove')")
    @Log(title = "合同信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{contractIds}")
    public AjaxResult remove(@PathVariable Long[] contractIds)
    {
        return toAjax(hrsContractService.deleteHrsContractByContractIds(contractIds));
    }
} 