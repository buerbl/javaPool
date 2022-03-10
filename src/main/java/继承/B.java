package 继承;


import lombok.Builder;
import lombok.Data;
import org.junit.Test;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/11/21 16:39
 */
@Data
public class B extends A {
    private int b;
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

    @Test
    public void test1(A a){
        System.out.println(a.toString());
        B b = (B) a;
        System.out.println(b.getB());
    }
}



