package pageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericMethods;

public class ProductSearchPage extends GenericMethods {
	
	WebDriver driver;
	
	public ProductSearchPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul//li//div[@class='s-item__info clearfix']//a[@class='s-item__link']")
	WebElement firstItem;
	
	
	public ItemListingPage selectFirstItem()
	{
		clickOnElement(firstItem);
		ItemListingPage itemListingPage = new ItemListingPage(driver);
		return itemListingPage;
	}
	
	
	
	
	
	

}
