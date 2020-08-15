package 基础;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

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

    @Test
    public void test5(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = list.stream().filter(l -> !Objects.equals(l, 2)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }


    @Test
    public void testBeforeSetAdd(){
        List<O1> list = new LinkedList();
        O1 o1 = new O2();
        if (o1 instanceof O2){
            System.out.println("是O2");
        }

        list.add(o1);
        System.out.println(list.get(0).toString());
        o1.setSex(1);
        o1.setName("chen");
        System.out.println(list.get(0).toString());
    }

    @Data
    private class O1 {
        private String name;
        private Integer sex;
    }

    @Data
    private class O2 extends O1{

    }

    @Data
    private class O3 extends O1{

    }

    @Test
    public void testJioaJi(){
        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("H");
        List<String> list2 = new ArrayList<String>();
        list2.add("B");
        list2.add("C");
        list2.add("P");

        System.out.println(list1.retainAll(list2));
        System.out.println(list1);
    }


    @Test
    public void testWhetherRepeat(){
        // 1. A 不限，B 指定可用或者不可用或者不限（0 不限 1 指定可用 2 指定不可用）
        // 期待返回true
//        List<Integer> A = new LinkedList<>();
//        List<Integer> B = new LinkedList<>();
//        B.add(1);
//        B.add(2);
//        B.add(3);
//        System.out.println(whetherRepeatUtil(0, 2, A, B)); // 通过
//        System.out.println(whetherRepeatUtil(0, 1, A, B)); // 通过
//        System.out.println(whetherRepeatUtil(0, 0, A, B)); // 通过




        // 2. A 指定可用，B不限 （0 不限 1 指定可用 2 指定不可用）
        // 期待返回true
//        List<Integer> A = new LinkedList<>();
//        List<Integer> B = new LinkedList<>();
//        A.add(1);
//        A.add(2);
//        A.add(3);
//        System.out.println(whetherRepeatUtil(1, 0, A, B));

        // 3. A 指定可用，B指定可用 A 包含 B （0 不限 1 指定可用 2 指定不可用）
        // 期待返回true
//        List<Integer> A = new LinkedList<>();
//        List<Integer> B = new LinkedList<>();
//        A.add(1);
//        A.add(2);
//        A.add(3);
//        B.add(1);
//        System.out.println(whetherRepeatUtil(1, 1, A, B));

        // 4. A 指定可用，B指定可用 A 不包含 B （0 不限 1 指定可用 2 指定不可用）
        // 期待返回false
//        List<Integer> A = new LinkedList<>();
//        List<Integer> B = new LinkedList<>();
//        B.add(2);
//        B.add(3);
//        A.add(1);
//        System.out.println(whetherRepeatUtil(1, 1, A, B));


        // 5. A 指定可用，B指定可用 A 不包含 B （0 不限 1 指定可用 2 指定不可用）
        // 期待返回false
//        List<Integer> A = new LinkedList<>();
//        List<Integer> B = new LinkedList<>();
//        B.add(2);
//        B.add(3);
//        A.add(1);
//        System.out.println(whetherRepeatUtil(1, 1, A, B));


        // 6. A 指定可用，B指定不可用 B 不包含 A （0 不限 1 指定可用 2 指定不可用）
        // 期待返回false
        List<Integer> A = new LinkedList<>();
        List<Integer> B = new LinkedList<>();
        B.add(2);
        B.add(3);
        A.add(3);
        System.out.println(whetherRepeatUtil(1, 2, A, B));




    }

    /**
     *
     * @param AAll True 表示 A 不限（包括所有）
     * @param BAll True 表示 B 不限（包括所有）
     * @param A A的范围（不可用或者可用）
     * @param B B的范围（不可用或者可用）
     * @return
     */
    /**
     *
     * @param AType 表示 A 类型 （0 不限 1 指定可用 2 指定不可用）
     * @param BType 表示 B 类型 （0 不限 1 指定可用 2 指定不可用）
     * @param A A的范围（不可用或者可用）
     * @param B B的范围（不可用或者可用）
     * @return
     */
    private Boolean whetherRepeatUtil(Integer AType, Integer BType, List A, List B){
        if (Objects.equals(AType, 0)){
            return Boolean.TRUE;
        }
        if (Objects.equals(BType, 0)){
            return Boolean.TRUE;
        }
        // 穷举所有情况（4种）
        // 1. A 可用  B可用
        if (Objects.equals(AType,1) && Objects.equals(BType, 1)){
            A.retainAll(B);
            if (CollectionUtils.isNotEmpty(A)){
                return Boolean.TRUE;
            }
        }
        // 2. A 可用  B不可用
        if (Objects.equals(AType,1) && Objects.equals(BType, 2)){
            if (B.containsAll(A) && A.containsAll(B)){
                return Boolean.FALSE ;
            }else{
                return Boolean.TRUE;
            }



        }
        // 3. A 不可用  B可用
        if (Objects.equals(AType,2) && Objects.equals(BType, 1)){
            if (B.containsAll(A) && A.containsAll(B)){
                return Boolean.FALSE;
            }else {
                return Boolean.TRUE;
            }
        }
        // 4. A 不可用  B不可用
        if (Objects.equals(AType,2) && Objects.equals(BType, 2)){
            A.retainAll(B);
            if (CollectionUtils.isNotEmpty(A)){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    @Test
    public void testListRetainAll(){
        List<Integer> list = new LinkedList(Arrays.asList(2,3));
        List list1 =  new LinkedList(Arrays.asList(1,2,5));
        list.retainAll(list1);
        System.out.println(list);
    }
}
