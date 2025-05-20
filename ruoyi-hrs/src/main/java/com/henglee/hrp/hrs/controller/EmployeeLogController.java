package com.henglee.hrp.hrs.controller;

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
import com.henglee.hrp.hrs.domain.EmployeeLog;
import com.henglee.hrp.hrs.service.IEmployeeLogService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 人员信息变更日志Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/employee/log")
public class EmployeeLogController extends BaseController
{
    @Autowired
    private IEmployeeLogService employeeLogService;

    /**
     * 查询人员信息变更日志列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:log:list')")
    @GetMapping("/list")
    public TableDataInfo list(EmployeeLog employeeLog)
    {
        startPage();
        List<EmployeeLog> list = employeeLogService.selectEmployeeLogList(employeeLog);
        return getDataTable(list);
    }

    /**
     * 导出人员信息变更日志列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:log:export')")
    @Log(title = "人员信息变更日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EmployeeLog employeeLog)
    {
        List<EmployeeLog> list = employeeLogService.selectEmployeeLogList(employeeLog);
        ExcelUtil<EmployeeLog> util = new ExcelUtil<EmployeeLog>(EmployeeLog.class);
        util.exportExcel(response, list, "人员信息变更日志数据");
    }

    /**
     * 获取人员信息变更日志详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:log:query')")
    @GetMapping(value = "/{logId}")
    public AjaxResult getInfo(@PathVariable("logId") Long logId)
    {
        return success(employeeLogService.selectEmployeeLogByLogId(logId));
    }

    /**
     * 新增人员信息变更日志
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:log:add')")
    @Log(title = "人员信息变更日志", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EmployeeLog employeeLog)
    {
        return toAjax(employeeLogService.insertEmployeeLog(employeeLog));
    }

    /**
     * 修改人员信息变更日志
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:log:edit')")
    @Log(title = "人员信息变更日志", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EmployeeLog employeeLog)
    {
        return toAjax(employeeLogService.updateEmployeeLog(employeeLog));
    }

    /**
     * 删除人员信息变更日志
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:log:remove')")
    @Log(title = "人员信息变更日志", businessType = BusinessType.DELETE)
    @DeleteMapping("/{logIds}")
    public AjaxResult remove(@PathVariable Long[] logIds)
    {
        return toAjax(employeeLogService.deleteEmployeeLogByLogIds(logIds));
    }
} 