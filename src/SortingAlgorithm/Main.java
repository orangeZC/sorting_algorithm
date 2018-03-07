package SortingAlgorithm;


import java.sql.Time;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

class Runnable_Bubble implements Runnable {
    private Thread t;
    private String threadName;
    private Integer[] testArr;

    Runnable_Bubble (String name, Integer[] test) {
        threadName = name;
        testArr = test;
    }

    public void run() {
        BubbleSort test_BubbleSort = new BubbleSort(); //冒泡排序
        test_BubbleSort.BubbleSort(testArr);
    }

    public void start () {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class Runnable_Heap implements Runnable {
    private Thread t;
    private String threadName;
    private Integer[] testArr;

    Runnable_Heap (String name, Integer[] test) {
        threadName = name;
        testArr = test;
    }

    public void run() {
        HeapSort test_HeapSort = new HeapSort(); //堆排序
        test_HeapSort.HeapSort(testArr);
    }

    public void start () {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class Runnable_Insert implements Runnable {
    private Thread t;
    private String threadName;
    private Integer[] testArr;

    Runnable_Insert (String name, Integer[] test) {
        threadName = name;
        testArr = test;
    }

    public void run() {
        InsertSort test_InsertSort = new InsertSort(); //插入排序
        test_InsertSort.InsertSort(testArr);
    }

    public void start () {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class Runnable_Merge implements Runnable {
    private Thread t;
    private String threadName;
    private Integer[] testArr;

    Runnable_Merge (String name, Integer[] test) {
        threadName = name;
        testArr = test;
    }

    public void run() {
        MergeSort test_MergeSort = new MergeSort(); //合并排序
        test_MergeSort.MergeSort(testArr);
    }

    public void start () {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class Runnable_Quick implements Runnable {
    private Thread t;
    private String threadName;
    private Integer[] testArr;

    Runnable_Quick (String name, Integer[] test) {
        threadName = name;
        testArr = test;
    }

    public void run() {
        QuickSort test_QuickSort = new QuickSort(); //快速排序
        test_QuickSort.QuickSort(testArr);
    }

    public void start () {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class Runnable_Radix implements Runnable {
    private Thread t;
    private String threadName;
    private Integer[] testArr;

    Runnable_Radix (String name, Integer[] test) {
        threadName = name;
        testArr = test;
    }

    public void run() {
        RadixSort test_RadixSort = new RadixSort(); //基排序
        test_RadixSort.RadixSort(testArr);
    }

    public void start () {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class Runnable_Select implements Runnable {
    private Thread t;
    private String threadName;
    private Integer[] testArr;

    Runnable_Select (String name, Integer[] test) {
        threadName = name;
        testArr = test;
    }

    public void run() {
        SelectSort test_SelectSort = new SelectSort(); //选择排序
        test_SelectSort.SelectSort(testArr);
    }

    public void start () {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class Runnable_Shell implements Runnable {
    private Thread t;
    private String threadName;
    private Integer[] testArr;

    Runnable_Shell (String name, Integer[] test) {
        threadName = name;
        testArr = test;
    }

    public void run() {
        ShellSort test_ShellSort = new ShellSort(); //希尔排序
        test_ShellSort.ShellSort(testArr);
    }

    public void start () {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        //随机生成一个长度10000且每个元素都在1-10000之间的Integer型数组
        Integer[] testArr = new Integer[10000];
        for (int i=0; i<10000; i++) {
            int randomNum = random.nextInt(10000)+1;
            testArr[i] = randomNum;
        }

        System.out.println("* ----------------- Part1: 多线程排序算法演示 ----------------- *");
        System.out.println("Program Paused, Press Enter to continue");

        new Scanner(System.in).nextLine();

        Runnable_Bubble test_Bubble = new Runnable_Bubble("test_Bubble", testArr);
        test_Bubble.start();

        Runnable_Shell test_Shell = new Runnable_Shell("test_Shell", testArr);
        test_Shell.start();

        Runnable_Select test_Select = new Runnable_Select("test_Select", testArr);
        test_Select.start();

        Runnable_Radix test_Radix = new Runnable_Radix("test_Radix", testArr);
        test_Radix.start();

        Runnable_Quick test_Quick = new Runnable_Quick("test_Quick", testArr);
        test_Quick.start();

        Runnable_Merge test_Merge = new Runnable_Merge("test_Merge", testArr);
        test_Merge.start();

        Runnable_Insert test_Insert = new Runnable_Insert("test_Insert", testArr);
        test_Insert.start();

        Runnable_Heap test_Heap = new Runnable_Heap("test_Heap", testArr);
        test_Heap.start();

        TimeUnit.SECONDS.sleep(2);

        System.out.println("* ----------------- Part2: 不同排序算法动态演示 ----------------- *");

        //随机生成一个长度15且每个元素都在1-15之间的Integer型数组
        Integer[] showArr = new Integer[15];
        for (int i=0; i<15; i++) {
            int randomNum = random.nextInt(15)+1;
            showArr[i] = randomNum;
        }

        System.out.println("Part2-1: 冒泡排序算法动态演示");
        System.out.println("Program paused, Press Enter to continue");

        new Scanner(System.in).nextLine();

        BubbleSort showBubble = new BubbleSort();
        showBubble.showBubbleSort(showArr);

        System.out.println("Part2-2: 堆排序算法动态演示");
        System.out.println("Program paused, Press Enter to continue");

        new Scanner(System.in).nextLine();

        HeapSort showHeap = new HeapSort();
        showHeap.showHeapSort(showArr);

        System.out.println("Part2-3: 插入排序算法动态演示");
        System.out.println("Program paused, Press Enter to continue");

        new Scanner(System.in).nextLine();

        InsertSort showInsert = new InsertSort();
        showInsert.showInsertSort(showArr);

        System.out.println("Part2-4: 归并排序算法动态演示");
        System.out.println("Program paused, Press Enter to continue");

        new Scanner(System.in).nextLine();

        MergeSort showMerge = new MergeSort();
        showMerge.showMergeSort(showArr);

        System.out.println("Part2-5: 快速排序算法动态演示");
        System.out.println("Program paused, Press Enter to continue");

        new Scanner(System.in).nextLine();

        QuickSort showQuick = new QuickSort();
        showQuick.showQuickSort(showArr);

        System.out.println("Part2-6: 基数排序算法动态演示");
        System.out.println("Program paused, Press Enter to continue");

        new Scanner(System.in).nextLine();

        RadixSort showRadix = new RadixSort();
        showRadix.showRadixSort(showArr);

        System.out.println("Part2-7: 选择排序算法动态演示");
        System.out.println("Program paused, Press Enter to continue");

        new Scanner(System.in).nextLine();

        SelectSort showSelect = new SelectSort();
        showSelect.showSelectSort(showArr);

        System.out.println("Part2-8: 希尔排序算法动态演示");
        System.out.println("Program paused, Press Enter to continue");

        new Scanner(System.in).nextLine();

        ShellSort showShell = new ShellSort();
        showShell.showShellSort(showArr);

    }
}
