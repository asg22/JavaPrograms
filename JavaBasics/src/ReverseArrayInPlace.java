import java.util.Arrays;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		
		int[] s={1,2,3,4,5,6};
		for(int t:s)
		{
			System.out.print(t + " ");
		}
		System.out.println();
		int last=s.length-1;
		for(int i=0;i<s.length/2;i++)
		{
			int temp=s[i];
			s[i]=s[last];
			s[last]=temp;
			last--;
		}

		for(int t:s)
		{
			System.out.print(t + " ");
		}
	}
}
