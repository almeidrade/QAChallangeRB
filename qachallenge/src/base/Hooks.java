package base;

import base.TestBase.DriverType;
import base.TestBase.FrontEndType;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public static void testSetUp() {
		TestBase.SetDriverType(DriverType.WEB, FrontEndType.CHROME);		
	}
	
	@After
	public static void testCleanup() {
		TestBase.driver.close();
		TestBase.driver.quit();
	}

}
