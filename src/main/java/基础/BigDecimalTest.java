package 基础;

import org.apache.commons.lang3.StringEscapeUtils;
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

	@Test
	public void test1(){
		String code = "{\"code\":200,\"message\":\"\u0048\\u0065\u006C\u006C\u006F\"}";
		String code2 = "{\"code\":200,\"message\":\"保存成功\"}";
		// unicode 转换成 中文
		System.out.println(StringEscapeUtils.unescapeJava(code));
		// 中文转换成 unicode
		System.out.println(StringEscapeUtils.escapeJava(code2));
	}
}
