package SortingAlgorithm;


import java.util.Arrays;

public class HeapSort {

    public void HeapSort(Integer[] ar) {
        Integer[] a = ar.clone();
        long currentTime = System.currentTimeMillis();
        heapsort(a);
        long nowTime = System.currentTimeMillis();
        System.out.println("HeapSort------cost time:" + (nowTime - currentTime) + Arrays.toString(a) + "\n");
    }

    public void showHeapSort(Integer[] ar) {
        Integer[] a = ar.clone();
        showheapsort(a);
    }

    private void heapsort(Integer[] a) {
        int arrayLength = a.length; //循环建堆
        for (int i = 0; i <= a.length - 1; i++) {
            buildMaxHeap(a, arrayLength - 1 - i);
            swap(a, 0, arrayLength - 1 - i);
        }
    }

    private void showheapsort(Integer[] a) {
        int arrayLength = a.length; //循环建堆
        for (int i = 0; i <= a.length - 1; i++) {
            buildMaxHeap(a, arrayLength - 1 - i);
            swap(a, 0, arrayLength - 1 - i);
            for (int j = 0; j <= a.length - 1; j++) {
                for (int k = 0; k < a[j]; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("--------------------------------------------");
        }
    }

    private void swap(Integer[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    //对data数组从0到lastIndex建堆
    private void buildMaxHeap(Integer[] data, int lastIndex) {
        //从lastIndex处节点的父节点开始
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            //k保存正在判断的节点
            int k = i;
            //如果当前k节点的子节点存在
            while (k * 2 + 1 <= lastIndex) {
                //k节点的左子节点的索引
                int biggerIndex = 2 * k + 1;
                //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
                if (biggerIndex < lastIndex) {
                    //如果右子节点的值比较大
                    if (data[biggerIndex] < data[biggerIndex + 1]) {
                        //biggerIndex总是记录较大子节点的索引
                        biggerIndex++;
                    }
                }
                //如果k节点的值小于其较大的子节点的值
                if (data[k] < data[biggerIndex]) {
                    //交换他们
                    swap(data, k, biggerIndex);
                    //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
                    k = biggerIndex;
                } else {
                    break;
                }
            }
        }
    }
}
