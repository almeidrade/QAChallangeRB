package steps;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.ContactUsPage;

public class WhenSteps {
	@When("the user navigates to the login page")
	public void the_user_navigate_to_the_login_page() throws InterruptedException, Throwable {
		TimeUnit.SECONDS.sleep(2); //added explicit sleeping to make it better viewing	
	}
	
	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		ContactUsPage.clickSubimit();
	}
	
	@And("and fills the email field in an invalid way")
	public void and_fills_the_email_field_in_an_invalid_way() {
		ContactUsPage.fillEmailAdress("lorem_ipsumlorem.ipsum");
		ContactUsPage.fillOrderReference("lorem_ipsum.orderreference.lorem.ipsum");
	}
}
