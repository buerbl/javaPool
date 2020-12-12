package 容器;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author buer
 * @create 2019/5/18 22:15
 * @description
 */
public class HasmMapTest {
    private final static Logger logger = LoggerFactory.getLogger(HasmMapTest.class);
    //hashmap的初始值对性能影响
    public int test( int true1,   int false1){
        int aHundredMillion = 100;
        int times = 100;


        Map<Integer, Integer> map = new HashMap<>();

        long s1 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            map.put(i, i);
        }
        new Date();
        long s2 = System.currentTimeMillis();

        System.out.println("未初始化容量，耗时 ： " + (s2 - s1));


        Map<Integer, Integer> map1 = new HashMap<>(aHundredMillion);

        long s5 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            map1.put(i, i);
        }
        long s6 = System.currentTimeMillis();

        System.out.println("初始化容量16，耗时 ： " + (s6 - s5));
        System.out.println((s2 - s1) >= (s6 - s5));

        if ((s2 - s1) >= (s6 - s5)){
            true1 = true1+1;

        }else {
            false1++;
        }
        return true1;


//
//        Map<Integer, Integer> map2 = new HashMap<>(aHundredMillion);
//
//        long s3 = System.currentTimeMillis();
//        for (int i = 0; i < times; i++) {
//            map2.put(i, i);
//        }
//        long s4 = System.currentTimeMillis();
//
//        System.out.println("初始化容量为10000000，耗时 ： " + (s4 - s3));
    }

    @Test
    public void test1(){
        int true1=0;
        int false1=0;
        int times = 0;

        for (int i = 0; i < 1000; i ++){
            times = test(true1, false1);
        }
        System.out.println("true次数："+times);

    }


    @Test
    public void putHashMap(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("5", 1);
        map.put("1",3);
        map.put("7",6);
        map.forEach((K,V)-> System.out.println(K+"&"+V));
    }

    /**
     * 测试 for 循环
     */
    @Test
    public void test(){
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("s","dd");
        hashMap.put("d", "sa");
        hashMap.entrySet();
        for (Map.Entry map : hashMap.entrySet()){

        }
//        hashMap.forEach((K,V)-> System.out.println(K+"&"+V));
    }

    @Test
    public void testDemoDto(){
        DemoDto demoDto = new DemoDto("chen", "shenzhen");
        DemoDto demoDto1 = new DemoDto("chen", null);
        HashMap<DemoDto, String> stringHashMap = new HashMap<>();
        stringHashMap.put(demoDto, "a");
        stringHashMap.put(demoDto1, "b");
        stringHashMap.forEach((k, v) -> System.out.println(k+"&&"+v));
        System.out.println("=======================");
        System.out.println(stringHashMap.get(new DemoDto("chen", null)));
    }

    @Test
    public void testDemoDtoLambda(){
        DemoDto demoDto = new DemoDto("chen", "shenzhen");
        DemoDto demoDto1 = new DemoDto("chen", null);
        ArrayList<DemoDto> arrayList = new ArrayList<>(Arrays.asList(demoDto, demoDto1));
        Map<DemoDTO1, DemoDto> collect = arrayList.stream().collect(Collectors.toMap(d -> new DemoDTO1(d.getName(), d.getAdress()), e -> e));
        HashMap<DemoDto, String> stringHashMap = new HashMap<>();
    }


}
