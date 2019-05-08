import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: boolean
 * @Date: 2019/5/6 14:18
 * @description:
 */
public class ListTest {

    @Test
    public void test(){
        List<String> list = new LinkedList<>();
        list.add(0, "{\"name\":\"3\"}");
//        list.set(1, "1");
//        list.set(2, "1");
//        list.set(3, "1");
//        list.set(4, "1");
        System.out.println(list.get(0));
        System.out.println(list.get(0).getClass());
        System.out.println();
        System.out.println(JSONObject.parseObject(list.get(0)).getString("name"));

    }



}
