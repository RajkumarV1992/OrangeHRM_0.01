package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps {
	
@Given("User is logged into Hrm web application")
public void user_is_logged_into_hrm_web_application() {
	
WebDriver driver = Hooks.getDriver();
  
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
