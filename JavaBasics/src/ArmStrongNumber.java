
public class ArmStrongNumber {

	public static void isArmStrongNumber(int firstNum,int num1)
	{
		
		for(int i = firstNum;i<=num1;i++)
		{
			int res=0;
			int num=i;
			int temp=num;
			int len = String.valueOf(num).length();
			while(num!=0)
			{
				int t = num%10;
				res+=Math.pow(t, len);
				num=num/10;
			}
			//System.out.println(res);
			if(res==temp)
			{
				System.out.println("ArmStrong Number:"+res);
			}
		}
	}
	
	public static void main(String[] args) {
		
		isArmStrongNumber(10,100000);
	}
}
