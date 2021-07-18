package MultipleStepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multipleSteps1 {
	
	WebDriver driver;
	
	public multipleSteps1 (SharedClass share) {
		driver = share.setup();
	}
	
	@Given ("^User is on the facebook login page$")
	public void User_is_on_the_facebook_login_page () throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	}
	
	@When ("^User enters \"([^\"]*)\" firstname$")
	public void User_enters_firstname(String email) throws InterruptedException {	
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(1000);
	}
	
}