package utilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	
	WebDriver driver;
	
	public GenericMethods(WebDriver driver)
	{
	   this.driver = driver;	
	}
	
	public void waitForElement(WebElement locator) 
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void clickOnElement(WebElement locator)
	{
		waitForElement(locator);
		locator.click();
	}
	
	public void sendTextToElement(WebElement locator, String data)
	{
		waitForElement(locator);
		locator.sendKeys(data);
	}
	
	public void switchWindow()
	{
		Set<String> allWindowHandles = driver.getWindowHandles();
	    String currentWindow = driver.getWindowHandle();
	    for (String windowHandle : allWindowHandles) 
	    {
	       if (!windowHandle.equals(currentWindow)) {
	          driver.switchTo().window(windowHandle);
	          break; }
	   }
	}
	
	public void clickOnElementUsingJS(WebElement locator)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", locator);
	}
	
	public void pressEnter(WebElement locator)
	{
		 Actions actions = new Actions(driver);
	     actions.moveToElement(locator).sendKeys(Keys.ENTER).perform();
	}
	
	

}
