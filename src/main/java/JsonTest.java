import classtest.Animal;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: boolean
 * @Date: 2019/4/29 19:24
 * @description:
 */
@Getter
@Setter
public class JsonTest {
    private String name;
    private List<String> list;
    private Integer[] array;

//    public JsonTest(List<String> list) {
//        this.list = list;
//        list.add(1, "A");
//        list.add(2, "HasmMapTest");
//        list.add(3, "v");
//    }
    public void init(JsonTest jsonTest){
        jsonTest.setName(name = "chen");
        List<String> list = new ArrayList<>();
        list.add(0, "A");
        list.add(1, "HasmMapTest");
        list.add(2, "c");
        jsonTest.setList(list);
        Integer[] array = new Integer[]{1,2,3,4,5,6};
        jsonTest.setArray(array);
    }

    @Setter@Getter
    class Name{
        private BigDecimal name;
        private String pass="dsds";
        private Integer pass1;

    }
    @Test
    public void jsonTest(){
//        String old = "name";
        Name name = new Name();
        name.setName(BigDecimal.valueOf(0));
        String str = JSONObject.toJSONString(name, Boolean.parseBoolean("ss"));
        name.setPass("3");
        String str1 = JSONObject.toJSONString(name);
//        System.out.println(str);

        JSONObject obj = new JSONObject();
        obj.put("name", name.getPass());
        System.out.println(obj.getClass());
//        System.out.println(obj.getString("name"));

        String a = "{\"name\":\"3\"}";
        System.out.println(JSONObject.parseObject(a).getString("name"));


        String s2 = new Gson().toJson(name.pass);
//        System.out.println(s2);
    }


    class Person{
        private String  name;
        private String age;
    }
    @Test
    public void test3(){
        String name ="{\"name\":\"cjen\"}";
        Gson gson = new Gson();
        System.out.println(gson.fromJson(name, Person.class).toString());
    }

    @Test
    public void test4(){
        JsonTest jsonTest  = new JsonTest();
        init(jsonTest);
        Gson gson = new Gson();
        String a = gson.toJson(jsonTest);
        System.out.println(a);
        String[] stringArray = new String[]{a};
        System.out.println(gson.toJson(stringArray));

    }
}
