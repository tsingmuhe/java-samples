package com.sunchangpeng;

/**
 * @author sunchangpeng
 */
public class SolutionOne {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }


        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
