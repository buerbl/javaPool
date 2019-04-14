import org.junit.Test;

/**
 * @Auther: boolean
 * @Date: 2019/4/15 00:34
 * @Description:
 */
public class a {
    @Test
    public static void runable(){
        new Thread(() -> System.out.println("it is a lambda")).start();
    }
    public static void main(String[] args) {
        runable();
    }
}
