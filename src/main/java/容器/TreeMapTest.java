package 容器;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void test(){
        System.out.println(111);
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("dsdasd", "32");
        treeMap.put("asdasd", "321");
        treeMap.put("udasd", "323");
        System.out.println(new Gson().toJson(treeMap));

    }
}
