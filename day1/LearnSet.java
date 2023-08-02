package week3.day1;


import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		String s= "google";
		//convert string to char array
		char[] charname = s.toCharArray();
		
		Set<Character> cname = new LinkedHashSet<Character>();
		Set<Character> dupcname = new LinkedHashSet<Character>();
		
		for(int i=0;i<charname.length;i++)
		{
			cname.add(charname[i]);
			if(!cname.add(charname[i]))
			{
				dupcname.add(charname[i]);
			}
		}
		System.out.println(charname);
		System.out.println(dupcname);
		

	}

}
