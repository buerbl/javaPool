package 多线程;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: ReentranLock锁的测试
 * @Author: boolean
 * @Date: 2019/11/30 22:39
 */
public class ReentranLockTest {
    private static int j;
    private static int n = 100;
    private static CountDownLatch latch = new CountDownLatch(n);
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            new Thread(new LockTest()).start();
        }
        latch.await();
        System.out.println("结果为："+j);
    }

    public static class LockTest implements Runnable{
        static Lock lock = new ReentrantLock();
        @Override
        public void run() {
            lockTest();
            latch.countDown();
        }
        private void lockTest() {
            lock.lock();
            try {
                for (int i = 0; i < 1000; i++) {
                        j++;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}



