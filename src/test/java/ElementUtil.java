import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	 
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public void doSendkeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}

	public String doGettext(By locator)
	{
		return getElement(locator).getText();
	}
	
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public List<WebElement> getElements(By locator){
		
		return driver.findElements(locator);
		
	}
	
	public List<String> getAllLinksText(By locator)
	{
		List<WebElement> iLinks=getElements(locator);
		List<String> iList=new ArrayList<String>();
		for(WebElement e:iLinks)
		{
			if(!e.getText().isEmpty())
			{
				iList.add(e.getText());
			}
		}
		return iList;
	}
	
	public void printElementsText(By locator)
	{
	
	getAllLinksText(locator).stream().forEach(e -> System.out.println(e));
	
	}
	
	public void doSelectValueByIndex(By locator, int index)
	{
		WebElement lstvalue=getElement(locator);
		Select slt=new Select(lstvalue);
		slt.selectByIndex(index);
	}
	public void doSelectValueByVisibleText(By locator, String vtext)
	{
		WebElement lstvalue=getElement(locator);
		Select slt=new Select(lstvalue);
		slt.selectByVisibleText(vtext);
	}
	public void doSelectValueByValue(By locator, String value)
	{
		WebElement lstvalue=getElement(locator);
		Select slt=new Select(lstvalue);
		slt.selectByValue(value);
	}
	
	public List<String> doGetDropdownListValues(By locator)
	{
		
		Select lstvalue=new Select(getElement(locator));
		List<WebElement> lstElements=lstvalue.getOptions();
		List<String> lstValues=new ArrayList<String>();
		for(WebElement e:lstElements)
		{
			lstValues.add(e.getText());
		}
		return lstValues;
		
	}
	
	public void doPrintDropdownValues(By locator)
	{
		doGetDropdownListValues(locator).stream().forEach(e -> System.out.println(e));
		
	}
	
	public void doSelectDropdownListValue(By locator,String value)
	{
		
		Select lstvalue=new Select(getElement(locator));
		List<WebElement> lstElements=lstvalue.getOptions();
		for(WebElement e:lstElements)
		{
			if(e.getText().equalsIgnoreCase(value))
			{
				e.click();
				break;
			}
		}
		
	}
	
	
	
	public void doSelectDropdownValueWithoutSelectClass(By locator,String value)
	{
		List<WebElement> langValues=getElements(locator);
		for(WebElement e:langValues)
		{
			if(e.getText().equalsIgnoreCase(value))
			{
				e.click();
				break;
			}
		}
		
	}
}

