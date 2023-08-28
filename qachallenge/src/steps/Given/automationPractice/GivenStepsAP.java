package steps.Given.automationPractice;

import base.TestBase;
import io.cucumber.java.en.Given;
import pages.automationPractice.ContactUsPageAP;
import pages.automationPractice.HomePage;

public class GivenStepsAP extends TestBase {	
	@Given("the user navigates to the contact form page")
	public void the_user_navigate_to_the_contact_form_page() throws Throwable {
		HomePage.ClickContactFormPage();
		ContactUsPageAP.validateLoggedContactUsPage("CUSTOMER SERVICE - CONTACT US");
	}
}
