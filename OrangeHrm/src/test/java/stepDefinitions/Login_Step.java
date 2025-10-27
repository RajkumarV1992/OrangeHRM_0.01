package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step {

	WebDriver driver;
	LoginPages loginP;

	@Given("User open the valid Orange Hrm url")
	public void user_open_the_valid_orange_hrm_url() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginP = new LoginPages(driver);
	}

	@When("User entered valid Credentials {string} and {string}")
	public void user_entered_valid_credentials_and(String username, String password) {

		loginP.getUsernamefield().sendKeys(username);
		loginP.getPasswordFeild().sendKeys(password);

	}

	@And("click login button")
	public void click_login_button() {
		loginP.getSubmitbtn().click();

	}

	@Then("User sees OrangeHRM portal Home Page")
	public void user_sees_orange_hrm_portal_home_page() {

		boolean status = loginP.getDashboard().isDisplayed();
		// Print result
		System.out.println(status ? "Dashboard is displayed ✅" : "Dashboard is NOT displayed ❌");

		// Assert
		Assert.assertTrue(status);
		
//		driver.quit();
	}

}
