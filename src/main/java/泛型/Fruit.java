package 泛型;

public class Fruit {
    public static void main(String[] args) {
        AppleTest1<FruitChildren> appleTest = new AppleTest1<>();
        test(appleTest);
    }

    private static void test(AppleTest1<? extends Fruit> fruit) {
        System.out.println(fruit);
    }

}
