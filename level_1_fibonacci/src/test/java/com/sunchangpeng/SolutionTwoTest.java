package com.sunchangpeng;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sunchangpeng
 */
public class SolutionTwoTest {
    @Test
    public void test_1() {
        assertEquals(SolutionTwo.fibonacci(1), 0);
    }

    @Test
    public void test_2() {
        assertEquals(SolutionTwo.fibonacci(2), 1);
    }

    @Test
    public void test_10() {
        assertEquals(SolutionTwo.fibonacci(10), 34);
    }

    @Test
    public void test_47() {
        assertEquals(SolutionTwo.fibonacci(47), 1836311903);
    }
}