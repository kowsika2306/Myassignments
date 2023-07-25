package week2.day1homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//create account
public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
	    driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    
	    
	    driver.findElement(By.xpath("//input[@id='groupNameLocal']"));
	    driver.findElement(By.xpath("//input[@id='officeSiteName']"));
	    driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("10000");
	    
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    Thread.sleep(3000);
	    driver.close();
	    
	    		
	    
	    
	    
		
	}

}
