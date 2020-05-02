package pat;


import java.util.Scanner;
import java.util.Stack;

/**
 * @Author 布尔bl
 * @create 2020/5/2 10:53
 */
public class 逆序的三位数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            char[] chars = String.valueOf(input).toCharArray();
            Stack characters = new Stack();
            for (char s : chars) {
                characters.push(s);
            }
            StringBuilder stringBuilder = new StringBuilder();
            while (characters.size() != 0) {
                stringBuilder.append(characters.pop());
            }
            System.out.println(Integer.parseInt(stringBuilder.toString()));

        }

    }
}
