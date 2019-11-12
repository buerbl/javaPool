package 剑指offer;

import org.junit.Test;

/**
 * @Description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 * @Author: boolean
 * @Date: 2019/11/10 20:29
 */
public class Title2 {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" ", "%20");
    }


    @Test
    public void test(){
        StringBuffer stringBuffer = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(stringBuffer));
    }

}



