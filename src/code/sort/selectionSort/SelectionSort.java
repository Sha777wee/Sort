package code.sort.selectionSort;

import code.sort.CommonSort;

/**
 * Created by shawee on 2021/5/12 22:51
 */
public class SelectionSort extends CommonSort {

    /**
     * @param array 进行排序的数组
     * @return int[] 排序完成的数组
     * @description 选择排序
     **/
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
        return array;
    }
}
