import org.junit.Test;

import java.util.Arrays;

/**
 * @Author buer
 * @create 2019/5/7 23:31
 * @description
 */
public class 数组 {
    @Test
    public  void test(){
        int[] a = new int[100];
        System.out.println(Arrays.toString(a));
        int[] b = new int[10];
        System.out.println(Arrays.toString(b));
        int[] c = new int[10];
        System.out.println(c);
        //匿名创建数组
        new  int[] {1,2};

    }
}
