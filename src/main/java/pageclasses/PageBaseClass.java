package pageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericMethods;

public class PageBaseClass extends GenericMethods {
	
	WebDriver driver;
	
	public PageBaseClass(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='gh-minicart-hover']//div//a//i")
	WebElement cartIcon;
	
	public String validateCartCount()
	{
		String countOfItem = cartIcon.getText();
		return countOfItem;
	}
   
	

}
