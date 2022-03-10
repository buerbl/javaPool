package 多线程;

import org.junit.Test;

/**
 * @Description: ThreadLocal测试
 * @Author: boolean
 * @Date: 2019/12/8 0:03
 */
public class ThreadLocalTest {

    @Test
    public void test(){
        System.out.println(this);
    }


    @Test
    public void test1(){
        ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);
        int i = 0;
        while (true){

            new Thread(()-> {
                threadLocal.set(100);

                System.out.println("主："+threadLocal.get());
            }).start();

            i++;
            System.out.println("子："+threadLocal.get());
            if (i == 5000){
                break;
            }
        }

    }


    @Test
    public void testAsyn(){
        new Thread(()-> {
            try {
                Thread.sleep(1000*5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("完成");
    }

}



