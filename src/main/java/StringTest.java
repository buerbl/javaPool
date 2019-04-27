import org.junit.Test;

/**
 * @Author buer
 * @create 2019/4/27 23:53
 * @description  String常用方法
 */
public class StringTest {
    @Test
    public void buildTest(){
        //线程安全类
        StringBuffer sb = new StringBuffer();
        sb.append("aa");
        sb.append("bb");
        sb.append("cc");
        System.out.printf(String.valueOf(sb));

    }
}
