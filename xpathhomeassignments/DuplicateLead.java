package week2.xpathhomeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("(//input[@name='emailAddress'])[1]")).sendKeys("kowsika2306@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(6000);
		
		String textname = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a")).getText();
		System.out.println(textname);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		//get title
		String duplicatetitle = driver.getTitle();
		System.out.println(duplicatetitle);
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String verifyname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(verifyname);
		if(verifyname.equals(textname))
		{
			System.out.println("Lead name is verified");
		}
		else
		{
			System.out.println("Lead name not match");
		}
		driver.close();
		
		
		
		
		
		

	}

}
