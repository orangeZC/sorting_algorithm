package SortingAlgorithm;


import java.util.Arrays;

public class SelectSort {

    public void SelectSort(Integer ar[]) {
        Integer[] a = ar.clone();
        long currentTime = System.currentTimeMillis();
        int position = 0;
        for (int i = 0; i < a.length; i++) {
            int j = i + 1;
            position = i;
            int temp = a[i];
            for (; j < a.length; j++) {
                if (a[j] < temp) {
                    temp = a[j];
                    position = j;
                }
            }
            a[position] = a[i];
            a[i] = temp;
        }
        long nowTime = System.currentTimeMillis();
        System.out.println("SelectSort------cost time:" + (nowTime - currentTime) + Arrays.toString(a) + "\n");
    }

    public void showSelectSort(Integer ar[]) {
        Integer[] a = ar.clone();
        int position = 0;
        for (int i = 0; i < a.length; i++) {
            int j = i + 1;
            position = i;
            int temp = a[i];
            for (; j < a.length; j++) {
                if (a[j] < temp) {
                    temp = a[j];
                    position = j;
                }
            }
            a[position] = a[i];
            a[i] = temp;
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
