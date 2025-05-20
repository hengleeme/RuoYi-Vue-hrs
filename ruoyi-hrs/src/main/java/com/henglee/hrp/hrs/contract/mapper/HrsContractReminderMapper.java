package com.henglee.hrp.hrs.contract.mapper;

import java.util.List;
import com.henglee.hrp.hrs.contract.domain.HrsContractReminder;

/**
 * 合同到期提醒Mapper接口
 * 
 * @author henglee
 */
public interface HrsContractReminderMapper 
{
    /**
     * 查询合同到期提醒
     * 
     * @param reminderId 合同到期提醒主键
     * @return 合同到期提醒
     */
    public HrsContractReminder selectHrsContractReminderByReminderId(Long reminderId);

    /**
     * 查询合同到期提醒列表
     * 
     * @param hrsContractReminder 合同到期提醒
     * @return 合同到期提醒集合
     */
    public List<HrsContractReminder> selectHrsContractReminderList(HrsContractReminder hrsContractReminder);

    /**
     * 新增合同到期提醒
     * 
     * @param hrsContractReminder 合同到期提醒
     * @return 结果
     */
    public int insertHrsContractReminder(HrsContractReminder hrsContractReminder);

    /**
     * 修改合同到期提醒
     * 
     * @param hrsContractReminder 合同到期提醒
     * @return 结果
     */
    public int updateHrsContractReminder(HrsContractReminder hrsContractReminder);

    /**
     * 删除合同到期提醒
     * 
     * @param reminderId 合同到期提醒主键
     * @return 结果
     */
    public int deleteHrsContractReminderByReminderId(Long reminderId);

    /**
     * 批量删除合同到期提醒
     * 
     * @param reminderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsContractReminderByReminderIds(Long[] reminderIds);

    /**
     * 查询合同的到期提醒
     * 
     * @param contractId 合同ID
     * @return 合同到期提醒集合
     */
    public List<HrsContractReminder> selectHrsContractReminderByContractId(Long contractId);

    /**
     * 查询未处理的提醒
     * 
     * @return 合同到期提醒集合
     */
    public List<HrsContractReminder> selectUnhandledReminders();
} 