package com.sunchangpeng;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sunchangpeng
 */
public class SolutionOneTest {
    @Test
    public void test_1() {
        assertEquals(SolutionOne.fibonacci(1), 0);
    }

    @Test
    public void test_2() {
        assertEquals(SolutionOne.fibonacci(2), 1);
    }

    @Test
    public void test_10() {
        assertEquals(SolutionOne.fibonacci(10), 34);
    }

    //时间太长
    @Test
    public void test_47() {
        assertEquals(SolutionOne.fibonacci(47), 1836311903);
    }
}