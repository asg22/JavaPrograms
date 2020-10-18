
public class ArrayMinimumNumber {

	public static void findMin(int[] array)
	{
		
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
		}
		
		System.out.println(min);
	}
	public static void main(String[] args) {
		 int[] arr = {5,8,9,4,1,0,5};
		 findMin(arr);
	}
}
