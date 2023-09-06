package generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public RemoteWebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void configuration(String browser) throws Throwable {
		URL url = new URL("http://192.168.164.1:4444/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		if (browser.equalsIgnoreCase("chrome")) {
			cap.setPlatform(Platform.WINDOWS);
			cap.setBrowserName("chrome");
		} else if (browser.equalsIgnoreCase("edge")) {
			cap.setPlatform(Platform.WINDOWS);
			cap.setBrowserName("edge");
		}
		driver = new RemoteWebDriver(url,cap);
	}

}
