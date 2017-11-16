package com.sunchangpeng;

/**
 * 插入排序
 *
 * @author sunchangpeng
 */
public class SolutionThree {
    public static void sortIntegers(int[] A) {
        int length = A.length;

        for (int i = 1; i < length; i++) {
            int tmp = A[i];

            int j = i - 1;
            for (; j >= 0 && A[j] > tmp; j--) {
                A[j + 1] = A[j];
            }

            A[j + 1] = tmp;
        }

    }
}
