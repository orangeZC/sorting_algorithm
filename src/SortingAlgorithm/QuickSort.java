package SortingAlgorithm;


import java.util.Arrays;

public class QuickSort {

    public void QuickSort(Integer[] ar) {
        Integer a[] = ar.clone();
        long currentTime = System.currentTimeMillis();
        quick(a);
        long nowTime = System.currentTimeMillis();
        System.out.println("QuickSort------cost time:" + (nowTime - currentTime) + Arrays.toString(a) + "\n");
    }

    public void showQuickSort(Integer[] ar) {
        Integer a[] = ar.clone();
        showquick(a);
    }

    private int getMiddle(Integer[] list, int low, int high) {
        int temp = list[low]; //以数组的第一个作为中轴
        while (low < high) {
            while (low < high && list[high] >= temp) {
                high--;
            }
            list[low] = list[high]; //比中轴的值小的话就移到低端
            while (low < high && list[low] <= temp) {
                low++;
            }
            list[high] = list[low]; //比中轴的值大的话移到高端
        }
        list[low] = temp; //中轴返回到尾端
        return low; //返回中轴位置
    }

    private void _quicksort(Integer[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);
            _quicksort(list, low, middle - 1);
            _quicksort(list, middle + 1, high);
        }
    }

    private void quick(Integer[] a2) {
        if (a2.length > 0) {
            _quicksort(a2, 0, a2.length - 1);
        }
    }

    private void _showquicksort(Integer[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);
            _showquicksort(list, low, middle - 1);
            _showquicksort(list, middle + 1, high);
            for (int q = 0; q <= list.length - 1; q++) {
                for (int k = 0; k < list[q]; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("--------------------------------------------");
        }
    }

    private void showquick(Integer[] a2) {
        if (a2.length > 0) {
            _showquicksort(a2, 0, a2.length - 1);
        }
    }
}
