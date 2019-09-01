package 异常;

import org.junit.Test;

public class MyException {
    @Test
    public void  test(){


        test1();
    }

    private String test1(){
        try {
            return "z";
        }finally {
            return "m";
        }
//        return "v";
    }
}
