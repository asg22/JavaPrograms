
public class Factorial {

	public static int factorial(int number)
	{
		if(number==0)
		{
			return 1;
		}
		
		return number*factorial(number-1);
	}
	
	public static void main(String[] args) {
		
		int number = 5;
		System.out.println(factorial(number));
		int result=1;
		for(int i=1;i<=5;i++)
		{
			result=result*i;
		}
		System.out.println(result);
	}
}
