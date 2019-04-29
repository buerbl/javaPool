import org.junit.Test;

import java.util.Hashtable;

/**
 * @Author: boolean
 * @Date: 2019/4/29 17:08
 * @description:
 */
public class StringTest {
    @Test
    public void repalceTest(){
        Integer a = 1;
            String description = "满_可用";
         String v = description.replace("_",a.toString() );
        System.out.println(v);
    }
}
