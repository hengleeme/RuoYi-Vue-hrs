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
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceSchedule;
import com.henglee.hrp.hrs.attendance.service.IHrsAttendanceScheduleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 排班管理Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/attendance/schedule")
public class HrsAttendanceScheduleController extends BaseController
{
    @Autowired
    private IHrsAttendanceScheduleService hrsAttendanceScheduleService;

    /**
     * 查询排班列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:schedule:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsAttendanceSchedule hrsAttendanceSchedule)
    {
        startPage();
        List<HrsAttendanceSchedule> list = hrsAttendanceScheduleService.selectHrsAttendanceScheduleList(hrsAttendanceSchedule);
        return getDataTable(list);
    }

    /**
     * 导出排班列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:schedule:export')")
    @Log(title = "排班管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsAttendanceSchedule hrsAttendanceSchedule)
    {
        List<HrsAttendanceSchedule> list = hrsAttendanceScheduleService.selectHrsAttendanceScheduleList(hrsAttendanceSchedule);
        ExcelUtil<HrsAttendanceSchedule> util = new ExcelUtil<HrsAttendanceSchedule>(HrsAttendanceSchedule.class);
        util.exportExcel(response, list, "排班数据");
    }

    /**
     * 获取排班详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:schedule:query')")
    @GetMapping(value = "/{scheduleId}")
    public AjaxResult getInfo(@PathVariable("scheduleId") Long scheduleId)
    {
        return success(hrsAttendanceScheduleService.selectHrsAttendanceScheduleByScheduleId(scheduleId));
    }

    /**
     * 新增排班
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:schedule:add')")
    @Log(title = "排班管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsAttendanceSchedule hrsAttendanceSchedule)
    {
        return toAjax(hrsAttendanceScheduleService.insertHrsAttendanceSchedule(hrsAttendanceSchedule));
    }

    /**
     * 修改排班
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:schedule:edit')")
    @Log(title = "排班管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsAttendanceSchedule hrsAttendanceSchedule)
    {
        return toAjax(hrsAttendanceScheduleService.updateHrsAttendanceSchedule(hrsAttendanceSchedule));
    }

    /**
     * 删除排班
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:schedule:remove')")
    @Log(title = "排班管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{scheduleIds}")
    public AjaxResult remove(@PathVariable Long[] scheduleIds)
    {
        return toAjax(hrsAttendanceScheduleService.deleteHrsAttendanceScheduleByScheduleIds(scheduleIds));
    }
} 