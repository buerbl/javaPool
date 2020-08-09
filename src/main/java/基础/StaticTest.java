package 基础;

/**
 * @Author buerbl
 * @create 2020/7/22 9:21
 */
public class StaticTest {
	private static Integer count = 0;
	public StaticTest(){
		count++;
	}

	public static void main(String[] args) {
		new StaticTest();
		new StaticTest();
		System.out.println(count);
	}


}
