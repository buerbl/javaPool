package j8新特性.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author buerbl
 * @create 2020/7/14 11:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
	private int id;
	private String name;
	private int age;
}
