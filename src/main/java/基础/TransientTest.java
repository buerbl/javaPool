package 基础;

import com.google.gson.Gson;
import org.junit.Test;


public class TransientTest {
    private String name;

    private transient String book;
    @Test
    public void testNoTransient(){
        name = "chen";
        System.out.println(new Gson().toJson(name));
    }


    @Test
    public void testHaveTransient(){
        book = "wen";
        System.out.println(new Gson().toJson(book));
    }
}
