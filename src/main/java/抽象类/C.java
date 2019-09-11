package 抽象类;

import lombok.Data;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author boolean
 * Date: 2019/5/17 13:45
 * description:
 */


@Data
public class C {
    private Integer code;
    private String msg;


    @Test
    public void test(){
        C n = new C();
        if (n == null) {
            System.out.println("n对象为空");
        }
        C a = null;
        if (a == null) {
            System.out.println("a对象为空");
        }
        System.out.println(n);
    }

    @Test
    public void emptyListTest(){
        System.out.println(Collections.emptyList());
        List<Object> list = Collections.emptyList();
        if (list == null) {
            System.out.println("list为空");
        }
    }
}
