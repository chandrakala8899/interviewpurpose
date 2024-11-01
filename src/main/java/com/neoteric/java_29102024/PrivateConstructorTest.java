package com.neoteric.java_29102024;

public class PrivateConstructorTest {


    public  String studentName;
    public  String fatherName;
    public  String rollNo;
    private PrivateConstructorTest(String studentName, String fatherName, String rollNo) {
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.rollNo = rollNo;
    }

    public  static  PrivateConstructorTest getInstance(String studentName, String fatherName, String rollNo){
        return new PrivateConstructorTest(studentName,fatherName,rollNo);
    }

}
