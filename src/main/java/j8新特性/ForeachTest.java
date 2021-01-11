package j8新特性;

import org.junit.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @Description: foreach的使用
 * @Author: boolean
 * @Date: 2019/11/21 16:13
 */
public class ForeachTest {

    @Test
    public void test1() {
        List list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(System.out::println);
        System.out.println(Arrays.toString(list.toArray()));
    }

    @Test
    public void test2() {
        List list = new LinkedList();
        for (Object o : list) {
//            list.add()
        }

        System.out.println(Arrays.toString(list.toArray()));
    }

    @Test
    public void test3() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 6, 2, 0, 4));
        System.out.println(Arrays.toString(new ArrayList[]{list}));
        list.removeIf(s -> s.equals(0) || s.equals(1));
        System.out.println("----------------------------------------");
        System.out.println(Arrays.toString(new ArrayList[]{list}));
    }

    @Test
    public void test4() {
//        String uri = "以下商品库存不足:</br>卖品不足了单品;,以下商品库存不足:</br>cwg1229单品;";
//        Pattern p = Pattern.compile("</br>.*?;");
//        Matcher m = p.matcher(uri.trim());
//        StringBuffer sb = new StringBuffer();
//        while (m.find())
//        {
//            System.out.println(m.group());
//        }
//        System.out.println(sb);
//        m.appendTail(sb);

        String U1 = "卖品不足了单品;";
        String U2 = "卖品不足了单品2;";
        String U3 = "卖品不足了单品3;";

        ArrayList<String> list = new ArrayList<>();
        list.add(U1);
        list.add(U2);
        list.add(U3);
        String join = String.join("", list);
        System.out.println(join);
    }
}



