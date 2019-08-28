package 枚举类的使用;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;


/**
 * @author boolean
 * Date: 2019/6/10 19:44
 * description:
 */
@Slf4j
public class a {
    @Test
    public  void test(){
        System.out.println("sasa");
    }

    @Test
    public void test1(){
        System.out.println(Color.getName(1));
        System.out.println(Color.getIndex("红色1"));
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            log.error(e.getMessage());
        }

    }
}
