package 多线程;

import org.junit.Test;

/**
 * @author buer
 * create 2019/5/19 11:59
 * description
 */
public class I {
    @Test
    public void test(){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    int a = 0;
                    for(int i = 0; i < 100;i ++){
                        a++;
                    }
                    System.out.println(a);

                }
            }).start();
    }



}
