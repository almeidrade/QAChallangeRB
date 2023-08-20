package pages;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import base.Helpers;
import base.TestBase;

public class ContactUsPage extends TestBase {
	/*---------------------------------ELEMENTS---------------------------------*/
	private static By txtContactBreadCrumb() {
		return By.xpath("//*[@id='center_column']/h1");
	}
	
	private static By cmbxSubjectHeading() {
		return By.id("id_contact");
	}
	
	private static By fldEmail() {
		return By.id("email");
	}
	
	private static By fldOrderReference() {
		return By.id("id_order");
	}
	
	private static By fldMessage() {
		return By.id("message");
	}
	
	private static By btnSubmit() {
		return By.id("submitMessage");
	}
	
	private static By chkEmailOk() {
		return By.xpath("//*[contains(@class, 'form-group form-ok')]");
	}
	
	private static By chkEmailNotOk() {
		return By.xpath("//*[contains(@class, 'form-group form-error')]");
	}
	
	private static By iptFileElememt() {
		return By.id("fileUpload");
	}
	
	private static By txtMessageSentSuccess() {
		return By.xpath("//*[contains(@class, 'alert alert-success')]");
	}
	
	private static By txtMessageSentError() {
		return By.xpath("//*[contains(@class, 'alert alert-danger')]/p");
	}		
	/*---------------------------------ACTIONS---------------------------------*/
	public static String getHeaderTextContactUs() throws Throwable {
		int timeoutSeconds = 5;
		return Helpers.GetText(txtContactBreadCrumb(), timeoutSeconds);
	}
	
	public static void selectDropBox(String pickedOption) {
		Helpers.Select(cmbxSubjectHeading(), pickedOption);
	}
	
	public static void fillEmailAdress(String email) {
		Helpers.SendKeys(fldEmail(), email);
	}
	
	public static void fillOrderReference(String orderReference) {
		Helpers.SendKeys(fldOrderReference(), orderReference);
	}
	
	public static void fillMessage(String message) {
		Helpers.SendKeys(fldMessage(), message);
	}
	
	public static void clickSubimit() {
		Helpers.Click(btnSubmit());
	}	
	
	public static void validateEmailSuccess() throws InterruptedException {
		int timeoutSeconds = 5;
		assertTrue(Helpers.ElementExists(chkEmailOk(), timeoutSeconds));
	}
	
	public static void validateEmailFail() throws InterruptedException {
		int timeoutSeconds = 5;
		assertTrue(Helpers.ElementExists(chkEmailNotOk(), timeoutSeconds)); 
		}
	
	public static void inputFileToForm(String fileLocation) {
		Helpers.AttachFileToWebPage(iptFileElememt(), fileLocation);
	}
	
	public static String getMessageSentSuccess() throws Throwable {
		int timeoutSeconds = 5;
		return Helpers.GetText(txtMessageSentSuccess(), timeoutSeconds);
	}
	
	public static String getMessageSentError() throws Throwable {
		int timeoutSeconds = 5;
		return Helpers.GetText(txtMessageSentError(), timeoutSeconds);
	}
	
	public static void validateLoggedContactUsPage(String expectedMessage) throws Throwable {
		assertTrue(!getHeaderTextContactUs().isEmpty());
		assertEquals(expectedMessage, getHeaderTextContactUs());
	}
	
	public static void selectSubjectHeadingList(String pickedOption) {
		selectDropBox(pickedOption);
	}
	
	public static void validateMessageSent(String typeMessage, String expectedMessage) throws Throwable {				
		if (typeMessage.equals("success")) {
			 assertEquals(expectedMessage, getMessageSentSuccess());
		} else {
			assertEquals(expectedMessage, getMessageSentError());
		}		
	}
	
}