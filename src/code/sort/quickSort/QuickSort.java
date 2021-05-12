package code.sort.quickSort;

/**
 * Created by shawee on 2021/5/13 0:36
 */
public class QuickSort {


    /**
     * @param array 进行排序的数组
     * @param left  左索引
     * @param right 右索引
     * @return int[] 排序完成的数组
     * @description 快速排序
     **/
    public static int[] sort(int[] array, int left, int right) {
        if (left < right) {
            int pivotPosition = partition(array, left, right);
            sort(array, left, pivotPosition - 1);
            sort(array, pivotPosition + 1, right);
        }
        return array;
    }

    /**
     * @param array 进行排序的数组
     * @param left  左索引
     * @param right 右索引
     * @return int 基准位置
     * @description 分区
     **/
    public static int partition(int[] array, int left, int right) {
        int pivot = array[left];
        while (left < right) {
            while (left < right && array[right] >= pivot) right--;
            array[left] = array[right];
            while (left < right && array[left] <= pivot) left++;
            array[right] = array[left];
        }
        array[left] = pivot;
        return left;
    }
}
