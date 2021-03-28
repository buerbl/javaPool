package 回调;

/**
 * 这是一个错误的例子
 * @Author 布尔bl
 * @create 2021/3/13 16:50
 */
public class CallBack031 {

    public static String a(){
        System.out.println("开始调用b");
        b();
        return "a执行完了";
    }

    private static void b() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("b执行完了,调用a");
        a();

    }

    public static void main(String[] args) {
        a();
    }
}
