package 异常;

import org.junit.Test;

public class MyException {
    @Test
    public void  test(){


        test1();
    }

    private String test1(){
        try {
//            return "z";
            throw new RuntimeException("ss");
        }finally {
            throw new RuntimeException("ss1");

        }
//        return "v";
    }

    @Test
    public void test2(){
        throw new RuntimeException("sa");
    }
}
