package pages.rightBalance;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import base.Helpers;

public class Learn {
	private static final int DEFAULT_TIMEOUT_SECONDS = 5;
	
	/*---------------------------------ELEMENTS Case Studies page---------------------------------*/
	protected static class Headers {
		public static By txtLearning() {
			return By.xpath("//div[@class='header-heading']");
		}		
		//... 
		//... 
	}
	
	protected static class Body {
		//... 
		//... 	
	}
	
	protected static class Footers {
		public static By txtForTechsByTechs() {
			return By.xpath("//div[@class='cta-heading']");
		}
		public static By btnLetsChat() {
			return By.xpath("//button[@class='cta-button']");			
		}
		//... 
		//... 
	}	
	
	/*---------------------------------ACTIONS Case Studies page---------------------------------*/
	/*---getWebElement---*/
	public static WebElement getPageWebElement(String screenDisplayedText) throws InterruptedException {
		switch (screenDisplayedText) {
		case "FOR TECHNOLOGISTS BY TECHNOLOGISTS":
			return Helpers.getsWebElement(Footers.txtForTechsByTechs(), DEFAULT_TIMEOUT_SECONDS);		
		//...
		//...	
		default:
			throw new NoSuchElementException("No such element found!");
		}
	}
	
	/*---clicks---*/
	public static void clickBtnWebElement(String elementTxtToClick) throws InterruptedException {
		switch (elementTxtToClick) {
		case "":			
			//... ToDo		
		default:
			throw new NoSuchElementException("Element not found!");
		}		
	}
	
	/*---validations---*/
	public static void validateTxtMessage(String expectedScreenDisplayedText) throws Throwable {
		expectedScreenDisplayedText = expectedScreenDisplayedText.contains("�") ?  expectedScreenDisplayedText.replace("�", "'") : expectedScreenDisplayedText;
		switch (expectedScreenDisplayedText) {
		case "LEARNING":
			assertEquals(expectedScreenDisplayedText, Helpers.GetText(Headers.txtLearning(), DEFAULT_TIMEOUT_SECONDS));
			break;
		case "LET'S CHAT":			
			assertEquals(expectedScreenDisplayedText, Helpers.GetText(Footers.btnLetsChat(), DEFAULT_TIMEOUT_SECONDS));
			break;
		default:
			throw new NoSuchElementException("No such element found!");
		}		
	}
}
