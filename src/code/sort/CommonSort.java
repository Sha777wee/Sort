package code.sort;

/**
 * Created by shawee on 2021/5/12 21:45
 */
public abstract class CommonSort {

    protected static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    
}
