package com.neoteric.java_29102024.Recruitment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HRRecruitmentService  extends BaseRecruitmentService implements RecruitmentProcessor{
    Logger logger = LogManager.getLogger(HRRecruitmentService.class);
    @Override
    public void processApplication(String candidateName) throws Exception {
        System.out.println("Processing application for HR role: " + candidateName);
        if (Math.random() > 0.5) {
            throw new Exception("HR interview failed!");
        }
     logger.info("Application approved for: " + candidateName);
    }

    @Override
    public void logApplication(String candidateName, String jobId) {
       logger.info("Logged HR application for " + candidateName + " with Job ID: " + jobId);
    }
}

