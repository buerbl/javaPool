package 多线程;

import org.junit.Test;

import java.util.LinkedHashMap;


public class CreateTest {
    private static String a = "chen";
     @Test
    public  void test() throws InterruptedException {
        CreateByThread createByThread = new CreateByThread();
        createByThread.start();
        createByThread.join();


        CreateByRunnable createByRunnable = new CreateByRunnable();
        Thread thread = new Thread(createByRunnable);
        thread.start();
        thread.join();

        Thread ss = new Thread(() -> {
            System.out.println("ss");
            System.out.println("sss");
            System.out.println("ssx");
        });
        ss.start();
        ss.join();

    }


    @Test
    public void threadpoolTest(){

    }

    class CreateByThread extends Thread {
        @Override
        public void run() {
            System.out.println("通过thread多线程");
        }
    }

    class  CreateByRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("通过runnable创建多线程");
        }
    }

    @Test
    public void testByTwoThread() {

    }

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
        for ( int i = 0; i < 100; i += 2) {
            synchronized (a) {
                System.out.println(Thread.currentThread().getName()+":"+i);
                try {
                    a.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 100; i += 2) {
                synchronized (a) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    a.notify();
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();thread1.start();
    }



}
