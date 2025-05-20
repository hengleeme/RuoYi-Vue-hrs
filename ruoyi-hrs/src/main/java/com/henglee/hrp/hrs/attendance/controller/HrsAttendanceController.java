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
import com.henglee.hrp.hrs.attendance.domain.HrsAttendance;
import com.henglee.hrp.hrs.attendance.service.IHrsAttendanceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 考勤记录Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/attendance")
public class HrsAttendanceController extends BaseController
{
    @Autowired
    private IHrsAttendanceService hrsAttendanceService;

    /**
     * 查询考勤记录列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsAttendance hrsAttendance)
    {
        startPage();
        List<HrsAttendance> list = hrsAttendanceService.selectHrsAttendanceList(hrsAttendance);
        return getDataTable(list);
    }

    /**
     * 导出考勤记录列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:export')")
    @Log(title = "考勤记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsAttendance hrsAttendance)
    {
        List<HrsAttendance> list = hrsAttendanceService.selectHrsAttendanceList(hrsAttendance);
        ExcelUtil<HrsAttendance> util = new ExcelUtil<HrsAttendance>(HrsAttendance.class);
        util.exportExcel(response, list, "考勤记录数据");
    }

    /**
     * 获取考勤记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:query')")
    @GetMapping(value = "/{attendanceId}")
    public AjaxResult getInfo(@PathVariable("attendanceId") Long attendanceId)
    {
        return success(hrsAttendanceService.selectHrsAttendanceByAttendanceId(attendanceId));
    }

    /**
     * 新增考勤记录
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:add')")
    @Log(title = "考勤记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsAttendance hrsAttendance)
    {
        return toAjax(hrsAttendanceService.insertHrsAttendance(hrsAttendance));
    }

    /**
     * 修改考勤记录
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:edit')")
    @Log(title = "考勤记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsAttendance hrsAttendance)
    {
        return toAjax(hrsAttendanceService.updateHrsAttendance(hrsAttendance));
    }

    /**
     * 删除考勤记录
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:remove')")
    @Log(title = "考勤记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{attendanceIds}")
    public AjaxResult remove(@PathVariable Long[] attendanceIds)
    {
        return toAjax(hrsAttendanceService.deleteHrsAttendanceByAttendanceIds(attendanceIds));
    }
} 