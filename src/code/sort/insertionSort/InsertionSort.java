package code.sort.insertionSort;

/**
 * Created by shawee on 2021/5/12 23:11
 */
public class InsertionSort {

    /**
     * @param array 进行排序的数组
     * @return int[] 排序完成的数组
     * @description 插入排序
     **/
    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int index = i - 1;
            while (index >= 0 && current < array[index]) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = current;
        }
        return array;
    }
}
