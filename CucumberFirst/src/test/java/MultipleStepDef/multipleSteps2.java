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

public class multipleSteps2 {
	
	WebDriver driver;
	
	public multipleSteps2 (SharedClass share) {
		driver = share.setup();
	}
	
	@Then ("^Verify availability \"([^\"]*)\" of firstname$")
	public void Verify_availability_of_firstname(String email) throws InterruptedException {
		String actualUserName = driver.findElement(By.id("email")).getAttribute("value");
		Assert.assertEquals(email, actualUserName);
		Thread.sleep(1000);
	}
	
	@And ("^User enters \"([^\"]*)\" password$")
	public void User_enters_password(String password) throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1000);
	}
	
	@Then ("^Check password \"([^\"]*)\" is encrytpted$")
	public void Check_password_is_encrytpted(String password) throws InterruptedException {
		String actualPassword = driver.findElement(By.id("pass")).getAttribute("value");
		Assert.assertEquals(password, actualPassword);
		Thread.sleep(1000);
	}
	
	@Then ("^Close Browser$")
	public void Close_Browser() {
		driver.quit();
		driver = null;
	}
}