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
import com.henglee.hrp.hrs.salary.domain.HrsSalaryInfo;
import com.henglee.hrp.hrs.salary.service.IHrsSalaryInfoService;
import com.henglee.common.utils.poi.ExcelUtil;
import com.henglee.common.core.page.TableDataInfo;

/**
 * 工资信息Controller
 * 
 * @author henglee
 */
@RestController
@RequestMapping("/hrs/salary")
public class HrsSalaryInfoController extends BaseController
{
    @Autowired
    private IHrsSalaryInfoService hrsSalaryInfoService;

    /**
     * 查询工资信息列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsSalaryInfo hrsSalaryInfo)
    {
        startPage();
        List<HrsSalaryInfo> list = hrsSalaryInfoService.selectHrsSalaryInfoList(hrsSalaryInfo);
        return getDataTable(list);
    }

    /**
     * 导出工资信息列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:export')")
    @Log(title = "工资信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsSalaryInfo hrsSalaryInfo)
    {
        List<HrsSalaryInfo> list = hrsSalaryInfoService.selectHrsSalaryInfoList(hrsSalaryInfo);
        ExcelUtil<HrsSalaryInfo> util = new ExcelUtil<HrsSalaryInfo>(HrsSalaryInfo.class);
        util.exportExcel(response, list, "工资信息数据");
    }

    /**
     * 获取工资信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:query')")
    @GetMapping(value = "/{salaryId}")
    public AjaxResult getInfo(@PathVariable("salaryId") Long salaryId)
    {
        return success(hrsSalaryInfoService.selectHrsSalaryInfoBySalaryId(salaryId));
    }

    /**
     * 新增工资信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:add')")
    @Log(title = "工资信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsSalaryInfo hrsSalaryInfo)
    {
        return toAjax(hrsSalaryInfoService.insertHrsSalaryInfo(hrsSalaryInfo));
    }

    /**
     * 修改工资信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:edit')")
    @Log(title = "工资信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsSalaryInfo hrsSalaryInfo)
    {
        return toAjax(hrsSalaryInfoService.updateHrsSalaryInfo(hrsSalaryInfo));
    }

    /**
     * 删除工资信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:remove')")
    @Log(title = "工资信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{salaryIds}")
    public AjaxResult remove(@PathVariable Long[] salaryIds)
    {
        return toAjax(hrsSalaryInfoService.deleteHrsSalaryInfoBySalaryIds(salaryIds));
    }

    /**
     * 提交工资信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:submit')")
    @Log(title = "工资信息", businessType = BusinessType.UPDATE)
    @PutMapping("/submit/{salaryId}")
    public AjaxResult submit(@PathVariable("salaryId") Long salaryId)
    {
        return toAjax(hrsSalaryInfoService.submitHrsSalaryInfo(salaryId));
    }

    /**
     * 审批工资信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:approve')")
    @Log(title = "工资信息", businessType = BusinessType.UPDATE)
    @PutMapping("/approve")
    public AjaxResult approve(@RequestBody HrsSalaryInfo hrsSalaryInfo)
    {
        return toAjax(hrsSalaryInfoService.approveHrsSalaryInfo(hrsSalaryInfo));
    }

    /**
     * 发放工资信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:salary:pay')")
    @Log(title = "工资信息", businessType = BusinessType.UPDATE)
    @PutMapping("/pay/{salaryId}")
    public AjaxResult pay(@PathVariable("salaryId") Long salaryId)
    {
        return toAjax(hrsSalaryInfoService.payHrsSalaryInfo(salaryId));
    }
} 