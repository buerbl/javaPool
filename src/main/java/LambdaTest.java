import org.junit.Test;

/**
 * @Auther: boolean
 * @Date: 2019/4/14 23:42
 * @Description:
 */
public class LambdaTest {
    @Test
    public void test(){
        System.out.println(1);
    }
    public static void main(String[] args) {
//        @Test
        System.out.println();
    }
    @Test
    public   void runable(){
        new Thread(() -> System.out.println("it is a lambda")).start();
    }
    @
}
