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
import com.henglee.hrp.hrs.salary.domain.HrsSalaryStandard;
import com.henglee.hrp.hrs.salary.service.IHrsSalaryStandardService;
import com.henglee.common.utils.poi.ExcelUtil;
import com.henglee.common.core.page.TableDataInfo;

/**
 * 薪资标准Controller
 * 
 * @author henglee
 */
@RestController
@RequestMapping("/hrs/salary/standard")
public class HrsSalaryStandardController extends BaseController
{
    @Autowired
    private IHrsSalaryStandardService hrsSalaryStandardService;

    /**
     * 查询薪资标准列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:standard:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsSalaryStandard hrsSalaryStandard)
    {
        startPage();
        List<HrsSalaryStandard> list = hrsSalaryStandardService.selectHrsSalaryStandardList(hrsSalaryStandard);
        return getDataTable(list);
    }

    /**
     * 导出薪资标准列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:standard:export')")
    @Log(title = "薪资标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsSalaryStandard hrsSalaryStandard)
    {
        List<HrsSalaryStandard> list = hrsSalaryStandardService.selectHrsSalaryStandardList(hrsSalaryStandard);
        ExcelUtil<HrsSalaryStandard> util = new ExcelUtil<HrsSalaryStandard>(HrsSalaryStandard.class);
        util.exportExcel(response, list, "薪资标准数据");
    }

    /**
     * 获取薪资标准详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:standard:query')")
    @GetMapping(value = "/{standardId}")
    public AjaxResult getInfo(@PathVariable("standardId") Long standardId)
    {
        return success(hrsSalaryStandardService.selectHrsSalaryStandardByStandardId(standardId));
    }

    /**
     * 新增薪资标准
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:standard:add')")
    @Log(title = "薪资标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsSalaryStandard hrsSalaryStandard)
    {
        return toAjax(hrsSalaryStandardService.insertHrsSalaryStandard(hrsSalaryStandard));
    }

    /**
     * 修改薪资标准
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:standard:edit')")
    @Log(title = "薪资标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsSalaryStandard hrsSalaryStandard)
    {
        return toAjax(hrsSalaryStandardService.updateHrsSalaryStandard(hrsSalaryStandard));
    }

    /**
     * 删除薪资标准
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:standard:remove')")
    @Log(title = "薪资标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{standardIds}")
    public AjaxResult remove(@PathVariable Long[] standardIds)
    {
        return toAjax(hrsSalaryStandardService.deleteHrsSalaryStandardByStandardIds(standardIds));
    }
} 