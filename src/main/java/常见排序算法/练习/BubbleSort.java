package 常见排序算法.练习;

import org.junit.Test;
/**
 * @Description:
 * 1.相邻的两个数字两两相比
 * 2.找出最大数字化，向后移动，
 * 3.一次循序确定一个数字
 *
 *
 * 优化：在外循环设置标志位flag 在内循环里面赋值 判断是否提前结束循环
 * @Author: boolean
 * @Date: 2019/11/18 11:50
 */
public class BubbleSort extends BaseSort {
//    @Override
    protected void sort1(int[] arr) {
        for (int i = arr.length - 1; i >=  0; i --) {
            for (int j = 0; j < i ; j++) {
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

    protected void sort(int[] arr) {
        for (int i = arr.length - 1; i >  0; i --) {
            boolean flag = false;
            for (int j = 0; j < i ; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag){
                return;
            }
        }
    }
}



