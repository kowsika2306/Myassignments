package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSetPractie {

	public static void main(String[] args) {
		
		String str="welcome to google";//string format
		
		//convert string to char array
		char[] names = str.toCharArray();
		
		Set<Character> words=new LinkedHashSet<Character>();
		Set<Character> dupwords=new LinkedHashSet<Character>();
		
		for(int i=0;i<names.length;i++)
		{
			words.add(names[i]);
			if(!words.add(names[i]))
			{
				dupwords.add(names[i]);
			}
			
		}
		System.out.println(names);
		System.out.println("The length of string is " + names.length);
	    System.out.println(dupwords);
	    System.out.println(dupwords.size());

	}

}
