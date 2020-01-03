package 设计模式.建造者模式;

import lombok.*;
import lombok.Builder;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/1/2 15:56
 */
@Getter
@Setter
public class Computer {
    private String cpu;
    private String hardDisk;
    private String mainBoard ; // 主板
    private String memory ; // 内存
    public Computer(){

    }
}



