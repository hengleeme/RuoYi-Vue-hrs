package com.henglee.hrp.hrs.recruitment.controller;

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
import com.henglee.hrp.hrs.recruitment.domain.HrsRecruitment;
import com.henglee.hrp.hrs.recruitment.service.IHrsRecruitmentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 招聘信息Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/recruitment")
public class HrsRecruitmentController extends BaseController
{
    @Autowired
    private IHrsRecruitmentService hrsRecruitmentService;

    /**
     * 查询招聘信息列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:recruitment:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsRecruitment hrsRecruitment)
    {
        startPage();
        List<HrsRecruitment> list = hrsRecruitmentService.selectHrsRecruitmentList(hrsRecruitment);
        return getDataTable(list);
    }

    /**
     * 导出招聘信息列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:recruitment:export')")
    @Log(title = "招聘信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsRecruitment hrsRecruitment)
    {
        List<HrsRecruitment> list = hrsRecruitmentService.selectHrsRecruitmentList(hrsRecruitment);
        ExcelUtil<HrsRecruitment> util = new ExcelUtil<HrsRecruitment>(HrsRecruitment.class);
        util.exportExcel(response, list, "招聘信息数据");
    }

    /**
     * 获取招聘信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:recruitment:query')")
    @GetMapping(value = "/{recruitmentId}")
    public AjaxResult getInfo(@PathVariable("recruitmentId") Long recruitmentId)
    {
        return success(hrsRecruitmentService.selectHrsRecruitmentByRecruitmentId(recruitmentId));
    }

    /**
     * 新增招聘信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:recruitment:add')")
    @Log(title = "招聘信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsRecruitment hrsRecruitment)
    {
        return toAjax(hrsRecruitmentService.insertHrsRecruitment(hrsRecruitment));
    }

    /**
     * 修改招聘信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:recruitment:edit')")
    @Log(title = "招聘信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsRecruitment hrsRecruitment)
    {
        return toAjax(hrsRecruitmentService.updateHrsRecruitment(hrsRecruitment));
    }

    /**
     * 删除招聘信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:recruitment:remove')")
    @Log(title = "招聘信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{recruitmentIds}")
    public AjaxResult remove(@PathVariable Long[] recruitmentIds)
    {
        return toAjax(hrsRecruitmentService.deleteHrsRecruitmentByRecruitmentIds(recruitmentIds));
    }
} 