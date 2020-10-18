package java.io.Exception;

public class InvalidInputDataException extends RuntimeException {
	
	private int code;
	private String msg;
	
	
	public InvalidInputDataException(ErrorCode errorCode)
	{
		super(errorCode.getMsg());
		this.msg=errorCode.getMsg();
		this.code=errorCode.getCode();
	}
	public InvalidInputDataException(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
