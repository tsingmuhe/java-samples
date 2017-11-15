package com.sunchangpeng;

/**
 * @author sunchangpeng
 */
public class SolutionTwo {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;

        if (n == 1) {
            return a;
        }

        if (n == 2) {
            return b;
        }

        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}
