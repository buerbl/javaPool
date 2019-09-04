package 输入与输出;

import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.util.Arrays;

public class IO {
    @Test
    public void test(){
        //当前
        File file = new File(".");
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
        //桌面
        File file1 = new File("/");
        System.out.println(Arrays.toString(file1.list()));
    }

    @Test
    public void test1(){
//        File file = new File();
    }
}
