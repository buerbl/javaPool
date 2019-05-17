package classtest;

import lombok.Getter;
import lombok.Setter;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author buer
 * @create 2019/4/28 10:06
 * @description test
 */
@Getter
@Setter
public class Dog extends Animal {
    private  String dogid;

    @Override
    public String toString() {
        return "Dog{" +
                "dogid='" + dogid + '\'' +
                ", name='" + name + '\'' +
                ", parent='" + parent + '\'' +
                ", test='" + test + '\'' +
                '}';
    }

    //使用父类属性
    @Test
    public void useTest(){
//        Animal animal = new Animal();
//        System.out.println(animal);
    }

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
//        Dog dog = new Dog();
//        dog.eat();
    }

    /**
     * 子类赋值给父类 b不行  大到小了
     *就像抽象类被子类是实例化
     */
    @Test
    public void test(){
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.setDogid("1");
//        dog = animal;
        test1(dog);
        test2(dog);
    }

    public void test1(Animal animal){
        System.out.println("变化");
        //anmial变成了dog类  卧槽卧槽卧槽
        System.out.println(animal.getClass());
        System.out.println(animal.toString());
    }

    public void test2(Dog dog){

    }
}
