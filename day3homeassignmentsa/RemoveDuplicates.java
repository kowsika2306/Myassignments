package week1.day3homeassignmentsa;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
        
		String arr[]=text.split("java");
		System.out.println("The string text after removing is:");
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					arr[j]="";
				}
			
			}
		}
		  
		      for(int i=0;i<arr.length;i++)
		    {
			
		    	  System.out.println(arr[i]+"");
		    }
		
	}

}

