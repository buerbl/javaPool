package classtest;

import java.util.HashMap;

/**
 * @author boolean
 * Date: 2019/8/28 10:05
 * description:
 */
public class P {
    private Integer age;
    private String name;

    /**
     * 用默认构造器初始化数据
     */
    public P() {
        this.age = 1;
        this.name = "chen";
    }

    public P(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        P p = new P();
        System.out.println(p.toString());


    }

    @Override
    public String toString() {
        return "P{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
