package Utilitarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class ActionsBase {
	
	public void clickcomponent(WebDriver driver, By idcomponent){
		WebElement element = driver.findElement(idcomponent);
		element.click();
	}
	
	public void sendkeys(WebDriver driver, By Idinput, String textToType){
		WebElement input = driver.findElement(Idinput);
		input.sendKeys(textToType);
	}
	
	public void moverScrolltoelement(WebDriver driver, By locatorNoVisible) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(locatorNoVisible));
	}
	
	public void Scroll(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("scroll(0,-100)");
	}
		
}