package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {

	public static WebDriver driver;

//Home Page	
	protected By username = By.name("userName");
	protected By password = By.name("password");
	protected By login = By.name("login");
	protected By register = By.linkText("REGISTER");
	
	
//Register page
	protected By firstname = By.name("firstName");
	protected By lastname = By.name("lastName");
	protected By phone = By.name("phone");
	protected By address = By.name("address1");
	protected By address2 = By.name("address2");
	protected By city = By.name("city");
	protected By state = By.name("state");
	protected By postalcode = By.name("postalCode");
	protected By userInfo_username = By.id("email");
	protected By confirmPassword = By.name("confirmPassword");
	protected By submit = By.name("register");
}
