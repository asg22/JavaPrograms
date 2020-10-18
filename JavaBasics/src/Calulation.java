
public class Calulation {

	public static void cal(int x,int y) throws InvalidInputDataException
	{
		throw new InvalidInputDataException(ErrorCode.Invalid_NUMBER);
	}
	
	public static void main(String[] args) {
		try
		{
			cal(1, 2);
		}
		catch(InvalidInputDataException e)
		{
			System.out.println(e.getCode()+":"+e.getMessage());
		}
	}
}
