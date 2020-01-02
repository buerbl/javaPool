package 设计模式.工厂模式.工厂模式;


/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/29 14:29
 */
public class OperationAddFactory implements IFactory{
    @Override
    public Operation createOperation(String operate) {
        Operation operation = new OperationAdd();
        System.out.println("这是+法");
        return operation;
    }
}



