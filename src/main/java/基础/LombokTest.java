package 基础;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

@Builder
public class LombokTest {
    private String aaa;

    private String aAa;

    private String AAa;

    private String AAA;

//    @Test
//    public void test(){
//        LombokTest build = LombokTest.builder().AAA("s").aAa("c").aaa("c1").AAa("e").build();
//        System.out.println(build.toString());
//    }
//

    public static void main(String[] args) {
        LombokTest build = LombokTest.builder().AAA("s").aAa("c").aaa("c1").AAa("e").build();
        System.out.println(build.toString());
    }


    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    public void setaAa(String aAa) {
        this.aAa = aAa;
    }

    public void setAAa(String AAa) {
        this.AAa = AAa;
    }

    public void setAAA(String AAA) {
        this.AAA = AAA;
    }
}
