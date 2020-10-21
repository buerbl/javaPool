package j8新特性;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: foreach的使用
 * @Author: boolean
 * @Date: 2019/11/21 16:13
 */
public class ForeachTest {
    public ForeachTest(){
        System.out.println("我是构造函数");
    }
    @Test
    public void test1(){
        List list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(System.out::println);
        System.out.println(Arrays.toString(list.toArray()));
    }

    @Test
    public void test2(){
        List list = new LinkedList();
        for (Object o : list) {
//            list.add()
        }

        System.out.println(Arrays.toString(list.toArray()));
    }

    @Test
    public void test3(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 6, 2, 0, 4));
        System.out.println(Arrays.toString(new ArrayList[]{list}));
        list.removeIf(s -> s.equals(0)||s.equals(1));
        System.out.println("----------------------------------------");
        System.out.println(Arrays.toString(new ArrayList[]{list}));
    }

}



