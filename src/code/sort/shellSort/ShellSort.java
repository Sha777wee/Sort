package code.sort.shellSort;

/**
 * Created by shawee on 2021/5/12 23:46
 */
public class ShellSort {

    /**
     * @param array 进行排序的数组
     * @return int[] 排序完成的数组
     * @description 选择排序
     **/
    public static int[] sort(int[] array) {
        //希尔增量
        int gap = array.length / 2;
        while (gap > 0) {
            for (int i = gap; i < array.length; i++) {
                int current = array[i];
                int index = i - gap;
                while (index >= 0 && current < array[index]) {
                    array[index + gap] = array[index];
                    index -= gap;
                }
                array[index + gap] = current;
            }
            gap /= 2;
        }
        return array;
    }
}
