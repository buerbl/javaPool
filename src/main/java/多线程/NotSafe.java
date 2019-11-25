package 多线程;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/11/13 15:05
 */
public class NotSafe {

    private AtomicInteger a = new AtomicInteger(0);
    List  list = new ArrayList();
    @Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Rrunnable());
            thread.start();
            thread.join();

        }
        System.out.println(a);
    }

    class Rrunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                a.getAndIncrement();
            }
        }
    }

}



