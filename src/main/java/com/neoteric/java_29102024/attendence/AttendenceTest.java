package com.neoteric.java_29102024.attendence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AttendenceTest {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(AttendenceTest.class);


      AttendenceSystem biometric = new BiometricAttendence("chandu",101);
      biometric.markAttendence();
      biometric.showEmployeeDetails();
        ( (AttendenceReport) biometric).generateReport();
        logger.info("  Biometric Attendence of Employee Details " +biometric);

        AttendenceSystem mannual = new MannualAttendence("geetha",102);
        mannual.showEmployeeDetails();
        mannual.markAttendence();
        ((AttendenceReport) mannual).generateReport();
        logger.info("  Mannual Attendence of Employee Details " +mannual);
    }
}
