import java.util.Stack;

public class ReverseSentence {

	public static void reverseStringUsingStack(String s)
	{
		Stack t = new Stack<>();
		
		for(char c:s.toCharArray())
		{
			t.push(c);
		}
		
		while(!t.isEmpty())
		{
			System.out.print(t.pop());
		}
		System.out.println();
	}
	
	public static void reverseString(String s)
	{
		int last=s.length()-1;
		//System.out.println(s.charAt(s.length()-1));
		StringBuilder ss = new StringBuilder();
		ss.append(s);
		for(int i =0;i<s.length()/2;i++)
		{
			char c = s.charAt(i);
			ss.setCharAt(i, s.charAt(last));
			ss.setCharAt(last, c);
			//System.out.print(s);
			last--;
		}
		System.out.print(ss.toString());
	}
	
	public static String reverseStringUsingRecurssion(String s)
	{
		if (s.isEmpty())
		      return s;

		    return reverseStringUsingRecurssion(s.substring(1)) + s.charAt(0);
	}
	public static void main(String[] args) {
		
		String s ="Go Work";
		reverseStringUsingStack(s);
		reverseString(s);
		System.out.println();
		System.out.println(reverseStringUsingRecurssion(s));
		
	}
}
