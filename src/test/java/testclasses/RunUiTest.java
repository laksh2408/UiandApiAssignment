package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.*;

public class RunUiTest extends BaseTest{
	
	@Test
	public void executeTest() throws IOException
	{
		LandingPage landingPage = new LandingPage(driver);
		ProductSearchPage productSearchPage = landingPage.searchItem("book");
		ItemListingPage itemListingPage = productSearchPage.selectFirstItem();
		PageBaseClass pageBaseClass = itemListingPage.addItemToCart();
		String NumberOfItems = pageBaseClass.validateCartCount();
		System.out.println("Number of items in cart : " + NumberOfItems);
		Assert.assertEquals(NumberOfItems, "1");
		System.out.println("Test Passed, Number of items in the cart have matched the expected number");		
	}
	

}
