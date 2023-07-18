package week1.day2homeassignment;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int range=8;
       int firstNum=0;
       int secNum=1;
       int sum;
       System.out.println("The first number is :" + firstNum);
	
	  for (int i=1;i<=range;i++)
	{
		System.out.println(firstNum+ " ");
		sum = firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
	}
	}

}
