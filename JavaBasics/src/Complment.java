
public class Complment {

	public static void main(String[] args) {
		
		int num=5;
		int temp=num;
		int tt=0;
		String number="";
		  while(num!=0)
          {
              int count1=num%2;
              number=count1+number;
              num=num/2;
          }
		for(int i =0;i<number.length();i++)
		{
			tt+=1*Math.pow(2, i);
		}
		System.out.println(tt+"**");
		int res= temp^tt;
		System.out.println(res);
		
	}
}
