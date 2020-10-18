
public class FirstAndLastDigitSum {
	 public static boolean isPerfectNumber(int number) {
	        if (number < 1)
	            return false;
	        int sum = 0, original = number, i = 1;
	        while (i <= number/2) {
	            if (number % i == 0)
	                sum += i;
	            i++;
	        }
	        if (sum == original)
	            return true;
	        return false;
	    }
	 
	 public static int getGreatestCommonDivisor(int first, int second) {
	        if (first < 10 || second < 10)
	            return -1;
	        int min = first, gcd = 1;
	        if (first > second)
	            min = second;
	        for (int i = 2; i <= min; i++) {
	            if (first % i == 0 && second % i == 0) {
	                if (gcd < i)
	                    gcd = i;
	            }
	        }
	        return gcd;
	    }
	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));
		System.out.println(getGreatestCommonDivisor(12,30));
		int t= 2125;
		
        int firstDigit = 0;
        int lastDigit = t % 10;
        while(t != 0) {
            int digit = t % 10;
            t /= 10;
            if (t == 0)
                firstDigit = digit;
        }
        
        System.out.println(firstDigit+lastDigit);
		
	}
}
