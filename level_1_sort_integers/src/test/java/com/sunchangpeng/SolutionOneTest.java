package com.sunchangpeng;

import org.junit.Test;

/**
 * @author sunchangpeng
 */
public class SolutionOneTest {

    @Test
    public void test() {
        int[] A = new int[]{3, 2, 1, 4, 5};
        SolutionOne.sortIntegers(A);

        for (int a : A) {
            System.out.println(a);
        }
    }
}