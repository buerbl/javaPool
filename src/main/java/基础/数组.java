package 基础;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.s;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author buer
 * @create 2019/5/7 23:31
 * @description
 */
public class 数组 {

    @Test
    public void test() {
        System.out.println();
    }

    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("沉默王二");
        list.add("沉默王三");
        list.add("一个文章真特么有趣的程序员");

        for (String str : list) {
            if ("沉默王二".equals(str)) {
                list.remove(str);
            }
        }
        System.out.println(list);
    }

    @Test
    public void test2() {
        int[] a = {1, 2};
        Integer[] aa = {2, 3};
    }

    // 遍历基本类型整数数组
    @Test
    public void forArray(){
        int[] a = {1,2,3,4,5,6};
        for (int i : a){
            System.out.println(i);
        }
    }


    /**
     * 遍历二维数组的所有元素并求元素和与平均数
     * @param array
     */
    public static void bl1(int[][] array){
        int i, sum = 0, j = 0;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length+1; j++) {
                System.out.println(array[i][j]);
                sum += array[i][j];
            }
        }
        int t = i + j + 1;
        System.out.println(sum);
        System.out.println((double)sum / t);
    }

    @Test
    public void test3dArray(){
        int [][] arr = new int[3][];
        arr[0]=new int[]{1, 3, 4,4};
        arr[1]=new int[]{1,  4,4};
        arr[2] = new int[]{};
        System.out.println(Arrays.deepToString(arr));
    }
}
