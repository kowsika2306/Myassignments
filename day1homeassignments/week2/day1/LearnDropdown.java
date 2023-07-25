package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
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
		
	   //using dropdown by index
		
		WebElement source= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(source);
		dropdown1.selectByIndex(4);
		
		// using dropdown by visible text
		
		WebElement marketing= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2 = new Select(marketing);
		dropdown2.selectByVisibleText("Automobile");
		
		//using by value
		
		WebElement ownership= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown3 = new Select(ownership);
		dropdown3.selectByValue("OWN_SCORP");
		
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kowsika2306@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9629034400");
		
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle();
		
	}

}
