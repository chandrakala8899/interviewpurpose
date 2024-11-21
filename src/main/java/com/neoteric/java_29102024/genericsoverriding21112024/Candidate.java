package com.neoteric.java_29102024.genericsoverriding21112024;

public class Candidate<T> {
    private T candiadateDetails;

    public T getCandiadateDetails() {
        return candiadateDetails;
    }

    public Candidate(T candiadateDetails){
        this.candiadateDetails = candiadateDetails;
    }

    public void setCandiadateDetails(T candiadateDetails){
        this.candiadateDetails=candiadateDetails;
    }
}