package 容器;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Description: LinkedList
 * @Author: boolean
 * @Date: 2019/11/20 12:03
 */
@Slf4j
public class LinkListTest {
    LinkedList linkedList = new LinkedList();
    @Test
    public void test(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(0, "s");
    }

    @Test
    public void test1(){

        linkedList.add("s");
        if (linkedList.size() == 5){
            linkedList.forEach(System.out::println);
            return;
        }
        test1();

    }

    @Test
    public void test2(){
        int j = 1;
        int i = 0;
        j = i++;
        System.out.println(j);
        System.out.println(i);
    }

    @Test
    public void test3(){
        ArrayList<String> strings = Lists.newArrayList("2", "d", "d");
        log.info(JSON.toJSONString(strings));
    }
}



