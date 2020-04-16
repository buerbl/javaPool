package 基础;

import org.junit.Test;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/11/19 22:10
 */
public class IntegerTest {
    @Test
    public void test(){
        int a = 200;
        int b = 128;
        Integer c = 200;
        Integer d = 200;
        Integer e = 126;
        Integer f = 126;
        System.out.println("a==b:"+ (a==b));
        System.out.println("e==f:"+ (e==f));
        System.out.println("c==d:"+ (c==d));
        System.out.println("c==a:"+ (c==a));
        System.out.println("c.equals(a):"+c.equals(a));

    }

    @Test
    public void test1(){
        System.out.println(new Integer(129) == 129);
    }
}



