package pageObjects;


import org.openqa.selenium.WebDriver;

public class Home_Page extends PageBase {
//	public WebDriver driver;
	public Home_Page(WebDriver driver){
		PageBase.driver=driver;
	}

	public void login_user(String uname, String pwd) throws InterruptedException{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login).click();
	}
	
	public void click_register() throws InterruptedException{
		System.out.println("In register");
		Thread.sleep(5000);
		driver.findElement(register).click();
	}
}
