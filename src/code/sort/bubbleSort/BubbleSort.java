package code.sort.bubbleSort;

import code.sort.CommonSort;

/**
 * Created by shawee on 2021/5/12 21:20
 */
public class BubbleSort extends CommonSort {

    /**
     * @param array 进行排序的数组
     * @return int[] 排序完成的数组
     * @description 冒泡排序
     **/
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean didSwap = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    didSwap = true;
                }
            }
            //加入这个判断后，可以让最好情况的时间复杂度变为O（n）
            if (!didSwap) {
                return array;
            }
        }
        return array;
    }
}
