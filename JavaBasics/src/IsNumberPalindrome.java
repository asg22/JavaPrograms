
public class IsNumberPalindrome {

	
	public static void main(String[] args) {
		int t=-1221;
		int result=0;
		int toCmp=t;
		while(t!=0)
		{
			int temp = t%10;
			result=temp+result*10;
			t=t/10;
		}
		
		if(result==toCmp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
