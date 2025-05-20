package com.henglee.hrp.hrs.self.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.henglee.hrp.hrs.self.mapper.HrsSelfServiceMapper;
import com.henglee.hrp.hrs.self.domain.HrsSelfService;
import com.henglee.hrp.hrs.self.service.IHrsSelfServiceService;

/**
 * 员工自助服务Service业务层处理
 * 
 * @author cbh
 */
@Service
public class HrsSelfServiceServiceImpl implements IHrsSelfServiceService 
{
    @Autowired
    private HrsSelfServiceMapper hrsSelfServiceMapper;

    /**
     * 查询员工自助服务
     * 
     * @param serviceId 员工自助服务主键
     * @return 员工自助服务
     */
    @Override
    public HrsSelfService selectHrsSelfServiceByServiceId(Long serviceId)
    {
        return hrsSelfServiceMapper.selectHrsSelfServiceByServiceId(serviceId);
    }

    /**
     * 查询员工自助服务列表
     * 
     * @param hrsSelfService 员工自助服务
     * @return 员工自助服务
     */
    @Override
    public List<HrsSelfService> selectHrsSelfServiceList(HrsSelfService hrsSelfService)
    {
        return hrsSelfServiceMapper.selectHrsSelfServiceList(hrsSelfService);
    }

    /**
     * 新增员工自助服务
     * 
     * @param hrsSelfService 员工自助服务
     * @return 结果
     */
    @Override
    public int insertHrsSelfService(HrsSelfService hrsSelfService)
    {
        return hrsSelfServiceMapper.insertHrsSelfService(hrsSelfService);
    }

    /**
     * 修改员工自助服务
     * 
     * @param hrsSelfService 员工自助服务
     * @return 结果
     */
    @Override
    public int updateHrsSelfService(HrsSelfService hrsSelfService)
    {
        return hrsSelfServiceMapper.updateHrsSelfService(hrsSelfService);
    }

    /**
     * 批量删除员工自助服务
     * 
     * @param serviceIds 需要删除的员工自助服务主键
     * @return 结果
     */
    @Override
    public int deleteHrsSelfServiceByServiceIds(Long[] serviceIds)
    {
        return hrsSelfServiceMapper.deleteHrsSelfServiceByServiceIds(serviceIds);
    }

    /**
     * 删除员工自助服务信息
     * 
     * @param serviceId 员工自助服务主键
     * @return 结果
     */
    @Override
    public int deleteHrsSelfServiceByServiceId(Long serviceId)
    {
        return hrsSelfServiceMapper.deleteHrsSelfServiceByServiceId(serviceId);
    }
} 