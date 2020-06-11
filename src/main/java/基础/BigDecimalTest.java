package 基础;

import org.junit.Test;

import java.math.BigDecimal;

public class BigDecimalTest {
	@Test
	public void testOf(){
		BigDecimal bigDecimal = BigDecimal.valueOf(0.1);
		System.out.printf(bigDecimal+"");
	}
	@Test
	public void testCon(){
		BigDecimal bigDecimal = new BigDecimal(0.1);
		System.out.printf(bigDecimal+"");
	}
}
