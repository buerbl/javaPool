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
}
