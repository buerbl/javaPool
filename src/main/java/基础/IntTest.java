package 基础;

import classtest.P;
import lombok.Data;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author boolean
 * Date: 2019/5/29 9:54
 * description: 测试idea的反编译
 */
public   class IntTest {
    @Test
    public  void test() throws Exception{
        String name = "a";
        String chen ="a";
        System.out.println(name == chen);//共享变量


    }

    @Data
    class Person{
        private   String name = "e";
        String chen ="a";


    }
}
