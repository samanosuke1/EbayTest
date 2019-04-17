package EbayComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilitarios.ActionsBase;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EbayPage extends ActionsBase{

	WebDriver driver;
	public By txtsearch;
	public By btnSearch;
	public By sectionbrand;
	public By txtbrand;
	public By chkpuma;
	public By chksize;
	public By lblresult;
	public By cmborder;
	
	public EbayPage(WebDriver driver){
		this.driver=driver;
		setlocators();
	}

	private void setlocators() {
		txtsearch= By.id(Ebaylocator.textboxsearch);
		btnSearch=By.id(Ebaylocator.btnsearch);
		sectionbrand = By.xpath(Ebaylocator.checkboxbrand);
		txtbrand = By.id(Ebaylocator.textbrand);
		chkpuma = By.xpath(Ebaylocator.checkboxpuma);
		chksize = By.xpath(Ebaylocator.checksize);
		lblresult = By.xpath(Ebaylocator.lblrestultado);
		cmborder = By.xpath(Ebaylocator.comboorderby);
	}
	
	public void waitForElement(By expectedLocator, int TIMEOUT) {
		Wait<WebDriver> wait = new WebDriverWait(driver,TIMEOUT);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(expectedLocator));
	}
	
	public void writesearch(String text){
		sendkeys(driver, txtsearch, text);
	}
	
	public void clicksearch(){
		clickcomponent(driver, btnSearch);
		waitForElement(lblresult, 4);
	}
	
	public void scrolltobrand(){
		moverScrolltoelement(driver, txtbrand);
	}
		
	public void selectPuma(){
		clickcomponent(driver, chkpuma);
	}
	
	public void scrolltolblresult(){
		moverScrolltoelement(driver, lblresult);
		waitForElement(lblresult,2);
	}
	
	public String gettextresult(){
		String result= driver.findElement(lblresult).getText();
		return result;
	}
	
	public void selectsize10(){
		clickcomponent(driver, chksize);
	}
	
	public void scrolloverbrand(){
	EventFiringWebDriver event = new EventFiringWebDriver(driver);
	event.executeScript("document.querySelector('#w3-w0-w2-w2 > ul').scroll(0,100)");
	}
	
	
}
