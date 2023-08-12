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

public class AdministratorCertifications {

	public static void main(String[] args) throws IOException {
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
		//performing the window handle and redirect to another window
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		//1 0f 1 method not found check weather its in shadow root(open)
		//shadow root(open) in dom-->create shadow object
		Shadow shadowname = new Shadow(driver);//syntax for shadow root
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//learning 
		shadowname.findElementByXPath("//span[text()='Learning']").click();
		
		//performing mouse hover function and create action class
		WebElement learning = shadowname.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions act = new Actions(driver);
		act.moveToElement(learning).perform();
		WebElement certificate = shadowname.findElementByXPath("//a[text()='Salesforce Certification']");
		driver.executeScript("arguments[0].click();",certificate);
		
		
		//act.scrollToElement(certificate).click(certificate).perform();//scroll to the element
		driver.findElement(By.xpath("//a[text()='Administrator']")).click();
		
		//stores the all certifications names in list
		List<WebElement> listelements = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		
		//iterate the all values by using for loop
		for (int i=0;i<listelements.size();i++)
		{
			String certificatenames = listelements.get(i).getText();
			System.out.println(certificatenames);
		}

		//take screenshot
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File Snap= new File("./snap/administratorcertificates.jpeg");
		FileUtils.copyFile(screenshot, Snap);
		
		driver.close();

	}

	
}
