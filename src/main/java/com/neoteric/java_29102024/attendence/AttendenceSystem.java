package com.neoteric.java_29102024.attendence;

public abstract class AttendenceSystem{
  private String employeeName;
  private  int employeeId;

    public AttendenceSystem(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public  abstract  void  markAttendence();

    public  void  showEmployeeDetails(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}
