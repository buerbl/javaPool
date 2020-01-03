package 设计模式.建造者模式;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/1/2 15:57
 */
public interface Builder {
    // 安装主板
    void createMainBoard(String mainBoard) ;
    // 安装 cpu
    void createCpu(String cpu) ;
    // 安装硬盘
    void createhardDisk(String hardDisk) ;
    // 安装内存
    void createMemory(String memory) ;
    // 组成电脑
    Computer createComputer() ;
}



