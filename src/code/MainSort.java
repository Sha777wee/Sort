package code;

import code.sort.bubbleSort.BubbleSort;
import code.sort.bucketSort.BucketSort;
import code.sort.insertionSort.InsertionSort;
import code.sort.mergeSort.MergeSort;
import code.sort.quickSort.QuickSort;
import code.sort.selectionSort.SelectionSort;
import code.sort.shellSort.ShellSort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shawee on 2021/5/12 21:02
 */
public class MainSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of the array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Please input the array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int[] newArray;
        System.out.println(Arrays.toString(BubbleSort.sort(array)));
        System.out.println(Arrays.toString(SelectionSort.sort(array)));
        System.out.println(Arrays.toString(InsertionSort.sort(array)));
        System.out.println(Arrays.toString(ShellSort.sort(array)));
        System.out.println(Arrays.toString(MergeSort.sort(array)));
        System.out.println(Arrays.toString(QuickSort.sort(array, 0, n - 1)));
        System.out.println(Arrays.toString(BucketSort.sort(array, 5)));
    }

}
