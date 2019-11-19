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
        int a = 150;
        int b = 150;
        Integer c = 150;
        Integer d = 150;

        System.out.println("a==b:"+ (a==b));
        System.out.println("c==d:"+ (c==d));
        System.out.println("c==a:"+ (c==a));
        System.out.println("c.equals(a):"+c.equals(a));
    }
}



