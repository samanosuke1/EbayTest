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
	public By cborderasc;
	
	//var for result list ascendet
	
	public By resultlist1;
	public By resultlist2;
	public By resultlist3;
	public By resultlist4;
	public By resultlist5;
	
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
		cborderasc = By.xpath(Ebaylocator.optionascendent);
		
		//variables result list of order ascendent
		
		resultlist1 = By.xpath(Ebaylocator.resultlist1);
		resultlist2 = By.xpath(Ebaylocator.resultlist2);
		resultlist3 = By.xpath(Ebaylocator.resultlist3);
		resultlist4 = By.xpath(Ebaylocator.resultlist4);
		resultlist5 = By.xpath(Ebaylocator.resultlist5);
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
	
	public String gettextlistresult1(){
		String text = driver.findElement(resultlist1).getText();
		return text;
	}
	
	public String gettextlistresult2(){
		String text = driver.findElement(resultlist2).getText();
		return text;
	}
	
	public String gettextlistresult3(){
		String text = driver.findElement(resultlist3).getText();
		return text;
	}
	
	public String gettextlistresult4(){
		String text = driver.findElement(resultlist4).getText();
		return text;
	}
	
	public String gettextlistresult5(){
		String text = driver.findElement(resultlist5).getText();
		return text;
	}
	
	public void mouseoverorder(){
		mouseover(driver, cmborder);
		clickcomponent(driver, cborderasc);
	}
	
	public void scrolloverbrand(){
		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		event.executeScript("document.querySelector('#w3-w0-w2-w2 > ul').scroll(0,100)");
	}
	
	
}
