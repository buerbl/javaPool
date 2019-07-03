package 多线程;

import java.util.HashMap;
import java.util.Map;

/**
 * @author boolean
 * Date: 2019/7/3 20:00
 * description:并发下的HashMap 1.8版本目前不会测试不会导致死循环 比1.7jdk好
 */
public class HashMapMultiThread {
    private static Map<String, String> map = new HashMap<>();

    public static class AddThread implements Runnable{
        int start = 0;
        public AddThread(int start){
            this.start = start;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100000; i+=2) {
                map.put(Integer.toString(i), Integer.toBinaryString(i));
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new HashMapMultiThread.AddThread(0));
        Thread t2 = new Thread(new HashMapMultiThread.AddThread(1));
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println(map.size());
    }
}
