package week2.day4homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] a={3,2,11,4,6,7};
        int[] b={1,2,8,4,9,7};
        
        List<Integer> lista = new ArrayList<Integer>();
        List<Integer> listb = new ArrayList<Integer>();
        List<Integer> listc = new ArrayList<Integer>();
        
        for(int i=0;i<a.length;i++)
        {
        	lista.add(a[i]);
        }
        System.out.println( "The first integer values are " + lista);
        
        for(int j=0;j<b.length;j++)
        {
        	listb.add(b[j]);
        	
        }
        System.out.println("The first integer values are " + listb);
        
        for(int k=0;k<lista.size();k++) 
        {
        	for(int l=0;l<listb.size();l++)
        	{
        		if(lista.get(k).equals(listb.get(l)))
        				
        		{
        			String stringnew = lista.get(k).toString();
        			int equalnumber = Integer.parseInt(stringnew);
        			listc.add(equalnumber);
        		}
        	}
        }
        System.out.println("The matched values are " + listc);
        
        

	}

}
