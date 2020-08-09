package 基础;

import org.junit.Test;

import java.util.Optional;

/**
 * @Author buerbl
 * @create 2020/6/17 17:08
 */
public class OptionalTest {
	@Test
	public void test(){
		String a = null;

		Optional.ofNullable(a).orElseThrow(() -> new RuntimeException("kongzhi"));

	}

	@Test
	public void test1(){
			Long currentTimestamps=System.currentTimeMillis();
			Long oneDayTimestamps= Long.valueOf(60*60*24*1000);
		long l = currentTimestamps - (currentTimestamps + 60 * 60 * 8 * 1000) % oneDayTimestamps;
		System.out.println(l);
	}

}
