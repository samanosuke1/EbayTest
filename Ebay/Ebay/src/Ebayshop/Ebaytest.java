package Ebayshop;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import EbayComponents.EbayPage;

public class Ebaytest {
	public WebDriver driver;
	
	 @Before
	  public void createAndStartService() throws IOException {
		 File file=new File ("navegador/chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver();  
	  }

	@Test
	public void testGoogleSearch() throws InterruptedException {
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(3);
		EbayPage ebay = new EbayPage(driver);
		ebay.writesearch("zapatos");
		ebay.clicksearch();
		ebay.scrolltobrand();
		ebay.scrolloverbrand();
		ebay.selectPuma();
		ebay.scrolltolblresult();
		ebay.selectsize10();
		System.out.print(ebay.gettextresult());	
	
	}
	
}
