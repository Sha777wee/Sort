package code.sort.bucketSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Shawee
 * @Date 2023/5/12
 */
public class BucketSort {

    /**
     * @param array      进行排序的数组
     * @param bucketSize 桶的数量
     * @return int[] 排序完成的数组
     * @description 桶排序
     **/
    public static int[] sort(int[] array, int bucketSize) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }

        List<List<Integer>> bucketList = new ArrayList<>();
        for (int i = 0; i < bucketSize; i++) {
            bucketList.add(new ArrayList<>());
        }

        for (int num : array) {
            // 通过num在[min，max]位置来划分桶
            int buckedIndex = (num - min) * (bucketSize - 1) / (max - min);
            List<Integer> list = bucketList.get(buckedIndex);
            list.add(num);
        }

        for (int i = 0, arrayIndex = 0; i < bucketList.size(); i++) {
            List<Integer> list = bucketList.get(i);
            list.sort(Comparator.comparingInt(a -> a));
            for (Integer val : list) {
                array[arrayIndex] = val;
            }
        }
        return array;
    }
}
