package 常见排序算法.练习;

import org.junit.Test;
/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/11/18 11:50
 */
public class BubbleSort extends BaseSort {
    @Override
    protected void sort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i --){
            for (int j = 0; j < i ; j ++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    @Test
    public void test(){
            BaseSort sort = new BubbleSort();
            sort.testSort(sort);
    }

    @Test
    public void testArrayIndex(){
        int[] arr = {1,3,4};
        System.out.println(arr[88]);

    }
}



