package pageObjects;


import org.openqa.selenium.WebDriver;

public class Home_Page extends PageBase {
//	public WebDriver driver;
	public Home_Page(WebDriver driver){
		PageBase.driver=driver;
	}

	public void login_user() throws InterruptedException{
		driver.findElement(username).sendKeys("username@email.com");
		driver.findElement(password).sendKeys("password");
		driver.findElement(login).click();
	}
	
	public void click_register() throws InterruptedException{
		System.out.println("In register");
		Thread.sleep(5000);
		driver.findElement(register).click();
	}
}
