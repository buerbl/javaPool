package 基础;

import org.apache.poi.hpsf.Array;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * @Author buer
 * @create 2019/5/7 23:04
 * @description 1、BigInteger 2、BigDecimal
 */
public class 大数值 {
    @Test
    public void test(){
        BigInteger bigInteger1 = BigInteger.valueOf(100);
        BigInteger bigInteger2 = BigInteger.valueOf(200);
        System.out.println("大数值之整形：" + bigInteger1);
        BigInteger c = bigInteger1.add(bigInteger2);
        System.out.println("相加：" + c);
        BigInteger e = bigInteger1.multiply(bigInteger2);
        System.out.println("相乘：" + e);

    }

    @Test
    public void tetsAdD() {
         Map map = new HashMap();
//         map.put(5,"s");
//         map.put(1,"sa");
//         map.put(2,"saa");
//        map.forEach((k,v)->{
//            System.out.println(k+"&"+v);
//        });

    }

    @Test
    public void test1(){
        BigDecimal bigDecimal = BigDecimal.valueOf(3);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(5);
        bigDecimal1 = null;
        System.out.println(bigDecimal.compareTo(bigDecimal1));

    }
}

