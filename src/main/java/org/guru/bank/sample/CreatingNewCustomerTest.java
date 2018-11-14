package org.guru.bank.sample;

package org.guru.bank.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CreatingNewCustomerTest {

	/*static WebDriver driver;

	@Given("The user is in the Guru login Page")
	public void the_user_is_in_the_Guru_login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Java\\Practical\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("The user enters the valid credentials")
	public void the_user_enters_the_valid_credentials() {
		driver.findElement(By.name("uid")).sendKeys("mngr162582");
		driver.findElement(By.name("password")).sendKeys("sUrEbez");
	}

	@When("The user clicks the login button")
	public void the_user_clicks_the_login_button() {
		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("The user should be in Managers home page")
	public void the_user_should_be_in_Managers_home_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("Managerhomepage"));
		System.out.println("valid credentials");
		driver.quit();
	}

	@When("The user enters the invalid credentials")
	public void the_user_enters_the_invalid_credentials() throws InterruptedException {
		driver.findElement(By.name("uid")).sendKeys("mng162582");
		driver.findElement(By.name("password")).sendKeys("sUrbez");
		Thread.sleep(3000);
	}

	@Then("The user unable to login")
	public void the_user_should_unable_to_login() {
		Alert al = driver.switchTo().alert();
		al.accept();

		System.out.println("invalid credentials");
		driver.quit();
	}

	

	
	}

	/*
	 * @When("The user fills all the basic details requested on the page") public
	 * void the_user_fills_all_the_basic_details_requested_on_the_page() { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * cucumber.api.PendingException(); }
	 * 
	 * @When("The user clicks on Submit") public void the_user_clicks_on_Submit() {
	 * // Write code here that turns the phrase above into concrete actions throw
	 * new cucumber.api.PendingException(); }
	 * 
	 * @Then("The user should receive a Customer ID") public void
	 * the_user_should_receive_a_Customer_ID() { // Write code here that turns the
	 * phrase above into concrete actions throw new cucumber.api.PendingException();
	 * }
	 */

}
