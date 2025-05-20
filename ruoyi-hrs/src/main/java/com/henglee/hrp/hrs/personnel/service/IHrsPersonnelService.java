package com.henglee.hrp.hrs.personnel.service;

import java.util.List;
import com.henglee.hrp.hrs.personnel.domain.HrsPersonnel;

/**
 * 人事管理Service接口
 *
 * @author cbh
 */
public interface IHrsPersonnelService {
    /**
     * 查询人事信息
     * @param personnelId 人事ID
     * @return 人事信息
     */
    HrsPersonnel selectHrsPersonnelByPersonnelId(Long personnelId);

    /**
     * 查询人事列表
     * @param hrsPersonnel 查询条件
     * @return 人事集合
     */
    List<HrsPersonnel> selectHrsPersonnelList(HrsPersonnel hrsPersonnel);

    /**
     * 新增人事
     * @param hrsPersonnel 人事信息
     * @return 结果
     */
    int insertHrsPersonnel(HrsPersonnel hrsPersonnel);

    /**
     * 修改人事
     * @param hrsPersonnel 人事信息
     * @return 结果
     */
    int updateHrsPersonnel(HrsPersonnel hrsPersonnel);

    /**
     * 批量删除人事
     * @param personnelIds 需要删除的人事ID数组
     * @return 结果
     */
    int deleteHrsPersonnelByPersonnelIds(Long[] personnelIds);

    /**
     * 删除单个人事
     * @param personnelId 人事ID
     * @return 结果
     */
    int deleteHrsPersonnelByPersonnelId(Long personnelId);
} 