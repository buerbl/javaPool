package 注解;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: boolean 获取注解的值
 * @Date: 2020/1/14 18:38
 */
public class UseCaseTest {

    @UseCase(description = "aa")
    public void test(){

    }

    public static void main(String[] args) {
        Method[] methods = UseCaseTest.class.getMethods();
        for (Method method : methods){
            if (method.isAnnotationPresent(UseCase.class)){
                UseCase annotation = method.getAnnotation(UseCase.class);
                System.out.println(annotation.description());
            }

        }
    }
}



