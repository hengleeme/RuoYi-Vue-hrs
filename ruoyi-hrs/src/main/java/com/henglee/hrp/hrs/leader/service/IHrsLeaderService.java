package com.henglee.hrp.hrs.leader.service;

import java.util.List;
import com.henglee.hrp.hrs.leader.domain.HrsLeader;

/**
 * 领导管理Service接口
 * 
 * @author cbh
 */
public interface IHrsLeaderService 
{
    /**
     * 查询领导管理
     * 
     * @param leaderId 领导管理主键
     * @return 领导管理
     */
    public HrsLeader selectHrsLeaderByLeaderId(Long leaderId);

    /**
     * 查询领导管理列表
     * 
     * @param hrsLeader 领导管理
     * @return 领导管理集合
     */
    public List<HrsLeader> selectHrsLeaderList(HrsLeader hrsLeader);

    /**
     * 新增领导管理
     * 
     * @param hrsLeader 领导管理
     * @return 结果
     */
    public int insertHrsLeader(HrsLeader hrsLeader);

    /**
     * 修改领导管理
     * 
     * @param hrsLeader 领导管理
     * @return 结果
     */
    public int updateHrsLeader(HrsLeader hrsLeader);

    /**
     * 批量删除领导管理
     * 
     * @param leaderIds 需要删除的领导管理主键集合
     * @return 结果
     */
    public int deleteHrsLeaderByLeaderIds(Long[] leaderIds);

    /**
     * 删除领导管理信息
     * 
     * @param leaderId 领导管理主键
     * @return 结果
     */
    public int deleteHrsLeaderByLeaderId(Long leaderId);
} 