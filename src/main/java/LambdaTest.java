import org.junit.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
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


    @Test
    public void oldRunable(){
        //多线程执行问题
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是匿名类的线程");
            }
        }).start();




    }

    @Test
public void newRunable() throws InterruptedException {
        for (int i = 0 ; i < 100; i ++){
            Thread athread = new Thread(() -> {
                System.out.println("我是lambda的线程");
                System.out.println("dsds");
                System.out.println("dsds");
            });
            athread.start();
            athread.sleep(1000);
            System.out.println(i+"============================");
        }




//        AbstractButton button = new AbstractButton();//抽象类不能实例化
//            button.addActionListener( (e) -> {
//            System.out.println("Hello world");
//        });
    }


    @Test
    public void printTest(){
        List list = new ArrayList();
        list.add(0,"d");
        list.add(1, "1");
        list.add(2, "2");
        list.add(3, "3");
//        System.out.println(list.toString());
        list.forEach(System.out::println);
        System.out.println("=======================================");
        list.forEach((n) -> System.out.println());



    }

    @Test
    public void lambdaTest1(){

    }

    @Test
    public void test3(){
        String name = "aaaa1dfssc";
        System.out.println(Arrays.toString(name.split("1")));
    }
}
