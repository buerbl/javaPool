import org.junit.Test;

/**
 * @Auther: boolean
 * @Date: 2019/4/14 23:42
 * @Description:
 */
public class LambdaTest {

    /**
     * 模板
     */
    @Test
    public void test(){
        System.out.println(1);
    }


    @Test
    public void oldRunable(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是匿名类的线程");
            }
        }).start();
    }

    @Test
    public   void newRunable(){
        new Thread(() -> System.out.println("it is a lambda")).start();
    }


}
