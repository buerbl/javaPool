package 位运算;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author boolean
 * Date: 2019/5/29 9:56
 * description:
 */
public class 乘除 {

    private int i = 1;
    private int times = 100000000;
    private static final Logger logger = LoggerFactory.getLogger(乘除.class);


    /**
     * 测试平常运算的时间
     */
    @Test
    public void test(){
        long start2 = System.currentTimeMillis();
        logger.debug("s2时间为【{}】",start2);
//        logger.info("s2时间为【{}】",start2);

        for (int j = 0; j < times; j ++){
            int result1 = i * 8;
        }
        System.out.println("平常花费时间：" + (System.currentTimeMillis() - start2) );
    }

    /**
     * 测试位运算的时间
     */
    @Test
    public void test1(){
        long start1 = System.currentTimeMillis();
        logger.debug("s2时间为【{}】",start1);
        for (int j = 0; j < times; j ++){
            int result2 = i << 3;
        }
        System.out.println("左移花费时间：" + (System.currentTimeMillis() - start1) );
    }

    @Test
    public void test2(){
            test();
            test1();


    }



    @Test
    public void  异或test(){
        // 需要整形
        int i=1, j=2;
//        String i = "a", j = "b";
        System.out.println("输入前："+"i:"+i+" "+"j:"+j);
        i = i ^ j;  // 01 10 -> i=11
        j = i^j;//11  10 -> j=01
        i = i^j;//11 01 -> i = 10
        System.out.println("输入后："+"i:"+i+" "+"j:"+j);
    }

    @Test
    public  void testStrign(){
        String a  = "a";
        System.out.println(a.getBytes()[0]);
        char b = 'a';

    }


}
