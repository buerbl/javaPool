package 常见排序算法;

import org.junit.Test;

/**
 * @Description:
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 以此类推，直到所有元素均排序完毕。
 * @Author: boolean
 * @Date: 2019/11/18 12:36
 */
public class SelectSort extends BaseSort {
    @Override
    protected void sort(int[] arr) {
        for (int i = 0; i < arr.length -1 ; i++) {
            int min = i;
            for (int j =  i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    @Test
    public void test(){
        BaseSort sort = new SelectSort();
        sort.testSort(sort);
    }
}



