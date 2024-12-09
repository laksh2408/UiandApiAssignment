package pageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericMethods;

public class ItemListingPage extends GenericMethods {
	
	WebDriver driver;
	
	public ItemListingPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'vim x-atc-action')]")
	WebElement addToCartBtn;
	
	
	public PageBaseClass addItemToCart()
	{
		switchWindow();
		clickOnElement(addToCartBtn);
		PageBaseClass pageBaseClass = new PageBaseClass(driver);
		return pageBaseClass;
	}
	
	
	
	
	
	

}
