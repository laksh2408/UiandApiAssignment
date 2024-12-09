package pageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericMethods;

public class LandingPage extends GenericMethods {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement searchBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitBtn;
	
	
	public ProductSearchPage searchItem(String itemToSearch) 
	{
		sendTextToElement(searchBox, itemToSearch);
		pressEnter(searchBox);
		ProductSearchPage productSearchPage = new ProductSearchPage(driver);
		return productSearchPage;
	}
	
	
	
	
	
	

}
