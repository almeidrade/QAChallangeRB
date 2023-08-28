package pages.rightBalance;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import base.Helpers;
import base.TestBase;

public class Contact extends TestBase{
	
	/*---------------------------------ELEMENTS Contact page---------------------------------*/	
	protected static class Headers {
		public static By txtContactRightBalance() {
			return By.xpath("//div[@class='relative width-full height-full']//*[@class='formName']");
		}
		
		public static By txtSubheaderTailoredStaffAugmentation() {
			return By.xpath("//div[@class='relative width-full height-full']//*[@class='formDescription break-word']");
		}
	}
	
	public static class Body {
		public static By txtName() {
			return By.xpath("//*[@class='title']/text()");
		}
		
		public static By fldName() {
			return By.xpath("//input[@type='text']");
		}
		
		public static By fldEmail() {
			return By.xpath("//input[@type='email']");
		}
		
		public static By fldEmailFilled() {
			return By.xpath("//a[@class='text-blue underline focus-visible']");
		}		
		
		public static By fldPhone() {
			return By.xpath("//input[@type='tel']");
		}
		
		public static By dpHowCanIHelpYou() {
			return By.xpath("//*[@class=\"truncate flex-auto\"]");
		}
		
		public static By dpHowCanIHelpYouTextField() {
			return By.xpath("//*[@class='border-box truncate pill px1 cellToken choiceToken line-height-4 inline-block orangeLight2 print-color-exact text-dark']");
		}
		
		public static By dpHowCanIHelpYouTextFieldSelected() {
			return By.xpath("//*[@class='flex-auto truncate-pre']");
		}
		
		public static By fldDetails() {
			return By.xpath("//*[@role='textbox']");
		}
	}
	
	public static class Footers {
		public static By txtNeverSubmitPasswordsThroughThisForm() {
			return By.xpath("//*[@class='mt2 quieter small']");			
		}			
	}
	
	public static class ReportAMaliciousFormModal {
		public static By radioButtonOther() {
			return By.xpath("//*[@class='flex items-center pointer']");
		}
		
		public static By fldReportMaliciousForm() {
			return By.xpath("//*[@class='border-box block width-full p2 white border-thick rounded-big line-height-5 mt2']");
		}
	}
	
	/*---------------------------------ACTIONS Contact page---------------------------------*/
	
	/*---SendKeys---*/
	public static void fillsInNameField(String nameToBefilled) throws InterruptedException {
		Helpers.SendKeys(Body.fldName(), nameToBefilled, DEFAULT_TIMEOUT_SECONDS);			
	}
	
	public static void fillsInEmailField(String emailToBefilled) throws InterruptedException {
		Helpers.SendKeys(Body.fldEmail(), emailToBefilled, DEFAULT_TIMEOUT_SECONDS);			
	}
	
	public static void fillsInPhoneField(String phoneToBefilled) throws InterruptedException {
		Helpers.SendKeys(Body.fldPhone(), phoneToBefilled, DEFAULT_TIMEOUT_SECONDS);			
	}	
	
	public static void fillsInDetailsField(String detailsToBefilled) throws InterruptedException {
		Helpers.SendKeys(Body.fldDetails(), detailsToBefilled, DEFAULT_TIMEOUT_SECONDS);			
	}
	
	public static void selectsAnOptionInDropDown(String optionToSelect) throws InterruptedException {
		clicksDropDown();
		Helpers.setSelenionActions()
			.sendKeys(optionToSelect)
			.sendKeys(Keys.ENTER).perform();
	}
	
	/*---clicks---*/
	public static void clicksDropDown() throws InterruptedException {
		Helpers.Click(Body.dpHowCanIHelpYou(), DEFAULT_TIMEOUT_SECONDS);
	}
	
	public static void clicksRadioButtonOther() throws InterruptedException {
		Helpers.Click(ReportAMaliciousFormModal.radioButtonOther(), DEFAULT_TIMEOUT_SECONDS);
	}
	
	/*---validations---*/
	public static void validateNameContactpage() throws Throwable {		
		assertTrue(!Helpers.GetText(Body.fldName(), "Value", DEFAULT_TIMEOUT_SECONDS).isEmpty());
	}
	
	public static void validateEmailContactpage() throws Throwable {
		assertTrue(!Helpers.GetText(Body.fldEmailFilled(), DEFAULT_TIMEOUT_SECONDS).isEmpty());
	}
	
	public static void validatePhoneContactpage() throws Throwable {
		assertTrue(!Helpers.GetText(Body.fldPhone(), "Value", DEFAULT_TIMEOUT_SECONDS).isEmpty());
	}
	
	public static void validateDropDownContactpage() throws Throwable {
		assertTrue(!Helpers.GetText(Body.dpHowCanIHelpYouTextFieldSelected(), DEFAULT_TIMEOUT_SECONDS).isEmpty());
	}
	
	public static void validateDetailsContactpage() throws Throwable {
		assertTrue(!Helpers.GetText(Body.fldDetails(), DEFAULT_TIMEOUT_SECONDS).isEmpty());
	}
	
	public static void validateTxtNeverSubmitPasswordsThroughThisForm(String expectedScreenDisplayedText) throws Throwable {
		assertEquals(expectedScreenDisplayedText, Helpers.GetText(Footers.txtNeverSubmitPasswordsThroughThisForm(), DEFAULT_TIMEOUT_SECONDS));
	}
}
