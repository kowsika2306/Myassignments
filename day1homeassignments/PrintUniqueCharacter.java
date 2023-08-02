package week3.day1homeassignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String s1= "kowsika";
		//convert string to chararray
		
		char[] name=s1.toCharArray();
		System.out.println(name);
		
		Set<Character> unique=new HashSet<Character>();
		Set<Character> duplicate=new HashSet<Character>();
		
		for(int i=0;i<name.length;i++)
		{
			
			if(!unique.add(name[i]))duplicate.add(name[i]);
			{
		        
			}
		}
		System.out.println(unique);
		System.out.println(duplicate);
	}

		}


