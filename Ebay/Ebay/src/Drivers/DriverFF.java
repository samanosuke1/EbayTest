package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFF extends Driver {
	@Override
	public WebDriver instanceDriver() {
		driver = new FirefoxDriver();
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
