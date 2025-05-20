package com.henglee.hrp.hrs.personnel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.personnel.mapper.HrsPersonnelMapper;
import com.henglee.hrp.hrs.personnel.domain.HrsPersonnel;
import com.henglee.hrp.hrs.personnel.service.IHrsPersonnelService;

/**
 * 人事管理Service实现
 *
 * @author cbh
 */
@Service
public class HrsPersonnelServiceImpl implements IHrsPersonnelService {
    @Autowired
    private HrsPersonnelMapper hrsPersonnelMapper;

    /**
     * 查询单个人事信息
     */
    @Override
    public HrsPersonnel selectHrsPersonnelByPersonnelId(Long personnelId) {
        return hrsPersonnelMapper.selectHrsPersonnelByPersonnelId(personnelId);
    }

    /**
     * 查询人事列表
     */
    @Override
    public List<HrsPersonnel> selectHrsPersonnelList(HrsPersonnel hrsPersonnel) {
        return hrsPersonnelMapper.selectHrsPersonnelList(hrsPersonnel);
    }

    /**
     * 新增人事
     */
    @Override
    public int insertHrsPersonnel(HrsPersonnel hrsPersonnel) {
        return hrsPersonnelMapper.insertHrsPersonnel(hrsPersonnel);
    }

    /**
     * 修改人事
     */
    @Override
    public int updateHrsPersonnel(HrsPersonnel hrsPersonnel) {
        return hrsPersonnelMapper.updateHrsPersonnel(hrsPersonnel);
    }

    /**
     * 批量删除人事
     */
    @Override
    public int deleteHrsPersonnelByPersonnelIds(Long[] personnelIds) {
        return hrsPersonnelMapper.deleteHrsPersonnelByPersonnelIds(personnelIds);
    }

    /**
     * 删除单个人事
     */
    @Override
    public int deleteHrsPersonnelByPersonnelId(Long personnelId) {
        return hrsPersonnelMapper.deleteHrsPersonnelByPersonnelId(personnelId);
    }
} 