
public class PaintJob {

	public static void paint(double width, double height, 
			double areaPerBucket, int extraBuckets)
	{
		double areaOfWall = width*height;
		
		double areaCoveredByExtraBuckets = areaPerBucket*extraBuckets;
		
		double remaining = areaOfWall-areaCoveredByExtraBuckets;
		
		double noOfBuckets = remaining/areaPerBucket;
		
		System.out.println(Math.ceil(noOfBuckets));
	}
	
	public static void main(String[] args) {
		//getBucketCount(3.4, 2.1, 1.5, 2); should return 3 since 
		//the wall area is 7.14, a single bucket can cover an area of 1.5 
		//and Bob has 2 extra buckets home.
		paint(2.5, 3.5, 1.5, 2);
	}
}
