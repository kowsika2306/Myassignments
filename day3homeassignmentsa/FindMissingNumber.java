package week1.day3homeassignmentsa;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//declare the array
		int[] arr = {1,2,3,4,7,6,8};
		
		int numbers = arr.length;
		Arrays.sort(arr);
		
		for(int i=1;i<arr.length;i++)
		{
			if(i!=arr[i-1])
			{
				System.out.println(i);
				break;
			}
	
		}
				
	}

}
