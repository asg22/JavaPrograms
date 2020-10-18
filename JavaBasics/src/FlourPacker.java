public class FlourPacker {
    
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        if (bigCount * 5 + smallCount < goal)
            return false;
        if (goal < 5 && goal <= smallCount)
            return true;
        if (goal % 5 == 0 && bigCount >= (goal / 5))
            return true;
        int remainingGoal = goal % 5;
        return remainingGoal <= smallCount;
    }
    
    public static void main(String[] args) {
    	//canPack (0, 5, 4); should return true 
    	//since smallCount is 5 (small bags of 1 kilo) 
    	//and goal is 4 kilos, and we have 1 bag left 
    	//which is ok as mentioned above.

		canPack(2, 2, 11);
	}
}