import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesScript {

public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
	
	BrowserClass bc=new BrowserClass();
	driver=bc.launchBrowser("Chrome");
	bc.launchURL("http://www.londonfreelance.org/courses/frames/index.html");
	
	Thread.sleep(2000);
	
//	List<WebElement> lstFrames=driver.findElements(By.xpath("//frame"));
//	
//	for(WebElement e:lstFrames)
//	{
//		if (driver instanceof JavascriptExecutor) {
//	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", e);
//	    }
//	}
	
	driver.switchTo().frame("content");
	System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());;
	
	}

}
