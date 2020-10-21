package 多线程;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.util.StopWatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
		CountDownLatch countDownLatch = new CountDownLatch(size);
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		executorService.submit(()->{
			for (int i = 0; i < size; i++){
				System.out.println("我是异步线程");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				countDownLatch.countDown();

			}
		});


		countDownLatch.await();
		stopWatch.stop();
		log.info(stopWatch.prettyPrint());
		System.out.println("我是主线程");
	}
}
