import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class WebDriverManager {
	
	public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
	
	BrowserClass bc=new BrowserClass();
	driver=bc.launchBrowser("Chrome");
	bc.launchURL("https://ishatrainingsolutions.com");
	
	
	By btnAdvanced=By.xpath("//button[@id='details-button']");
	By lnkProceed=By.id("proceed-link");
	By btnSignIn=By.xpath("//div[@class='form-group']/child::button");
	By eleQuestion=By.xpath("//div[@class='form-group']/child::label");
	By txtAnswer=By.name("answer");
	By btnValidate=By.xpath("//button[text()='VALIDATE']");
	By lnkMerchants=By.xpath("//a[text()='MERCHANTS']");
	By lstLanguage=By.xpath("//select[@name='language']");
	By lstLanguageNew=By.xpath("//select[@name='language']/option");
	
	//By links=By.tagName("a");
	
	ElementUtil eleutil=new ElementUtil(driver);
	eleutil.doClick(btnAdvanced);
	eleutil.doClick(lnkProceed);
	eleutil.doClick(btnSignIn);
	Thread.sleep(2000);
	String str=eleutil.doGettext(eleQuestion);
	String strAnswer="";
	if(str.equals("What is Your Father Name ?"))
	{
		strAnswer="father";
	}
	else if(str.equals("What is Your Mother name ?"))
	{
		strAnswer="mother";
	}
	else
	{
		strAnswer="india";
	}

	//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	eleutil.doSendkeys(txtAnswer, strAnswer);
	eleutil.doClick(btnValidate);
	Thread.sleep(2000);
	eleutil.doClick(lnkMerchants);
	Thread.sleep(2000);
	eleutil.doSelectValueByVisibleText(lstLanguage, "English");
	eleutil.doPrintDropdownValues(lstLanguage);
	eleutil.doSelectDropdownValueWithoutSelectClass(lstLanguageNew, "Telugu");
	
	
	

	


	
	
	//bc.quitBrowser();
	
	
	
	}
	

	
	
	
}
