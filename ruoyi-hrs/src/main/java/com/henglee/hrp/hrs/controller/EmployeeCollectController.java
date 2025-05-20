package com.henglee.hrp.hrs.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.henglee.hrp.hrs.domain.EmployeeCollect;
import com.henglee.hrp.hrs.service.IEmployeeCollectService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 人员信息采集Controller
 * 
 * @author cbh
 */
@Controller
@RequestMapping("/hrs/employee/collect")
public class EmployeeCollectController extends BaseController
{
    private String prefix = "hrs/employee/collect";

    @Autowired
    private IEmployeeCollectService employeeCollectService;

    @RequiresPermissions("hrs:employee:collect:view")
    @GetMapping()
    public String collect()
    {
        return prefix + "/index";
    }

    /**
     * 查询人员信息采集列表
     */
    @RequiresPermissions("hrs:employee:collect:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(EmployeeCollect employeeCollect)
    {
        startPage();
        List<EmployeeCollect> list = employeeCollectService.selectEmployeeCollectList(employeeCollect);
        return getDataTable(list);
    }

    /**
     * 导出人员信息采集列表
     */
    @RequiresPermissions("hrs:employee:collect:export")
    @Log(title = "人员信息采集", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(EmployeeCollect employeeCollect)
    {
        List<EmployeeCollect> list = employeeCollectService.selectEmployeeCollectList(employeeCollect);
        ExcelUtil<EmployeeCollect> util = new ExcelUtil<EmployeeCollect>(EmployeeCollect.class);
        return util.exportExcel(list, "人员信息采集数据");
    }

    /**
     * 新增人员信息采集
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存人员信息采集
     */
    @RequiresPermissions("hrs:employee:collect:add")
    @Log(title = "人员信息采集", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(EmployeeCollect employeeCollect)
    {
        return toAjax(employeeCollectService.insertEmployeeCollect(employeeCollect));
    }

    /**
     * 修改人员信息采集
     */
    @RequiresPermissions("hrs:employee:collect:edit")
    @GetMapping("/edit/{collectId}")
    public String edit(@PathVariable("collectId") Long collectId, ModelMap mmap)
    {
        EmployeeCollect employeeCollect = employeeCollectService.selectEmployeeCollectByCollectId(collectId);
        mmap.put("employeeCollect", employeeCollect);
        return prefix + "/edit";
    }

    /**
     * 修改保存人员信息采集
     */
    @RequiresPermissions("hrs:employee:collect:edit")
    @Log(title = "人员信息采集", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(EmployeeCollect employeeCollect)
    {
        return toAjax(employeeCollectService.updateEmployeeCollect(employeeCollect));
    }

    /**
     * 删除人员信息采集
     */
    @RequiresPermissions("hrs:employee:collect:remove")
    @Log(title = "人员信息采集", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(employeeCollectService.deleteEmployeeCollectByCollectIds(ids));
    }

    /**
     * 审核人员信息采集
     */
    @RequiresPermissions("hrs:employee:collect:audit")
    @Log(title = "人员信息采集", businessType = BusinessType.UPDATE)
    @PostMapping("/audit")
    @ResponseBody
    public AjaxResult audit(EmployeeCollect employeeCollect)
    {
        return toAjax(employeeCollectService.auditEmployeeCollect(employeeCollect));
    }

    /**
     * 上传人员信息采集附件
     */
    @RequiresPermissions("hrs:employee:collect:upload")
    @Log(title = "人员信息采集", businessType = BusinessType.UPDATE)
    @PostMapping("/upload")
    @ResponseBody
    public AjaxResult upload(EmployeeCollect employeeCollect)
    {
        return toAjax(employeeCollectService.updateEmployeeCollect(employeeCollect));
    }

    /**
     * 下载人员信息采集附件
     */
    @RequiresPermissions("hrs:employee:collect:download")
    @GetMapping("/download/{fileName}")
    @ResponseBody
    public void download(@PathVariable("fileName") String fileName)
    {
        // 实现文件下载逻辑
    }
} 