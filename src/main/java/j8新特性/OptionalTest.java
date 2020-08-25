package j8新特性;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Auther: boolean
 * @Date: 2019/4/14 23:38
 * @Description: 消灭if-else
 */
@Slf4j
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
                .map(User::getName)
                .orElse("Unknown");
//        String s = Optional.ofNullable(u)
//                .map(user -> user.name)
//                .orElse("Unknown");
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

    /**
     * 什么是空对象
     */
    @Test
    public void test1(){
        User user = new User();
        if (Objects.isNull(user)){
            log.info("{}是null","user");
        }else {
            log.info("该对象不是null，改值为{}",user.toString());

        }
    }

    /**
     * 什么是null
     */
    @Test
    public void test2(){
        User user = null;
        if (Objects.isNull(user)){
            log.info("该对象是null");
        }else {
            log.info("该对象不是null，改值为{}",user.toString());
        }
    }

    /**
     * 翻会一个null
     * @return
     */
    private User getnull(){
        User user = null;
        return user;
    }

    /**
     * optional 二义性
     */
    @Test
    public void test3(){
        User getnull = getnull();
        Optional<User> getnull1 = Optional.ofNullable(getnull);
        log.info(getnull1.get().toString());
    }

    /**
     * 测试map方法
     */
    @Test
    public void testMap(){
        O1 o1 = new O1("CHEN", "深圳");
        String s = Optional.ofNullable(o1).map(o11 -> o11.getAdress()).orElse(null);
        System.out.println(s);
    }

    @Data
    @AllArgsConstructor
    class O1{
        private String name;
        private String adress;
    }


    @Test
    public void test4(){
        String s = null;
        Optional.ofNullable(s).ifPresent(p->p="1");
        System.out.println(s);
    }
}
