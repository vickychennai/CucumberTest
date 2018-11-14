package org.guru.bank.sample;

import static org.testng.Assert.assertTrue;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPage {

	static WebDriver driver;

	@Given("The user is in the Guru login Page")
	public void the_user_is_in_the_Guru_login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Java\\Practical\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");
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
		// driver.quit();
	}

	@When("The user clicks the New Customer")
	public void the_user_clicks_the_New_Customer() {
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
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
		// driver.quit();
	}

	@When("The user fills all the basic details requested on the page")
	public void the_user_fills_all_the_basic_details_requested_on_the_page(io.cucumber.datatable.DataTable input) {
		Map<String, String> inputMap = input.asMap(String.class, String.class);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(inputMap.get("customername"));
		driver.findElement(By.xpath("//input[@name='rad1']")).click();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(inputMap.get("dob"));
		// driver.findElement(By.xpath("//table[@class='layout']//tbody/tr[7]/td[1]")).click();
		driver.findElement(By.xpath("//table[@class='layout']//tbody/tr[7]/td[2]/textarea"))
				.sendKeys(inputMap.get("address"));
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(inputMap.get("city"));
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(inputMap.get("state"));
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(inputMap.get("pin"));
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(inputMap.get("mobile"));
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(inputMap.get("email"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(inputMap.get("password"));

	}

	@Then("The user should receive a Customer ID")
	public void the_user_should_receive_a_Customer_ID() {
		WebElement customerID = driver.findElement(By.xpath("// table[@id=\"customer\"]/tbody/tr[4]/td[2]"));
		Assert.assertTrue(customerID.getText().length() > 0);
		String id = customerID.getText();
		System.out.println("Your customer ID is: " + id);

	}

	@When("The user clicks on Submit")
	public void the_user_clicks_on_Submit() {
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
	}

	@Then("The user closes the browser")
	public void the_user_closes_the_browser() {
		driver.quit();
	}
	
	@Then("The user unable to create a new customer entry because the email ID used already")
	public void the_user_unable_to_create_a_new_customer_entry_because_the_email_ID_used_already() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

}
