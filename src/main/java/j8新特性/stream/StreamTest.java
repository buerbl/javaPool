package j8新特性.stream;

import com.google.gson.Gson;
import org.checkerframework.checker.units.qual.s;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author: boolean
 * @Date: 2019/5/17 9:34
 * @description: Stream新特实践 实践 实践
 */
public class StreamTest {
    @Test
    public void test1(){
        //通过集合创建Stream  asList()->返回由指定数组支持的固定大小的列表
        List<String> str = Arrays.asList("A", "HasmMapTest", "C", "A");
        Stream<String> stringStream = str.stream();
        //过滤
        System.out.println(stringStream.filter(s -> "A".equals(s)).collect(Collectors.toList()));
        List<Integer> list = Arrays.asList(1, 4, 6, 2, 5, 6);
        // 去重
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
        System.out.println(str.stream().distinct().collect(Collectors.toList()));
        // 最大值
        System.out.println(list.stream().max(Comparator.comparing(Integer::intValue)).get());
        // 最小孩子
        System.out.println(list.stream().min(Comparator.comparing(Integer::intValue)).get());
    }

    @Test
    public void test(){
        List<Integer> integerList = Arrays.asList(1, 1, 2, 3, 4, 5);
        integerList.stream().filter(i -> i > 3).forEach(System.out::println);
    }


    @Test
    public void test2(){
        List list = Arrays.asList(1, 2, 3, 4, 5);
        int count = 0;
        for (Object o : list){
            count ++;
        }
        System.out.println(count);
    }

    @Test
    public void test3(){
        List list = Arrays.asList(1, 2, 3, 4, 5);
        long count = list.stream().count();
        System.out.println(count);
    }

    @Test
    public void test4(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5,1);
        List<Integer> collect = stream.collect(Collectors.toList());
        stream.distinct().collect(Collectors.toList()).forEach(System.out::println);

    }

    @Test
    public void test5(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5,1);
        List<Integer> collect = stream.filter(a -> a > 3).collect(Collectors.toList());
        System.out.println(Arrays.asList(collect));
    }

    @Test
    public void test6(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5,1);
        List<Integer> collect = stream.filter(a -> a > 3).collect(Collectors.toList());
        System.out.println(Arrays.asList(collect));
    }
    @Test
    public void test7(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5,1);
        List<Integer> collect = stream.distinct().collect(Collectors.toList());
        System.out.println(Arrays.asList(collect));
    }

    @Test
    public void test8(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5,1);
        List<Integer> collect = stream.map(a -> a = 1).collect(Collectors.toList());
//        List<Boolean> collect = stream.map(a -> a == 1).collect(Collectors.toList());
        System.out.println(Arrays.asList(collect));
    }
    @Test
    public void test9(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5,1);
        List<Integer> collect = stream.map(a -> {
            a = a + 1;
            return a;
        }).collect(Collectors.toList());
        System.out.println(Arrays.asList(collect));
    }

    @Test
    public void test10(){
        int[] arr = {1, 2, 3, 4, 5,1};
        IntStream stream = Arrays.stream(arr);
        int i  = 1;
        stream.forEach(s -> {
            System.out.println(s+1);
            arr[i] = s++;
        });
        System.out.println(Arrays.toString(arr));
    }
}
