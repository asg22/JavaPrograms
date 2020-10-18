import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class movieRating implements Comparator<MovieComparableAndComparator>
{

	@Override
	public int compare(MovieComparableAndComparator o1, MovieComparableAndComparator o2) {
		if(o1.getRating()>o2.getRating())
		{
			return -1;
		}
		else if(o1.getRating()<o2.getRating())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
public class MovieComparableAndComparator implements Comparable<MovieComparableAndComparator>{

	private String name;
	private int year;
	private int rating;
	  	
	public MovieComparableAndComparator() {
		// TODO Auto-generated constructor stub
	}


	public MovieComparableAndComparator(String name, int year,int rating) {
		super();
		this.name = name;
		this.year = year;
		this.rating= rating;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", year=" + year + ", rating=" + rating + "]";
	}


	@Override
	public int compareTo(MovieComparableAndComparator o) {
		return this.year-o.year;
	}
	
	public static void main(String[] args) {
		
		List<MovieComparableAndComparator> movieList = new ArrayList<>(); 
		movieList.add( new MovieComparableAndComparator("Don", 2004,9));
		movieList.add(new MovieComparableAndComparator("Don1", 2010,6));
		movieList.add(new MovieComparableAndComparator("Don2", 2008,8));
		movieList.add( new MovieComparableAndComparator("Don3", 2002,7));
		
		//Collections.sort(movieList);
		Collections.sort(movieList,new movieRating());
		System.out.println(movieList);
		
	}
	
}
