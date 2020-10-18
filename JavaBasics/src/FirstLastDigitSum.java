public class FirstLastDigitSum {
    
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        int firstDigit = 0;
        int lastDigit = number % 10;
        while(number != 0) {
            int digit = number % 10;
            number /= 10;
            if (number == 0)
                firstDigit = digit;
        }
        return (firstDigit + lastDigit);
    }
    
    public static void main(String[] args) {
		
    	//sumFirstAndLastDigit(257);should return 9, 
    	//the first digit is 2 and the
    	//last is 7 which gives us 2+7 and the sum is 9.
    	sumFirstAndLastDigit(254);
	}
    
}