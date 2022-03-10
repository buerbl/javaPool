package 基础;

import com.google.gson.Gson;
import lombok.Data;
import org.junit.Test;

@Data
public class ObjectsTest {
    private boolean flag;
    private Boolean flag1;


    @Test
    public void test(){
        ObjectsTest objectsTest = new ObjectsTest();
        System.out.println(new Gson().toJson(objectsTest));
        objectsTest.setFlag1(Boolean.TRUE);
        System.out.println(new Gson().toJson(objectsTest));
    }
}
