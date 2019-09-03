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
            for (int i = 0; i < 1000000; i++) {
                al.add(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new Thread(new AddThread());
//        Thread t2 = new Thread(new AddThread());
//        t1.start();t2.start();
//        t1.join();t2.join();
//        System.out.println(al.size());


        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("LotteryService-pool-%d").build();
        ExecutorService singleThreadPool = new ThreadPoolExecutor(2, 2, 10L,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy()){
            @Override
            protected void afterExecute(Runnable r, Throwable t){
                System.out.println("执行完成time：" + System.currentTimeMillis());
            }
        };

    }

    @Test
    public void test2(){
        long s = System.currentTimeMillis();
        int a  = 0;
        for (int i = 0; i < 1000000; i++) {
            a ++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        long e = System.currentTimeMillis();
        System.out.println("b:"+a);
        System.out.println("time2："+(e - s )/1000);
    }

    @Test
    public void test4(){
        long s = System.currentTimeMillis();
        int q = 1000000;
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("LotteryService-pool-%d").build();
        ExecutorService singleThreadPool = new ThreadPoolExecutor(2, 2, 0L,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(q), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy()){
//            @Override
//            protected void afterExecute(Runnable r, Throwable t){
//                System.out.println("执行完成tim1e：" + System.currentTimeMillis());
//            }
//
//            @Override
//            protected void terminated(){
//                System.out.println("退出");
//            }
        };

        AtomicInteger a = new AtomicInteger(0);
        final int[] c = {0};
        for (int i =  0; i < q; i++) {
//            singleThreadPool.execute(a::getAndIncrement);
            singleThreadPool.execute(()->{
                c[0]++;
            });
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        singleThreadPool.shutdown();
//        while (true){
//            if (singleThreadPool.isTerminated()) {
                long e = System.currentTimeMillis();
        System.out.println("a:"+c[0]);
        System.out.println("time4："+(e - s )/1000);
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
