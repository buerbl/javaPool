package classtest;

import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

/**
 * @Author buer
 * @create 2019/4/28 10:06
 * @description 父类
 */
@Getter
@Setter
 public class Animal {
    private int id;
    String name="chen";
    protected String parent="chen";
    public String test="chen";




    //    //两个构造器，按照需要调用
//    public  Animal(){
//    }
//    public Animal(int id, String name, String parent) {
//        this.id = id;
//        this.name = name;
//        this.parent = parent;
//    }

    @Test
    public void eat(){

        Animal animal  = new Animal();
        System.out.println(animal.name);
    }
}
