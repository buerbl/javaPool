package pat;

import java.util.Scanner;

/**
 * @Author 布尔bl
 * @create 2020/5/2 14:55
 */
public class 打印九九口诀表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i ++){
                for (int j = 1; j <= i; j++ ){
                    System.out.print(j+"*"+i+"="+i*j);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
