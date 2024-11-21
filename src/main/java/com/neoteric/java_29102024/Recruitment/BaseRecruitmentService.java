package com.neoteric.java_29102024.Recruitment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BaseRecruitmentService {
    Logger logger = LogManager.getLogger(BaseRecruitmentService.class);
    public abstract void logApplication(String candidateName, String jobId);

    public void notifyCandidate(String candidateName, String status) {
       logger.info("Notification to " + candidateName + ": " + status);
    }
}
