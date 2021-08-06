package com.sda.training.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTest {

    @Before
    public void setUp() {
        System.out.println("inside setup");
    }

    @After
    public void tearDown() {
        System.out.println("inside teardown");
    }

    @Test
    public void testFirst() {
        System.out.println("We are inside first test method");

    }

    @Test
    public void testSecond() {
        System.out.println("We are inside second test method");
    }
}
