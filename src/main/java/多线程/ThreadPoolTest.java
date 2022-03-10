package 多线程;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * @Author buerbl
 * @create 2020/9/9 15:19
 */
@Slf4j
public class ThreadPoolTest {

    @Test
    public void test1() throws InterruptedException {
        int size = 5;

        ExecutorService executorService = Executors.newFixedThreadPool(size);
//        CountDownLatch countDownLatch = new CountDownLatch(20);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for (int i = 0; i < 20; i++) {
            executorService.submit(() -> {
                System.out.println("我是异步" + Thread.currentThread().getName() + "线程");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                countDownLatch.countDown();
            });
        }

//        countDownLatch.await();
        stopWatch.stop();
        log.info(stopWatch.prettyPrint());
        System.out.println("我是主线程");
    }



    @Test
    public void test2() throws InterruptedException {
        int size = 5;

        ExecutorService executorService = Executors.newFixedThreadPool(size);


        List<C1> list = new LinkedList<>();
        C1 c1 = new C1(1, "chen");
        C1 c11 = new C1(2, "WEB");
        C1 c12 = new C1(5, "guan");
        list.add(c1);
        list.add(c11);
        list.add(c12);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        list.stream().collect(Collectors.groupingBy(C1::getId));
        countDownLatch.countDown();
        countDownLatch.await();
        stopWatch.stop();
        System.out.println(new Gson().toJson(list));
        log.info(stopWatch.prettyPrint());
        System.out.println("我是主线程");
    }

    @Test
    public void test3(){
        String str = "我是[%s]";
        String s = String.format(str, "电影院");
        System.out.println(s);
        System.out.println(String.format("我是[%s],你是[%s], 他是[%s]", "我", "你", "他"));
    }

    @Test
    public void test4() throws InterruptedException {
        List<String> list = new ArrayList<String>();
        System.out.println("bein");
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    Thread aa = new Thread(() -> list.add("AA"));
                    aa.start();
                }
            });
            thread.start();
            thread.join();
            Thread.sleep(1000);//确保全部线程都执行完毕
            System.out.println("列表大小：" + list.size());
        }
    }
}
