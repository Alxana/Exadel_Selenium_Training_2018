import static org.apache.commons.lang3.RandomUtils.*;

public class RandomUtilsExample {
	public static void main(String[] args) {
		boolean b = nextBoolean();
		System.out.println(b);

		byte[] array = nextBytes(16);
		System.out.println(array);

		//all this stuff can be bounded
		double d = nextDouble();
		System.out.println(d);

		float f = nextFloat();
		System.out.println(f);

		int i = nextInt();
		System.out.println(i);

		long l = nextLong();
		System.out.println(l);

		System.out.println(nextInt(4, 7));
	}
}
