package 多线程;

import classtest.A;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author boolean
 * Date: 2019/7/3 19:50
 * description: 多线程下的ArrayList
 */
public class ArrayListMultiThread {
    static ArrayList<Integer> al = new ArrayList<>(10);
    public static class AddThread implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                al.add(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new AddThread());
        Thread t2 = new Thread(new AddThread());
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println(al.size());
    }

    @Test
    public void test2(){
        long s = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);

        }
        long e = System.currentTimeMillis();
        System.out.println("time2："+(e - s ));
    }

    @Test
    public void test4(){
        long s = System.currentTimeMillis();
        int q = 1000000;
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("LotteryService-pool-%d").build();
        ExecutorService singleThreadPool = new ThreadPoolExecutor(2, 2, 10L,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(q), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < q; i++) {
            int finalI = i;
            singleThreadPool.execute(() -> {
                    System.out.println(finalI);
            });
        }
        singleThreadPool.shutdown();
//        while (true){
//            if (singleThreadPool.isTerminated()) {
                long e = System.currentTimeMillis();
                System.out.println("time4："+(e - s ));
//            }
//        }



    }

    @Test
    public void test5(){
        long  s1 = System.currentTimeMillis();
        test2();
        long e1 = System.currentTimeMillis();
        System.out.println(e1 - s1);

        long s = System.currentTimeMillis();
        test4();
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }

}
