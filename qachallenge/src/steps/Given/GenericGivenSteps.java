package steps.Given;

import base.TestBase;
import io.cucumber.java.en.Given;
import pages.automationPractice.HomePage;

public class GenericGivenSteps extends TestBase{
	@Given("the user is in the home page of {string}")
	public void the_user_is_in_home_page(String UrlSite) throws Throwable {
		HomePage.NavigateToHomePage(UrlSite);
	}
}
