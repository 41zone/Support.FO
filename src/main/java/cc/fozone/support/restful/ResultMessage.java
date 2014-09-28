package cc.fozone.support.restful;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class ResultMessage {
	private static ResultMessage resultMessage;
	public static ResultMessage getInstance(){
		if(resultMessage == null) {
			resultMessage = new ResultMessage();
		}
		return resultMessage;
	}
	
	private Properties properties;
	private static final String LOCATION = "/http.status.properties";
	private ResultMessage(){
		properties = new Properties();
		try {
			URL url = ResultMessage.class.getResource(LOCATION);
			
			if(url == null) return ;
			
			InputStream stream = new FileInputStream(url.getFile());
			properties.load(stream);
			
			if(stream != null) stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
	}
	
	/**
	 * 通过Code获得对应的消息
	 * @param code 代码
	 * @return 值
	 */
	public String get(String code) {
		return properties.getProperty(code,"Unknown Status");
	}
}
