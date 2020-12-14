package 反射;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@Slf4j
public class MethodTest {

    @Test
    public void test1() throws InvocationTargetException {
        Class<?> clazz = MethodTest. class ;
        try {
            Method test = clazz.getMethod("test", Integer.class);
            test.invoke(clazz.newInstance(),0);
        } catch (NoSuchMethodException e) {
            log.error("错误1为{}", e);
        } catch  (IllegalAccessException e) {
            log.error("错误2为{}", e);
        }
        catch (InvocationTargetException e) {
            log.error("错误3为{}", e);
            throw e;
        } catch  (InstantiationException e) {
            log.error("错误4为{}", e);
        }
    }

    @Test
    public void test2(){
        try {
            test1();
        } catch (InvocationTargetException e) {
            log.error("错误3111为{}", e);
        }
    }



    public void test(Integer num){
        int i = 1 / num;
    }

}
