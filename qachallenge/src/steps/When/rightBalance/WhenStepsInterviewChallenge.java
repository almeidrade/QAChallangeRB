package steps.When.rightBalance;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;

import base.Helpers;
import base.TestBase;
import io.cucumber.java.en.When;
import pages.rightBalance.Careers;
import pages.rightBalance.CaseStudies;
import pages.rightBalance.Contact;
import pages.rightBalance.HomePage;
import pages.rightBalance.Learn;
import pages.rightBalance.Team;
import steps.Given.rightBalance.GivenStepsInterviewChallenge;

public class WhenStepsInterviewChallenge extends TestBase{
	
	@When("the user scrolls down until the text element {string} is displayed")
	public void the_user_scrolls_down_until_the_text_element_of_is_displayed(String screenDisplayedText) throws InterruptedException {
		switch (GivenStepsInterviewChallenge.HEADER_BAR_PAGE) {
		case "HOME PAGE":
			Helpers.ExecuteJavaScriptToScroll(HomePage.getPageWebElement(screenDisplayedText), DEFAULT_TIMEOUT_SECONDS);
			break;
		case "CASE STUDIES":
			Helpers.ExecuteJavaScriptToScroll(CaseStudies.getPageWebElement(screenDisplayedText), DEFAULT_TIMEOUT_SECONDS);
			break;
		case "TEAM":
			Helpers.ExecuteJavaScriptToScroll(Team.getPageWebElement(screenDisplayedText), DEFAULT_TIMEOUT_SECONDS);
			break;
		case "CAREERS":
			Helpers.ExecuteJavaScriptToScroll(Careers.getPageWebElement(screenDisplayedText), DEFAULT_TIMEOUT_SECONDS);
			break;
		case "LEARN":
			Helpers.ExecuteJavaScriptToScroll(Learn.getPageWebElement(screenDisplayedText), DEFAULT_TIMEOUT_SECONDS);
			break;
		default:
			throw new NoSuchElementException("Element not found!");
		}
		Thread.sleep(1000); //added explicit sleeping to make it better viewing the actions on the page
	}
	
	@When("the user fills in all the fields")
	public void the_user_fills_in_all_the_fields() throws InterruptedException {
	    Contact.fillsInNameField("Clayton Andrade");
	    TimeUnit.MILLISECONDS.sleep(1000); //added explicit sleeping to make it better viewing the actions on the page
	    
	    Contact.fillsInEmailField("andrade.clayton@hotmail.com");
	    TimeUnit.MILLISECONDS.sleep(500); //added explicit sleeping to make it better viewing the actions on the page
	    
	    Contact.fillsInPhoneField("+5541996014994");
	    TimeUnit.MILLISECONDS.sleep(500); //added explicit sleeping to make it better viewing the actions on the page	    
	    
	    Contact.selectsAnOptionInDropDown("Other");
	    
	    Contact.fillsInDetailsField("Challenge coding for QA Right Balance job opening :)");
	    TimeUnit.MILLISECONDS.sleep(2000); //added explicit sleeping to make it better viewing the actions on the page
	    	    
	}
}
