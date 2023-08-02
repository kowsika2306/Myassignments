package week3.day1homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;





public class SortingUsingCollection {

	public static void main(String[] args) {
		
		//String[] array = {"Google,Microsoft,TestLeaf,Maverick"};
		
		List<String> L1 =new ArrayList<String>();
		L1.add("Google");
		L1.add("Microsoft");
		L1.add("TestLeaf");
		L1.add("TCS");
		L1.add("Maverick");
		System.out.println("The length of array : " + L1.size());
		//sort the array
		Collections.sort(L1);
		Collections.sort(L1,Collections.reverseOrder());
		
		Iterator a1=L1.iterator();
		while(a1.hasNext())
		{
		System.out.println(a1.next());
		}
   
		
	}

}
