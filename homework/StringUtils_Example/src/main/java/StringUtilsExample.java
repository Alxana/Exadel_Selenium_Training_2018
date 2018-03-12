import org.apache.commons.lang3.StringUtils;

public class StringUtilsExample {
	public static void main(String[] args) {
		//Strings are immutable!

		String name = "Darya";
		String language = "Java";

		//new String object
		language += " and English";

		//so many objects!!
		for(int i = 0; i < 10; i++) {
			language += " and smth ";
		}

		//better use StringBuilder
		StringBuilder builder = new StringBuilder(language);
		for(int i = 0; i < 10; i++) {
			builder.append(" and smth ");
		}

		//StringBuilder under the hood, working fine
		String test = "Hi, " + name + " I know " + builder.toString() + " better than you";

		//no need to use StringBuilder, too complex to create it
		String test1 = "Hi, " + name;

		//so better to use concat
		String test2 = "Hi, ".concat(name);


		String str = "Hello World";
		String newStr = StringUtils.deleteWhitespace(str);

		System.out.println("Without White space: " + newStr);
		System.out.println("Difference is: "
				+ StringUtils.difference(str, newStr));

		String reverse = StringUtils.reverse(str);
		System.out.println("Reverse of " + str + " is " + reverse);

		if (StringUtils.containsIgnoreCase(str, "hello")) {
			System.out.println("String is present");
		}

		if (StringUtils.containsNone(str, "abc")) {
			System.out.println("The string does not contain letters a,b,c.");

		}

		if (StringUtils.containsWhitespace(str)) {
			System.out.println("The String Contains White space");
		}

		str = str.toLowerCase();
		if (StringUtils.isAllLowerCase(str)) {
			System.out.println("All the letters are in lower case");
		}

		if (StringUtils.isAllUpperCase(str)) {
			System.out.println("All the letters are in upper case");
		}
	}
}
