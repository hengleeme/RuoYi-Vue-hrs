package com.henglee.hrp.hrs.contract.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.contract.mapper.HrsContractReminderMapper;
import com.henglee.hrp.hrs.contract.domain.HrsContractReminder;
import com.henglee.hrp.hrs.contract.service.IHrsContractReminderService;

/**
 * 合同到期提醒Service业务层处理
 * 
 * @author henglee
 */
@Service
public class HrsContractReminderServiceImpl implements IHrsContractReminderService 
{
    @Autowired
    private HrsContractReminderMapper hrsContractReminderMapper;

    /**
     * 查询合同到期提醒
     * 
     * @param reminderId 合同到期提醒主键
     * @return 合同到期提醒
     */
    @Override
    public HrsContractReminder selectHrsContractReminderByReminderId(Long reminderId)
    {
        return hrsContractReminderMapper.selectHrsContractReminderByReminderId(reminderId);
    }

    /**
     * 查询合同到期提醒列表
     * 
     * @param hrsContractReminder 合同到期提醒
     * @return 合同到期提醒
     */
    @Override
    public List<HrsContractReminder> selectHrsContractReminderList(HrsContractReminder hrsContractReminder)
    {
        return hrsContractReminderMapper.selectHrsContractReminderList(hrsContractReminder);
    }

    /**
     * 新增合同到期提醒
     * 
     * @param hrsContractReminder 合同到期提醒
     * @return 结果
     */
    @Override
    public int insertHrsContractReminder(HrsContractReminder hrsContractReminder)
    {
        return hrsContractReminderMapper.insertHrsContractReminder(hrsContractReminder);
    }

    /**
     * 修改合同到期提醒
     * 
     * @param hrsContractReminder 合同到期提醒
     * @return 结果
     */
    @Override
    public int updateHrsContractReminder(HrsContractReminder hrsContractReminder)
    {
        return hrsContractReminderMapper.updateHrsContractReminder(hrsContractReminder);
    }

    /**
     * 批量删除合同到期提醒
     * 
     * @param reminderIds 需要删除的合同到期提醒主键
     * @return 结果
     */
    @Override
    public int deleteHrsContractReminderByReminderIds(Long[] reminderIds)
    {
        return hrsContractReminderMapper.deleteHrsContractReminderByReminderIds(reminderIds);
    }

    /**
     * 删除合同到期提醒信息
     * 
     * @param reminderId 合同到期提醒主键
     * @return 结果
     */
    @Override
    public int deleteHrsContractReminderByReminderId(Long reminderId)
    {
        return hrsContractReminderMapper.deleteHrsContractReminderByReminderId(reminderId);
    }

    /**
     * 查询合同的到期提醒
     * 
     * @param contractId 合同ID
     * @return 合同到期提醒集合
     */
    @Override
    public List<HrsContractReminder> selectHrsContractReminderByContractId(Long contractId)
    {
        return hrsContractReminderMapper.selectHrsContractReminderByContractId(contractId);
    }

    /**
     * 查询未处理的提醒
     * 
     * @return 合同到期提醒集合
     */
    @Override
    public List<HrsContractReminder> selectUnhandledReminders()
    {
        return hrsContractReminderMapper.selectUnhandledReminders();
    }
} 