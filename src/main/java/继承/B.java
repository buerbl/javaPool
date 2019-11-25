package 继承;


import org.junit.Test;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/11/21 16:39
 */
public class B extends A {
    public B(){
        super(1);
        System.out.println("我是B的构造函数");
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println("sss");
    }

    @Test
    public void test(){
        System.out.println();
    }
}



