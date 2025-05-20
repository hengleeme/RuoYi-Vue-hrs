package com.henglee.hrp.hrs.recruitment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.recruitment.mapper.HrsRecruitmentMapper;
import com.henglee.hrp.hrs.recruitment.domain.HrsRecruitment;
import com.henglee.hrp.hrs.recruitment.service.IHrsRecruitmentService;

/**
 * 招聘信息Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsRecruitmentServiceImpl implements IHrsRecruitmentService 
{
    @Autowired
    private HrsRecruitmentMapper hrsRecruitmentMapper;

    /**
     * 查询招聘信息
     * 
     * @param recruitmentId 招聘信息主键
     * @return 招聘信息
     */
    @Override
    public HrsRecruitment selectHrsRecruitmentByRecruitmentId(Long recruitmentId)
    {
        return hrsRecruitmentMapper.selectHrsRecruitmentByRecruitmentId(recruitmentId);
    }

    /**
     * 查询招聘信息列表
     * 
     * @param hrsRecruitment 招聘信息
     * @return 招聘信息
     */
    @Override
    public List<HrsRecruitment> selectHrsRecruitmentList(HrsRecruitment hrsRecruitment)
    {
        return hrsRecruitmentMapper.selectHrsRecruitmentList(hrsRecruitment);
    }

    /**
     * 新增招聘信息
     * 
     * @param hrsRecruitment 招聘信息
     * @return 结果
     */
    @Override
    public int insertHrsRecruitment(HrsRecruitment hrsRecruitment)
    {
        return hrsRecruitmentMapper.insertHrsRecruitment(hrsRecruitment);
    }

    /**
     * 修改招聘信息
     * 
     * @param hrsRecruitment 招聘信息
     * @return 结果
     */
    @Override
    public int updateHrsRecruitment(HrsRecruitment hrsRecruitment)
    {
        return hrsRecruitmentMapper.updateHrsRecruitment(hrsRecruitment);
    }

    /**
     * 批量删除招聘信息
     * 
     * @param recruitmentIds 需要删除的招聘信息主键
     * @return 结果
     */
    @Override
    public int deleteHrsRecruitmentByRecruitmentIds(Long[] recruitmentIds)
    {
        return hrsRecruitmentMapper.deleteHrsRecruitmentByRecruitmentIds(recruitmentIds);
    }

    /**
     * 删除招聘信息信息
     * 
     * @param recruitmentId 招聘信息主键
     * @return 结果
     */
    @Override
    public int deleteHrsRecruitmentByRecruitmentId(Long recruitmentId)
    {
        return hrsRecruitmentMapper.deleteHrsRecruitmentByRecruitmentId(recruitmentId);
    }
} 