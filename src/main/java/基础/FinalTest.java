package 基础;

import lombok.Data;
import org.junit.Test;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/2 14:48
 */
@Data
public final class FinalTest {
    private String name;

    @Test
    public  void r() {
        FinalTest finalTest = new FinalTest();
        System.out.println(System.identityHashCode(finalTest));
        finalTest = new FinalTest();
        System.out.println(System.identityHashCode(finalTest));

    }

    // 参数不可以改变
    @Test
    public void test(){
//        change(parm);
    }
    private void change(final String s){
//        s="d";
    }

    @Test
    public void test1(){
        int i = 0;
        i++;
        System.out.println(i);
    }

}



