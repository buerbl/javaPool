import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: boolean
 * @Date: 2019/4/20 17:29
 * @description:
 */
public class ThrowsCatchTest {
    private final static Logger logger = LoggerFactory.getLogger(ThrowsCatchTest.class);
    @Test
    public void noyAdd(){
        try{
            int a = 1;
            int b = 0;
            int c = a/b;
        }catch (ArithmeticException e){
            logger.info("不能这样做哦");
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        int a=1;
        int b = 0;
        int c = a/b;
    }
}
