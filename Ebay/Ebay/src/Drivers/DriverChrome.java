package Drivers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChrome extends Driver {

	@Override
	public WebDriver instanceDriver() {
		File file=new File ("navegador/chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver(); 
		return driver;
	}

	@Override
	public WebDriver driver() {
		// TODO Auto-generated method stub
		return driver;
	}

	@Override
	public void freeDrive() {
		// TODO Auto-generated method stub
		driver.quit();
	}

}
