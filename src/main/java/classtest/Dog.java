package classtest;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author buer
 * @create 2019/4/28 10:06
 * @description test
 */
public class Dog extends Animal {


     @Test
//    @Override
    public void get1Id() {
         //super关键字
          int a = super.getId();
         Assert.assertEquals(a,1);
//         System.out.println(a);
    }
    @Test
    //使用父方法
    public void method() {
        Dog dog = new Dog();
        dog.eat();
    }
}
