package cc.fozone.support.text;

import org.pegdown.Extensions;
import org.pegdown.PegDownProcessor;

public class MarkdownUtils {
	private static PegDownProcessor processor;
	
	static {
		processor = new PegDownProcessor(Extensions.ALL);
	}
	
	public static String html(String markdown) {
		String result =processor.markdownToHtml(markdown);
		return result;
	}
}
