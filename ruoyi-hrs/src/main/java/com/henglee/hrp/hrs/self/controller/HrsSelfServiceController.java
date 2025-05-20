package com.henglee.hrp.hrs.self.controller;

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
import com.henglee.hrp.common.annotation.Log;
import com.henglee.hrp.common.core.controller.BaseController;
import com.henglee.hrp.common.core.domain.AjaxResult;
import com.henglee.hrp.common.enums.BusinessType;
import com.henglee.hrp.hrs.self.domain.HrsSelfService;
import com.henglee.hrp.hrs.self.service.IHrsSelfServiceService;
import com.henglee.hrp.common.utils.poi.ExcelUtil;
import com.henglee.hrp.common.core.page.TableDataInfo;

/**
 * 员工自助服务Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/self")
public class HrsSelfServiceController extends BaseController
{
    @Autowired
    private IHrsSelfServiceService hrsSelfServiceService;

    /**
     * 查询员工自助服务列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:self:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsSelfService hrsSelfService)
    {
        startPage();
        List<HrsSelfService> list = hrsSelfServiceService.selectHrsSelfServiceList(hrsSelfService);
        return getDataTable(list);
    }

    /**
     * 导出员工自助服务列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:self:export')")
    @Log(title = "员工自助服务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsSelfService hrsSelfService)
    {
        List<HrsSelfService> list = hrsSelfServiceService.selectHrsSelfServiceList(hrsSelfService);
        ExcelUtil<HrsSelfService> util = new ExcelUtil<HrsSelfService>(HrsSelfService.class);
        util.exportExcel(response, list, "员工自助服务数据");
    }

    /**
     * 获取员工自助服务详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:self:query')")
    @GetMapping(value = "/{serviceId}")
    public AjaxResult getInfo(@PathVariable("serviceId") Long serviceId)
    {
        return success(hrsSelfServiceService.selectHrsSelfServiceByServiceId(serviceId));
    }

    /**
     * 新增员工自助服务
     */
    @PreAuthorize("@ss.hasPermi('hrs:self:add')")
    @Log(title = "员工自助服务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsSelfService hrsSelfService)
    {
        return toAjax(hrsSelfServiceService.insertHrsSelfService(hrsSelfService));
    }

    /**
     * 修改员工自助服务
     */
    @PreAuthorize("@ss.hasPermi('hrs:self:edit')")
    @Log(title = "员工自助服务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsSelfService hrsSelfService)
    {
        return toAjax(hrsSelfServiceService.updateHrsSelfService(hrsSelfService));
    }

    /**
     * 删除员工自助服务
     */
    @PreAuthorize("@ss.hasPermi('hrs:self:remove')")
    @Log(title = "员工自助服务", businessType = BusinessType.DELETE)
    @DeleteMapping("/{serviceIds}")
    public AjaxResult remove(@PathVariable Long[] serviceIds)
    {
        return toAjax(hrsSelfServiceService.deleteHrsSelfServiceByServiceIds(serviceIds));
    }
} 