import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author buer
 * @create 2019/4/28 19:39
 * @description 时间描述
 */
public class DateTest {
    private static final int a = 1;
    @Test
    public void dateTest(){
        //mm与MM区别 mm表示分钟（minutes） MM表示（months）
//        SimpleDateFormat  sdf = new SimpleDateFormat("yy/MM/dd");
//        String format  = sdf.format(new Date());
//        System.out.println(format);
        System.out.println(new Date());
        System.out.println(a);
//        LocalDateTime
//                Date()

        System.out.println(LocalDate.now());
    }
}
