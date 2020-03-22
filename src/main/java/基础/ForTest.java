package 基础;

/**
 * @Description: for循环测试
 *
 * 初始值不符合判断的话，不会执行循环 一次也不会
 * @Author: boolean
 * @Date: 2019/11/22 15:45
 */
public class ForTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(-1);
            System.out.println("我是循环");
            return;
        }
        System.out.println("return后的位置");
    }
}



