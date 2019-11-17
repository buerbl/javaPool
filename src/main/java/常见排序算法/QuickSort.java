package 常见排序算法;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: https://www.cxyxiaowu.com/2026.html 快速排序
 * 1.从数列中挑出一个元素，称为 “基准”（pivot）;
 *
 * 2.重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
 * 在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
 *
 * 3.递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序；
 *
 * @Author: boolean
 * @Date: 2019/11/16 14:29
 */
public class QuickSort {
//        public int[] sort(int[] arr){
//            return quickSort(arr, 0, arr.length - 1);
//        }
//
//    private int[] quickSort(int[] arr, int left, int right) {
//            if (left < right){
//                int partittionIndex = partititon(arr, left, right);
//                quickSort(arr, left, partittionIndex - 1);
//                quickSort(arr, partittionIndex + 1, right);
//            }
//        return arr;
//    }
//
//    private int partititon(int[] arr, int left, int right) {
//        // 设定基准值（privot）
//        int pivot = left;
//        int index = pivot + 1;
//        for (int i = index; i <= right; i++) {
//            if (arr[i] < arr[pivot]){
//                swap(arr, i, index);
//                index ++;
//            }
//        }
//        swap(arr, pivot, index - 1);
//        return index - 1;
//    }
//
//    private void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }



    public void  sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int left ,int right){
        if (left >= right || arr == null || arr.length == 1) {
            return;
        }
        int partitionIndex = partition(arr, left, right);
        quickSort(arr, left, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, right);
    }

    private int partition(int[] arr, int left, int right){
        int pivot = left;
        int index =pivot + 1;
        for(int i = index; i <= right; i ++){
            if(arr[i] < arr[pivot]){
                swap(arr, i, index);
                index ++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private void swap(int[] arr, int i, int j){
        int tem =  arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }

    @Test
    public  void  testSwap(){
        int[] arr = {2, 1,8, 3};
        swap(arr, 0,3);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testSort() {
        int[] arr = {4, 3,2, 1};
        System.out.println("排序之前的"+Arrays.toString(arr));
        sort(arr);
        System.out.println("排序之后的"+Arrays.toString(arr));
    }

    @Test
    public void testAdd(){
        System.out.println((1+2)/2);
    }


    @Test
    public void testMid(){
        for (int i = 0; i < 1000000; i++) {
            int a = new Random().nextInt(100) ;
            int b = new Random().nextInt(100);
            if (a < b){
                int c = a + ((b - a) >> 1);
                int d = (a + b) /2;
                if (c != d){
                    System.out.println("fuck");
                    break;
                }
                System.out.println(a+"&&"+b);
            }


        }
    }
}



