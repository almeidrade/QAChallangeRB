package pages.rightBalance;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import base.Helpers;

public class Careers {
	private static final int DEFAULT_TIMEOUT_SECONDS = 5;
	
	/*---------------------------------ELEMENTS Case Studies page---------------------------------*/
	protected static class Headers {
		public static By txtLastJobYoullEverNeed() {
			return By.xpath("//*[@class='header-heading' and contains(text(),'Last job you’ll ever need')]");
		};
		//...
		//...
	}
	
	protected static class Body {
		//... ToDo
		//... ToDo
	}
	
	protected static class Footers {
		public static By txtJoinRightBalance() {
			return By.xpath("//div[@class='cta-heading']");
		}
		public static By btnApply() {
			return By.xpath("//div[@class='cta']//button[@class='cta-button']");
		}
		//...
		//...
	}	
	
	/*---------------------------------ACTIONS Case Studies page---------------------------------*/
	/*---getWebElement---*/
	public static WebElement getPageWebElement(String screenDisplayedText) throws InterruptedException {
		switch (screenDisplayedText) {
		case "JOIN RIGHT BALANCE":
			return Helpers.getsWebElement(Footers.txtJoinRightBalance(), DEFAULT_TIMEOUT_SECONDS);
		case "APPLY":
			return Helpers.getsWebElement(Footers.btnApply(), DEFAULT_TIMEOUT_SECONDS);
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
		case "LAST JOB YOU'LL EVER NEED":
			expectedScreenDisplayedText = expectedScreenDisplayedText.contains("'") ?  expectedScreenDisplayedText.replace("'", "’") : expectedScreenDisplayedText;
			assertEquals(expectedScreenDisplayedText, Helpers.GetText(Headers.txtLastJobYoullEverNeed(), DEFAULT_TIMEOUT_SECONDS));
			break;
		case "APPLY":
			assertEquals(expectedScreenDisplayedText, Helpers.GetText(Footers.btnApply(), DEFAULT_TIMEOUT_SECONDS));
			break;
		default:
			throw new NoSuchElementException("No such element found!");
		}		
	}
}
