package 异常;

import org.junit.Test;

public class MyException {
    @Test
    public void  test(){


        test1();
    }

    private String test1(){
        throw new MyPlusException("ss");
    }

    @Test
    public void test2(){
        throw new RuntimeException("sa");
    }

    @Test
    public void test3(){
        try {
            try {
                test2();
            }catch (Exception E){

            }
            System.out.println(1);
        }catch (Exception e){

        }
    }
}
