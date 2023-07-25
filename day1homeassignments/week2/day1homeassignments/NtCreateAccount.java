package week2.day1homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NtCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		driver.findElement(By.id("accountName")).sendKeys("TestLeaf");
		
		WebElement currency = driver.findElement(By.id("currencyUomId"));
		Select dropdown1=new Select(currency);
		dropdown1.selectByValue("INR");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select dd = new Select(industry);
		dd.selectByVisibleText("Health Care");
		
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select dd1 = new Select(owner);
		dd1.selectByVisibleText("Corporation");

		
		driver.findElement(By.name("description")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("CURRENCY");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("SITE DEVICE");
		driver.findElement(By.xpath("//input[@class='inputBox'][5]")).sendKeys("25000");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(5000);
		
		WebElement message = driver.findElement(By.className("errorMessageHeader"));
		System.out.println(message.getText());
		
		WebElement message1 = driver.findElement(By.className("errorMessage"));
		System.out.println(message1.getText());
		

	}

}
