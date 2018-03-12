import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringUtilsExample {
	public static void main(String[] args) {
		System.out.println(RandomStringUtils.randomNumeric(10));
		System.out.println(RandomStringUtils.randomAlphabetic(10));
		System.out.println(RandomStringUtils.randomAscii(10));
		System.out.println(RandomStringUtils.random(10));
		System.out.println(RandomStringUtils.random(10, true, false));
	}
}
