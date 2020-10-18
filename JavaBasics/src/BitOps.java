
public class BitOps
{
    public static void main(String[] args)
    {
    	
        int x = 8;//0000 0101
        int y = 15;//0000 0110
         System.out.println( x ^ y);//if bits are diff then 1 otherwise 0
         System.out.println(x & y);//1 and 1 is 1 otherwise 0
         System.out.println(+x | y);//0 and 0 is 0 otherwise 1
         System.out.println("~y:"+~y);
         System.out.println(Integer.bitCount(y));// counts all 1's
         System.out.println(Integer.toBinaryString(x) + "**" + x); 
         x <<= 1;//0000 1010
         System.out.println(Integer.toBinaryString(x) + "**" + x);
         x <<= 1;//0001 0100
         System.out.println(Integer.toBinaryString(x) + "**" + x);
         System.out.println("right shift start");
         x = 2;
         System.out.println(Integer.toBinaryString(x) + "**" + x);// right shift by 1 to make no
         x >>= 1;//0000 0001
         System.out.println(Integer.toBinaryString(x) + "**" + x);
         x >>= 1;//0000 0000
         System.out.println(Integer.toBinaryString(x) + "**" + x);
    }

}
