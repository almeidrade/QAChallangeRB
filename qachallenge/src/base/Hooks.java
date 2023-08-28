package base;
import base.TestBase.DriverType;
import base.TestBase.FrontEndType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {	
	
	public static String testName;
	public static boolean closeBroser = true;
	
	@Before
	public static void testSetUp(Scenario scenario) {
		testName = scenario.getName();
		if (closeBroser) {
			TestBase.SetDriverType(DriverType.WEB, FrontEndType.CHROME);
		}
	}
	
	@After
	public static void testCleanup(Scenario scenario) {		
		if (closeBroser) {
			TestBase.driver.close();
			TestBase.driver.quit();			
		}
	}

}
