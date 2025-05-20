package com.henglee.hrp.hrs.salary.mapper;

import java.util.List;
import com.henglee.hrp.hrs.salary.domain.HrsSalaryInfo;

/**
 * 工资信息Mapper接口
 * 
 * @author henglee
 */
public interface HrsSalaryInfoMapper 
{
    /**
     * 查询工资信息
     * 
     * @param salaryId 工资信息主键
     * @return 工资信息
     */
    public HrsSalaryInfo selectHrsSalaryInfoBySalaryId(Long salaryId);

    /**
     * 查询工资信息列表
     * 
     * @param hrsSalaryInfo 工资信息
     * @return 工资信息集合
     */
    public List<HrsSalaryInfo> selectHrsSalaryInfoList(HrsSalaryInfo hrsSalaryInfo);

    /**
     * 新增工资信息
     * 
     * @param hrsSalaryInfo 工资信息
     * @return 结果
     */
    public int insertHrsSalaryInfo(HrsSalaryInfo hrsSalaryInfo);

    /**
     * 修改工资信息
     * 
     * @param hrsSalaryInfo 工资信息
     * @return 结果
     */
    public int updateHrsSalaryInfo(HrsSalaryInfo hrsSalaryInfo);

    /**
     * 删除工资信息
     * 
     * @param salaryId 工资信息主键
     * @return 结果
     */
    public int deleteHrsSalaryInfoBySalaryId(Long salaryId);

    /**
     * 批量删除工资信息
     * 
     * @param salaryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsSalaryInfoBySalaryIds(Long[] salaryIds);

    /**
     * 提交工资信息
     * 
     * @param salaryId 工资信息主键
     * @return 结果
     */
    public int submitHrsSalaryInfo(Long salaryId);

    /**
     * 审核工资信息
     * 
     * @param hrsSalaryInfo 工资信息
     * @return 结果
     */
    public int approveHrsSalaryInfo(HrsSalaryInfo hrsSalaryInfo);

    /**
     * 发放工资信息
     * 
     * @param salaryId 工资信息主键
     * @return 结果
     */
    public int payHrsSalaryInfo(Long salaryId);
} 