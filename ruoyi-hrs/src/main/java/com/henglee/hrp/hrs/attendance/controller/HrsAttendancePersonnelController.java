package com.henglee.hrp.hrs.attendance.controller;

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
import com.henglee.hrp.hrs.attendance.domain.HrsAttendancePersonnel;
import com.henglee.hrp.hrs.attendance.service.IHrsAttendancePersonnelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 考勤人员管理Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/attendance/personnel")
public class HrsAttendancePersonnelController extends BaseController
{
    @Autowired
    private IHrsAttendancePersonnelService hrsAttendancePersonnelService;

    /**
     * 查询考勤人员列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:personnel:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsAttendancePersonnel hrsAttendancePersonnel)
    {
        startPage();
        List<HrsAttendancePersonnel> list = hrsAttendancePersonnelService.selectHrsAttendancePersonnelList(hrsAttendancePersonnel);
        return getDataTable(list);
    }

    /**
     * 导出考勤人员列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:personnel:export')")
    @Log(title = "考勤人员管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsAttendancePersonnel hrsAttendancePersonnel)
    {
        List<HrsAttendancePersonnel> list = hrsAttendancePersonnelService.selectHrsAttendancePersonnelList(hrsAttendancePersonnel);
        ExcelUtil<HrsAttendancePersonnel> util = new ExcelUtil<HrsAttendancePersonnel>(HrsAttendancePersonnel.class);
        util.exportExcel(response, list, "考勤人员数据");
    }

    /**
     * 获取考勤人员详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:personnel:query')")
    @GetMapping(value = "/{personnelId}")
    public AjaxResult getInfo(@PathVariable("personnelId") Long personnelId)
    {
        return success(hrsAttendancePersonnelService.selectHrsAttendancePersonnelByPersonnelId(personnelId));
    }

    /**
     * 新增考勤人员
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:personnel:add')")
    @Log(title = "考勤人员管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsAttendancePersonnel hrsAttendancePersonnel)
    {
        return toAjax(hrsAttendancePersonnelService.insertHrsAttendancePersonnel(hrsAttendancePersonnel));
    }

    /**
     * 修改考勤人员
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:personnel:edit')")
    @Log(title = "考勤人员管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsAttendancePersonnel hrsAttendancePersonnel)
    {
        return toAjax(hrsAttendancePersonnelService.updateHrsAttendancePersonnel(hrsAttendancePersonnel));
    }

    /**
     * 删除考勤人员
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:personnel:remove')")
    @Log(title = "考勤人员管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{personnelIds}")
    public AjaxResult remove(@PathVariable Long[] personnelIds)
    {
        return toAjax(hrsAttendancePersonnelService.deleteHrsAttendancePersonnelByPersonnelIds(personnelIds));
    }
} 