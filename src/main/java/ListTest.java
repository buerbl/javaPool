import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author buer
 * @create 2019/5/6 23:24
 * @description
 */
public class ListTest {
    @Test
    public void test(){
        List<String> list = new LinkedList<String>();
        for(Integer i = 0; i < 10; i ++){
            list.add(i, i.toString());
            System.out.println(list.get(i));
        }
String a = "1";

    }
}
