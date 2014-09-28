package cc.fozone.support.text;

import java.io.IOException;

import org.markdown4j.Markdown4jProcessor;

public class MarkdownUtils {
	
	public static String html(String markdown) {
		Markdown4jProcessor processor = new Markdown4jProcessor();
		String result = null;
		try {
			result = processor.process(markdown);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			result = null;
		}
		return result;
	}
}
