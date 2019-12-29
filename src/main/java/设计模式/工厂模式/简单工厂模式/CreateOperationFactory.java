package 设计模式.工厂模式.简单工厂模式;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/29 11:14
 */
public class CreateOperationFactory {
    public static Operation createOperation(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
                System.out.println("这是+法");
                break;
            case "/":
                operation = new OperationDiv();
                System.out.println("这是/法");
                break;
            case "*":
                operation = new OperationMul();
                System.out.println("这是*法");
                break;
        }
        return operation;
    }
}



