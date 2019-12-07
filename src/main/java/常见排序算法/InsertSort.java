package 常见排序算法;

import org.junit.Test;

/**
     * @Description:  和打牌一样,后来的牌与前面相比，如果前面的牌大，就将大的牌向后移动
 * @Author: boolean
 * @Date: 2019/11/18 14:17
 */
public class InsertSort extends BaseSort {
    @Override
    protected void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j --) {
                    swap(arr, j, j + 1);
            }
        }
    }
    @Test
    public void test( ){
        BaseSort sort  = new InsertSort();
        sort.testSort(sort);

    }
}



