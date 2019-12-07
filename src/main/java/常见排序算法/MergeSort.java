package 常见排序算法;

import org.junit.Test;

/**
 * @Description: 归并算法
 * 步骤：
 * 1.按中间位置左右递归划分模块
 * 2.申请一个辅助数组
 * 2.比较两个数组元素的大小，按小到大放进辅助数组中
 * 3.比较后剩余元素直接放在辅助数组后面
 * 4.将辅助数组放进原来的数组
 * @Author: boolean
 * @Date: 2019/11/17 20:24
 */
public class MergeSort extends BaseSort {
    public  void sort(int[] arr){
        merge( arr, 0, arr.length - 1);
    }
    private static void merge(int[] arr, int left, int right){
        if(left >= right ||arr == null){
            return;
        }
        int mid = left + ((right - left) >> 1 );
        merge(arr, left, mid);
        merge(arr, mid + 1, right);
        int p1 = left, p2= mid + 1, i = 0;
        int[] help = new int[right - left + 1];
        while(p1 <= mid && p2 <= right){
            help[i ++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1 <= mid ){
            help[i ++] =  arr[p1++] ;
        }
        while(p2 <= right){
            help[i ++] =  arr[p2++];
        }
        for(int j = 0; j < help.length ; j ++){
            arr[left +j] = help[j];
        }
    }
    @Test
    public void test(){
        MergeSort sort = new MergeSort();
        testSort(sort);
    }
}


