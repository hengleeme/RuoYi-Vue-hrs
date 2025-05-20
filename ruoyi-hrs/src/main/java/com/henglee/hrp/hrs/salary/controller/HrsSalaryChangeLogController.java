package com.henglee.hrp.hrs.salary.controller;

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
import com.henglee.hrp.hrs.salary.domain.HrsSalaryChangeLog;
import com.henglee.hrp.hrs.salary.service.IHrsSalaryChangeLogService;
import com.henglee.common.utils.poi.ExcelUtil;
import com.henglee.common.core.page.TableDataInfo;

/**
 * 薪酬变更日志Controller
 * 
 * @author henglee
 */
@RestController
@RequestMapping("/hrs/salary/log")
public class HrsSalaryChangeLogController extends BaseController
{
    @Autowired
    private IHrsSalaryChangeLogService hrsSalaryChangeLogService;

    /**
     * 查询薪酬变更日志列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:log:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsSalaryChangeLog hrsSalaryChangeLog)
    {
        startPage();
        List<HrsSalaryChangeLog> list = hrsSalaryChangeLogService.selectHrsSalaryChangeLogList(hrsSalaryChangeLog);
        return getDataTable(list);
    }

    /**
     * 导出薪酬变更日志列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:log:export')")
    @Log(title = "薪酬变更日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsSalaryChangeLog hrsSalaryChangeLog)
    {
        List<HrsSalaryChangeLog> list = hrsSalaryChangeLogService.selectHrsSalaryChangeLogList(hrsSalaryChangeLog);
        ExcelUtil<HrsSalaryChangeLog> util = new ExcelUtil<HrsSalaryChangeLog>(HrsSalaryChangeLog.class);
        util.exportExcel(response, list, "薪酬变更日志数据");
    }

    /**
     * 获取薪酬变更日志详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:log:query')")
    @GetMapping(value = "/{logId}")
    public AjaxResult getInfo(@PathVariable("logId") Long logId)
    {
        return success(hrsSalaryChangeLogService.selectHrsSalaryChangeLogByLogId(logId));
    }

    /**
     * 新增薪酬变更日志
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:log:add')")
    @Log(title = "薪酬变更日志", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsSalaryChangeLog hrsSalaryChangeLog)
    {
        return toAjax(hrsSalaryChangeLogService.insertHrsSalaryChangeLog(hrsSalaryChangeLog));
    }

    /**
     * 修改薪酬变更日志
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:log:edit')")
    @Log(title = "薪酬变更日志", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsSalaryChangeLog hrsSalaryChangeLog)
    {
        return toAjax(hrsSalaryChangeLogService.updateHrsSalaryChangeLog(hrsSalaryChangeLog));
    }

    /**
     * 删除薪酬变更日志
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:log:remove')")
    @Log(title = "薪酬变更日志", businessType = BusinessType.DELETE)
    @DeleteMapping("/{logIds}")
    public AjaxResult remove(@PathVariable Long[] logIds)
    {
        return toAjax(hrsSalaryChangeLogService.deleteHrsSalaryChangeLogByLogIds(logIds));
    }
} 