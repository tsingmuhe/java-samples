package com.sunchangpeng;

import org.junit.Test;

/**
 * @author sunchangpeng
 */
public class SolutionThreeTest {
    @Test
    public void test() {
        int[] A = new int[]{3, 2, 1, 4, 5};
        SolutionThree.sortIntegers(A);

        for (int a : A) {
            System.out.println(a);
        }
    }
}