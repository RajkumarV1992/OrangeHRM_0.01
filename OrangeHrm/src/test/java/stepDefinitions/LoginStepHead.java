package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepHead {
	
	WebDriver driver;
	LoginPages loginP;

	

@Given("User access the valid Orange Hrm url")
public void user_access_the_valid_orange_hrm_url() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	loginP = new LoginPages(driver);
	
	
}
    
@When("User pass the valid {string} and {string}")
public void user_pass_the_valid_and(String username, String password) {

	
	loginP.getUsernamefield().sendKeys(username);
	loginP.getPasswordFeild().sendKeys(password);

}
@And("USer click login button")
public void u_ser_click_login_button() {
	loginP.getSubmitbtn().click();
   
}
@Then("User sees OrangeHRM portal Home pages")
public void user_sees_orange_hrm_portal_home_pages() {
	boolean status = loginP.getDashboard().isDisplayed();
	// Print result
	System.out.println(status ? "Dashboard is displayed ✅" : "Dashboard is NOT displayed ❌");

	// Assert
	Assert.assertTrue(status);
}
}


