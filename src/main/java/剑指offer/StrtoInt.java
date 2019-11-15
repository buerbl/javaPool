package 剑指offer;

/**
 * @Description: 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 * @Author: boolean
 * @Date: 2019/11/15 15:18
 */
public class StrtoInt {
    public int StrToInt(String str) {
         int i = 0;
         try {
             i = Integer.parseInt(str);
         }catch (Exception e){

         }
         return 0;
    }
}



