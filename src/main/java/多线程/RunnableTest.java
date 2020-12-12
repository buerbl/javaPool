package 多线程;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class RunnableTest implements Runnable{

    @Override
    public void run() {
        System.out.println("我是runnable方法");
    }

    public static void main(String[] args) {
        RunnableTest runnableTest = new RunnableTest();

    }

}

