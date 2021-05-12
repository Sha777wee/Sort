package code.sort.mergeSort;

import java.util.Arrays;

/**
 * Created by shawee on 2021/5/13 0:08
 */
public class MergeSort {

    /**
     * @param array 进行排序的数组
     * @return int[] 排序完成的数组
     * @description 归并排序
     **/
    public static int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(sort(left), sort(right));
    }

    /**
     * @param left  进行合并的数组
     * @param right 进行合并的数组
     * @return int[] 合并完成的数组
     * @description 合并数组
     **/
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = right[i++];
            } else if (left[i] > right[j]) {
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;
    }
}
