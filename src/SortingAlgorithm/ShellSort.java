package SortingAlgorithm;


import java.util.Arrays;

public class ShellSort {

    public void ShellSort(Integer ar[]) {
        Integer a[] = ar.clone();
        long currentTime = System.currentTimeMillis();
        double d1 = a.length;
        int temp = 0;
        while (true) {
            d1 = Math.ceil(d1 / 2);
            int d = (int) d1;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < a.length; i += d) {
                    int j = i - d;
                    temp = a[i];
                    for (; j >= 0 && temp < a[j]; j -= d) {
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                }
            }
            if (d == 1)
                break;
        }
        long nowTime = System.currentTimeMillis();
        System.out.println("ShellSort------cost time:" + (nowTime - currentTime) + Arrays.toString(a) + "\n");
    }

    public void showShellSort(Integer ar[]) {
        Integer a[] = ar.clone();
        double d1 = a.length;
        int temp = 0;
        while (true) {
            d1 = Math.ceil(d1 / 2);
            int d = (int) d1;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < a.length; i += d) {
                    int j = i - d;
                    temp = a[i];
                    for (; j >= 0 && temp < a[j]; j -= d) {
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                }
                for (int q = 0; q <= a.length - 1; q++) {
                    for (int k = 0; k < a[q]; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println("--------------------------------------------");
            }
            if (d == 1)
                break;

        }
    }
}
