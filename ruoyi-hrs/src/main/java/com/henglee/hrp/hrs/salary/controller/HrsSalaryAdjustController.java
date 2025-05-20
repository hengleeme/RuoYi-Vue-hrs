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
import com.henglee.hrp.hrs.salary.domain.HrsSalaryAdjust;
import com.henglee.hrp.hrs.salary.service.IHrsSalaryAdjustService;
import com.henglee.common.utils.poi.ExcelUtil;
import com.henglee.common.core.page.TableDataInfo;

/**
 * 定薪调薪Controller
 * 
 * @author henglee
 * @date 2024-03-20
 */
@RestController
@RequestMapping("/hrs/salary/adjust")
public class HrsSalaryAdjustController extends BaseController
{
    @Autowired
    private IHrsSalaryAdjustService hrsSalaryAdjustService;

    /**
     * 查询定薪调薪列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:adjust:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsSalaryAdjust hrsSalaryAdjust)
    {
        startPage();
        List<HrsSalaryAdjust> list = hrsSalaryAdjustService.selectHrsSalaryAdjustList(hrsSalaryAdjust);
        return getDataTable(list);
    }

    /**
     * 导出定薪调薪列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:adjust:export')")
    @Log(title = "定薪调薪", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsSalaryAdjust hrsSalaryAdjust)
    {
        List<HrsSalaryAdjust> list = hrsSalaryAdjustService.selectHrsSalaryAdjustList(hrsSalaryAdjust);
        ExcelUtil<HrsSalaryAdjust> util = new ExcelUtil<HrsSalaryAdjust>(HrsSalaryAdjust.class);
        util.exportExcel(response, list, "定薪调薪数据");
    }

    /**
     * 获取定薪调薪详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:adjust:query')")
    @GetMapping(value = "/{adjustId}")
    public AjaxResult getInfo(@PathVariable("adjustId") Long adjustId)
    {
        return success(hrsSalaryAdjustService.selectHrsSalaryAdjustByAdjustId(adjustId));
    }

    /**
     * 新增定薪调薪
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:adjust:add')")
    @Log(title = "定薪调薪", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsSalaryAdjust hrsSalaryAdjust)
    {
        return toAjax(hrsSalaryAdjustService.insertHrsSalaryAdjust(hrsSalaryAdjust));
    }

    /**
     * 修改定薪调薪
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:adjust:edit')")
    @Log(title = "定薪调薪", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsSalaryAdjust hrsSalaryAdjust)
    {
        return toAjax(hrsSalaryAdjustService.updateHrsSalaryAdjust(hrsSalaryAdjust));
    }

    /**
     * 删除定薪调薪
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:adjust:remove')")
    @Log(title = "定薪调薪", businessType = BusinessType.DELETE)
	@DeleteMapping("/{adjustIds}")
    public AjaxResult remove(@PathVariable Long[] adjustIds)
    {
        return toAjax(hrsSalaryAdjustService.deleteHrsSalaryAdjustByAdjustIds(adjustIds));
    }

    /**
     * 提交定薪调薪
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:adjust:submit')")
    @Log(title = "定薪调薪", businessType = BusinessType.UPDATE)
    @PutMapping("/submit/{adjustId}")
    public AjaxResult submit(@PathVariable Long adjustId)
    {
        return toAjax(hrsSalaryAdjustService.submitHrsSalaryAdjust(adjustId));
    }

    /**
     * 审批定薪调薪
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:adjust:approve')")
    @Log(title = "定薪调薪", businessType = BusinessType.UPDATE)
    @PutMapping("/approve")
    public AjaxResult approve(@RequestBody HrsSalaryAdjust hrsSalaryAdjust)
    {
        return toAjax(hrsSalaryAdjustService.approveHrsSalaryAdjust(hrsSalaryAdjust));
    }
} 