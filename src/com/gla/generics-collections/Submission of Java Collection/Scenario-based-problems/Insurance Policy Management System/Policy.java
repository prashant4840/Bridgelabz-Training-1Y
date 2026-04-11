package com.gla.generics-collections.java_collection_assignment.insurance_system;

import java.time.LocalDate;

public class Policy implements Comparable<Policy> {
    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    public Policy(int policyNumber, String holderName, LocalDate expiryDate, String coverageType, double premium){
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }


    @Override
    public int compareTo(Policy p){
        return this.expiryDate.compareTo(p.expiryDate);
    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Policy)) return false;
        return this.policyNumber == ((Policy)o).policyNumber;
    }

    @Override
    public int hashCode(){
        return policyNumber;
    }

    @Override
    public String toString(){
        return policyNumber + " | " + holderName + " | " + coverageType + " | " + expiryDate;
    }
}
