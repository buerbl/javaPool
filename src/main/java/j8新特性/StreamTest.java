package j8新特性;

import org.checkerframework.checker.units.qual.s;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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
        List<String> str = Arrays.asList("A", "HasmMapTest", "C");
        Stream<String> stringStream = str.stream();
        //过滤
        System.out.println(stringStream.filter(s -> "A".equals(s)).collect(Collectors.toList()));
        List<Integer> list = Arrays.asList(1, 4, 6, 2, 5, 6);
        // 去重
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
        // 最大值
        System.out.println(list.stream().max(Comparator.comparing(Integer::intValue)).get());
        // 最小孩子
        System.out.println(list.stream().min(Comparator.comparing(Integer::intValue)).get());
    }
}
