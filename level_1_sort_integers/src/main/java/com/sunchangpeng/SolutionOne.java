package com.sunchangpeng;

/**
 * 冒泡排序
 *
 * @author sunchangpeng
 */
public class SolutionOne {
    public static void sortIntegers(int[] A) {
        int length = A.length;
        for (int i = length - 1; i > 0; i--) {
            int current = A[i];
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] > current) {
                    current = A[j];
                    A[j] = A[i];
                    A[i] = current;
                }
            }
        }
    }
}
