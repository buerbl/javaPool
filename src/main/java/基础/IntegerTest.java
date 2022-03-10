package 基础;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/11/19 22:10
 */
public class IntegerTest {
    @Test
    public void test(){
        int a = 200;
        int b = 128;
        Integer c = 200;
        Integer d = 200;
        Integer e = 126;
        Integer f = 126;
        System.out.println("a==b:"+ (a==b));
        System.out.println("e==f:"+ (e==f));
        System.out.println("c==d:"+ (c==d));
        System.out.println("c==a:"+ (c==a));
        System.out.println("c.equals(a):"+c.equals(a));

    }

    @Test
    public void test1(){
        System.out.println(new Integer(129) == 129);
    }

    @Test
    public void testIntshufa(){
        System.out.println(1133/100);
    }

    @Test
    public void testNUll(){
        System.out.println(11);
    }

    @Test
    public void testCompare(){

        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings123";
        BigDecimal one = BigDecimal.ONE;
        BigDecimal ten = BigDecimal.TEN;
        System.out.println(one.compareTo(ten));

        System.out.println(BigDecimal.valueOf(-1L));
    }

    @Test
    public void testCpu() throws IOException {
        int NCPU = Runtime.getRuntime().availableProcessors();
        System.out.println(NCPU);

        Process process = null;
        try {
            process = Runtime.getRuntime().exec("nvidia-smi.exe");
        } catch (IOException e) {
            System.out.println("独显不存在");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        StringBuffer stringBuffer = new StringBuffer();
        String line = "";
        while (null != (line = reader.readLine())) {
            stringBuffer.append(line + "\n");
        }
        System.out.println(stringBuffer.toString());
    }


}



