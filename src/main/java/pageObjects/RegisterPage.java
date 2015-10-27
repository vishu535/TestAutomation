package pageObjects;


import org.openqa.selenium.WebDriver;

public class RegisterPage extends PageBase{
	public RegisterPage(WebDriver driver){
		PageBase.driver=driver;
	}

	public void register_fillDetails(){
		driver.findElement(firstname).sendKeys("username");
		driver.findElement(lastname).sendKeys("last");
		driver.findElement(phone).sendKeys("87465876546");
		driver.findElement(address).sendKeys("automation");
		driver.findElement(address2).sendKeys("test automation");
		driver.findElement(city).sendKeys("hyderabad");
		driver.findElement(state).sendKeys("test state");
		driver.findElement(postalcode).sendKeys("5432123");
		driver.findElement(userInfo_username).sendKeys("testauto@email.com");
		driver.findElement(password).sendKeys("test automation");
		driver.findElement(confirmPassword).sendKeys("hyderabad");
		
	}
	
	public void click_submit(){
		driver.findElement(submit).click();
	}

}
