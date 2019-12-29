package 基础;

import lombok.Data;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Description: 反射测试
 * @Author: boolean
 * @Date: 2019/12/26 17:01
 */
@Data
public class ReflectTest {
    private String name;
    private String pass;

    @Test
    public void test() throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 前提获取 Class 类
         */
        // 方法1
        System.out.println(ReflectTest.class);
        // 方法2
        System.out.println(new ReflectTest().getClass());
        // 方法3  包名+类名 （JDBC那种操作） 有异常
        System.out.println(Class.forName("基础.ReflectTest"));
        // 获取类名
        System.out.println(ReflectTest.class.getName());
        // 获取方法
        System.out.println(Arrays.toString(ReflectTest.class.getDeclaredMethods()));
        // 获取属性
        System.out.println(Arrays.toString(ReflectTest.class.getDeclaredFields()));

        // 正常创建对象并初始化
        ReflectTest reflectTest = new ReflectTest();
        reflectTest.setName("boolenbl公众号");
        System.out.println(reflectTest.getName());

        // 反射创建对象并初始化
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        Constructor<ReflectTest> constructor = reflectTestClass.getConstructor();
        reflectTest = constructor.newInstance();
        Method method = reflectTestClass.getMethod("setName", String.class);
        method.invoke(reflectTest, "公众号");
        System.out.println(reflectTest.getName());
    }

    public void test1(){

    }

    public void test2(){

    }

    public void test3(){

    }
}



