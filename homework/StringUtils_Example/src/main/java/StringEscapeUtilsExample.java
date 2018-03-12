import org.apache.commons.text.StringEscapeUtils;

public class StringEscapeUtilsExample {
	public static void main(String[] args) {
		System.out.println(StringEscapeUtils.escapeJava("\\\n\t\r"));
		System.out.println(StringEscapeUtils.unescapeJava("\\\\\\n\\t\\r"));
		System.out.println(StringEscapeUtils.unescapeJson("{\"data\": \"hello\"}"));
		System.out.println(StringEscapeUtils.escapeXml10("<xml>"));
		System.out.println(StringEscapeUtils.unescapeXml("&lt;xml&gt;"));
	}
}
