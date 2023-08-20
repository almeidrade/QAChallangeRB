package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {

	public enum DriverType {
		DESKTOP, MOBILE, WEB
	}

	public enum FrontEndType {
		ANDROID, IOS, CHROME, FIREFOX, IE, OPERA, SAFARI
	}

	public static DriverType DRIVERTYPE;
	public static FrontEndType FRONTENDTYPE;
	public static RemoteWebDriver driver;
	public String reportLocation = "./target";
	
	public static Properties getProperty() throws IOException {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/base/Domains.properties"));
		} catch (Exception e) {
			System.out.println("Exception:" + e);
		}
		return properties;
	}

	public static void SetDriverType(DriverType dt, FrontEndType fet) {

		DRIVERTYPE = dt;
		FRONTENDTYPE = fet;

		switch (DRIVERTYPE) {
		case MOBILE:
			switch (FRONTENDTYPE) {
			case ANDROID:
				// ToDo
				break;
			case IOS:
				// ToDo
				break;
			default:
				break;
			}
			break;
		case DESKTOP:
			switch (FRONTENDTYPE) {
			case IE:
				// ToDo
				break;
			case SAFARI:
				// ToDo
				break;
			default:
				break;
			}
		case WEB:
			switch (FRONTENDTYPE) {
			case CHROME:
//				ChromeOptions options = new ChromeOptions();				
//				  options.addArguments("--remote-allow-origins=*");
//				  options.addArguments("--disable-notifications"); 
//				  DesiredCapabilities dp = new DesiredCapabilities(); 
//				  dp.setCapability(ChromeOptions.CAPABILITY, options);
//				  options.merge(dp);				 
				 
				String projectPath = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", projectPath + "/src/support/Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				break;
			case FIREFOX:
				// ToDo
				break;
			case OPERA:
				// ToDo
				break;
			default:
				break;
			}
		default:
			break;
		}
	}	
}