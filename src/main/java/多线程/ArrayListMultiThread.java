package 多线程;

import classtest.A;

import java.util.ArrayList;

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
}
