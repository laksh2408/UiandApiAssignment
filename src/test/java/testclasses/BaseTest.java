package testclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadExcelData;

public class BaseTest {
	
	WebDriver driver;

	public WebDriver initializeDriver() throws IOException
	{
		String browser = ReadExcelData.readData(1, 0, System.getProperty("user.dir")+ "\\testdata\\testdatasheet.xlsx");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
		WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Browser not Supported");
			System.exit(0);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		System.out.println("Opening the Browser...");
		return driver;
	}
	
	@BeforeTest
	public void launchUrl() throws IOException
	{
		String url = ReadExcelData.readData(1, 1, System.getProperty("user.dir")+ "\\testdata\\testdatasheet.xlsx");
		driver = initializeDriver();
		driver.get(url);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.manage().deleteAllCookies();
		driver.quit();
		System.out.println("Closing all Windows!");
	}
	

}
