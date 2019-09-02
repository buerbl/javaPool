package 多线程;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

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
            for (int i = 0; i < 10000; i++) {
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
        int c = 0;
        for (int i = 0; i < 10000000; i++) {
            ++c;

        }
        long e = System.currentTimeMillis();
        System.out.println("test2的i值为：" + c);
        System.out.println("time2："+(e - s ));
    }

    @Test
    public void test4(){
        Integer a  = 0;
        long s = System.currentTimeMillis();
        int q = 10000000;
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("LotteryService-pool-%d").build();
        ExecutorService singleThreadPool = new ThreadPoolExecutor(2, 2, 0L,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(q), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        AtomicInteger b = new AtomicInteger();
        for ( int i =0; i < q; i++) {
            synchronized (al){
                singleThreadPool.execute(() -> b.getAndIncrement());
            }
        }
        singleThreadPool.shutdown();
        long e = System.currentTimeMillis();
        System.out.println("test4的i值为：" + b);
        System.out.println("time4："+(e - s ));
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

    @Test
    public void test8(){
        System.out.println(this);
    }

}
