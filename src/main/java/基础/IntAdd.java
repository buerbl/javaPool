package 基础;

import org.junit.Test;

/**
 * @Description: i++
 * @Author: boolean
 * @Date: 2019/12/2 15:42
 */
public class IntAdd {

	@Test
	public void tets1() {
		int i = 0;
		System.out.println(i);
		System.out.println(i++);
	}

	@Test
	public void test2() {
		for (int i = 1; i < 2; i++) {
			System.out.println("进去" + i + "次");
		}
	}
}



