package SortingAlgorithm;

import java.util.Arrays;

public class InsertSort {

    public void InsertSort(Integer[] ar) {
        Integer[] a = ar.clone();
        long currentTime = System.currentTimeMillis();
        int temp = 0;
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            temp = a[i];
            for (; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j]; //将大于temp的值整体向后移一位
            }
            a[j + 1] = temp; //将a[i]的值赋予a[i-1]
        }
        long nowTime = System.currentTimeMillis();
        System.out.println("InsertSort------cost time:" + (nowTime - currentTime) + Arrays.toString(a) + "\n");
    }

    public void showInsertSort(Integer[] ar) {
        Integer[] a = ar.clone();
        int temp = 0;
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            temp = a[i];
            for (; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j]; //将大于temp的值整体向后移一位
            }
            a[j + 1] = temp; //将a[i]的值赋予a[i-1]
            for (int q = 0; q <= a.length - 1; q++) {
                for (int k = 0; k < a[q]; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("--------------------------------------------");
        }
    }
}
