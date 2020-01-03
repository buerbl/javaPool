package j8新特性.lambda;

import org.junit.Test;
/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/1/3 1:10
 */
public class Test1 {
    @Test
    public void test(){
        test1(1);
    }

    @Test
    public void test2(){
        test2(a -> {
            System.out.println(a);
            return a;
        });
    }

    private void test1(int a){
        System.out.println(a);
    }

    private void test2(IPerson person){
        int a = 1;
        int b = 2;
        person.personMethod(a);
    }

    @Test
    public void test3(){
        int b  = 1;
        test2(a -> {
            a ++ ;
//            b++; // error
            return 1;
        });
    }

    @Test
    public void test4(){
        final  int a = 1;
//        a ++;
    }
}






