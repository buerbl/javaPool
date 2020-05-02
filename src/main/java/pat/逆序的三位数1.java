package pat;

import java.util.Scanner;

/**
 * @Author 布尔bl
 * @create 2020/5/2 11:17
 */
public class 逆序的三位数1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            System.out.println(input%10*100+input/10%10*10+input/100);
        }
    }
}
