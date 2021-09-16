package 继承;

import lombok.Builder;
import lombok.Data;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/11/21 16:38
 */
@Data
public class A {
    private int a;
    private int a1;
    private String a2;

    public A(){
        this(1);
        System.out.println("我是A的构造函数");
    }


    public A(int i){
        System.out.println("我是A的构造函数");
    }
}



