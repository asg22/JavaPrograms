public class FactorPrinter {

    public static void printFactors(int number) {
        if(number < 1)
            System.out.println("Invalid Value");
        int i = 1;
        while (i <= number){
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
		
    	//printFactors(6);- should print 1 2 3 6
    	printFactors(6);
	}  
}