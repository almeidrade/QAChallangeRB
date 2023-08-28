package steps.Given.rightBalance;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriverException;

import base.Helpers;
import base.Hooks;
import base.TestBase;
import io.cucumber.java.en.Given;
import pages.rightBalance.Contact;
import pages.rightBalance.HomePage;

public class GivenStepsInterviewChallenge extends TestBase {
	
	public static String HEADER_BAR_PAGE; 
	
	@Given("the user is in {string} part of the main page")
	public void the_user_is_in_part_of_the_main_page(String fieldBar) throws InterruptedException {
		Hooks.closeBroser = false;
		HEADER_BAR_PAGE = fieldBar;
	    HomePage.clickBtnHomePageFieldBar(fieldBar);
	    TimeUnit.MILLISECONDS.sleep(1200); //added explicit sleeping to make it better viewing the actions on the page
	}
	
	@Given("the user is in the {string} page form")
	public void the_user_is_in_the_page_form(String fieldBar) throws InterruptedException {
	    HomePage.clickBtnHomePageFieldBar(fieldBar);
	    ArrayList<String> tabs = Helpers.getWindowTabs();
	    if (tabs.size() > 1) {
	    	Helpers.switchToTab(tabs.get(1));	    		  	
	    } else {
	    	throw new WebDriverException("Tab for 'Contact' page form not found!");
	    }
	    
	    TimeUnit.SECONDS.sleep(1); //added explicit sleeping to make it better viewing the actions on the page
	}
	
	@Given("the user is in the Report Malicious modal form")
	public void the_user_is_in_the_report_malicious_modal_form() throws InterruptedException {
		the_user_is_in_the_page_form("CONTACT");
		Helpers.Click(Contact.Footers.txtNeverSubmitPasswordsThroughThisForm(), DEFAULT_TIMEOUT_SECONDS);
		TimeUnit.MILLISECONDS.sleep(500); //added explicit sleeping to make it better viewing the actions on the page
	}
}