package 基础;

import org.junit.Test;
import 回调.Teacher;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: 原子类测试
 * @Author: boolean
 * @Date: 2019/12/2 15:47
 */
public class AtomicIntegerYest  {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.getAndIncrement();

    }
    @Test
    public void test(){
    }
}



