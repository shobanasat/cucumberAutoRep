package Datatable;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datatableSteps {
	
	WebDriver driver;
	
	@Given ("^User is on the facebook login page$")
	public void User_is_on_the_facebook_login_page () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Shobana\\\\Cucumber Setup\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
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
	
	@Then ("^Close Browser$")
	public void Close_Browser() {
		driver.quit();
		driver = null;
	}
	
	@When("^User enters following data$")
	public void User_enters_following_data (DataTable table) {
		
		List<List<String>> data = table.cells();
		
		String value1 = data.get(0).get(0);
		String value2 = data.get(0).get(1);		
				
		String value3 = data.get(1).get(0);
		String value4 = data.get(1).get(1);	
		
		String value5 = data.get(2).get(0);
		String value6 = data.get(2).get(1);
		
	}
}