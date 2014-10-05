package cc.fozone.support.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.lang.StringUtils;

public class SimpleEmailSender {
	String host = "";
	String user = "";
	String password = "";

	public void setHost(String host) {
		this.host = host;
	}

	public void setAccount(String user, String password) {
		this.user = user;
		this.password = password;
	}

	/**
	 * 发送邮件
	 * @param user 用户认证
	 * @param to 地址
	 * @param subject 主题
	 * @param content 内容
	 * @param contentType 类型
	 * @throws EmailException 发送失败后的异常
	 */
	public static void send(EmailUser user, String to, String subject,
			String content, String contentType) throws EmailException {
		Properties props = new Properties();

		props.put("mail.smtp.host", user.getHost());
		props.put("mail.smtp.auth", user.isAuth());

		try {
			Session mailSession = Session.getDefaultInstance(props);
			Message message = new MimeMessage(mailSession);

			message.setFrom(new InternetAddress(user.getUsername()));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					to));

			message.setSubject(subject);
			if(StringUtils.isBlank(contentType))
				message.setText(content);
			else 
				message.setContent(content,contentType);
			message.saveChanges();

			Transport transport = mailSession.getTransport("smtp");
			transport.connect(user.getHost(), user.getUsername(),
					user.getPassword());
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			throw new EmailException(e.getMessage());
		}
	}
	
	public static void sendText(EmailUser user, String to, String subject,
			String content) throws EmailException {
		SimpleEmailSender.send(user, to, subject, content, null);
	}
	
	public static void sendHTML(EmailUser user, String to, String subject,
			String content) throws EmailException {
		SimpleEmailSender.send(user, to, subject, content, "text/html;charset=UTF-8");
	}
}
