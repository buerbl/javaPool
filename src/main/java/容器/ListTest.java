package 容器;

import org.junit.Test;

import java.beans.Transient;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author boolean
 * Date: 2019/5/28 15:27
 * description:
 */
public class ListTest {
    @Test
    public void test(){
        List<Integer> aList = new LinkedList();
        for (int i = 0; i < 10; i ++){
            int num = new Random().nextInt(10);
            aList.add(num);
        }

        for (Integer i : aList){
            System.out.println(i);
        }
        aList.forEach(System.out::println);
        for (int i = 0; i < 10; i++){
            System.out.println(aList.get(i));
        }

        aList.forEach(System.out::println);
    }

    @Test
    public void linkListTest(){
        LinkedList<String> linkedList = new LinkedList<>();
    }

    @Test
    public void testFor(){
        int times = 10;
        List<Integer> list = new LinkedList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println(list);
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = list.size() - 1;j > i; j --  ){
                if (list.get(i) == list.get(j)){
                    list.remove(i);
                }
            }
        }
        System.out.println(list);
    }


    @Test
    public void testFor3(){
        int times = 10;
        List<Integer> list = new LinkedList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println(list);
        for (int i = 0; i < list.size() ; i++){
            for (int j = i+1;j < list.size(); j ++  ){
                if (list.get(i) == list.get(j)){
                    list.remove(i);

                }
            }
        }
        System.out.println(list);
    }


    @Test
    public void testFor1(){
        int times = 10;
        List<Integer> list = new LinkedList();
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--){
            list.remove(i);
        }
        System.out.println(list);
    }

    @Test
    public void testFor2(){
        int times = 10;
        List<Integer> list = new LinkedList();
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }


}
