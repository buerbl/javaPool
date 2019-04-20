import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: boolean
 * @Date: 2019/4/14 23:42
 * @Description:
 */
public class LambdaTest {

    /**
     * 模板
     */
    @Test
    public void test(){
        System.out.println(1);
    }
    public static void main(String[] args) {
//        @Test
        System.out.println();
    }

    @Test
    public void oldRunable(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是匿名类的线程");
            }
        }).start();
    }

    @Test
    public void newRunable(){
        new Thread(() -> System.out.println("it is a lambda")).start();
    }

    public void printTest(){
        List list = new ArrayList();
        list.add(0,"d");
        list.add(1, "1");
        list.add(2, "2");list.add(3, "3");
//        System.out.println(list.toString());
        list.forEach(System.out::println);


    }

    @Test
    public void lambdaTest1(){
        int a =1;
    }


}
