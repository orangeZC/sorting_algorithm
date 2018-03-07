package SortingAlgorithm;


import java.util.Arrays;

public class BubbleSort {

    public void BubbleSort(Integer[] ar) {
        //冒泡排序
        Integer[] a = ar.clone();
        long currentTime = System.currentTimeMillis();
        int temp = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        long nowTime = System.currentTimeMillis();
        System.out.println("BubbleSort------cost time:" + (nowTime - currentTime) + Arrays.toString(a) + "\n");
    }

    public void showBubbleSort(Integer[] ar) {
        Integer[] a = ar.clone();
        int temp = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
            for (int j = 0; j <= a.length - 1; j++) {
                for (int k = 0; k < a[j]; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("--------------------------------------------");
        }
    }
}
