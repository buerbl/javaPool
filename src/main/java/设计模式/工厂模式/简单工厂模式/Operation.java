package 设计模式.工厂模式.简单工厂模式;

import lombok.Data;

@Data
public abstract class Operation {
    private Double numA;
    private Double numB;
    /**
     * 运算方法
     */
    abstract Double getResult();
}
