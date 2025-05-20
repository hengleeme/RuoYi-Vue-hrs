package com.henglee.hrp.hrs.personnel.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import com.henglee.hrp.hrs.personnel.domain.HrsPersonnel;
import com.henglee.hrp.hrs.personnel.service.IHrsPersonnelService;

/**
 * 人事管理Controller
 *
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/personnel")
public class HrsPersonnelController extends BaseController {
    @Autowired
    private IHrsPersonnelService hrsPersonnelService;

    /**
     * 查询人事列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:personnel:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsPersonnel hrsPersonnel) {
        startPage();
        List<HrsPersonnel> list = hrsPersonnelService.selectHrsPersonnelList(hrsPersonnel);
        return getDataTable(list);
    }

    /**
     * 导出人事列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:personnel:export')")
    @Log(title = "人事管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsPersonnel hrsPersonnel) {
        List<HrsPersonnel> list = hrsPersonnelService.selectHrsPersonnelList(hrsPersonnel);
        ExcelUtil<HrsPersonnel> util = new ExcelUtil<>(HrsPersonnel.class);
        util.exportExcel(response, list, "人事数据");
    }

    /**
     * 获取人事详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:personnel:query')")
    @GetMapping(value = "/{personnelId}")
    public AjaxResult getInfo(@PathVariable("personnelId") Long personnelId) {
        return success(hrsPersonnelService.selectHrsPersonnelByPersonnelId(personnelId));
    }

    /**
     * 新增人事
     */
    @PreAuthorize("@ss.hasPermi('hrs:personnel:add')")
    @Log(title = "人事管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsPersonnel hrsPersonnel) {
        return toAjax(hrsPersonnelService.insertHrsPersonnel(hrsPersonnel));
    }

    /**
     * 修改人事
     */
    @PreAuthorize("@ss.hasPermi('hrs:personnel:edit')")
    @Log(title = "人事管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsPersonnel hrsPersonnel) {
        return toAjax(hrsPersonnelService.updateHrsPersonnel(hrsPersonnel));
    }

    /**
     * 删除人事
     */
    @PreAuthorize("@ss.hasPermi('hrs:personnel:remove')")
    @Log(title = "人事管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{personnelIds}")
    public AjaxResult remove(@PathVariable Long[] personnelIds) {
        return toAjax(hrsPersonnelService.deleteHrsPersonnelByPersonnelIds(personnelIds));
    }
} 