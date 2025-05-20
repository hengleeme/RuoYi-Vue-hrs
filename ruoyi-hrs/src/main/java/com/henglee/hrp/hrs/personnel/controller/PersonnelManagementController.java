package com.henglee.hrp.hrs.personnel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.henglee.hrp.hrs.personnel.service.PersonnelManagementService;
import com.henglee.hrp.hrs.personnel.domain.Personnel;
import java.util.List;

/**
 * 人事管理控制器
 * 
 * @author cbh
 */
@RestController
@RequestMapping("/hrs/personnel")
public class PersonnelManagementController {

    @Autowired
    private PersonnelManagementService personnelManagementService;

    /**
     * 获取员工列表
     * 
     * @return 员工列表
     */
    @GetMapping("/list")
    public List<Personnel> getPersonnelList() {
        return personnelManagementService.getPersonnelList();
    }

    /**
     * 添加员工
     * 
     * @param personnel 员工信息
     */
    @PostMapping("/add")
    public void addPersonnel(@RequestBody Personnel personnel) {
        personnelManagementService.addPersonnel(personnel);
    }

    /**
     * 更新员工信息
     * 
     * @param personnel 员工信息
     */
    @PutMapping("/update")
    public void updatePersonnel(@RequestBody Personnel personnel) {
        personnelManagementService.updatePersonnel(personnel);
    }

    /**
     * 删除员工
     * 
     * @param id 员工ID
     */
    @DeleteMapping("/delete/{id}")
    public void deletePersonnel(@PathVariable Long id) {
        personnelManagementService.deletePersonnel(id);
    }
} 