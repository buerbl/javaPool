package j8新特性;

import com.google.gson.Gson;
import lombok.Data;
import org.junit.Test;

import java.util.Optional;

/**
 * @Auther: boolean
 * @Date: 2019/4/14 23:38
 * @Description: 消灭if-else
 */
public class OptionalTest {
    @Data
    class User{
        private String name;
    }


    public  String getNameByNew(User u ) {
        String s = Optional.ofNullable(u)
                .map(user -> user.name)
                .orElse("Unknown");
        return s;
    }

    public  String getNameByOld(User u ){
        if (u.getName() == null){
            u.setName("Unknown") ;
        }
        String s = u.getName();
        return s;
    }

    @Test
    public void test(){
        User u = new User();
        if (u == null) {
            System.out.println("u为空");
        }else {
            System.out.println("不为空");
            System.out.println(u.getName());
        }
        String reNew =  getNameByNew(u);
        System.out.println("new:"+reNew);
        String reOld =  getNameByOld(u);
        System.out.println("old:"+reOld);


    }

}
