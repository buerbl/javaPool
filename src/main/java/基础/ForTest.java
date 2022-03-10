package 基础;

import org.junit.Test;

import java.util.Collections;

/**
 * @Description: for循环测试
 * <p>
 * 初始值不符合判断的话，不会执行循环 一次也不会
 * @Author: boolean
 * @Date: 2019/11/22 15:45
 */
public class ForTest {

    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            System.out.println(-1);
            System.out.println("我是循环");
            return;
        }
        System.out.println("return后的位置");
    }

    @Test
    public void testBreak() {
        for (int i = 0; i < 10; i++) {
            System.out.println(-1);
            System.out.println("我是循环");
            break;
        }
        System.out.println("break后的位置");
    }

    @Test
    public void testContinue() {
        for (int i = 0; i < 10; i++) {
            System.out.println(-1);
            System.out.println("我是循环");
            continue;
        }
        System.out.println("continue后的位置");
    }

    @Test
    public void test1(){
        for (int i = 0;;){
            System.out.println(i);
        }
    }
    @Test
    public void testm(){
        int n = 20;
        for (int i = 0; i < n; i++){
            for (int j = n; j >=0 ; j--){
                if (i < j){
                    System.out.print(" ");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
//        System.out.println(111);
    }

    @Test
    public void testDebugFor(){
        int times = 120;
        for (int i = 0; i < times; i ++){
        }
    }

    /**
     * 结论 foreach即使空集合也不会导致空指针
     */
    @Test
    public void testForList(){
//        for (String p : Collections.emptyList()){
//            System.out.println(11);
//        }
    }




}



