import org.junit.Test;

import java.util.Hashtable;

/**
 * @Author: boolean
 * @Date: 2019/4/29 17:08
 * @description:
 */
public class StringTest {
    @Test
    public void repalceTest() {
        Integer a = 1;
        String description = "满_可用";
        String v = description.replace("_", a.toString());
        System.out.println(v);
    }

    /**
     * @Author buer
     * @create 2019/4/27 23:53
     * @description String常用方法
     */
    class StringTe1st {
        @Test
        public void buildTest() {
            //线程安ss全类
            StringBuffer sb = new StringBuffer();
            sb.append("aa");
            sb.append("bb");
            sb.append("cc");
            System.out.printf(String.valueOf(sb));

        }
    }


    @Test
    public void formatTest(){
        String userId = "1";
        String amount= "1";
        String scene= "1";
        System.out.println(getClass());
        String tip = String.format("%s->takeRedpacket:userId=%s,amount=%s,scene=%s",
                this.getClass().getName(),
                userId,
                amount,
                scene);
        System.out.println(tip);
    }
}