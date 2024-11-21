package com.neoteric.java_29102024.Recruitment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class RecruitmentService<T> {
    Logger logger = LogManager.getLogger(RecruitmentService.class);
    private List<T> candidates = new ArrayList<>();

    public void addCandidate(T candidate) {
        candidates.add(candidate);
       logger.info("Candidate added: " + candidate);
    }

    public List<T> getCandidates() {
        return candidates;
    }

    // 5. Generic method overriding in inheritance
    public void listCandidates() {
       logger.info("Candidates: " + candidates);
    }
}
