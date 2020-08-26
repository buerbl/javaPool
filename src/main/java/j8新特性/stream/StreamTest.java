package j8新特性.stream;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author: boolean
 * @Date: 2019/5/17 9:34
 * @description: Stream新特实践 实践 实践
 */
@Slf4j
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
        integerList.stream().filter(i -> i > 3 || i< 2).forEach(System.out::println);
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
        List list = Arrays.asList(1, 2, 3, 4, 5,2,8, 7);
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

    @Test
    public void testMap(){
        List<O1> o1List = Arrays.asList(new O1("CHEN1", "深圳1",1),
                new O1("CHEN2", "深圳2",1),
                new O1("CHNE3", "深圳3",1),
                new O1("CHEN", "深圳4",1));
        List<U> uList = o1List.stream().map(o -> {
            U u1 = new U();
            u1.setAdress(o.getAdress());
            u1.setName(o.getName());
            return u1;
        }).collect(Collectors.toList());
        log.info(new Gson().toJson(uList));

    }

    @Test
    public void testSort(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Mahesh", 12));
        list.add(new Student(2, "Suresh", 15));
        list.add(new Student(3, "Nilesh", 10));

        System.out.println("---Natural Sorting by Name---");
        List<Student> slist = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

    }



    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class U{
        private String name;
        private String adress;
        private String a;
        private String b;

    }

    @Data
    @AllArgsConstructor
    class O1{
        private String name;
        private String adress;
        private Integer sex;

    }


    @Test
    public void testMatch(){
        List<Employee> employees = Arrays.asList(
                new Employee("张三", 18 ,9999.99, Employee.Status.FREE),
                new Employee("李四", 38, 5555.99, Employee.Status.BUSY),
                new Employee("王五", 50, 6666.66, Employee.Status.VOCATION),
                new Employee("赵六", 16, 3333.33, Employee.Status.FREE),
                new Employee("田七", 8, 7777.77, Employee.Status.BUSY)
        );
        //allMatch---检查是否匹配所有元素
        boolean b1 = employees.stream()
                .allMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b1);

        //anyMatch---检查是否至少匹配一个元素
        boolean b2 = employees.stream()
                .anyMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b2);


    }

    @Test
    public void testListToMap(){
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 3, 6, 6, 7, 8));
        List<Employee> list = new ArrayList<>();
        Employee chen1 = new Employee("chen", 18, 18.00D, Employee.Status.BUSY);
        Employee chen2 = new Employee("chen", 19, 18.00D, Employee.Status.BUSY);
        list.add(chen1);list.add(chen2);
        Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getName));
        map.forEach((k,v)-> System.out.println(k+"&&"+v));
        System.out.println(map);
    }


    @Test
    public void testListPutMap(){
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 3, 6, 6, 7, 8));
        Map<Integer, List<Integer>> map = new HashMap();
        map.put(1, integers);
        map.get(1);

    }
    @Data
    @AllArgsConstructor
    static class Employee {

        private String name;
        private Integer age;
        private Double salary;
        private Status status;

         enum Status{
            FREE,
            BUSY,
            VOCATION;
        }
    }

    }
