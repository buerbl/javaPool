package 多线程;

import org.junit.Test;

/**
 * @Description: ThreadLocal测试
 * @Author: boolean
 * @Date: 2019/12/8 0:03
 */
public class ThreadLocalTest {

    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);
    @Test
    public void test(){
        System.out.println(this);
    }


    @Test
    public void test1(){

        threadLocal.set(2);
        System.out.println(threadLocal.get());
    }

}



