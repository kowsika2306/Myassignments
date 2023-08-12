package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.openqa.selenium.support.ui.Select;


import io.github.sukgu.Shadow;

public class ServiceNowOrderMobile {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//disable the chrome notifications
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
       //instantiation the browser control and login to salesforce application
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://dev146490.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//valid credentials for login to application
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Uouh$-9J2cIU");
		driver.findElement(By.id("sysverb_login")).click();
		
		//shadow root elements
		Shadow Shadows = new Shadow(driver);
		Shadows.setImplicitWait(20);
		Shadows.findElementByXPath("//div[text()='All']").click();
		Shadows.setImplicitWait(10);
		Shadows.findElementByXPath("//input[@id='filter']").sendKeys("Service Catalog");
		Shadows.findElementByXPath("//mark[text()='Service Catalog']").click();
		
		driver.switchTo().frame(Shadows.findElementByXPath("//iframe[@id='gsft_main']"));
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		
		driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
		WebElement dd = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select dd1 = new Select(dd);
		dd1.selectByValue("unlimited");
		
		driver.findElement(By.xpath("//label[text()='Graphite']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'512 GB')]")).click();
		driver.findElement(By.xpath("//button[@name='oi_order_now_button']")).click();
		
		driver.findElement(By.xpath("//span[text()='Thank you, your request has been submitted']"));
		//span[text()='Thank you, your request has been submitted']
		
		String summery = driver.findElement(By.xpath("//div[@class='order_summary']")).getText();
		System.out.println(summery);
		
		if(summery.equals("Thank you, your request has been submitted"))
		{
			System.out.println("your order was successfully placed and track your order with request number");
		}
		
		String text = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
		
		System.out.println("The request number is :" + text);
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File snaps = new File("./snap/mobileorder.jpeg");
		FileUtils.copyFile(screenshotAs, snaps);
		driver.close();
		
	}

}
