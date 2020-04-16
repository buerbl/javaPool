package 基础;

import org.junit.Test;

/**
 * @Author 布尔bl
 * @create 2020/4/16 15:52
 */
public class SwithTest {
    // 测试参数为 null 的switch
    @Test
    public void test(){
        method(null);
    }

    private void method(String param) {
        switch (param){
            case "sth":
                System.out.println("sth");
                break;
            case "null":
                System.out.println("null");
                break;
            default:
                System.out.println("default");
        }

    }
}
