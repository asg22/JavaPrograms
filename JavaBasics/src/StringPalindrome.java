
public class StringPalindrome {

	
	public static String isPalindrome(String s)
	{
		if(s==null || s.isEmpty())
		{
			return s;
		}
		
		return s.charAt(s.length()-1)+isPalindrome(s.substring(0, s.length()-1));
	}
	public static void main(String[] args) {
		
		String s="Bob";
		System.out.println(isPalindrome(s));
		//starts from 0
		int cnt=s.length()-1;
		String re="";
		while(cnt>=0)
		{
			re+=s.substring(cnt,cnt+1);
			//System.out.println(re);
			cnt--;
		}
		
		if(re.equalsIgnoreCase(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
