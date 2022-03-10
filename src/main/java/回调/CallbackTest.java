package 回调;

import org.junit.Test;

/**
 * 回调测试，原文出处http://www.cnblogs.com/xrq730/p/6424471.html
 */
public class CallbackTest {

    @Test
    public void testCallback() {
        Student student = new Ricky();
        Teacher teacher = new Teacher(student);
        System.out.println("问个问题, xxxx");
        long l = System.currentTimeMillis();
        teacher.askQuestion();
        System.out.println("耗时是"+(System.currentTimeMillis()-l)/1000);

    }

}