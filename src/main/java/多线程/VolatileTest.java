package 多线程;


/**
 * @Description:
 * @Author: boolean volatile关键字的测试
 * @Date: 2019/11/24 18:02
 */
public class VolatileTest implements Runnable {
    private static volatile boolean single = true;
        // 改例子说明了volatile的可见性，类变量不见他的话就出不来了
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new VolatileTest());
        a.start();
        Thread.sleep(100);
        single = false;
        System.out.println("start");

    }

    @Override
    public void run() {
        while (single){

        }
        System.out.println("end");
    }
}



