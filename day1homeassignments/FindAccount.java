package week2.day1homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Find Accounts")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("credit Limited Account");
		driver.findElement(By.xpath("(//button[text()='Find Accounts'])")).click();
		driver.findElement(By.xpath("//a[text()='Credit Limited Account']")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		WebElement fa = driver.findElement(By.xpath("(//input[@name='accountName'])[2]"));
		String names=fa.getAttribute("value");
		System.out.println(names);
		
		if(fa.equals("credit Limited Account"))
		{
			System.out.println("correct account name");
		}
		else
		{
			System.out.println("wrong account name");
		}
		
		WebElement d = driver.findElement(By.name("description"));
		System.out.println(d.getText());
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Edit Account|opentaps CRM" ))
		{
			System.out.println("the title of page is right!");
		}
		else
		{
			System.out.println("the title of page is wrong");
		}
		
	
	}

}
