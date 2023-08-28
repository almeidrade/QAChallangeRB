package steps.And.automationPractice;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.And;
import pages.automationPractice.ContactUsPageAP;

public class AndSteps {
	
	@And("selects an option in dropdown list")
	public void the_user_select_an_option_in_the_list() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2); //added explicit sleeping to make it better viewing the actions on the page
		ContactUsPageAP.selectSubjectHeadingList("1");
	}
	
	@And("fills all text fields properly")
	public void fills_all_text_fields_properly() throws InterruptedException {
		the_user_select_an_option_in_the_list();
		ContactUsPageAP.fillEmailAdress("lorem_ipsum@lorem.ipsum");
		ContactUsPageAP.fillOrderReference("lorem_ipsum.orderreference.lorem.ipsum");
		ContactUsPageAP.validateEmailSuccess();
		uploads_a_file();
		ContactUsPageAP.fillMessage("loremipsum loremipsum loremipsum loremipsum loremipsum");
	}
	
	@And("does not fill all text fields properly")
	public void does_not_fill_all_text_fields_properly() throws InterruptedException {
		ContactUsPageAP.fillOrderReference("lorem_ipsum.orderreference.lorem.ipsum");
		ContactUsPageAP.fillMessage("loremipsum loremipsum loremipsum loremipsum loremipsum");
	}
	
	@And("uploads a file")
	public void uploads_a_file() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		String fileLocation = "/src/base/FileToBeAttachedToForm.txt";
	    ContactUsPageAP.inputFileToForm(projectPath + fileLocation);
	}	
	
	@And("fills the form in an improper way")
	public void fills_the_form_in_an_improper_way() throws InterruptedException {
		does_not_fill_all_text_fields_properly();
	}
}