package 设计模式.建造者模式;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/1/2 16:00
 */
public class Test {
    public static void main(String args[]){
        // 装机员小美
        Builder builder = new AssemblerBuilder() ;
        // 老板把小明的需求转给小美
        Director direcror = new Director(builder) ;
        // 老板最后拿到成品机子，工作全由小美去做
        Computer computer = direcror.createComputer("Intel 酷睿i9 7900X","三星M9T 2TB （HN-M201RAD）","技嘉AORUS Z270X-Gaming 7","科赋Cras II 红灯 16GB DDR4 3000") ;
        System.out.println("小明这台电脑使用的是：\n"+computer.getMainBoard()+" 主板\n"+computer.getCpu()+" CPU\n"+computer.getHardDisk()+"硬盘\n"+computer.getMainBoard()+" 内存\n");

    }
}



