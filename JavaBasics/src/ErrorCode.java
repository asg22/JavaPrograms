
public class ErrorCode {

	private int code;
	private String msg;
	
	public ErrorCode(int code, String msg) {
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

	public static ErrorCode getInvalidInput() {
		return Invalid_NUMBER;
	}

	public static final ErrorCode Invalid_NUMBER = new ErrorCode(1000,"invalid input entered");
}
