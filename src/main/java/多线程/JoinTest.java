package 多线程;

import lombok.Data;

/**
 * @Description: Thread.join()方法的测试
 * @Author: boolean
 * @Date: 2019/12/2 14:27
 */
//@Data
public class JoinTest {
    private static int n = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                n++;
            }
        });
        thread.start();thread.join();
        System.out.println(n);
    }

}



