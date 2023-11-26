import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpClass {
	
	
public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
	
	BrowserClass bc=new BrowserClass();
	driver=bc.launchBrowser("Chrome");
	bc.launchURL("https://mail.rediff.com/cgi-bin/login.cgi");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("proceed")).click();
	
	Thread.sleep(1000);
	
	Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	
	}

}
