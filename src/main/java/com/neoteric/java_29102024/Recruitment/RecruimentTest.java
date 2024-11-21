package com.neoteric.java_29102024.Recruitment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RecruimentTest {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(RecruimentTest.class);
        try {

            RecruitmentProcessor techRecruitment = new TechnicalRecruitmentService();
            techRecruitment.processApplication("ABC");
            ((TechnicalRecruitmentService) techRecruitment).logApplication("ABC", "TECH123");

            RecruitmentProcessor hrRecruitment = new HRRecruitmentService();
            hrRecruitment.processApplication("DEF");
            ((HRRecruitmentService) hrRecruitment).logApplication("DEF", "HR456");

            TechnicalCandidateService techCandidateService = new TechnicalCandidateService();
            techCandidateService.addCandidate("Chandu");
            techCandidateService.addCandidate("Geetha");
            techCandidateService.listCandidates();

        } catch (Throwable e) {
          logger.info("Error occurred: " + e.getMessage());
        }
    }
    }

