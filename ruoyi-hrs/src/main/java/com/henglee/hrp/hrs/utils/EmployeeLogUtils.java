package com.henglee.hrp.hrs.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.henglee.hrp.hrs.domain.EmployeeLog;
import com.henglee.hrp.hrs.service.IEmployeeLogService;
import com.ruoyi.common.utils.SecurityUtils;
import java.util.Date;

/**
 * 人员信息变更日志工具类
 * 
 * @author cbh
 */
@Component
public class EmployeeLogUtils
{
    @Autowired
    private IEmployeeLogService employeeLogService;

    /**
     * 记录人员信息变更日志
     * 
     * @param employeeId 人员ID
     * @param changeType 变更类型
     * @param changeField 变更字段
     * @param oldValue 原值
     * @param newValue 新值
     * @param remark 备注
     */
    public void recordLog(Long employeeId, String changeType, String changeField, String oldValue, String newValue, String remark)
    {
        EmployeeLog log = new EmployeeLog();
        log.setEmployeeId(employeeId);
        log.setChangeType(changeType);
        log.setChangeField(changeField);
        log.setOldValue(oldValue);
        log.setNewValue(newValue);
        log.setChangeTime(new Date());
        log.setChangeBy(SecurityUtils.getUsername());
        log.setRemark(remark);
        employeeLogService.insertEmployeeLog(log);
    }
} 