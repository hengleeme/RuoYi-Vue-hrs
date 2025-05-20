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
import com.henglee.hrp.hrs.salary.domain.HrsSalarySystem;
import com.henglee.hrp.hrs.salary.service.IHrsSalarySystemService;
import com.henglee.common.utils.poi.ExcelUtil;
import com.henglee.common.core.page.TableDataInfo;

/**
 * 薪酬体系Controller
 * 
 * @author henglee
 */
@RestController
@RequestMapping("/hrs/salary/system")
public class HrsSalarySystemController extends BaseController
{
    @Autowired
    private IHrsSalarySystemService hrsSalarySystemService;

    /**
     * 查询薪酬体系列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:system:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsSalarySystem hrsSalarySystem)
    {
        startPage();
        List<HrsSalarySystem> list = hrsSalarySystemService.selectHrsSalarySystemList(hrsSalarySystem);
        return getDataTable(list);
    }

    /**
     * 导出薪酬体系列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:system:export')")
    @Log(title = "薪酬体系", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsSalarySystem hrsSalarySystem)
    {
        List<HrsSalarySystem> list = hrsSalarySystemService.selectHrsSalarySystemList(hrsSalarySystem);
        ExcelUtil<HrsSalarySystem> util = new ExcelUtil<HrsSalarySystem>(HrsSalarySystem.class);
        util.exportExcel(response, list, "薪酬体系数据");
    }

    /**
     * 获取薪酬体系详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:system:query')")
    @GetMapping(value = "/{systemId}")
    public AjaxResult getInfo(@PathVariable("systemId") Long systemId)
    {
        return success(hrsSalarySystemService.selectHrsSalarySystemBySystemId(systemId));
    }

    /**
     * 新增薪酬体系
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:system:add')")
    @Log(title = "薪酬体系", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsSalarySystem hrsSalarySystem)
    {
        return toAjax(hrsSalarySystemService.insertHrsSalarySystem(hrsSalarySystem));
    }

    /**
     * 修改薪酬体系
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:system:edit')")
    @Log(title = "薪酬体系", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsSalarySystem hrsSalarySystem)
    {
        return toAjax(hrsSalarySystemService.updateHrsSalarySystem(hrsSalarySystem));
    }

    /**
     * 删除薪酬体系
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:system:remove')")
    @Log(title = "薪酬体系", businessType = BusinessType.DELETE)
	@DeleteMapping("/{systemIds}")
    public AjaxResult remove(@PathVariable Long[] systemIds)
    {
        return toAjax(hrsSalarySystemService.deleteHrsSalarySystemBySystemIds(systemIds));
    }
} 