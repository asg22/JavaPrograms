import java.util.Arrays;

public class BinarySearch {

	public static void binarySearch(int[] arr,int num)
	{
		Arrays.sort(arr);
		int low = 0;
		int high= arr.length-1;
		int mid = (low+high)/2;
		
		while(low<=high)
		{
			if(arr[mid]<num)
			{
				low=mid+1;
			}
			else if(arr[mid]==num)
			{
				 System.out.println("found at "+mid);
				 break;
			}
			else
			{
				high=mid-1;
			}
			
			mid=(low+high)/2;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr= {2,3,4,5,6,7,8};
		binarySearch(arr, 9);
		
	}
}
