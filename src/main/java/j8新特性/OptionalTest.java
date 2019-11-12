package j8新特性;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: boolean
 * @Date: 2019/4/14 23:38
 * @Description: 消灭if-else
 */
public class OptionalTest {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    class User{
        private String name;
        private String chen;
        private Integer wen;
        private String guan;

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
        Optional.ofNullable(u).orElse(null);
        String reNew =  getNameByNew(u);
        System.out.println("new:"+reNew);
        String reOld =  getNameByOld(u);
        System.out.println("old:"+reOld);
        u.setName("chen");
        System.out.println(reNew = getNameByNew(u));
        System.out.println(reOld = getNameByOld(u));
    }

    @Test
    public void mapTest(){
        Stream<User> userStream = Stream.of(new User("n1", "c1", 1, "g1"),
                new User("n1", "c1", 1, "g2"),
                new User("n2", "c2", 2, "g3"),
                new User("n3", "c3", 3, "g4"));
//        userStream.forEach(System.out::println);
//        System.out.println(userStream.flatMap(user -> Stream.of(user.getChen(),user.getWen())).collect(Collectors.toList()));
    }

    @Test
    public void testifpresent(){
        for (int i = 0; i < 10; i++) {
            if (i == 0){
                System.out.println(0);
                break;
            }
            System.out.println(1);

        }


        for (int i = 0; i < 10; i++) {
            if (i == 2){
                System.out.println(2);
                continue;
            }
            System.out.println(3);
        }


    }

}
