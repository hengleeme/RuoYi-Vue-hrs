package com.henglee.hrp.hrs.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.mapper.EmployeeCollectMapper;
import com.henglee.hrp.hrs.domain.EmployeeCollect;
import com.henglee.hrp.hrs.service.IEmployeeCollectService;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;
import com.henglee.hrp.hrs.utils.EmployeeLogUtils;
import com.henglee.hrp.hrs.constant.EmployeeLogConstants;

/**
 * 人员信息采集Service业务层处理
 * 
 * @author cbh
 */
@Service
public class EmployeeCollectServiceImpl implements IEmployeeCollectService 
{
    @Autowired
    private EmployeeCollectMapper employeeCollectMapper;

    @Autowired
    private EmployeeLogUtils employeeLogUtils;

    /**
     * 查询人员信息采集
     * 
     * @param collectId 人员信息采集主键
     * @return 人员信息采集
     */
    @Override
    public EmployeeCollect selectEmployeeCollectByCollectId(Long collectId)
    {
        return employeeCollectMapper.selectEmployeeCollectByCollectId(collectId);
    }

    /**
     * 查询人员信息采集列表
     * 
     * @param employeeCollect 人员信息采集
     * @return 人员信息采集
     */
    @Override
    public List<EmployeeCollect> selectEmployeeCollectList(EmployeeCollect employeeCollect)
    {
        return employeeCollectMapper.selectEmployeeCollectList(employeeCollect);
    }

    /**
     * 新增人员信息采集
     * 
     * @param employeeCollect 人员信息采集
     * @return 结果
     */
    @Override
    public int insertEmployeeCollect(EmployeeCollect employeeCollect)
    {
        employeeCollect.setCreateTime(DateUtils.getNowDate());
        int result = employeeCollectMapper.insertEmployeeCollect(employeeCollect);
        // 记录新增日志
        employeeLogUtils.recordLog(
            employeeCollect.getEmployeeId(),
            EmployeeLogConstants.CHANGE_TYPE_BASIC,
            "新增信息采集",
            null,
            employeeCollect.getCollectContent(),
            "新增人员信息采集记录"
        );
        return result;
    }

    /**
     * 修改人员信息采集
     * 
     * @param employeeCollect 人员信息采集
     * @return 结果
     */
    @Override
    public int updateEmployeeCollect(EmployeeCollect employeeCollect)
    {
        employeeCollect.setUpdateTime(DateUtils.getNowDate());
        // 查询原数据
        EmployeeCollect old = employeeCollectMapper.selectEmployeeCollectByCollectId(employeeCollect.getCollectId());
        int result = employeeCollectMapper.updateEmployeeCollect(employeeCollect);
        // 记录修改日志
        if (old != null && !old.getCollectContent().equals(employeeCollect.getCollectContent())) {
            employeeLogUtils.recordLog(
                employeeCollect.getEmployeeId(),
                EmployeeLogConstants.CHANGE_TYPE_BASIC,
                "采集内容",
                old.getCollectContent(),
                employeeCollect.getCollectContent(),
                "修改人员信息采集内容"
            );
        }
        return result;
    }

    /**
     * 批量删除人员信息采集
     * 
     * @param collectIds 需要删除的人员信息采集主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeCollectByCollectIds(String collectIds)
    {
        return employeeCollectMapper.deleteEmployeeCollectByCollectIds(Convert.toLongArray(collectIds));
    }

    /**
     * 删除人员信息采集信息
     * 
     * @param collectId 人员信息采集主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeCollectByCollectId(Long collectId)
    {
        return employeeCollectMapper.deleteEmployeeCollectByCollectId(collectId);
    }

    /**
     * 审核人员信息采集
     * 
     * @param employeeCollect 人员信息采集
     * @return 结果
     */
    @Override
    public int auditEmployeeCollect(EmployeeCollect employeeCollect)
    {
        employeeCollect.setAuditTime(DateUtils.getNowDate());
        return employeeCollectMapper.updateEmployeeCollect(employeeCollect);
    }
} 