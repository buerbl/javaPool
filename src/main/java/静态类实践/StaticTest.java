package 静态类实践;

/**
 * @author boolean
 * Date: 2019/5/20 9:44
 * description: static关键字执行顺序
 */
public class StaticTest extends Base{

    static{
        System.out.println("test static");
    }

    public StaticTest(){
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new StaticTest();
        System.out.println("====================1");
        new StaticTest();
        System.out.println("====================2");
        new StaticTest();

    }
}

class Base{

    static{
        System.out.println("base static");
    }

    public Base(){
        System.out.println("base constructor");
    }
}