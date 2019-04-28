package classtest;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author buer
 * @create 2019/4/28 10:06
 * @description 父类
 */
@Getter@Setter
public class Animal {
    private int id = 1;
    private String name;

    public void eat(){
        System.out.printf("我有吃的需求");
    }
}
