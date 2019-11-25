package 多线程;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @Description:
 * @Author: boolean volatile关键字的测试
 * @Date: 2019/11/24 18:02
 */
public class VolatileTest {
    private    static   boolean flag= false;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Stop());
        thread.start();
        Thread thread1 = new Thread(new DoTest());
        thread1.start();
    }
    public static class DoTest implements Runnable{
        @Override
        public void run() {
            while(flag){
                System.out.println("dott:"+new Date());
                flag=false;
            }
        }
    }
    public  static  class Stop implements  Runnable{
        @Override
        public void run() {
            flag = true;
            System.out.println("Stop:"+new Date());
            try {
                Thread.sleep(3000);
                System.out.println("===");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



