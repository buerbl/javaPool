package pat;

import java.util.Scanner;

/**
 * @Author 布尔bl
 * @create 2020/5/1 17:37
 *  类名 Main
 */
public class Ademo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
