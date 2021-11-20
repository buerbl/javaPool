package 基础;

import classtest.P;
import lombok.Data;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author boolean
 * Date: 2019/5/29 9:54
 * description: 测试idea的反编译
 */
@Data
public   class IntTest {
    // 测试初始化
    private Integer code;
    private String name;
    private int num;
    private List<String > list;

    @Test
    public void testInit(){
        System.out.println(code);
        System.out.println(name);
        System.out.println(num);
        System.out.println(list);
    }

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

    public int  tets(){
        int i = 0;
        return i++;
    }

    @Test
    public void test3(){
        System.out.println(tets());
    }

    @Test
    public void testTe(){
        String regEx = "[\\n`~!@#$%^&*()+=|{}':;',\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？]";
//        String str = "浙江省";
        String str = "上海市》---。。.~`>.>>.自治区";

        String newString = str.replaceAll(regEx, "");//不想保留原来的字符串可以直接写成 “str =

        System.out.println(newString);
    }
}
