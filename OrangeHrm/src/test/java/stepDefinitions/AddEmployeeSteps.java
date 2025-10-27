package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.AddEmpPages;
import Pages.LoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps {

	WebDriver driver;
    AddEmpPages addEmpPage;
    LoginPages loginP;
	
@Given("User is logged into Hrm web application")
public void user_is_logged_into_hrm_web_application() {
	

addEmpPage = new AddEmpPages(driver);


addEmpPage.getPIMButton().click();
addEmpPage.getAddEmployeeButton().click();
  
}
@When("User add employee details from {string}")
public void user_add_employee_details_from(String string) {
	
   
}
@And("User clicked Save button")
public void user_clicked_save_button() {
   
}
@Then("Employees should be created successfully")
public void employees_should_be_created_successfully() {
   
}
}
