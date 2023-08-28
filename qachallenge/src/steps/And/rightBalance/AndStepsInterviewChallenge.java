package steps.And.rightBalance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;

import io.cucumber.java.en.And;
import pages.rightBalance.Careers;
import pages.rightBalance.CaseStudies;
import pages.rightBalance.Contact;
import pages.rightBalance.HomePage;
import pages.rightBalance.Learn;
import pages.rightBalance.Team;
import steps.Given.rightBalance.GivenStepsInterviewChallenge;

public class AndStepsInterviewChallenge {
	@And("the header text element {string} is displayed")
	public void the_header_text_element_is_displayed(String expectedScreenDisplayedText) throws Throwable {			
		switch (GivenStepsInterviewChallenge.HEADER_BAR_PAGE) {
		case "HOME PAGE":
			HomePage.validateTxtMessage(expectedScreenDisplayedText);
			break;
		case "CASE STUDIES":
			CaseStudies.validateTxtMessage(expectedScreenDisplayedText);
			break;
		case "TEAM":
			Team.validateTxtMessage(expectedScreenDisplayedText);
			break;
		case "CAREERS":
			Careers.validateTxtMessage(expectedScreenDisplayedText);
			break;
		case "LEARN":
			Learn.validateTxtMessage(expectedScreenDisplayedText);
			break;
		default:
			throw new NoSuchElementException("Element not found!");
		}
	}
	
	@And("clicks the {string} radio button")
	public void clicks_the_radio_button(String string) throws InterruptedException {
	    Contact.clicksRadioButtonOther();
	    TimeUnit.SECONDS.sleep(1);
	}
}
