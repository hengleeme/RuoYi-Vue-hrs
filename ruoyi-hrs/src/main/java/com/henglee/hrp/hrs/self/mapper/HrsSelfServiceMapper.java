package com.henglee.hrp.hrs.self.mapper;

import java.util.List;
import com.henglee.hrp.hrs.self.domain.HrsSelfService;

/**
 * 员工自助服务Mapper接口
 * 
 * @author cbh
 */
public interface HrsSelfServiceMapper 
{
    /**
     * 查询员工自助服务
     * 
     * @param serviceId 员工自助服务主键
     * @return 员工自助服务
     */
    public HrsSelfService selectHrsSelfServiceByServiceId(Long serviceId);

    /**
     * 查询员工自助服务列表
     * 
     * @param hrsSelfService 员工自助服务
     * @return 员工自助服务集合
     */
    public List<HrsSelfService> selectHrsSelfServiceList(HrsSelfService hrsSelfService);

    /**
     * 新增员工自助服务
     * 
     * @param hrsSelfService 员工自助服务
     * @return 结果
     */
    public int insertHrsSelfService(HrsSelfService hrsSelfService);

    /**
     * 修改员工自助服务
     * 
     * @param hrsSelfService 员工自助服务
     * @return 结果
     */
    public int updateHrsSelfService(HrsSelfService hrsSelfService);

    /**
     * 删除员工自助服务
     * 
     * @param serviceId 员工自助服务主键
     * @return 结果
     */
    public int deleteHrsSelfServiceByServiceId(Long serviceId);

    /**
     * 批量删除员工自助服务
     * 
     * @param serviceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrsSelfServiceByServiceIds(Long[] serviceIds);
} 