package pat;

import java.util.Scanner;

/**
 * @Author 布尔bl
 * @create 2020/8/19 1:00
 */
public class 混合类型数据格式化输入 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        double d1,d2;
        String c;
        d1 = scan.nextDouble();
        i = scan.nextInt();
        c = scan.next();
        d2 = scan.nextDouble();
        System.out.print(c+" ");
        System.out.print(i+" ");
        System.out.print(d1+" ");
        System.out.print(d1+" ");
    }


}
