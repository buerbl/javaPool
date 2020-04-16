package lambdatest;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CRUDTest {
    /**
     * 查找出特定的值
     */
    @Test
    public void test(){
        List<Integer> list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (Object o : list) {
            Object a = null;
            if (o.equals(1)){
                a = o;
                System.out.println(a.getClass().getSimpleName());
                System.out.println(a);
                break;
            }
        }
        Object collect = list.stream().filter(s -> s.equals(1)).collect(Collectors.toList());
        System.out.println(collect.getClass().getSimpleName());
        System.out.println(collect);
        Object collect1 = list.stream().filter(s -> s.equals(2)).collect(Collectors.toList());
        System.out.println(collect1);
    }

    /**
     * 创建特定的对象集合以及查找特定集合
     */
    @Test
    public void creatTest(){
        List<Student> studentList = Stream.of(
                new Student("路飞", 22, 175),
                new Student("红发", 40, 180),
                new Student("白胡子", 50, 185)).
                collect(Collectors.toList());
        System.out.println(studentList);
        System.out.println(new Gson().toJson(studentList));
        List<Integer> integerList = studentList.stream().map(Student::getAge).collect(Collectors.toList());
        System.out.println(integerList);
    }


    @Test
    public void test1(){
        Integer[] data  = {5,34,67,2,6};
        Arrays.sort(data,(var1, var2)->{
            if (var1>var2) return 1;
            else return -1;
        });
        System.out.println(Arrays.toString(data));
    }


}
