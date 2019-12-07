package 常见排序算法;

import org.junit.Test;

/**
 * @Description: 快速排序
 *
 * 1 找出基准（选中间值）
 * 2 移动左边数字直到数字大于基准
 * 3 移动右边数字直到数字小于基准
 * 4 交换左右数字(与基准值相等的数可以到任何一边)
 * 5 左边递归
 * 6 右边递归
 * @Author: boolean
 * @Date: 2019/11/17 18:14
 */
public class QucikSort extends BaseSort {

    public  static void quickSort(int[] arr, int left, int right){
        if ( left >= right||arr == null || arr.length <= 1){
            return;
        }
        int pivot = arr[left + ((right - left) >> 1)];
        int i = left;
        int j = right;
        while (i <= j ){
            while (arr[i] < pivot){
                ++i ;
            }
            while (arr[j] > pivot){
               -- j ;
            }

            //与基准值相等的数可以到任何一边
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                ++i;
                --j;
            } else if (i == j) { //跳出循环后i>j
                ++i;
            }
        }
        quickSort(arr, left, j);
        quickSort(arr,i, right);
    }

    public static void main(String[] args) {
        BaseSort sort = new QucikSort();
       sort.testSort(sort);

    }

    @Override
    protected void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    @Test
    public void test(){
        System.out.println((0 - 1) / 2); // 0
    }
}



