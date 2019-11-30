package 多线程;

import java.util.concurrent.CountDownLatch;

/**
 * @Description: synchronized测试
 * @Author: boolean
 * @Date: 2019/11/26 16:03
 */
public class SynchronizedTest {
    private static  int i = 0;
    public static void main(String[] args) throws InterruptedException {
        int n = 3;
        CountDownLatch countDownLatch = new CountDownLatch(n);
        for (int j = 0; j < n; j++) {
            Thread thread = new Thread(new addSynchronized());
            thread.start();
            countDownLatch.countDown();
        }
        countDownLatch.await();
        System.out.println(i);

    }

    public static class addSynchronized implements Runnable{
        @Override
        public void run() {
            addSynchronized();
        }
        public static synchronized void addSynchronized(){
            i ++;
        }
    }

    public static class addNoSynchronized implements Runnable{
        @Override
        public void run() {
            addNosynchronized();
        }
        public static synchronized void addNosynchronized(){
            i ++;
        }
    }

}



