
public class LeapYearCalculator {

	public static void main(String[] args) {
		
		 int year=1696;
		 
		 if(year%4==0)
		 {
			 if(year%100==0)
			 {
				 if(year%400==0)
				 {
					 System.out.println("Leap year");
				 }
				 else
				 {
					 System.out.println("not Leap year");
				 }	 
			 }
			 else
			 {
				 System.out.println(" Leap year");
			 }	 
		 }
		 else
		 {
			 System.out.println("Not Leap year");
		 }	 
	}
}
