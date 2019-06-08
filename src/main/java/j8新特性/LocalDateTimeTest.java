package j8新特性;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

/**
 * @author buer
 * create 2019/6/8 18:06
 * description 新时间联系
 */
public class LocalDateTimeTest {
    private final  static Logger logger = LoggerFactory.getLogger(LocalDateTimeTest.class);

    @Test
    public void test(){
        LocalDateTime now = LocalDateTime.now();
        logger.debug("sssss");
        logger.info("当前时间：【{}】", now);
    }
}
