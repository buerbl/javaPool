package 多线程;


/**
 * @Description:
 * @Author: boolean volatile关键字的测试
 * @Date: 2019/11/24 18:02
 */
public class VolatileTest implements Runnable{
    private static VolatileTest volatileTest = new VolatileTest();
    private  static volatile int i= 0;
    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 20; j++) {
            Thread a = new Thread(new VolatileTest());
            Thread b = new Thread(new VolatileTest());
            a.start();b.start();
            a.join();b.join();
            System.out.print(i+"&&");
        }

    }

    @Override
    public void run() {
//        synchronized (volatileTest){
            for (int j = 0; j < 1000; j++) {
                i++;
            }
//        }

    }
}



