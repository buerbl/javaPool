import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @Auther: boolean
 * @Date: 2019/4/14 21:51
 * @Description:使用sjf4的log打印
 */
public class LogtTe {
    private final static Logger logger = LoggerFactory.getLogger(LogtTe.class);

//    public static class A{
//        static   int b = 1;
//    }
    public static void main(String[] args) {
//        String a = "sasasasasa";
//        System.out.println(String.valueOf(a));

//        logger.debug("i", A.b);
//        logger
        int a = 5;
        for(int i = 0; i < 50; i ++){
            System.out.println(new Random().nextInt(a));
        }
    }

    @Resource
    private interfaceTest aa;

    public void d(){
        System.out.println(111);
    }
    @Test
    public void z(){
        d();
    }
}
