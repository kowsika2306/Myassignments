package week1.day4homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditUpdate {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//using locators
		driver.findElement(By.id("username")).sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//using linktext
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//company name.firstname,lastname,email,phonenumber
		
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kowsika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("murugaiyan");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kowsika2306@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9629034400");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.name("submitButton")).click();

	}

}
