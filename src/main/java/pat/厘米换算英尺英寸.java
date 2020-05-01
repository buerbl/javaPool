package pat;

import java.util.Scanner;

/**
 * @Author 布尔bl
 * @create 2020/5/1 17:54
 *
 */
public class 厘米换算英尺英寸 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            int foot = 0;
            int inch = 0;
            foot = (int) (input / 30.48);
            double inchv = (input / 30.48 - foot);
            inch = (int) (inchv * 12);
            System.out.print(foot);
            System.out.print(" ");
            System.out.print(inch);
        }
    }
}
