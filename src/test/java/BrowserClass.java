import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserClass {
	
	WebDriver driver;
	
	
	public WebDriver launchBrowser(String browser)
	{
		//String ="Chrome";
		//String title;
		
		switch(browser)
		{
		case "Chrome":
			 driver =new ChromeDriver();
			 driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			// driver.get("http://ishatrainingsolutions.com");
			// driver.findElement(By.xpath("//button[@id='details-button']")).click();
			// driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
			// title= driver.getTitle();
			// System.out.println(title);
			// driver.quit();
			 return driver;
			 //break;
			 
		case "Firefox":
			 driver =new FirefoxDriver();
			 driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 driver.get("http://ishatrainingsolutions.com");
			 driver.findElement(By.xpath("//button[@id='details-button']")).click();
			 driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
			 return driver;
			// break;
			
		default:
			System.out.println("Please enter correct browser");
			return driver;
			 
		}
	}
	
	public void launchURL(String url)
	{
		driver.get(url);
	}
	
	public String getTitle() {
		
		return driver.getTitle();
	}
	
	public String getURL()
	{
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		
		driver.quit();
	}


}
