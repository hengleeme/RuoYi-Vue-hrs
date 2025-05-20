package com.henglee.hrp.hrs.personnel.service;

import com.henglee.hrp.hrs.personnel.domain.Personnel;
import java.util.List;

/**
 * 人事管理服务接口
 * 
 * @author cbh
 */
public interface PersonnelManagementService {
    /**
     * 获取员工列表
     * 
     * @return 员工列表
     */
    List<Personnel> getPersonnelList();

    /**
     * 添加员工
     * 
     * @param personnel 员工信息
     */
    void addPersonnel(Personnel personnel);

    /**
     * 更新员工信息
     * 
     * @param personnel 员工信息
     */
    void updatePersonnel(Personnel personnel);

    /**
     * 删除员工
     * 
     * @param id 员工ID
     */
    void deletePersonnel(Long id);
} 