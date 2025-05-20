package com.henglee.hrp.hrs.leader.controller;

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
import com.henglee.hrp.hrs.leader.domain.HrsLeader;
import com.henglee.hrp.hrs.leader.service.IHrsLeaderService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 领导管理Controller
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/leader")
public class HrsLeaderController extends BaseController
{
    @Autowired
    private IHrsLeaderService hrsLeaderService;

    /**
     * 查询领导管理列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:leader:list')")
    @GetMapping("/list")
    public TableDataInfo list(HrsLeader hrsLeader)
    {
        startPage();
        List<HrsLeader> list = hrsLeaderService.selectHrsLeaderList(hrsLeader);
        return getDataTable(list);
    }

    /**
     * 导出领导管理列表
     */
    @PreAuthorize("@ss.hasPermi('hrs:leader:export')")
    @Log(title = "领导管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HrsLeader hrsLeader)
    {
        List<HrsLeader> list = hrsLeaderService.selectHrsLeaderList(hrsLeader);
        ExcelUtil<HrsLeader> util = new ExcelUtil<HrsLeader>(HrsLeader.class);
        util.exportExcel(response, list, "领导管理数据");
    }

    /**
     * 获取领导管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('hrs:leader:query')")
    @GetMapping(value = "/{leaderId}")
    public AjaxResult getInfo(@PathVariable("leaderId") Long leaderId)
    {
        return success(hrsLeaderService.selectHrsLeaderByLeaderId(leaderId));
    }

    /**
     * 新增领导管理
     */
    @PreAuthorize("@ss.hasPermi('hrs:leader:add')")
    @Log(title = "领导管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HrsLeader hrsLeader)
    {
        return toAjax(hrsLeaderService.insertHrsLeader(hrsLeader));
    }

    /**
     * 修改领导管理
     */
    @PreAuthorize("@ss.hasPermi('hrs:leader:edit')")
    @Log(title = "领导管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HrsLeader hrsLeader)
    {
        return toAjax(hrsLeaderService.updateHrsLeader(hrsLeader));
    }

    /**
     * 删除领导管理
     */
    @PreAuthorize("@ss.hasPermi('hrs:leader:remove')")
    @Log(title = "领导管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{leaderIds}")
    public AjaxResult remove(@PathVariable Long[] leaderIds)
    {
        return toAjax(hrsLeaderService.deleteHrsLeaderByLeaderIds(leaderIds));
    }
} 