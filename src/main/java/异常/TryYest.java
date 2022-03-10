package 异常;

import org.junit.Test;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/1/14 14:15
 */
public class TryYest {
    @Test
    public void test(){
        int a = 1;
        try {
            a = 2;
            int b = 3;
            System.out.println(b);
            int i = b / 0;
        }catch (Exception e){
            System.out.println("异常");
            throw new  MyPlusException("除数不能为0");

        }finally {
            System.out.println("finally");
        }

        System.out.println(a);
    }

    @Test
    public void test1(){
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("我还在继续走！！");
    }
}



