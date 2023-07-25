package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //launch the driver
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//using xpath locators
		//attribute based
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesmanager");
		//attribute based
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//collection based
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//partial attribute based xpath
		//driver.findElement(By.xpath("//form[contains(@id,'/logout')]")).click();
		//partial text based xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//text based
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		
	
		
		
	}

}
