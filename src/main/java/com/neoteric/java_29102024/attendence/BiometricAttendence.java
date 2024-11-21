package com.neoteric.java_29102024.attendence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BiometricAttendence extends AttendenceSystem implements  AttendenceReport{
Logger logger = LogManager.getLogger(BiometricAttendence.class);
    public BiometricAttendence(String employeeName, int employeeId) {
        super(employeeName, employeeId);
    }

    @Override
    public void markAttendence() {
       logger.info("Marking attendance using Biometric system...");

    }

    @Override
    public void generateReport() {
        logger.info( "Reporting attendance Biometric system...");
    }
}
