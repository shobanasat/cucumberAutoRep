package Practice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multipleScenariosSteps {
	
	WebDriver driver;
	
	@Given ("^User is on the facebook login page$")
	public void User_is_on_the_facebook_login_page () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Shobana\\\\Cucumber Setup\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	}
	
	@When ("^User enters firstname$")
	public void User_enters_firstname() throws InterruptedException {	
		driver.findElement(By.id("email")).sendKeys("shobanasathyanathan@gmail.com");
		Thread.sleep(1000);
	}
	
	@Then ("^Verify availability of firstname$")
	public void Verify_availability_of_firstname() throws InterruptedException {
		String actualUserName = driver.findElement(By.id("email")).getAttribute("value");
		Assert.assertEquals("shobanasathyanathan@gmail.com", actualUserName);
		Thread.sleep(1000);
	}
	
	@And ("^User enters password$")
	public void User_enters_password() throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys("shobikr@1");
		Thread.sleep(1000);
	}
	
	@But ("^Check password is encrytpted$")
	public void Check_password_is_encrytpted() throws InterruptedException {
		String actualPassword = driver.findElement(By.id("pass")).getAttribute("value");
		Assert.assertEquals("shobikr@1", actualPassword);
		Thread.sleep(1000);
	}
	
	@Then ("^Close Browser$")
	public void Close_Browser() {
		driver.quit();
		driver = null;
	}
}