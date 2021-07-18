package MultipleStepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SharedClass {
	
	WebDriver driver;
	
	public WebDriver setup() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Shobana\\Cucumber Setup\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
}
