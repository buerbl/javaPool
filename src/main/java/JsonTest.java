import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author: boolean
 * @Date: 2019/4/29 19:24
 * @description:
 */
public class JsonTest {
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
        System.out.println(str);

        //
        JSONObject obj = new JSONObject();
        obj.put("name", name.getPass());
        System.out.println(obj);


        String s2 = new Gson().toJson(name.pass);
        System.out.println(s2);
    }
}
