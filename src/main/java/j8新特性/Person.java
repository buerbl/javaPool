package j8新特性;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
//@AllArgsConstructor
@Data
public class Person implements Serializable {
    private String name;
    private String mgs;
}
