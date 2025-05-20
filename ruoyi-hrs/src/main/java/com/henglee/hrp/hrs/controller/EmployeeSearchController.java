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
import com.henglee.hrp.hrs.domain.EmployeeSearch;
import com.henglee.hrp.hrs.service.IEmployeeSearchService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 人员综合查询Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/employee/search")
public class EmployeeSearchController extends BaseController
{
    @Autowired
    private IEmployeeSearchService employeeSearchService;

    /**
     * 查询人员综合信息列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:search:list')")
    @GetMapping("/list")
    public TableDataInfo list(EmployeeSearch employeeSearch)
    {
        startPage();
        List<EmployeeSearch> list = employeeSearchService.selectEmployeeSearchList(employeeSearch);
        return getDataTable(list);
    }

    /**
     * 导出人员综合信息列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:search:export')")
    @Log(title = "人员综合查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EmployeeSearch employeeSearch)
    {
        List<EmployeeSearch> list = employeeSearchService.selectEmployeeSearchExport(employeeSearch);
        ExcelUtil<EmployeeSearch> util = new ExcelUtil<EmployeeSearch>(EmployeeSearch.class);
        util.exportExcel(response, list, "人员综合信息数据");
    }
} 