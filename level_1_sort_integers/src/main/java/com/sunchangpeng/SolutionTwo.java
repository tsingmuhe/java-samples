package com.sunchangpeng;

/**
 * 选择排序
 *
 * @author sunchangpeng
 */
public class SolutionTwo {
    public static void sortIntegers(int[] A) {
        int length = A.length;

        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int t = A[min];
                A[min] = A[i];
                A[i] = t;
            }
        }

    }
}
