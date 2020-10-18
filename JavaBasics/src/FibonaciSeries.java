
public class FibonaciSeries {

	public static void fibonaaciWithRecursion(int first,int second,int next,int upTo)
	{
		if(next>upTo)
		{
			return;
		}
		System.out.print(next+" ");
		next = first + second;
		first=second;
		second=next;
		
		fibonaaciWithRecursion(first,second,next,upTo);
	}
	
	public static void main(String[] args) {
		
		int upTo=4;
		int first =0 ; int second=1;
		int temp=1;
		while(temp<=upTo )
		{
			System.out.print(temp+" ");
			temp = first + second;
			first=second;
			second=temp;
		}
		System.out.println();
		fibonaaciWithRecursion(0,1,1,4);
	}
}
