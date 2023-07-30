package week2.day4homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node0u6sjm72dovsyzfrsq5kjqlc393322.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement tables = driver.findElement(By.xpath("//div[@id='form:j_idt89']"));
		System.out.println(tables.getSize());
		
		List<WebElement> tablerows =driver.findElements(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']//tr"));
        List<WebElement> tablecolumn = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//th"));
        System.out.println("tablerows are :" + tablerows.size());
        System.out.println("tablerows are :" + tablecolumn.size());
        
        List<String> rows=new ArrayList<String>();
        for(int i=0;i<tablerows.size();i++)
        {
        	String text = tablerows.get(i).getText();
        	rows.add(text);
        }
        System.out.println(rows);
        
        
	}

}
