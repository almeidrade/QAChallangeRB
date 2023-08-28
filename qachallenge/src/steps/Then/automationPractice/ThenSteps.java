package steps.Then.automationPractice;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.Then;
import pages.automationPractice.ContactUsPageAP;

public class ThenSteps {
	@Then("then the {string} message {string} is displayed to the customer")
	public void then_the_message_is_displayed_to_the_customer(String typeMessage, String message) throws Throwable {
	    ContactUsPageAP.validateMessageSent(typeMessage, message);
	    TimeUnit.SECONDS.sleep(3); //added explicit sleeping to make it better viewing the actions on the page
	}
	
	@Then("the email field is highlited warning an error")
	public void the_email_field_is_highlited_warning_an_error() throws InterruptedException {
		ContactUsPageAP.validateEmailFail();
		TimeUnit.SECONDS.sleep(3); //added explicit sleeping to make it better viewing the actions on the page
	}
}
