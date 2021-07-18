package MultipleScenarios;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSteps {
	
	WebDriver driver;
	
	@Given ("^User is in google page$")
	public void User_is_in_google_page() throws InterruptedException {
		System.setProperty("\"webdriver.chrome.driver\"", "C:\\Shobana\\Cucumber Setup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
	}
	
	@When ("^User enters search \"([^\"]*)\" word$")
	public void User_enters_search_word(String word) throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(word);
		Thread.sleep(1000);
	}
	
	@Then ("^search word \"([^\"]*)\" is available$")
	public void search_is_available(String word) throws InterruptedException {
		String actualSearchWord = driver.findElement(By.name("q")).getAttribute("value");
		Assert.assertEquals(word, actualSearchWord);
		Thread.sleep(1000);
	}
	
	@Then ("^close browser$")
	public void close_browser() {
		driver.quit();
		driver = null;
	}

}
