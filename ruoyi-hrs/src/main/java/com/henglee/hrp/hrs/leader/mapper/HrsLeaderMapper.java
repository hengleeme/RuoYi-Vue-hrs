package com.henglee.hrp.hrs.leader.mapper;

import java.util.List;
import com.henglee.hrp.hrs.leader.domain.HrsLeader;

/**
 * 领导管理Mapper接口
 * 
 * @author cbh
 */
public interface HrsLeaderMapper 
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
     * 删除领导管理
     * 
     * @param leaderId 领导管理主键
     * @return 结果
     */
    public int deleteHrsLeaderByLeaderId(Long leaderId);

    /**
     * 批量删除领导管理
     * 
     * @param leaderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsLeaderByLeaderIds(Long[] leaderIds);
} 