package 基础;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
}
