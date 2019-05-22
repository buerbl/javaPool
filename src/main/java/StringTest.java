import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Author: boolean
 * @Date: 2019/4/29 17:08
 * @description:
 */
public class StringTest {
    @Test
    public void repalceTest() {
        Integer a = 1;
        String description = "满_可用";
        String v = description.replace("_", a.toString());
        System.out.println(v);
    }

    /**
     * @Author buer
     * @create 2019/4/27 23:53
     * @description String常用方法
     */
    class StringTe1st {
        @Test
        public void buildTest() {
            //线程安ss全类
            StringBuffer sb = new StringBuffer();
            sb.append("aa");
            sb.append("bb");
            sb.append("cc");
            System.out.printf(String.valueOf(sb));

        }
    }


    @Test
    public void formatTest(){
        String userId = "1";
        String amount= "1";
        String scene= "1";
        System.out.println(getClass());
        String tip = String.format("%s->takeRedpacket:userId=%s,amount=%s,scene=%s",
                this.getClass().getName(),
                userId,
                amount,
                scene);
        System.out.println(tip);
    }


    @Test
    public void equalTest(){
        String a  = new String("A");
        String b =a;
        System.out.println("b==A:" + (b==a));
        System.out.println("b.equals(A): " +b.equals(a) );
    }

    @Test
    public void test2(){
        String name= "sasasaQZX1sdasdad";
//        if (name.contains("QZX") && name.split("QZX").length == 2 && NumberUtils.isDigits(name.split("QZX")[1])){
//            System.out.println(name);
//        }
        System.out.println(Arrays.toString(name.split("QZX")));
        System.out.println(name.split("QZX")[0]);
        System.out.println("\uD83D");
    }

    @Test  //split
    public void test(){
        String terms = "1dsds,2dsd,3sdsds,4dsd";
        //以 ， 号分割字符串
        String[] termArray = terms.split(",");
        System.out.println(termArray.length);
        for (String termBean : termArray) {
            System.out.println(termBean);
        }
    }

    @Test
    public void test1(){
        String name = null;
        System.out.println(name.length());
//        HashMap
    }
}
