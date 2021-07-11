package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class firstFeature {
	
	WebDriver driver;

	@Given("^User need to be on facebook login page$")
	public void User_need_to_be_on_facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Shobana\\Cucumber Setup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@When("^User enters first name$")
	public void User_enters_first_name () {
	
		driver.findElement(By.id("email")).sendKeys("shobanasathyanathan@gmail.com");
		
	}
	
	@Then("^User checks for availability of first name$")
	public void User_checks_for_availability_of_first_name () {
		
		String userActualName = driver.findElement(By.id("email")).getAttribute("value");
		Assert.assertEquals("shobanasathyanathan@gmail.com", userActualName);
		
	}
}
