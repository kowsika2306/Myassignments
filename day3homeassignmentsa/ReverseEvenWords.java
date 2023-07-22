package week1.day3homeassignmentsa;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//output--I ma a erawtfos tester
		String test = "I am a software tester"; 
		
		String arr[]= test.split("");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==1)
			{
				char[] charArray=arr[i].toCharArray();
				for(int j=charArray.length-2;j>=0;j--)
				{
					System.out.print(charArray[j]);
				}
			}
			else
			{
				System.out.print(""+arr[i]+"");
			}
		
		}
	}

}
