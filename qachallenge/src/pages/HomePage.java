package pages;
import org.openqa.selenium.By;
import base.Helpers;
import base.TestBase;
//import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Properties;

public class HomePage extends TestBase{			
	
	/*---------------------------------ELEMENTS---------------------------------*/ 
	public static By btnContactUs() {
		return By.id("contact-link");
	}	
	
	/*---------------------------------ACTIONS---------------------------------*/	
	public static void NavigateToHomePage(String UrlSite) throws IOException {
		Properties url = getProperty();
		Helpers.NavigateTo(url.getProperty(UrlSite));		
	}
	
	public static void ClickContactFormPage() {
		Helpers.Click(btnContactUs());
	}
}
