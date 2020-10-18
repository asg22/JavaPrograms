
public class DuplicateZeros {

	  public static void duplicateZeros(int[] arr) {
		  int temp=0;
		  for(int i =0;i<arr.length;i++)
		  {
			  if(arr[i]==0)
			  {
				  for(int j=i+1;j<arr.length;j++)
				  {
					 if(j==i+1 )
					 {
						 temp= arr[j];
						 arr[j]=0;
					 }
					 else
					 {
						 int t=temp;
						 temp=arr[j];
						 arr[j]=t;
						
					 }
				  }
				  i++;
			  }
		  }
		  for(int n:arr)
		  {
			  System.out.print(n+ " ");
		  }
	    }
	  
	  public static void main(String[] args) {
		
		  int[] arr ={1,0,2,3,0,4,5,0};
		  duplicateZeros(arr);
	}
}
