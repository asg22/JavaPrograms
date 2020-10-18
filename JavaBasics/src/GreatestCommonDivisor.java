public class GreatestCommonDivisor {
    
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
		
    	//getGreatestCommonDivisor(25, 15); should return 5 since both can be 
    	//divided by 5 without a remainder
    	
    	getGreatestCommonDivisor(25, 15);
	}
}