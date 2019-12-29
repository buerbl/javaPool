package 设计模式.工厂模式.简单工厂模式;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/29 11:19
 */
public class Test {
    public static void main(String[] args) {
        Operation operation = CreateOperationFactory.createOperation("+");
        operation.setNumA(1D);
        operation.setNumB(2D);
        System.out.println(operation.getResult());

        operation = CreateOperationFactory.createOperation("*");
        operation.setNumA(1D);
        operation.setNumB(2D);
        System.out.println(operation.getResult());

        operation = CreateOperationFactory.createOperation("/");
        operation.setNumA(1D);
        operation.setNumB(2D);
        System.out.println(operation.getResult());
    }
}



