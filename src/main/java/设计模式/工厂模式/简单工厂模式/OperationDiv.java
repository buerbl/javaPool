package 设计模式.工厂模式.简单工厂模式;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/29 11:10
 */
public class OperationDiv extends Operation{
    @Override
    Double getResult() {
        if (getNumB() == 0){
            throw new RuntimeException("除数不能为零！");
        }
        return getNumA() / getNumB();
    }
}



