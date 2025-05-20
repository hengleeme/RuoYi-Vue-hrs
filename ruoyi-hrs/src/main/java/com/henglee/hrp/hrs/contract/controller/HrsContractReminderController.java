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
import com.henglee.hrp.hrs.contract.domain.HrsContractReminder;
import com.henglee.hrp.hrs.contract.service.IHrsContractReminderService;
import com.henglee.common.utils.poi.ExcelUtil;
import com.henglee.common.core.page.TableDataInfo;

/**
 * 合同到期提醒Controller
 * 
 * @author henglee
 */
@RestController
@RequestMapping("/hrs/contract/reminder")
public class HrsContractReminderController extends BaseController
{
    @Autowired
    private IHrsContractReminderService hrsContractReminderService;

    /**
     * 查询合同到期提醒列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:reminder:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsContractReminder hrsContractReminder)
    {
        startPage();
        List<HrsContractReminder> list = hrsContractReminderService.selectHrsContractReminderList(hrsContractReminder);
        return getDataTable(list);
    }

    /**
     * 导出合同到期提醒列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:reminder:export')")
    @Log(title = "合同到期提醒", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsContractReminder hrsContractReminder)
    {
        List<HrsContractReminder> list = hrsContractReminderService.selectHrsContractReminderList(hrsContractReminder);
        ExcelUtil<HrsContractReminder> util = new ExcelUtil<HrsContractReminder>(HrsContractReminder.class);
        util.exportExcel(response, list, "合同到期提醒数据");
    }

    /**
     * 获取合同到期提醒详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:reminder:query')")
    @GetMapping(value = "/{reminderId}")
    public AjaxResult getInfo(@PathVariable("reminderId") Long reminderId)
    {
        return success(hrsContractReminderService.selectHrsContractReminderByReminderId(reminderId));
    }

    /**
     * 新增合同到期提醒
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:reminder:add')")
    @Log(title = "合同到期提醒", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsContractReminder hrsContractReminder)
    {
        return toAjax(hrsContractReminderService.insertHrsContractReminder(hrsContractReminder));
    }

    /**
     * 修改合同到期提醒
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:reminder:edit')")
    @Log(title = "合同到期提醒", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsContractReminder hrsContractReminder)
    {
        return toAjax(hrsContractReminderService.updateHrsContractReminder(hrsContractReminder));
    }

    /**
     * 删除合同到期提醒
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:reminder:remove')")
    @Log(title = "合同到期提醒", businessType = BusinessType.DELETE)
    @DeleteMapping("/{reminderIds}")
    public AjaxResult remove(@PathVariable Long[] reminderIds)
    {
        return toAjax(hrsContractReminderService.deleteHrsContractReminderByReminderIds(reminderIds));
    }

    /**
     * 获取合同的到期提醒
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:reminder:query')")
    @GetMapping(value = "/contract/{contractId}")
    public AjaxResult getContractReminders(@PathVariable("contractId") Long contractId)
    {
        return success(hrsContractReminderService.selectHrsContractReminderByContractId(contractId));
    }

    /**
     * 获取未处理的提醒
     */
    @PreAuthorize("@ss.hasPermi('hrs:contract:reminder:query')")
    @GetMapping("/unhandled")
    public AjaxResult getUnhandledReminders()
    {
        return success(hrsContractReminderService.selectUnhandledReminders());
    }
} 