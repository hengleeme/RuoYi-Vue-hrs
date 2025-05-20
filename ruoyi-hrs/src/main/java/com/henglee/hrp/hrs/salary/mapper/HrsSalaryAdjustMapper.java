package com.henglee.hrp.hrs.salary.mapper;

import java.util.List;
import com.henglee.hrp.hrs.salary.domain.HrsSalaryAdjust;

/**
 * 定薪调薪Mapper接口
 * 
 * @author henglee
 */
public interface HrsSalaryAdjustMapper 
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
     * 删除定薪调薪
     * 
     * @param adjustId 定薪调薪主键
     * @return 结果
     */
    public int deleteHrsSalaryAdjustByAdjustId(Long adjustId);

    /**
     * 批量删除定薪调薪
     * 
     * @param adjustIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsSalaryAdjustByAdjustIds(Long[] adjustIds);

    /**
     * 提交定薪调薪
     * 
     * @param adjustId 定薪调薪主键
     * @return 结果
     */
    public int submitHrsSalaryAdjust(Long adjustId);

    /**
     * 审核定薪调薪
     * 
     * @param hrsSalaryAdjust 定薪调薪
     * @return 结果
     */
    public int approveHrsSalaryAdjust(HrsSalaryAdjust hrsSalaryAdjust);
} 