package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
	

 WebDriver driver;


public LoginPages(WebDriver driver) {
	
	this.driver =driver;
    PageFactory.initElements(driver, this);
  
}


@FindBy(xpath="//input[@name='username']")
private WebElement usernamefield;

@FindBy(xpath="//input[@name='password']")
private WebElement passwordField; 


@FindBy(xpath = "//button[@type='submit']")
private WebElement submitbtn;

@FindBy(xpath="//span[text()='Dashboard']")
private WebElement dashboard;


public WebDriver getDriver() {
	return driver;
}



public WebElement getPasswordField() {
	return passwordField;
}



public WebElement getDashboard() {
	return dashboard;
}



public WebElement getUsernamefield() {
	return usernamefield;
}



public WebElement getPasswordFeild() {
	return passwordField;
}


public WebElement getSubmitbtn() {
	return submitbtn;
}
}