package 多线程;

/**
 * @Description: 死锁的演示
 * @Author: boolean
 * @Date: 2019/11/11 16:06
 */
public class DeadThreadTest {
    public static void main(String[] args) {
        final Object a = new Object();
        final Object b = new Object();
        new Thread(() -> {
            synchronized (a) {
                try {
                    System.out.println("now i in threadA-locka");
                    Thread.sleep(1000l);
                    synchronized (b) {
                        System.out.println("now i in threadA-lockb");
                    }
                } catch (Exception e) {
                    // ignore
                }
            }
        }).start();

         new Thread(() -> {
            synchronized (b) {
                try {
                    System.out.println("now i in threadB-lockb");
                    Thread.sleep(1000l);
                    synchronized (a) {
                        System.out.println("now i in threadB-locka");
                    }
                } catch (Exception e) {
                    // ignore
                }
            }
        }).start();
    }
}



