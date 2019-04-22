package Drivers;

import org.openqa.selenium.WebDriver;

public class InstanceDriver {
public Driver genericDriver;
	
	public void getDriver(String browserName)
	{
		switch(browserName){
		case "ff":
			genericDriver = new DriverFF();
			break;
		case "chrome":
			genericDriver = new DriverChrome();
			break;
		}
		genericDriver.instanceDriver();
	}
	

	public WebDriver driver()
	{
		return genericDriver.driver();
	}
	
}
