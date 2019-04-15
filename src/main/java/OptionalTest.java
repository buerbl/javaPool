import org.junit.Test;

import java.util.Optional;

/**
 * @Auther: boolean
 * @Date: 2019/4/14 23:38
 * @Description:
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> strOpt = Optional.of("Hello World");
        strOpt.ifPresent(System.out::println);
    }

    public class User{
        public String name = "i got you";

        public void setName(String name) {
            this.name = name;
        }

    public String getName() {
        return name;
    }
}

    @Test
    public  String getName1() {
        User u = new User();
        return Optional.ofNullable(u)
                .map(user -> user.name)
                .orElse("Unknown");
    }

    @Test
    public void test(){
        System.out.println(1);
    }

}
