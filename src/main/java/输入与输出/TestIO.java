package 输入与输出;

import lombok.*;

@Data
public class TestIO {
    private String mag;

    private String code;

    public TestIO(String mag, String code) {
        this.mag = mag;
        this.code = code;
    }

    public void test(){
        System.out.println(mag);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TestIO;
    }

}
