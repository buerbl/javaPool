package 基础;

import lombok.Data;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/2 14:48
 */
@Data
public final class FinalTest {
    private String name;
    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        System.out.println(System.identityHashCode(finalTest));
        finalTest = new FinalTest();
        System.out.println(System.identityHashCode(finalTest));

    }
}



