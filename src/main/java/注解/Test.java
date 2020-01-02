package 注解;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/29 17:26
 */
@Hello
@World
public class Test {

    public void tes111t(){
        System.out.println("111");
    }
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Annotation[] annotations = Test.class.getAnnotations();
        Arrays.asList(annotations).forEach(System.out::println);
        Class<Test> testClass = Test.class;
        Constructor<Test> constructor = testClass.getConstructor();
        Test test = constructor.newInstance();
        Method method = testClass.getMethod("tes111t", String.class);
        method.invoke(test);
    }
}



