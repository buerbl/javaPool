package 设计模式.建造者模式;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/1/2 15:58
 */
public class AssemblerBuilder implements Builder {
    private Computer computer = new Computer() ;
    @Override
    public void createCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void createhardDisk(String hardDisk) {
        computer.setHardDisk(hardDisk);
    }

    @Override
    public void createMainBoard(String mainBoard) {
        computer.setMainBoard(mainBoard);
    }

    @Override
    public void createMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public Computer createComputer() {
        return computer;
    }

}



