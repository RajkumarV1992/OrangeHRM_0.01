package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmpPages {
	
	 WebDriver driver;
	
	public AddEmpPages(WebDriver driver) {
		
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPIMButton() {
		return PIMButton;
	}

	public WebElement getAddEmployeeButton() {
		return AddEmployeeButton;
	}

	public WebElement getFirstNameField() {
		return FirstNameField;
	}

	public WebElement getLastNameField() {
		return LastNameField;
	}

	public WebElement getEmployeeid() {
		return Employeeid;
	}
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIMButton;

	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement AddEmployeeButton;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement FirstNameField;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement LastNameField;
	
	@FindBy(xpath="//input[@fdprocessedid='kdg8o7']")
	private WebElement Employeeid;
	

}
