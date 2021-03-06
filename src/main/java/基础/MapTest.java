package 基础;

import com.google.common.collect.Maps;
import org.junit.Test;
import org.springframework.util.StopWatch;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author 布尔bl
 * @create 2020/5/6 12:28
 */
public class MapTest {
    // HashMap 无序
    @Test
    public void test1() {
        Map<String, String> map = new HashMap<>();
        map.put("3", "1");
        map.put("4", "1");
        map.put("1", "1");
        for (int i = 0; i < 100; i++) {
            System.out.println("++++++++++++++++++");
            map.forEach((k, v) -> {
                System.out.println(k);
            });
            System.out.println("++++++++++++++++++");
        }
    }

    // TreeMap HashMap 无序 LinkedHashMap 有序
    @Test
    public void test2() {
        Map<String, Integer> hashMap = Maps.newHashMap();
        Map<String, Integer> treeMap = Maps.newTreeMap();
        Map<String, Integer> linkedHashMap = Maps.newLinkedHashMap();
        System.out.println("--------------test hashMap");
        testMap(hashMap);
        System.out.println("--------------test treeMap");
        testMap(treeMap);
        System.out.println("--------------test linkedHashMap");
        testMap(linkedHashMap);
    }

    private static void testMap(Map<String, Integer> map) {
        map.put("asd", 1);
        map.put("2das", 2);
        map.put("3das", 3);
        map.put("4das", 4);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }


    @Test
    public void testValues(){
        Map<String, String> map = new HashMap();
        map.put("c","h");
        map.put("e", "n");
        map.put("w", "e");
        Collection<String> values = map.values();
        values = null;
        values.forEach(s-> System.out.println(s));



    }

    @Test
    public void testMapAndList(){
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int time = 11;
        for (int i = 0; i < time; i ++){
            list.add(i);
            map.put(i,i);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("list");
        list.stream().filter(l -> l.equals(10)).collect(Collectors.toList()).get(0);
        list.stream().filter(l -> l.equals(10)).collect(Collectors.toList()).get(0);
        list.stream().filter(l -> l.equals(10)).collect(Collectors.toList()).get(0)
        ;list.stream().filter(l -> l.equals(10)).collect(Collectors.toList()).get(0);list.stream().filter(l -> l.equals(10)).collect(Collectors.toList()).get(0);
        list.stream().filter(l -> l.equals(10)).collect(Collectors.toList()).get(0);



        stopWatch.stop();
        stopWatch.start("map");
        Integer integer = map.get(10);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());

    }


}
