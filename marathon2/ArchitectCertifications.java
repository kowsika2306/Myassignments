package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws IOException, InterruptedException {

		//disable the chrome notifications
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//instantiation the browser control and login to salesforce application
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		
		//performing the window handle and redirect to another window
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		//1 0f 1 method not found check weather its in shadow root(open)
		//shadow root(open) in dom-->create shadow object
		Shadow shadowname = new Shadow(driver);//syntax for shadow root
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(2000);
		//learning 
		shadowname.findElementByXPath("//span[text()='Learning']").click();
		Thread.sleep(2000);
		WebElement learning = shadowname.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions act = new Actions(driver);
		act.moveToElement(learning).perform();
		/*
		 * //performing mouse hover function and create action class Actions act = new
		 * Actions(driver); WebElement learning =
		 * shadowname.findElementByXPath("//span[text()='Learning on Trailhead']");
		 * act.moveToElement(learning).perform();
		 */
		Thread.sleep(2000);
		WebElement certificate = shadowname.findElementByXPath("//a[text()='Salesforce Certification']");

		
		act.scrollToElement(certificate).click(certificate).perform();//scroll to the element
		
		WebElement salesforce = driver.findElement(By.xpath("//img[@alt='Salesforce<br/>Architect']"));
		act.moveToElement(salesforce).click(salesforce).perform();
		
		WebElement description = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text')]"));
		System.out.println("The Sales Architect summery:" + description.getText());
		
		//get the webelement text details and store in list and iterate through for loop
		List<WebElement> certificatenames = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for(int i=0;i<certificatenames.size();i++)
		{
			String certificatelist = certificatenames.get(i).getText();
			System.out.println(certificatelist);
		}

		//take screenshot
		File screenshot1 = driver.getScreenshotAs(OutputType.FILE);
		File Snap1= new File("./snap/architechurecertificates.jpeg");
		FileUtils.copyFile(screenshot1, Snap1);
		
		

	}
}