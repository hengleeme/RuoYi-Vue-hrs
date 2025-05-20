package com.henglee.hrp.hrs.personnel.domain;

/**
 * 人事实体类
 * 
 * @author cbh
 */
public class Personnel {
    /** 员工ID */
    private Long id;
    
    /** 员工姓名 */
    private String name;
    
    /** 性别 */
    private String gender;
    
    /** 职位 */
    private String position;
    
    /** 部门 */
    private String department;
    
    /** 邮箱 */
    private String email;
    
    /** 电话 */
    private String phone;
    
    /** 状态 */
    private String status;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
} 