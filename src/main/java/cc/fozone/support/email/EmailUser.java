package cc.fozone.support.email;

public class EmailUser {
	private String host;
	private String username;
	private String password;
	private boolean isAuth = true;
	
	public EmailUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmailUser(String host, String username, String password,
			boolean isAuth) {
		super();
		this.host = host;
		this.username = username;
		this.password = password;
		this.isAuth = isAuth;
	}



	public boolean isAuth() {
		return isAuth;
	}
	public void setAuth(boolean isAuth) {
		this.isAuth = isAuth;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
