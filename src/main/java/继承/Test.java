package 继承;

public class Test {
    @org.junit.Test
    public void test(){
        B b = new B();
        b.setA(1);b.setA2("2");b.setA1(3);b.setB(4);
        b.test1(b);
    }
}
