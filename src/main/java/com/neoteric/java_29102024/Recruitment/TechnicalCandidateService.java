package com.neoteric.java_29102024.Recruitment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TechnicalCandidateService extends RecruitmentService<String>{
    Logger logger = LogManager.getLogger(TechnicalCandidateService.class);
    @Override
    public void listCandidates() {
        logger.info("Technical Candidates: " + getCandidates());
    }
}
