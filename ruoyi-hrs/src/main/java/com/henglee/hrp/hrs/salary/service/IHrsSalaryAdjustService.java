package com.henglee.hrp.hrs.salary.service;

import java.util.List;
import com.henglee.hrp.hrs.salary.domain.HrsSalaryAdjust;

/**
 * 定薪调薪Service接口
 * 
 * @author henglee
 * @date 2024-03-20
 */
public interface IHrsSalaryAdjustService 
{
    /**
     * 查询定薪调薪
     * 
     * @param adjustId 定薪调薪主键
     * @return 定薪调薪
     */
    public HrsSalaryAdjust selectHrsSalaryAdjustByAdjustId(Long adjustId);

    /**
     * 查询定薪调薪列表
     * 
     * @param hrsSalaryAdjust 定薪调薪
     * @return 定薪调薪集合
     */
    public List<HrsSalaryAdjust> selectHrsSalaryAdjustList(HrsSalaryAdjust hrsSalaryAdjust);

    /**
     * 新增定薪调薪
     * 
     * @param hrsSalaryAdjust 定薪调薪
     * @return 结果
     */
    public int insertHrsSalaryAdjust(HrsSalaryAdjust hrsSalaryAdjust);

    /**
     * 修改定薪调薪
     * 
     * @param hrsSalaryAdjust 定薪调薪
     * @return 结果
     */
    public int updateHrsSalaryAdjust(HrsSalaryAdjust hrsSalaryAdjust);

    /**
     * 批量删除定薪调薪
     * 
     * @param adjustIds 需要删除的定薪调薪主键集合
     * @return 结果
     */
    public int deleteHrsSalaryAdjustByAdjustIds(Long[] adjustIds);

    /**
     * 删除定薪调薪信息
     * 
     * @param adjustId 定薪调薪主键
     * @return 结果
     */
    public int deleteHrsSalaryAdjustByAdjustId(Long adjustId);

    /**
     * 提交定薪调薪
     * 
     * @param adjustId 定薪调薪主键
     * @return 结果
     */
    public int submitHrsSalaryAdjust(Long adjustId);

    /**
     * 审批定薪调薪
     * 
     * @param hrsSalaryAdjust 定薪调薪
     * @return 结果
     */
    public int approveHrsSalaryAdjust(HrsSalaryAdjust hrsSalaryAdjust);
} 