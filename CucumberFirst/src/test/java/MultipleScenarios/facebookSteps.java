package MultipleScenarios;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class facebookSteps {
	
	WebDriver driver;
	
  @Given("^User is on the facebook page$")
  public void User_is_on_the_facebook_page() throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver", "C:\\Shobana\\Cucumber Setup\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(1000);
  }

  @When("^User enters \"([^\"]*)\" email$")
  public void User_enters_email(String email) throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys(email);
	  Thread.sleep(1000);
  }

  @And("^User enters \"([^\"]*)\" password$")
  public void User_enters_password(String password) throws InterruptedException {
	  driver.findElement(By.id("pass")).sendKeys(password);
	  Thread.sleep(1000);
  }

  @Then("^Verify login$")
  public void Verify_login() throws InterruptedException {
	  driver.findElement(By.name("login")).click();
	  //String actual = driver.findElement(By.className("a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5")).getAttribute("value");
	  //String actual = driver.findElement(By.partialLinkText("https://www.facebook.com/shobana.sathyanathan.1")).getAttribute("value");
	  //Assert.assertEquals("shobana.sathyanathan", actual);
	  Thread.sleep(5000);
  }

  @Then("^Close$")
  public void Close() {
	  driver.quit();
	  driver = null;
	  //driver.close();
  }

}
