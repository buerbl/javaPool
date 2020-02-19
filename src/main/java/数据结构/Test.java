package 数据结构;

import java.util.Scanner;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/1/15 18:01
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = 5*(a-32)/9;

            System.out.println("Celsius = "+b);
        }
    }
}



