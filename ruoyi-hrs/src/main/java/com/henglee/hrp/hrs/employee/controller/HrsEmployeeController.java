package com.henglee.hrp.hrs.employee.controller;

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
import com.henglee.hrp.hrs.employee.domain.HrsEmployee;
import com.henglee.hrp.hrs.employee.service.IHrsEmployeeService;
import com.henglee.common.utils.poi.ExcelUtil;
import com.henglee.common.core.page.TableDataInfo;

/**
 * 人员基本信息Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/employee")
public class HrsEmployeeController extends BaseController
{
    @Autowired
    private IHrsEmployeeService hrsEmployeeService;

    /**
     * 查询人员基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsEmployee hrsEmployee)
    {
        startPage();
        List<HrsEmployee> list = hrsEmployeeService.selectHrsEmployeeList(hrsEmployee);
        return getDataTable(list);
    }

    /**
     * 导出人员基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:export')")
    @Log(title = "人员基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsEmployee hrsEmployee)
    {
        List<HrsEmployee> list = hrsEmployeeService.selectHrsEmployeeList(hrsEmployee);
        ExcelUtil<HrsEmployee> util = new ExcelUtil<HrsEmployee>(HrsEmployee.class);
        util.exportExcel(response, list, "人员基本信息数据");
    }

    /**
     * 获取人员基本信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:query')")
    @GetMapping(value = "/{employeeId}")
    public AjaxResult getInfo(@PathVariable("employeeId") Long employeeId)
    {
        return success(hrsEmployeeService.selectHrsEmployeeByEmployeeId(employeeId));
    }

    /**
     * 新增人员基本信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:add')")
    @Log(title = "人员基本信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsEmployee hrsEmployee)
    {
        return toAjax(hrsEmployeeService.insertHrsEmployee(hrsEmployee));
    }

    /**
     * 修改人员基本信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:edit')")
    @Log(title = "人员基本信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsEmployee hrsEmployee)
    {
        return toAjax(hrsEmployeeService.updateHrsEmployee(hrsEmployee));
    }

    /**
     * 删除人员基本信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:remove')")
    @Log(title = "人员基本信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{employeeIds}")
    public AjaxResult remove(@PathVariable Long[] employeeIds)
    {
        return toAjax(hrsEmployeeService.deleteHrsEmployeeByEmployeeIds(employeeIds));
    }

    /**
     * 根据工号查询人员信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:query')")
    @GetMapping("/no/{employeeNo}")
    public AjaxResult getInfoByEmployeeNo(@PathVariable("employeeNo") String employeeNo)
    {
        return success(hrsEmployeeService.selectHrsEmployeeByEmployeeNo(employeeNo));
    }

    /**
     * 根据身份证号查询人员信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:query')")
    @GetMapping("/idcard/{idCard}")
    public AjaxResult getInfoByIdCard(@PathVariable("idCard") String idCard)
    {
        return success(hrsEmployeeService.selectHrsEmployeeByIdCard(idCard));
    }

    /**
     * 更新人员工龄
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:edit')")
    @Log(title = "人员基本信息", businessType = BusinessType.UPDATE)
    @PutMapping("/workyears/{employeeId}")
    public AjaxResult updateWorkYears(@PathVariable("employeeId") Long employeeId)
    {
        return toAjax(hrsEmployeeService.updateHrsEmployeeWorkYears(employeeId));
    }

    /**
     * 批量更新人员工龄
     */
    @PreAuthorize("@ss.hasPermi('hrs:employee:edit')")
    @Log(title = "人员基本信息", businessType = BusinessType.UPDATE)
    @PutMapping("/workyears/batch")
    public AjaxResult updateWorkYearsBatch()
    {
        return toAjax(hrsEmployeeService.updateHrsEmployeeWorkYearsBatch());
    }
} 