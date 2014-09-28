package cc.fozone.support.restful;

/**
 * 结果对象构造对象
 * @author jimmy.song
 */
public abstract class ResultFactory {
	/**
	 * 构造对象
	 */
	private ResultFactory(){}
	private static ResultMessage resultMessage = ResultMessage.getInstance();
	
	/**
	 * 构建结果对象
	 * @param code 状态码
	 * @param data 数据对象
	 * @param message 消息
	 * @return 结果对象
	 */
	public static ResultModel buildResultModel(String code, Object data, Object message) {
		ResultModel model = new ResultModel();
		model.setCode(code);
		model.setData(data);
		model.setMessage(message);
		return model;
	}
	
	/**
	 * 构建结果对象
	 * @param code 状态码
	 * @param data 数据对象
	 * @return 结果对象
	 */
	public static ResultModel buildResultModel(String code , Object data){
		return ResultFactory.buildResultModel(code, data, resultMessage.get(code));
	}
}
