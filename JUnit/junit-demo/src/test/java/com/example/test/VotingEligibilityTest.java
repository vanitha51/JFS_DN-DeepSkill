package com.example.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.VotingEligibility;

public class VotingEligibilityTest {

    VotingEligibility voter = new VotingEligibility();

    @Test
    public void testEligibleToVote() {

        assertTrue(voter.isEligibleToVote(20));

    }

    @Test
    public void testNotEligibleToVote() {

        assertFalse(voter.isEligibleToVote(15));

    }

    @Test
    public void testChildCategory() {

        assertEquals("Child", voter.getCategory(10));

    }

    @Test
    public void testTeenCategory() {

        assertEquals("Teen", voter.getCategory(16));

    }

    @Test
    public void testAdultCategory() {

        assertEquals("Adult", voter.getCategory(25));

    }

}