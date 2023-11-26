import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
	
	BrowserClass bc=new BrowserClass();
	driver=bc.launchBrowser("Chrome");
	bc.launchURL("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	Thread.sleep(2000);
	
	By rightclick=By.xpath("//span[text()='right click me']");
	WebElement ele=driver.findElement(rightclick);
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	
	Thread.sleep(1000);
	
	By allEle=By.xpath("//ul[@class='context-menu-list context-menu-root']//span");
	List<WebElement> lst=driver.findElements(allEle);
	for(WebElement e: lst)
	{
		if(e.getText().equalsIgnoreCase("Copy"))
		{
			e.click();
		}
	}
	
	
	
	}

}
