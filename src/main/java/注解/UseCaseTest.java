package 注解;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Description:
 * @Author: boolean 获取注解的值
 * @Date: 2020/1/14 18:38
 */
public class UseCaseTest {

    @UseCase(description = "aa")
    public void test(){

    }

    // lamada
    @Test
    public  void test1() {
        Method[] methods = UseCaseTest.class.getMethods();
        Arrays.asList(methods).stream().forEach(method ->
        {
            if (method.isAnnotationPresent(UseCase.class)){
                UseCase annotation = method.getAnnotation(UseCase.class);
                System.out.println(annotation.description());
            }
        });
    }

    // for 增强
    @Test
    public void test2(){
        Method[] methods = UseCaseTest.class.getMethods();
        for (Method method  : methods){
            if (method.isAnnotationPresent(UseCase.class)){
                UseCase annotation = method.getAnnotation(UseCase.class);
                System.out.println(annotation.description());
            }
        }
    }
}



