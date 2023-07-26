package week2.xpathhomeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("arjun");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("reddy");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("kutty");
		driver.findElement(By.xpath("//input[@name='lastNameLocal']")).sendKeys("m");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("testing");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("WE ARE THE SOFTWARE TESTER");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("kowsika2306@gmail.com");
		
		WebElement states = driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
		Select ss = new Select(states);
		ss.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("All works going to finalize");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String titlenew = driver.getTitle();
		System.out.println(titlenew);
			
	}

}
