package 多线程;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: synchronized测试
 * @Author: boolean
 * @Date: 2019/11/26 16:03
 */
public class SynchronizedTest {
    static int n = 100;
    final static CountDownLatch start = new CountDownLatch(n);
    private static  Integer i = 0;
    public static void main(String[] args) throws InterruptedException {
        long str = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            Thread thread = new Thread(new addNoSynchronized());
            thread.start();
        }
        start.await();
        System.out.println(i);
        System.out.println(System.currentTimeMillis() - str+"毫秒");

    }

    public static class addSynchronized implements Runnable{
        @Override
        public void run() {
            addSynchronized();
        }
        public static synchronized void addSynchronized(){
            for (int j = 0; j < 1000; j++) {
                i++;
            }
            start.countDown();
        }
    }


    public static class addNoSynchronized implements Runnable{
        @Override
        public void run() {
            addNosynchronized();
        }
        public static  void addNosynchronized(){
            for (int j = 0; j < 1000; j++) {
                i++;
            }
            start.countDown();
        }
    }

    @Test
    public void  tets(){
        Lock lock = new ReentrantLock();
    }

}



