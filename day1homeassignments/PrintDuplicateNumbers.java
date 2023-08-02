package week3.day1homeassignments;



import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> numbers= new LinkedHashSet<Integer>();
		Set<Integer> duplicate= new LinkedHashSet<Integer>();
		
		
		for(int i=0;i<data.length;i++)
		{
			if(!numbers.add(data[i]))
			{
				duplicate.add(data[i]);
			}
		}
       System.out.println(duplicate);
	}

}
