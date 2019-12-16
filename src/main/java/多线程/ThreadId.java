package 多线程;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/8 0:21
 */
public class ThreadId {
    private static final AtomicInteger nextId = new AtomicInteger(0);
    private static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(() -> {
        System.out.println("调用");
        return nextId.getAndIncrement();
    });
//    private static final ThreadLocal<Integer> threadId = new ThreadLocal<>();


    public static int get() {
          return threadId.get();
    }

    public static void main(String[] args) {
        System.out.println(threadId.get());
        threadId.remove();
        System.out.println(threadId.get());
//        threadId.remove();
       ;
    }
}



