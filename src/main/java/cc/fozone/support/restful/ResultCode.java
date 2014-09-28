package cc.fozone.support.restful;

public interface ResultCode {
	/**
	 * 100～199 字段
	 */
	// 需要继续发送请求
	public static final String CONTINUE = "100";
	// 切换协议
	public static final String SWITCHING_PROTOCOLS = "101";
	// 执行中
	public static final String PROCESSING = "102";
	
	/**
	 * 200~299 字段
	 */
	// 请求成功
	public static final String OK = "200";
	// 新的资源需要建立
	public static final String CREATED = "201";
	// 服务接受请求，但无法处理
	public static final String ACCEPTED = "202";
	// 不是安全的信息：Non-Authoritative Information
	public static final String NON_AUTHORITATIVE_INFORMATION = "203";
	// 没有内容
	public static final String NO_CONTENT = "204";
	// 重置内容
	public static final String RESET_CONTENT = "205";
	// 处理了部分内容，适用于断点处理
	public static final String PARTIAL_CONTENT = "206";
	// 多种状态：Multi-Status
	public static final String MULTI_STATUS = "207";
	
	/**
	 * 300~399 字段
	 */
	// 多选
	public static final String MULTIPLE_CHOICES = "300";
	// 永久移动
	public static final String MOVED_PERMANENTLY = "301";
	// 临时移动
	public static final String MOVE_TEMPORARILY = "302";
	// 新地址
	public static final String SEE_OTHER = "303";
	// 缓存
	public static final String NOT_MODIFIED = "304";
	// 使用代理
	public static final String USE_PROXY = "305";
	// 切换代理
	public static final String SWITCH_PROXY = "306";
	// 临时重定向
	public static final String TEMPORARY_REDIRECT = "307";
	
	/**
	 * 400~499 字段
	 */
	// 错误请求
	public static final String BAD_REQUEST = "400";
	// 未认证
	public static final String UNAUTHORIZED = "401";
	// 需要付款
	public static final String PAYMENT_REQUIRED = "402";
	// 访问决绝
	public static final String FORBIDDEN = "403";
	// 查询不到
	public static final String NOT_FOUND = "404";
	// 方法被禁止
	public static final String METHOD_NOT_ALLOWED = "405";
	// 不可接受
	public static final String NOT_ACCEPTABLE = "406";
	// 需要代理验证
	public static final String PROXY_AUTHENTICATION_REQUIRED = "407";
	// 请求超时
	public static final String REQUEST_TIMEOUT = "408";
	// 冲突
	public static final String CONFLICT = "409";
	// 完成
	public static final String GONE = "410";
	// 需要长度
	public static final String LENGTH_REQUIRED = "411";
	// 前提条件失败
	public static final String PRECONDITION_FAILED = "412";
	// 请求地址太常
	public static final String REQUEST_URI_TOO_LONG = "414";
	// 不支持媒体类型
	public static final String UNSUPPORTED_MEDIA_TYPE = "415";
	// 请求条件不符合
	public static final String REQUESTED_RANGE_NOT_SATISFIABLE = "416";
	// 预期失败
	public static final String EXPECTATION_FAILED = "417";
	// 我是一个大水壶
	public static final String TEAPOT = "418";
	// 链接太多
	public static final String TOO_MANY_CONNECTIONS = "421";
	// 语义错误
	public static final String UNPROCESSABLE_ENTITY = "422";
	// 锁
	public static final String LOCKED = "423";
	// 依赖失败
	public static final String FAILED_DEPENDENCY = "424";
	// 不允许的请求
	public static final String UNORDERED_COLLECTION = "425";
	// 需要升级
	public static final String UPGRADE_REQUIRED = "426";
	// 随后重试
	public static final String RETRY_WITH = "449";
	
	/**
	 * 500~599
	 */
	// 服务器错误
	public static final String INTERNAL_SERVER_ERROR = "500";
	// 未实现
	public static final String NOT_IMPLEMENTED = "501";
	// 网关错误
	public static final String BAD_GATEWAY = "502";
	// 服务错误
	public static final String SERVICE_UNAVAILABLE = "503";
	// 网关超时
	public static final String GATEWAY_TIMEOUT = "504";
	// HTTP版本不被支持
	public static final String HTTP_VERSION_NOT_SUPPORTED = "505";
	// 内部配置错误
	public static final String VARIANT_ALSO_NEGOTIATES = "506";
	// 服务无法存储请求内容
	public static final String INSUFFICIENT_STORAGE = "507";
	// 服务达到带宽限制
	public static final String LOOP_DETECTED = "508";
	// 服务达到带宽限制
	public static final String BANDWIDTH_LIMIT_EXCEEDED = "509";
	// 获取的资源没有被满足
	public static final String NOT_EXTENDED = "510";
	
	/**
	 * 600~699 
	 */
	// 不可解析的头信息
	public static final String UNPARSEABLE_RESPONSE_HEADERS = "600";
}
