package com.company;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class BigRockTest {
    BigRock rocky;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void getName() {
        assertEquals("Rocky", rocky.getName());
    }

    // before every single test, do the following
    @Before
    public void myTestSetUp() throws Exception {
        rocky = new BigRock("Rocky");
    }

    @Test
    public void testUnhappyToStart() {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay(){
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    @Ignore("Exception throwing not defined yet")
    @Test (expected = IllegalStateException.class)
    public void willFail() {
        rocky.getHappyMessage();
    }

    @Test (timeout=100) // in ms
    public void waitForHappyTimeout() {
        rocky.waitTillHappy();
    }

    @Test
    public void name() {
        rocky.playWithRock();
        String msg = rocky.getHappyMessage();
        assertEquals("I'm happy", msg);
    }

    @Test
    public void testFavNum() {
        assertEquals(42, rocky.getFavNum());
    }

    @Test (expected = IllegalArgumentException.class)
    public void emptyNameFail() {
        new BigRock("");
    }
}