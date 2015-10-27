package testcases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Register extends pageObjects.PageBase {
		WebDriver driver = new FirefoxDriver();
		@BeforeTest
		public void openUrl(){
			driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com/");
		
		}
		@Test
		public void underTest() throws InterruptedException{
			
			pageObjects.Home_Page hp = new pageObjects.Home_Page(driver);
			hp.click_register();
			pageObjects.RegisterPage registerpage = new pageObjects.RegisterPage(driver);
			registerpage.register_fillDetails();
			registerpage.click_submit();
			
			System.out.print("Registered Successfully");
		}
		@AfterTest
		public void QuitDriver(){
			driver.quit();
			  }
			
	}
	


