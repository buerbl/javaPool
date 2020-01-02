package 设计模式.工厂模式.工厂模式;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/29 11:04
 */
public class OperationAdd extends Operation {

    @Override
    Double getResult() {
        return getNumA() + getNumB();
    }
}



