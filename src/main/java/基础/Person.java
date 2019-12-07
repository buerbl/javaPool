package 基础;

import classtest.P;
import lombok.Data;
import lombok.Getter;
import org.junit.Test;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/3 15:22
 */
@Data
public class Person extends Man implements Cloneable {
    private String name;
    private Person person;

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setName("chen");
        Person clone = (Person)person.clone();
        System.out.println(clone.toString());
        System.out.println("person.equals(clone):"+person.equals(clone));
        System.out.println("person == clone:"+(person == clone));
        System.out.println("person.person == clone.person:"+(person.person == clone.person));
    }








}



