package com.neoteric.java_29102024.genericsoverriding21112024;

public class JobApplication<T> extends Candidate<T>{

    public JobApplication(T candiadateDetails) {
        super(candiadateDetails);
    }
  // Method overriding using Generics
    @Override
    public void setCandiadateDetails(T candiadateDetails) {
        super.setCandiadateDetails(candiadateDetails);
    }
}
