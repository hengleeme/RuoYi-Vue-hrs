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
import com.henglee.hrp.common.annotation.Log;
import com.henglee.hrp.common.core.controller.BaseController;
import com.henglee.hrp.common.core.domain.AjaxResult;
import com.henglee.hrp.common.enums.BusinessType;
import com.henglee.hrp.hrs.attendance.domain.HrsAttendanceLeave;
import com.henglee.hrp.hrs.attendance.service.IHrsAttendanceLeaveService;
import com.henglee.hrp.common.utils.poi.ExcelUtil;
import com.henglee.hrp.common.core.page.TableDataInfo;

/**
 * 请假管理Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/attendance/leave")
public class HrsAttendanceLeaveController extends BaseController
{
    @Autowired
    private IHrsAttendanceLeaveService hrsAttendanceLeaveService;

    /**
     * 查询请假列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:leave:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsAttendanceLeave hrsAttendanceLeave)
    {
        startPage();
        List<HrsAttendanceLeave> list = hrsAttendanceLeaveService.selectHrsAttendanceLeaveList(hrsAttendanceLeave);
        return getDataTable(list);
    }

    /**
     * 导出请假列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:leave:export')")
    @Log(title = "请假管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsAttendanceLeave hrsAttendanceLeave)
    {
        List<HrsAttendanceLeave> list = hrsAttendanceLeaveService.selectHrsAttendanceLeaveList(hrsAttendanceLeave);
        ExcelUtil<HrsAttendanceLeave> util = new ExcelUtil<HrsAttendanceLeave>(HrsAttendanceLeave.class);
        util.exportExcel(response, list, "请假数据");
    }

    /**
     * 获取请假详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:leave:query')")
    @GetMapping(value = "/{leaveId}")
    public AjaxResult getInfo(@PathVariable("leaveId") Long leaveId)
    {
        return success(hrsAttendanceLeaveService.selectHrsAttendanceLeaveByLeaveId(leaveId));
    }

    /**
     * 新增请假
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:leave:add')")
    @Log(title = "请假管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsAttendanceLeave hrsAttendanceLeave)
    {
        return toAjax(hrsAttendanceLeaveService.insertHrsAttendanceLeave(hrsAttendanceLeave));
    }

    /**
     * 修改请假
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:leave:edit')")
    @Log(title = "请假管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsAttendanceLeave hrsAttendanceLeave)
    {
        return toAjax(hrsAttendanceLeaveService.updateHrsAttendanceLeave(hrsAttendanceLeave));
    }

    /**
     * 删除请假
     */
    @PreAuthorize("@ss.hasPermi('hrs:attendance:leave:remove')")
    @Log(title = "请假管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{leaveIds}")
    public AjaxResult remove(@PathVariable Long[] leaveIds)
    {
        return toAjax(hrsAttendanceLeaveService.deleteHrsAttendanceLeaveByLeaveIds(leaveIds));
    }
} 