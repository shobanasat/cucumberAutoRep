package Hooks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooksSteps {
	
	WebDriver driver;
	
	@Before (order=1)
	public void beforeSetup() {
		System.out.println("Before 1");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Shobana\\\\Cucumber Setup\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Before (order=2)
	public void beforeSetup1() {
		System.out.println("Before 2");
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
	
	@But ("^Check password \"([^\"]*)\" is encrytpted$")
	public void Check_password_is_encrytpted(String password) throws InterruptedException {
		String actualPassword = driver.findElement(By.id("pass")).getAttribute("value");
		Assert.assertEquals(password, actualPassword);
		Thread.sleep(1000);
	}
	
	//@Then ("^Close Browser$")
	//public void Close_Browser() {
	//	driver.quit();
	//	driver = null;
	//}
	
	@After (order=1)
	public void tearDown() {
		System.out.println("After 1");
		driver.quit();
		driver = null;
	}
	
	@After
	public void tearDown1() {
		System.out.println("After 2");
	}
}