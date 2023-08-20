package steps;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.And;
import pages.ContactUsPage;
import pages.HomePage;

public class AndSteps {
	
	@And("selects an option in dropdown list")
	public void the_user_select_an_option_in_the_list() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2); //added explicit sleeping to make it better viewing
		ContactUsPage.selectSubjectHeadingList("1");
	}
	
	@And("fills all text fields properly")
	public void fills_all_text_fields_properly() throws InterruptedException {
		the_user_select_an_option_in_the_list();
		ContactUsPage.fillEmailAdress("lorem_ipsum@lorem.ipsum");
		ContactUsPage.fillOrderReference("lorem_ipsum.orderreference.lorem.ipsum");
		ContactUsPage.validateEmailSuccess();
		uploads_a_file();
		ContactUsPage.fillMessage("loremipsum loremipsum loremipsum loremipsum loremipsum");
	}
	
	@And("does not fill all text fields properly")
	public void does_not_fill_all_text_fields_properly() {
		ContactUsPage.fillOrderReference("lorem_ipsum.orderreference.lorem.ipsum");
		ContactUsPage.fillMessage("loremipsum loremipsum loremipsum loremipsum loremipsum");
	}
	
	@And("uploads a file")
	public void uploads_a_file() {
		String projectPath = System.getProperty("user.dir");
		String fileLocation = "/src/base/FileToBeAttachedToForm.txt";
	    ContactUsPage.inputFileToForm(projectPath + fileLocation);
	}	
	
	@And("fills the form in an improper way")
	public void fills_the_form_in_an_improper_way() {
		does_not_fill_all_text_fields_properly();
	}
}