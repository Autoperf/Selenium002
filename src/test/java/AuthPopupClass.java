import org.openqa.selenium.WebDriver;

public class AuthPopupClass {

public static WebDriver driver;
	
	public static void main(String args[]) {
	
	BrowserClass bc=new BrowserClass();
	driver=bc.launchBrowser("Chrome");
	bc.launchURL("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	
	}

}
