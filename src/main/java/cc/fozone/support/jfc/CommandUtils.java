package cc.fozone.support.jfc;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.lang.StringUtils;

/**
 * 命令工具集
 * @author Jimmy Song
 *
 */
public class CommandUtils {
	private static Desktop desktop;
	static {
		if(Desktop.isDesktopSupported()) {
			desktop = Desktop.getDesktop();
		}
	}
	
	/**
	 * 通过浏览器访问地址
	 * @param url 网络地址
	 */
	public static void browse(String url) {
		if(desktop == null) return ;
		
		try {
			final URI uri = new URI(url);
			Thread t = new Thread(new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					if(desktop == null) return ;
					try {
						desktop.browse(uri);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}});
			t.start();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 调用邮箱访问，执行mailto:xxx@xxx.com
	 * @param email 邮箱地址
	 */
	public static void mail(String email){
		if(StringUtils.isBlank(email)) return ;
		if(desktop == null) return ;
		try {
			final URI uri = new URI("mailto:"+email);
			Thread t = new Thread(new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					if(desktop == null) return ;
					try {
						desktop.mail(uri);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}});
			t.start();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
