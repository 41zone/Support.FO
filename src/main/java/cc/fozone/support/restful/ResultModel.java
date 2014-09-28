package cc.fozone.support.restful;

/**
 * 结果对象
 * @author jimmy.song
 */
public class ResultModel {
	private String code;
	private Object data;
	private Object message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getMessage() {
		return message;
	}
	public void setMessage(Object message) {
		this.message = message;
	}
}
