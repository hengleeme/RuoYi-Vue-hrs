package com.henglee.hrp.hrs.leader.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.leader.mapper.HrsLeaderMapper;
import com.henglee.hrp.hrs.leader.domain.HrsLeader;
import com.henglee.hrp.hrs.leader.service.IHrsLeaderService;

/**
 * 领导管理Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsLeaderServiceImpl implements IHrsLeaderService 
{
    @Autowired
    private HrsLeaderMapper hrsLeaderMapper;

    /**
     * 查询领导管理
     * 
     * @param leaderId 领导管理主键
     * @return 领导管理
     */
    @Override
    public HrsLeader selectHrsLeaderByLeaderId(Long leaderId)
    {
        return hrsLeaderMapper.selectHrsLeaderByLeaderId(leaderId);
    }

    /**
     * 查询领导管理列表
     * 
     * @param hrsLeader 领导管理
     * @return 领导管理
     */
    @Override
    public List<HrsLeader> selectHrsLeaderList(HrsLeader hrsLeader)
    {
        return hrsLeaderMapper.selectHrsLeaderList(hrsLeader);
    }

    /**
     * 新增领导管理
     * 
     * @param hrsLeader 领导管理
     * @return 结果
     */
    @Override
    public int insertHrsLeader(HrsLeader hrsLeader)
    {
        return hrsLeaderMapper.insertHrsLeader(hrsLeader);
    }

    /**
     * 修改领导管理
     * 
     * @param hrsLeader 领导管理
     * @return 结果
     */
    @Override
    public int updateHrsLeader(HrsLeader hrsLeader)
    {
        return hrsLeaderMapper.updateHrsLeader(hrsLeader);
    }

    /**
     * 批量删除领导管理
     * 
     * @param leaderIds 需要删除的领导管理主键
     * @return 结果
     */
    @Override
    public int deleteHrsLeaderByLeaderIds(Long[] leaderIds)
    {
        return hrsLeaderMapper.deleteHrsLeaderByLeaderIds(leaderIds);
    }

    /**
     * 删除领导管理信息
     * 
     * @param leaderId 领导管理主键
     * @return 结果
     */
    @Override
    public int deleteHrsLeaderByLeaderId(Long leaderId)
    {
        return hrsLeaderMapper.deleteHrsLeaderByLeaderId(leaderId);
    }
} 