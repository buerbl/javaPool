package letcode;

import org.junit.Test;

/**
 * @author boolean
 * Date: 2019/10/8 15:05
 * description: https://leetcode-cn.com/problems/reverse-integer/
 * tip: x/=10
 */
public class 整数反转7 {
    public int reverse(int x) {
        long answer = 0; //用long承接数据
        while (x != 0){
            answer = answer * 10 + x%10;
            x /=10;
        }
        return (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) ? 0 : (int) answer;
    }

    @Test
    public void test(){
        System.out.println(reverse(1534236469));
    }
}
