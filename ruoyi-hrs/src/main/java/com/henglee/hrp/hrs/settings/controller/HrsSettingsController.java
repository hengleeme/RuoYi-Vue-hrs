package com.henglee.hrp.hrs.settings.controller;

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
import com.henglee.hrp.hrs.settings.domain.HrsSettings;
import com.henglee.hrp.hrs.settings.service.IHrsSettingsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 系统设置Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/settings")
public class HrsSettingsController extends BaseController
{
    @Autowired
    private IHrsSettingsService hrsSettingsService;

    /**
     * 查询系统设置列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:settings:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsSettings hrsSettings)
    {
        startPage();
        List<HrsSettings> list = hrsSettingsService.selectHrsSettingsList(hrsSettings);
        return getDataTable(list);
    }

    /**
     * 导出系统设置列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:settings:export')")
    @Log(title = "系统设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsSettings hrsSettings)
    {
        List<HrsSettings> list = hrsSettingsService.selectHrsSettingsList(hrsSettings);
        ExcelUtil<HrsSettings> util = new ExcelUtil<HrsSettings>(HrsSettings.class);
        util.exportExcel(response, list, "系统设置数据");
    }

    /**
     * 获取系统设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:settings:query')")
    @GetMapping(value = "/{settingsId}")
    public AjaxResult getInfo(@PathVariable("settingsId") Long settingsId)
    {
        return success(hrsSettingsService.selectHrsSettingsBySettingsId(settingsId));
    }

    /**
     * 新增系统设置
     */
    @PreAuthorize("@ss.hasPermi('hrs:settings:add')")
    @Log(title = "系统设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsSettings hrsSettings)
    {
        return toAjax(hrsSettingsService.insertHrsSettings(hrsSettings));
    }

    /**
     * 修改系统设置
     */
    @PreAuthorize("@ss.hasPermi('hrs:settings:edit')")
    @Log(title = "系统设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsSettings hrsSettings)
    {
        return toAjax(hrsSettingsService.updateHrsSettings(hrsSettings));
    }

    /**
     * 删除系统设置
     */
    @PreAuthorize("@ss.hasPermi('hrs:settings:remove')")
    @Log(title = "系统设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{settingsIds}")
    public AjaxResult remove(@PathVariable Long[] settingsIds)
    {
        return toAjax(hrsSettingsService.deleteHrsSettingsBySettingsIds(settingsIds));
    }
} 