package com.henglee.hrp.hrs.attendance.domain;

import java.util.Date;

/**
 * 考勤实体类
 * 
 * @author cbh
 */
public class Attendance {
    /** 考勤ID */
    private Long id;
    
    /** 员工ID */
    private Long employeeId;
    
    /** 员工姓名 */
    private String employeeName;
    
    /** 考勤日期 */
    private Date attendanceDate;
    
    /** 签到时间 */
    private Date checkInTime;
    
    /** 签退时间 */
    private Date checkOutTime;
    
    /** 考勤状态 */
    private String status;
    
    /** 考勤类型 */
    private String type;
    
    /** 备注 */
    private String remark;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
} 