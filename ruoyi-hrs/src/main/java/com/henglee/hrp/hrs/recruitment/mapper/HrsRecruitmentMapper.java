package com.henglee.hrp.hrs.recruitment.mapper;

import java.util.List;
import com.henglee.hrp.hrs.recruitment.domain.HrsRecruitment;

/**
 * 招聘信息Mapper接口
 * 
 * @author cbh
 */
public interface HrsRecruitmentMapper 
{
    /**
     * 查询招聘信息
     * 
     * @param recruitmentId 招聘信息主键
     * @return 招聘信息
     */
    public HrsRecruitment selectHrsRecruitmentByRecruitmentId(Long recruitmentId);

    /**
     * 查询招聘信息列表
     * 
     * @param hrsRecruitment 招聘信息
     * @return 招聘信息集合
     */
    public List<HrsRecruitment> selectHrsRecruitmentList(HrsRecruitment hrsRecruitment);

    /**
     * 新增招聘信息
     * 
     * @param hrsRecruitment 招聘信息
     * @return 结果
     */
    public int insertHrsRecruitment(HrsRecruitment hrsRecruitment);

    /**
     * 修改招聘信息
     * 
     * @param hrsRecruitment 招聘信息
     * @return 结果
     */
    public int updateHrsRecruitment(HrsRecruitment hrsRecruitment);

    /**
     * 删除招聘信息
     * 
     * @param recruitmentId 招聘信息主键
     * @return 结果
     */
    public int deleteHrsRecruitmentByRecruitmentId(Long recruitmentId);

    /**
     * 批量删除招聘信息
     * 
     * @param recruitmentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsRecruitmentByRecruitmentIds(Long[] recruitmentIds);
} 