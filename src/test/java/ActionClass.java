import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

public static WebDriver driver;
//new code added
//new code added again
	
	public static void main(String args[]) {
	
	BrowserClass bc=new BrowserClass();
	driver=bc.launchBrowser("Chrome");
	bc.launchURL("https://spicejet.com");
	
	try {
	    Thread.sleep(3000);
	} catch (InterruptedException e) {

	    e.printStackTrace();
	}
	
	By links=By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8']");
	List<WebElement> ele=driver.findElements(links);
	
	for(WebElement ex:ele)
	{
		if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", ex);
	    }
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {

		    e.printStackTrace();
		}
	}
	
	/*By menuLink=By.xpath("//div[text()='Add-ons']");
	WebElement menulink=driver.findElement(menuLink);
	Actions act=new Actions(driver);
	act.moveToElement(menulink).perform();
	
	try {
	    Thread.sleep(3000);
	} catch (InterruptedException e) {

	    e.printStackTrace();
	}
	WebElement elem=driver.findElement(By.xpath("//div[text()='SpiceCafé']"));	
	if (driver instanceof JavascriptExecutor) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
    }
	//ele.click();*/
	
	
	}

}
