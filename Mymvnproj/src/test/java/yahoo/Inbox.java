package yahoo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class,MethodListener.class })
public class Inbox 
{
	WebDriver driver;
	
	{
        System.setProperty("atu.reporter.config", "e:/online_sep_16/atu.properties");
    }
	
    public Inbox(WebDriver d)
    {
    	driver=d;
    }
	public void deletemail()
	{
		//driver.findElement(By.xpath("(//input[@name='mid'])[position()=5]")).click();
		//OR
		List<WebElement> lst=driver.findElements(By.xpath("//input[@name='mid']"));
		lst.get(4).click();
		driver.findElement(By.id("top_delete")).click();
		
		
		
	}
}
