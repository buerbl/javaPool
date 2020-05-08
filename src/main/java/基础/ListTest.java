package 基础;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.*;

/**
 * @Author buer
 * @create 2019/5/6 23:24
 * @description
 */
public class ListTest {
    @Test
    public void test(){
        List<String> list = new LinkedList<String>();
        for(Integer i = 0; i < 10; i ++){
            list.add(i, i.toString());
            System.out.println(list.get(i));
        }
String a = "1";

    }

    @Test
    public void test2(){
        List list = new LinkedList();
        List list1 = new ArrayList();
        list = list1;
        System.out.println(list.getClass().getSimpleName());
    }


    @Test
    public void test1(){
        List<String> list = new LinkedList<>();
//        list.add(0, "{\"name\":\"3\"}");
        list.add(0, "1");
//        list.set(2, "1");
//        list.set(3, "1");
//        list.set(4, "1");
//        System.out.println(list.get(0));
//        System.out.println(list.get(0).getClass());
        System.out.println(JSONObject.toJSON(list));
//        System.out.println(JSONObject.parseObject(list.get(0)).getString("name"));

    }

    @Test
    public void test3(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(6,1);
//        list.add(0, "{\"name\":\"3\"}");
        System.out.println(JSONObject.toJSON(map));

    }

    @Test
    public void test4(){
       int a=5,b=2,c=4,d=6;
        System.out.println(a--*2+c*--d);
    }


}
