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
import com.henglee.common.annotation.Log;
import com.henglee.common.core.controller.BaseController;
import com.henglee.common.core.domain.AjaxResult;
import com.henglee.common.enums.BusinessType;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceReport;
import com.henglee.hrp.hrs.attendance.service.IHrsAttendanceReportService;
import com.henglee.common.utils.poi.ExcelUtil;
import com.henglee.common.core.page.TableDataInfo;

/**
 * 考勤结果上报Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/attendance/report")
public class HrsAttendanceReportController extends BaseController
{
    @Autowired
    private IHrsAttendanceReportService hrsAttendanceReportService;

    /**
     * 查询考勤结果上报列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:report:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsAttendanceReport hrsAttendanceReport)
    {
        startPage();
        List<HrsAttendanceReport> list = hrsAttendanceReportService.selectHrsAttendanceReportList(hrsAttendanceReport);
        return getDataTable(list);
    }

    /**
     * 导出考勤结果上报列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:report:export')")
    @Log(title = "考勤结果上报", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsAttendanceReport hrsAttendanceReport)
    {
        List<HrsAttendanceReport> list = hrsAttendanceReportService.selectHrsAttendanceReportList(hrsAttendanceReport);
        ExcelUtil<HrsAttendanceReport> util = new ExcelUtil<HrsAttendanceReport>(HrsAttendanceReport.class);
        util.exportExcel(response, list, "考勤结果上报数据");
    }

    /**
     * 获取考勤结果上报详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:report:query')")
    @GetMapping(value = "/{reportId}")
    public AjaxResult getInfo(@PathVariable("reportId") Long reportId)
    {
        return success(hrsAttendanceReportService.selectHrsAttendanceReportByReportId(reportId));
    }

    /**
     * 新增考勤结果上报
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:report:add')")
    @Log(title = "考勤结果上报", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsAttendanceReport hrsAttendanceReport)
    {
        return toAjax(hrsAttendanceReportService.insertHrsAttendanceReport(hrsAttendanceReport));
    }

    /**
     * 修改考勤结果上报
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:report:edit')")
    @Log(title = "考勤结果上报", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsAttendanceReport hrsAttendanceReport)
    {
        return toAjax(hrsAttendanceReportService.updateHrsAttendanceReport(hrsAttendanceReport));
    }

    /**
     * 删除考勤结果上报
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:report:remove')")
    @Log(title = "考勤结果上报", businessType = BusinessType.DELETE)
    @DeleteMapping("/{reportIds}")
    public AjaxResult remove(@PathVariable Long[] reportIds)
    {
        return toAjax(hrsAttendanceReportService.deleteHrsAttendanceReportByReportIds(reportIds));
    }
} 