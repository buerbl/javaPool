package lambdatest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 *  测试 lambda 表达式
 * @see Lam
 * @Author: boolean
 * @Date: 2020/1/1 15:48
 */
public class LamTest {

    @Test
    public void test(){
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", 22, 175));
        students.add(new Student("红发", 40, 180));
        List<Student> list = students.stream()
                .filter(stu -> stu.getTall() < 180)
                .collect(Collectors.toList());
        System.out.println(list);
        List<String> collect = students.stream()
                .map(student -> student.getName())
                .collect(Collectors.toList());
        System.out.println(collect);

//        test1(new A());
    }

    private void test1(Lam lam){
        System.out.println("1");
        lam.test(6);
    }

    public class  A implements Lam{

        @Override
        public int test(int q) {
            System.out.println(2);
            return 0;
        }
    }
}



