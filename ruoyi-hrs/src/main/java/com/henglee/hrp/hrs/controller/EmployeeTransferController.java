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
import com.henglee.hrp.hrs.domain.EmployeeTransfer;
import com.henglee.hrp.hrs.service.IEmployeeTransferService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 人员异动Controller
 * 
 * @author cbh
 */
@Controller
@RequestMapping("/hrs/employee/transfer")
public class EmployeeTransferController extends BaseController
{
    private String prefix = "hrs/employee/transfer";

    @Autowired
    private IEmployeeTransferService employeeTransferService;

    @RequiresPermissions("hrs:employee:transfer:view")
    @GetMapping()
    public String transfer()
    {
        return prefix + "/index";
    }

    /**
     * 查询人员异动列表
     */
    @RequiresPermissions("hrs:employee:transfer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(EmployeeTransfer employeeTransfer)
    {
        startPage();
        List<EmployeeTransfer> list = employeeTransferService.selectEmployeeTransferList(employeeTransfer);
        return getDataTable(list);
    }

    /**
     * 导出人员异动列表
     */
    @RequiresPermissions("hrs:employee:transfer:export")
    @Log(title = "人员异动", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(EmployeeTransfer employeeTransfer)
    {
        List<EmployeeTransfer> list = employeeTransferService.selectEmployeeTransferList(employeeTransfer);
        ExcelUtil<EmployeeTransfer> util = new ExcelUtil<EmployeeTransfer>(EmployeeTransfer.class);
        return util.exportExcel(list, "人员异动数据");
    }

    /**
     * 新增人员异动
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存人员异动
     */
    @RequiresPermissions("hrs:employee:transfer:add")
    @Log(title = "人员异动", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(EmployeeTransfer employeeTransfer)
    {
        return toAjax(employeeTransferService.insertEmployeeTransfer(employeeTransfer));
    }

    /**
     * 修改人员异动
     */
    @RequiresPermissions("hrs:employee:transfer:edit")
    @GetMapping("/edit/{transferId}")
    public String edit(@PathVariable("transferId") Long transferId, ModelMap mmap)
    {
        EmployeeTransfer employeeTransfer = employeeTransferService.selectEmployeeTransferByTransferId(transferId);
        mmap.put("employeeTransfer", employeeTransfer);
        return prefix + "/edit";
    }

    /**
     * 修改保存人员异动
     */
    @RequiresPermissions("hrs:employee:transfer:edit")
    @Log(title = "人员异动", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(EmployeeTransfer employeeTransfer)
    {
        return toAjax(employeeTransferService.updateEmployeeTransfer(employeeTransfer));
    }

    /**
     * 删除人员异动
     */
    @RequiresPermissions("hrs:employee:transfer:remove")
    @Log(title = "人员异动", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(employeeTransferService.deleteEmployeeTransferByTransferIds(ids));
    }

    /**
     * 审核人员异动
     */
    @RequiresPermissions("hrs:employee:transfer:audit")
    @Log(title = "人员异动", businessType = BusinessType.UPDATE)
    @PostMapping("/audit")
    @ResponseBody
    public AjaxResult audit(EmployeeTransfer employeeTransfer)
    {
        return toAjax(employeeTransferService.auditEmployeeTransfer(employeeTransfer));
    }

    /**
     * 上传人员异动附件
     */
    @RequiresPermissions("hrs:employee:transfer:upload")
    @Log(title = "人员异动", businessType = BusinessType.UPDATE)
    @PostMapping("/upload")
    @ResponseBody
    public AjaxResult upload(EmployeeTransfer employeeTransfer)
    {
        return toAjax(employeeTransferService.updateEmployeeTransfer(employeeTransfer));
    }

    /**
     * 下载人员异动附件
     */
    @RequiresPermissions("hrs:employee:transfer:download")
    @GetMapping("/download/{fileName}")
    @ResponseBody
    public void download(@PathVariable("fileName") String fileName)
    {
        // 实现文件下载逻辑
    }
} 