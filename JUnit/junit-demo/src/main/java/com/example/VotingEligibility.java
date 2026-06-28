package com.example;

public class VotingEligibility {

    public boolean isEligibleToVote(int age) {

        if(age >= 18) {
            return true;
        }

        return false;
    }

    public String getCategory(int age) {

        if(age < 13)
            return "Child";
        else if(age < 18)
            return "Teen";
        else
            return "Adult";
    }
}