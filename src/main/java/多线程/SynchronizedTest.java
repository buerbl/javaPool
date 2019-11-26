package 多线程;

/**
 * @Description: synchronized测试
 * @Author: boolean
 * @Date: 2019/11/26 16:03
 */
public class SynchronizedTest {
    private static  int i = 0;
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        synchronized (SynchronizedTest.class){
            synchronized (SynchronizedTest.class){
                i++;
            }
        }
    }
}



