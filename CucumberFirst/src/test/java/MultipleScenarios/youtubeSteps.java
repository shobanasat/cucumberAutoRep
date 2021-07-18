package MultipleScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class youtubeSteps {
	
	WebDriver driver;
	
	@Given ("^User is on the youtube page$")
	public void User_is_on_the_youtube_page () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shobana\\Cucumber Setup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
	}

	@Then ("^Verify page is loaded$")
	public void Verify_page_is_loaded() throws InterruptedException {
		driver.findElement(By.id("search"));
		Thread.sleep(1000);
	}
	
	@Then ("^close window$")
	public void close_window() {
		driver.quit();
		driver = null;
	}
}
