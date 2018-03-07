package SortingAlgorithm;

import java.util.Arrays;

public class MergeSort {

    public void MergeSort(Integer[] ar) {
        Integer[] a = ar.clone();
        long currentTime = System.currentTimeMillis();
        sort(a, 0, a.length - 1);
        long nowTime = System.currentTimeMillis();
        System.out.println("MergeSort------cost time:" + (nowTime - currentTime) + Arrays.toString(a) + "\n");
    }

    public void showMergeSort(Integer[] ar) {
        Integer[] a = ar.clone();
        showsort(a, 0, a.length - 1);
    }

    private void sort(Integer[] data, int left, int right) {
        if (left < right) {
            //找出中间索引
            int center = (left + right) / 2;
            //对左边数组进行递归
            sort(data, left, center);
            //对右边数组进行递归
            sort(data, center + 1, right);
            //合并
            merge(data, left, center, right);
        }
    }

    private void showsort(Integer[] data, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            showsort(data, left, center);
            showsort(data, center + 1, right);
            merge(data, left, center, right);
            for (int q = 0; q <= data.length - 1; q++) {
                for (int k = 0; k < data[q]; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("--------------------------------------------");
        }
    }

    private void merge(Integer[] data, int left, int center, int right) {
        int[] tmpArr = new int[data.length];
        int mid = center + 1;
        //third记录中间数组的索引
        int third = left;
        int tmp = left;
        while (left <= center && mid <= right) {
            //从两个数组中取出最小的放入中间数组
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        //剩余部分依次放入中间数组
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        //将中间数组中的内容复制回原数组
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }
}
