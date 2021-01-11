package 泛型;

public class AppleTest1<T extends Fruit> {
    private void test(T s) {

    }

    public static void main(String[] args) {
        AppleTest1<FruitChildren> fruitAppleTest1 = new AppleTest1<>();
        FruitChildrenChildren fruit = new FruitChildrenChildren();
        fruitAppleTest1.test(fruit);
    }

}
