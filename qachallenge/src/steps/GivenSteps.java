package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import pages.ContactUsPage;
import pages.HomePage;

public class GivenSteps extends TestBase {
	
	@Given("the user is in the home page of {string}")
	public void the_user_is_in_home_page(String UrlSite) throws Throwable {
		HomePage.NavigateToHomePage(UrlSite);
	}
	
	@Given("the user navigates to the contact form page")
	public void the_user_navigate_to_the_contact_form_page() throws Throwable {
		HomePage.ClickContactFormPage();
		ContactUsPage.validateLoggedContactUsPage("CUSTOMER SERVICE - CONTACT US");
	}
}
